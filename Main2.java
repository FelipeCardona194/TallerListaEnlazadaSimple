
package main2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main2 {
    
    public static void main(String[] args) {
        
   boolean val = true;
        int opt;

        Nodo1 nodito = new Nodo1(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor del primer nodo")));

        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.setCabeza(nodito);

        while (val) {

            switch (opt = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que deseas hacer? "
                    + "\n 1: Recorrer la lista"
                    + "\n 2: Localizar un dato dentro de la lista"
                    + "\n 3: Agregar cabeza"
                    + "\n 4: Obtener tamaño"
                    + "\n 5: Obtener ultimo" 
                    + "\n 7: Salir"))) {
                case 1:

                    lista.recorrer();

                    break;
                case 2:

                    String resp = lista.localizar(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero a buscar")));
                    System.out.println(resp);
                    break;

                case 3:

                    lista.agregarCabeza(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero a agregar en la cabeza")));

                    break;
                case 4:

                    int rep = lista.getTamaño();
                    System.out.println(rep);

                    break;

                case 5:

                    lista.ultimo();

                    break;
                case 6:
                    val = false;
                    break;
            }

        }

    }

}
/* Elaborado por: Andres Felipe Cardona Londoño
                  Juan David Arias Sanchez
*/     
        
 
