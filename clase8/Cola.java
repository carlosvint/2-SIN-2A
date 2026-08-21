package clase8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


// public class Main {

//     public static void main(String[] args) {

//         int[] numeros = new int[5];

//         numeros[0] = 10;
//         numeros[1] = 20;
//         numeros[2] = 30;
//         numeros[3] = 40;
//         numeros[4] = 50;

//         for (int numero : numeros) {
//             System.out.println(numero);
//         }

//         for (int i = 0; i < numeros.length; i++) {
//             System.out.println(numeros[i]);
//         }

//         int interes = numeros[3];
//     }
// }

// public class Lista {

//     public static void main(String[] args) {

//         ArrayList<String> nombres = new ArrayList<>();

//         nombres.add("Carlos");
//         nombres.add("Ana");
//         nombres.add("Luis");

//         System.out.println(nombres);

//         nombres.add("Pedro");

//         nombres.remove("Ana");

//         for (String nombre : nombres) {
//             System.out.println(nombre);
//         }
//     }
// }



// public class Pila {

//     public static void main(String[] args) {

//         Stack<String> pila = new Stack<>();

//         pila.push("A");
//         pila.push("B");
//         pila.push("C");

//         System.out.println(pila);

//         System.out.println("Elemento superior: "
//                 + pila.peek());

//         System.out.println("Eliminado: "
//                 + pila.pop());

//         System.out.println(pila);

//         System.out.println(pila.peek());
//     }
// }




public class Cola {

    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();

        cola.offer("Carlos");
        cola.offer("Ana");
        cola.offer("Luis");

        System.out.println(cola);

        System.out.println("Primero: "
                + cola.peek());

        System.out.println("Atendiendo: "
                + cola.poll());

        System.out.println(cola);

    }
}



// public class ListaEnlazada {

//     public static void main(String[] args) {

//         LinkedList<String> lista = new LinkedList<>();

//         lista.add("A");
//         lista.add("B");
//         lista.add("C");

//         System.out.println(lista);

//         lista.addFirst("Inicio");
//         lista.addLast("Final");

//         System.out.println(lista);

//         lista.removeFirst();
//         lista.removeLast();

//         System.out.println(lista);

//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         ArrayList<String> lista = new ArrayList<>();

//         HashSet<String> conjunto = new HashSet<>();

//         HashMap<String, Integer> mapa = new HashMap<>();

//         Queue<String> cola = new LinkedList<>();

//         Stack<String> pila = new Stack<>();
//     }
// }