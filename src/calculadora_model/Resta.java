package calculadora_model;

public class Resta extends OperacionMatematica implements EjecutaCalculo {
    
    public Resta(double numeroA, double numeroB){
        super(numeroA, numeroB);
    }

    @Override
    public double ejecutar() {
        return this.numeroA - this.numeroB;
    }
    
}
