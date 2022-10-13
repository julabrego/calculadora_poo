package calculadora_controller;

import calculadora_view.LineaDeComandos;
import calculadora_view.Ventana;

public class Calculadora {

    public static void main(String[] args) {
//        LineaDeComandos lineaDeComandos = new LineaDeComandos();
//        lineaDeComandos.ejecutarMenu();
        
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
    }
    
}
