import java.util.Scanner;


public class Calculadora
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double salario_prof = 0;

        System.out.print("Digite o nome do professor: ");
        String nome_professor = input.nextLine();
        System.out.println();

        System.out.print("Digite seu regime de pagamento: \n[1] CLT \n[2] Horista \n[3] PJ \n");
        int regime_pagamento = input.nextInt();
        
        System.out.println();
        switch (regime_pagamento){

            case 1:
                System.out.print("Digite salário mensal do professor: \nR$");
                salario_prof = input.nextDouble();
                break;

            case 2:
                System.out.print("Digite o valor da hora de trabalho: \nR$");
                double valorHora = input.nextDouble();
                System.out.println();
                System.out.println("Digite a quantidade de horas trabalhadas: ");
                double horaTrabalhada = input.nextDouble(); 

                salario_prof = valorHora * horaTrabalhada;
                break;
            
            case 3:
                System.out.print("Qual o valor dito no contrato? \nR$");
                salario_prof = input.nextDouble(); 
                break;
            
            default:
                System.out.print("Tente novamente, utilize uma opção válida.");
                return;
    }
        input.close();
        System.out.println();
        System.out.print("Nome do professor: " + nome_professor + "\nValor a ser recebido: R$" + salario_prof);
    }
}