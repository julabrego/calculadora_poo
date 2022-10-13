package calculadora_model;

public abstract class OperacionMatematica implements EjecutaCalculo {
    protected double numeroA, numeroB, resultado;
    
    public OperacionMatematica(double numeroA, double numeroB){
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }
}
