package atvdd3;
public class Pessoa{
    private String nome;
    private String cpf;
    private String dt_nasc;

    public Pessoa (String nome, String cpf, String dt_nasc){
        this.nome = nome;
        this.cpf = cpf;
        this.dt_nasc = dt_nasc;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getDt_nasc(){
        return this.dt_nasc;
    }

    public void setDt_nasc(String dt_nasc){
        this.dt_nasc = dt_nasc;
    }

    public void exibirDados(){
        System.out.println("nome: " +this.nome);
        System.out.println("cpf: " +this.cpf);
        System.out.println("nasc: " +this.dt_nasc);
    }
}