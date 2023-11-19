import java.util.Scanner;

public class pomekon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de instâncias: ");
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println("Instância " + (i + 1) + ":");
            int bonus = scanner.nextInt();

            int ataqueDabriel = scanner.nextInt();
            int defesaDabriel = scanner.nextInt();
            int levelDabriel = scanner.nextInt();

            int ataqueGuarte = scanner.nextInt();
            int defesaGuarte = scanner.nextInt();
            int levelGuarte = scanner.nextInt();

            int golpeDabriel = (ataqueDabriel + defesaDabriel) / 2 + (levelDabriel % 2 == 0 ? bonus : 0);
            int golpeGuarte = (ataqueGuarte + defesaGuarte) / 2 + (levelGuarte % 2 == 0 ? bonus : 0);

            if (golpeDabriel > golpeGuarte) {
                System.out.println("Dabriel");
            } else if (golpeGuarte > golpeDabriel) {
                System.out.println("Guarte");
            } else {
                System.out.println("Empate!");
            }

        }
    }
}
