import java.util.Scanner;

public class salario {
 
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);

        int numero_funcionario;
        int numero_horas_trabalhadas;
        double valor_hora;
        double salario_funcionario;

        System.out.println("Digite o número de id do funcionário: ");
        numero_funcionario = entrada.nextInt();
        System.out.println("Digite o valor da hora trabalhada pelo funcionário: ");
        valor_hora = entrada.nextDouble();
        System.out.println("Informe o número de horas trabalhadas pelo funcionário: ");
        numero_horas_trabalhadas = entrada.nextInt();

        salario_funcionario = valor_hora*numero_horas_trabalhadas;
        
        System.out.println("Número do funcionário: " + numero_funcionario);
        System.out.printf("O salário do funcionário será: " + "R$" + salario_funcionario);
       
 
    }
 
}