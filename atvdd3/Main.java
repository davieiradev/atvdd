package atvdd3;
import java.util.*;

public class Main {
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    List<Professor> prof = new ArrayList();
    List<Aluno> alu = new ArrayList();

  

    while (true) {
          int opc =scanner.nextInt();
          
        switch (opc) {
            case 1:
                scanner.nextLine();
                String nome = scanner.nextLine();
                String cpf = scanner.next();
                String dt_nasc = scanner.next();
                double nota1 = scanner.nextDouble();
                double nota2 = scanner.nextDouble();
                double nota3 = scanner.nextDouble();
                double nota4 = scanner.nextDouble();
                
                Aluno aluno = new Aluno(nome, cpf, dt_nasc, nota1, nota2, nota3, nota4);
                alu.add(aluno);
                break;
            
            case 2:
                scanner.nextLine();
                String nome2 = scanner.nextLine();
                String cpf2 = scanner.next();
                String dt_nasc2 = scanner.next();
                double salario = scanner.nextDouble();

                Professor professor = new Professor(nome2, cpf2, dt_nasc2, salario);
                prof.add(professor);
                break;

            case 3:
            scanner.nextLine();
             String cpf3 = scanner.next();
             for(Aluno a: alu){
                if (cpf3.equals(a.getCpf())) {
                    System.out.println((a.getNota1()+ a.getNota2() + a.getNota3() + a.getNota4()) / 4 );
                }
               
             }
             break;
            case 4:
             scanner.nextLine();
            String cpf4 = scanner.next();
             for(Aluno a: alu){
                if (cpf4.equals(a.getCpf())) {
                 a.exibirDados();
                }
            }
            break;

            case 5:
             scanner.nextLine();
            String cpf5 = scanner.next();
             for(Professor p : prof){
                if (cpf5.equals(p.getCpf())) {
                 p.exibirDados();
                }
            }
            break;

            case 0:
            return;
            default:
                break;

        }
        
    }
}
    
}