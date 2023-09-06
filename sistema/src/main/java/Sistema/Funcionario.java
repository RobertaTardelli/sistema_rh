package Sistema;

public abstract class Funcionario extends Pessoa {
    
   private int matricula;

    public Funcionario(int matricula) {
        super();
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }



}
