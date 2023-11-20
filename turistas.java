import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner scanner = new Scanner(System.in);
    int jipe = 0;
    int T = 0;

    while (true) {
        String input = leitor.next();
        if(input.equals("Salida")){
            jipe++;
            T += leitor.nextInt();
        }
        else if (input.equals("Vuelta")){
            jipe--;
            T -= leitor.nextInt();
        }else{
            break;
        }

    }

    System.out.println(T);
    System.out.println(jipes);
    }
 
}