package atividade3;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        String cpf;
        String endereco;
        String telefone;
        String setor;
        String tipo;
        int salario;
        int valorHora;
        int hora;
        int percentual;
        
        Funcionario[] lista = new Funcionario[10];
        
        System.out.print("Pecentual para o aumento: ");
        percentual = leia.nextInt();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o tipo de funcionário (Horista/Assalariado): ");
            tipo = leia.next();
            leia.nextLine();
            
            if("assalariado".equals(tipo)){
                
                System.out.print("Nome: ");
                nome = leia.nextLine();
                System.out.print("CPF: ");
                cpf  = leia.next();
                leia.nextLine();
                System.out.print("Endereço: ");
                endereco = leia.nextLine();
                System.out.println("Telefone: ");
                telefone = leia.next();
                leia.nextLine();
                System.out.println("Setor: ");
                setor = leia.nextLine();
                System.out.print("Salario: ");
                salario = leia.nextInt();
                lista[i] = new Assalariado(nome, cpf, endereco, telefone, setor, salario, percentual);
            }
            else if("horista".equals(tipo)){
                System.out.print("Nome: ");
                nome = leia.nextLine();
                System.out.print("CPF: ");
                cpf  = leia.next();
                leia.nextLine();
                System.out.print("Endereço: ");
                endereco = leia.nextLine();
                System.out.println("Telefone: ");
                telefone = leia.next();
                leia.nextLine();
                System.out.println("Setor: ");
                setor = leia.nextLine();
                System.out.println("Valor da hora: ");
                valorHora = leia.nextInt();
                System.out.println("Horas de trabalho: ");
                hora = leia.nextInt();
                lista[i] = new Horista(nome, cpf, endereco, telefone, setor, valorHora, hora, percentual);
            }
        }
        
        for (Funcionario elem : lista) {
            System.out.print("\n");
            elem.listaInfor();
        }
       
        
    }
    
}
