package calculadora_view;

import calculadora_controller.CalculadoraController;
import calculadora_model.Division;
import calculadora_model.Multiplicacion;
import calculadora_model.OperacionMatematica;
import calculadora_model.Resta;
import calculadora_model.Suma;
import java.util.Scanner;

public class LineaDeComandos {

    private boolean ejecutando = true;
    private Scanner scanner = new Scanner(System.in);
    private int opcion;
    private double numeroA, numeroB;

    private OperacionMatematica operacionMatematica;

    public void ejecutarMenu() {
        while (ejecutando) {
            mostrarMenuPrincipal();
        }
    }

    private void mostrarTitulo() {
        clearScreen();
        System.out.printf("****** CALCULADORA ******\n\n");
    }

    private void mostrarMenuPrincipal() {
        mostrarTitulo();
        System.out.println("Elija una opción:");
        System.out.println("1) Sumar\n2) Restar\n3) Multiplicar\n4) Dividir\n0) Salir");

        leerOpcionElegidaPorUsuario();

        if (opcion < 1 || opcion > 4) {
            if (opcion == 0) {
                ejecutando = false;
            } else {
                System.out.println("Opción incorrecta");
            }
        } else {
            ejecutarCalculo(opcion);
        }
    }

    private void leerOpcionElegidaPorUsuario() {
        this.opcion = this.scanner.nextInt();
        this.scanner.nextLine();
    }

    private void ejecutarCalculo(int opcion) {
        System.out.println("Ingrese primer número: ");
        numeroA = this.scanner.nextDouble();

        System.out.println("Ingrese segundo número: ");
        numeroB = this.scanner.nextDouble();

        CalculadoraController controller = new CalculadoraController(numeroA, numeroB, this.opcion);
        
        System.out.println("\nResultado: " + controller.realizarCalculo() + "\n");
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
