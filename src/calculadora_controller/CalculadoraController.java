package calculadora_controller;

import calculadora_model.Division;
import calculadora_model.EjecutaCalculo;
import calculadora_model.Multiplicacion;
import calculadora_model.OperacionMatematica;
import calculadora_model.Resta;
import calculadora_model.Suma;

public class CalculadoraController {

    private final int operacion;
    private double numeroA, numeroB;

    public CalculadoraController(double numeroA, double numeroB, int operacion) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
        this.operacion = operacion;
    }

    public double realizarCalculo() {
        switch (operacion) {
            case 1:
                return new Suma(numeroA, numeroB).ejecutar();
            case 2:
                return new Resta(numeroA, numeroB).ejecutar();
            case 3:
                return new Multiplicacion(numeroA, numeroB).ejecutar();
            case 4:
                return new Division(numeroA, numeroB).ejecutar();
            default:
                return 0f;
        }
    }

}
