package calculadora_model;

public class Division extends OperacionMatematica implements EjecutaCalculo {

    public Division(double numeroA, double numeroB) {
        super(numeroA, numeroB);
    }

    @Override
    public double ejecutar() {
        return this.numeroA / this.numeroB;
    }

}
