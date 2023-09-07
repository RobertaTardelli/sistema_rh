package Sistema;

public abstract class Funcionario extends Pessoa implements tributos{
    
private int matricula;
private salario tipo;

public Funcionario(int matricula, String nome, int cpf, String email, int  telefone, salario tipo) {
    
        this.matricula = matricula;
        this.tipo = tipo;
    }
    public salario getTipo (){
    return tipo;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }



}
