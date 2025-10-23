package atvdd3;
public class Aluno extends Pessoa{
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Aluno(String nome, String cpf, String dt_nasc, double nota1,double nota2,double nota3, double nota4){
        super( nome, cpf, dt_nasc);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;

        
    }
    public double getNota1(){
        return this.nota1;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public double getNota2(){
        return this.nota2;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public double getNota3(){
        return this.nota3;
    }

    public void setNota3(double nota3){
        this.nota3 = nota3;
    }

    public double getNota4(){
        return this.nota4;
    }

    public void setNota4(double nota4){
        this.nota4 = nota4;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("nota1: " +nota1);
        System.out.println("nota2: "+nota2);
        System.out.println("nota3: "+nota3);
        System.out.println("nota4: "+nota4);
    }
    }
