package atividade3;

public class Assalariado extends Funcionario {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    @Override
    public int calcSalario(){
        return getSalario();
    }

    @Override
    public void listaInfor() {
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+ getCpf());
        System.out.println("Endereço: "+ getEndereco());
        System.out.println("Telefone: "+ getTelefone());
        System.out.println("Setor: "+ getSetor());
        System.out.println("Salario normal: R$"+ calcSalario());
        System.out.println("Salario com aumento: "+calcAumento());
    }


    public Assalariado( String nome, String cpf, String endereco, String telefone, String setor, int salario, int percentual) {
        super(nome, cpf, endereco, telefone, setor, percentual);
        this.salario = salario;
    }
    
    
    @Override
    public int aumento(){
        return salario*percentual/100;
    }

    @Override
    public int calcAumento() {
        return salario*percentual/100+salario;
    }

    
    
    
}
