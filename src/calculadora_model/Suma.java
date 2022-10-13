package calculadora_model;

public class Suma extends OperacionMatematica implements EjecutaCalculo {
    
    public Suma(double numeroA, double numeroB){
        super(numeroA, numeroB);
    }

    @Override
    public double ejecutar() {
        return this.numeroA + this.numeroB;
    }
    
}
