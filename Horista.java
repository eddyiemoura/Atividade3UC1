package atividade3;

public class Horista extends Funcionario{
    private int valorHora;
    private int hora;

    public Horista( String nome, String cpf, String endereco, String telefone, String setor, 
      int hora, int valorHora, int percentual) {
        super(nome, cpf, endereco, telefone, setor, percentual);
        this.valorHora = valorHora;
        this.hora = hora;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    @Override
    public int calcSalario(){
        return getHora() * getValorHora();
    }

    @Override
    public void listaInfor() {
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("Endereço: "+ getEndereco());
        System.out.println("Telefone: "+ getTelefone());
        System.out.println("Setor: "+ getSetor());
        System.out.println("Salario: R$"+calcSalario());
        System.out.println("Salario com aumento: "+calcAumento());
    }

    
    @Override
    public int aumento(){
        return hora*valorHora*percentual/100;
    }
    

    @Override
    public int calcAumento() {
        return aumento()+calcSalario();
    }


    

    
    
    
}
