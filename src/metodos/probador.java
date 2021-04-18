
package metodos;

import javax.swing.JOptionPane;

/**
 * esto es una prueba para el fork
 * @author ajrego
 */
public class probador {

    public static void main(String[] args) {

        lista<Integer> lista_enlazada = new lista<>();

        int opcion_menu = 0;
        int dato;

        do {
            try {
                opcion_menu = Integer.parseInt(JOptionPane.showInputDialog("#### Lista Enlazada #####\n\n"
                        + "[1] Agregar dato al inicio\n"
                        + "[2] Agregar dato al final\n"
                        + "[3] Mostrar datos\n"
                        + "[4] Salir\n\n"
                        + "Escoja una opcion valida: ?"));

                switch (opcion_menu) {
                    case 1:
                        dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dato: "));
                        lista_enlazada.agregarPrimero(dato);
                        break;
                    case 2:
                        dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dato: "));
                        lista_enlazada.agregarUltimo(dato);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Datos de la lista:\n"+lista_enlazada.getDatosLista());
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "¡Adiós!");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "¡Opcion invalida!");

                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "¡Dato valido!");
            }
        } while (opcion_menu != 4);

    }
}
