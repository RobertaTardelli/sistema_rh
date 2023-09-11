package Sistema;

public class Supervisor extends Funcionario {


    public Supervisor (int matricula, String nome, int cpf, String email, int  telefone, salario tipo) {
super(matricula, nome, cpf, email, telefone, tipo);
}

    @Override
    public double fgts() {
        return getTipo ().getSalarioBase() *0.08;
      
    }

    @Override
    public double inss() {
        return getTipo().getSalarioBase()*0.11;
    }

    @Override
    public double decimoTerceiro() {
        return getTipo().getSalarioBase()/12;
    }

    @Override
    public double ferias() {
        return  ((getTipo().getSalarioBase()/12)*0.3)+ getTipo().getSalarioBase();
    }
}