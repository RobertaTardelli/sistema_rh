package Sistema;

public enum salario {
    
    SUPERVISOR(5000), GERENTE(3000), ATENDENTE(1000);
        
    private double salarioBase;
    salario(double salarioBase){
        this.salarioBase =  salarioBase;

    }

    public double getSalarioBase() {
        return salarioBase;
    }





}
