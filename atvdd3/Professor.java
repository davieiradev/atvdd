package atvdd3;

public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, String cpf, String dt_nasc, double salario){
        super(nome, cpf, dt_nasc);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("salario: "+this.salario);
    }
}
