package calculadora_model;

public class Multiplicacion extends OperacionMatematica implements EjecutaCalculo {
    
    public Multiplicacion(double numeroA, double numeroB){
        super(numeroA, numeroB);
    }

    @Override
    public double ejecutar() {
        return this.numeroA * this.numeroB;
    }
    
}
