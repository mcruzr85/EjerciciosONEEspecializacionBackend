import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class TareaCuentaBancaria {
    public static void main(String[] args) {

        String dados = """
                ***************************************************************
                Dados Bancarios Meybis Cruz Rodriguez - exercicios alura-java
                saldo inicial R$ 2500.00
                ***************************************************************
                """;

        String name = "Meybis Cruz Rodriguez";
        double saldo = 2500;
        int opcao=0;
        double aux = 0.0;
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("\nSeja benvindo(a)");
        System.out.println(name);
        System.out.println("O saldo da sua conta é: " + saldo);
        System.out.println("\n***************************************************");
        System.out.println();

        String menu = """  
           
                Selecione:
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;

        while(flag){
            System.out.println(menu);
            opcao = scanner.nextInt();


            switch (opcao){

                case 1:{
                    System.out.println("Saldo atual: " + saldo);
                    System.out.println(saldo);
                    break;
                }
                case 2:{
                    System.out.println("cantidad a recibir");  //ou fazer um metodo para cada opçao
                    aux = scanner.nextDouble();
                    if(aux > 0){
                        saldo+= aux;
                        System.out.println("Operação efetivada com  sucesso!");
                        System.out.println("Saldo atualizado: " + saldo);
                    }else{
                        System.out.println("valor inválido");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Escreva o valor  que deseja transferir");
                    aux = scanner.nextDouble();
                    if(aux <= saldo){
                        saldo-= aux;
                        System.out.println("Operação efetivada com  sucesso!");
                        System.out.println("Saldo atualizado: " + saldo);
                    }else{
                        System.out.println("Saldo insuficiente para essa operação");
                    }

                    break;
                }
                case 4: {
                    System.out.println("Até mais!!");
                    flag= false;
                    break;
                }
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }

        }

    }
}