package atividade3;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String setor;
    int percentual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
     public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getPercentual() {
        return percentual;
    }

    public void setPercentual(int percentual) {
        this.percentual = percentual;
    }
    
    public Funcionario(String nome, String cpf, String endereco, String telefone, String setor, int percentual) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
        this.percentual = percentual;
    }
    
    public abstract void listaInfor();
    
    public abstract int calcSalario();
    
    public abstract int aumento();
    
    public abstract int calcAumento();

   
    
    
}
