import java.util.Scanner;

public class salariocombonus {
 
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);

        String nome_funcionario;
        double valor_em_vendas;
        double salario_fixo;
        double salario_bonus;

        System.out.println("Digite o nome do funcionário: ");
        nome_funcionario = entrada.nextLine();
        System.out.println("Digite o valor obtido em vendas totais feitas pelo funcionário: ");
        valor_em_vendas = entrada.nextDouble();
        System.out.println("Informe o salário fixo do funcionário: ");
        salario_fixo = entrada.nextDouble();

        salario_bonus = (valor_em_vendas*0.15)+salario_fixo;
        
        System.out.println("Nome do funcionário: " + nome_funcionario);
        System.out.printf("O salário do funcionário será: " + "R$" + salario_bonus);
       
 
    }
 
}
