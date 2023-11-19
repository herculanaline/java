import java.util.Scanner;

public class lanche {

    public static void main(String[] args) {

        double[] tabelaPrecos = { 4.00, 4.50, 5.00, 2.00, 1.50 };

        System.out.println("               Lanche");
        System.out.println("Código      Especificação      Preço");
        System.out.println("1           Cachorro Quente    R$4,00");
        System.out.println("2           X-Salada           R$4,50");
        System.out.println("3           X-Bacon            R$5,00");
        System.out.println("4           Torrada Simples    R$2,00");
        System.out.println("5           Refrigerante       R$1,50");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do produto: ");
        int codigo_item = scanner.nextInt();

        int indice = codigo_item - 1;

        if (codigo_item >= 0 && codigo_item < tabelaPrecos.length + 1) {
            System.out.print("Digite a quantidade do item: ");
            int quantidade_item = scanner.nextInt();

            double valor_total = tabelaPrecos[indice] * quantidade_item;

            System.out.printf("Valor Total: R$" + valor_total);
        } else {
            System.out.println("Código de item inválido.");
        }

    }
}
