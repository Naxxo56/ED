package ED;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Random;
import java.util.Scanner;

public class subasta {
    static Scanner teclado = new Scanner(System.in);
    static String opcion;
    static ArrayList<Object[]> subastaModerna;
    static ArrayList<Object[]> subastaAntiguedades;

    public static void main(String[] args) {
        subastaModerna = new ArrayList();
        subastaAntiguedades = new ArrayList();
        menu();
    }

    public static void menu() {
        do {
            System.out.println("1ºAñadir objeto a subasta moderna");
            System.out.println("2ºAñadir objeto a subasta de antiguedades");
            System.out.println("3ºEliminar objeto moderno");
            System.out.println("4ºEliminar objeto antiguo");
            System.out.println("5ºMostrar objetos modernos");
            System.out.println("6ºMostrar objetos antiguos");
            System.out.println("7ºEncontrar objetos modernos");
            System.out.println("8ºEncontrar objetos antiguos");
            System.out.println("9ºForzar");
            System.out.println("10ºSalir");
            System.out.println("Introduce la opcion deseada");
            opcion = teclado.next();
            switch (opcion) {
                case "1":
                    agregarObjetoModerno();
                    break;
                case "2":
                    agregarObjetoAntiguo();
                    break;
                case "3":
                    String elementoModerno = teclado.next();
                    eliminarObjetoModerno(elementoModerno);
                    break;
                case "4":
                    String elementoAntiguo = teclado.next();
                    eliminarObjetoAntiguo(elementoAntiguo);
                    break;
                case "5":
                    productosModernos();
                    break;
                case "6":
                    productosAntiguos();
                    break;
                case "7":
                    encontrarObjetosModernos();
                    break;
                case "8":
                    encontrarObjetosAntiguos();
                    break;
                case "9":
                    System.out.println("Saliendo");
                    break;
            }
        } while (!opcion.equals("9"));
    }
    public static void agregarObjetoModerno() {
        System.out.println("Introduzca objeto a subastar");
        String objeto = teclado.next();
        Object[] unModerno = {objeto};
        boolean existe = false;
        for (Object[] elemento : subastaModerna) {
            if (elemento[0].equals(objeto)) {
                existe = true;
                break;
            } else {
                existe = false;
            }
        }
        if (existe) {
            System.out.println("El objeto no se puede agregarse,ya existe");
        } else {
            subastaModerna.add(unModerno);
        }


    }

    public static void agregarObjetoAntiguo() {
        System.out.println("Introduzca objeto a subastar");
        String objeto = teclado.next();
        Object[] unModerno = {objeto};
        boolean existe = false;
        for (Object[] elemento : subastaAntiguedades) {
            if (elemento[0].equals(objeto)) {
                existe = true;
                break;
            } else {
                existe = false;
            }
        }
        if (existe) {
            System.out.println("El objeto no se puede agregarse,ya existe");
        } else {
            subastaAntiguedades.add(unModerno);
        }


    }

    public static void eliminarObjetoModerno(String eliminar) {

        if (subastaModerna.contains(eliminar)) {
            for (int i = 0; i < subastaModerna.size(); i++) {
                Object[] elemento = subastaModerna.get(i);
                if (eliminar.equals(subastaModerna.get(i))) {
                    subastaModerna.remove(i);
                    break;
                }
            }
        } else {
            System.out.println("El elemento no se encuentra en esta subasta");
        }

    }

    public static void eliminarObjetoAntiguo(String eliminar) {
        if (subastaAntiguedades.contains(eliminar)) {
            for (int i = 0; i < subastaAntiguedades.size(); i++) {
                Object[] elemento = subastaAntiguedades.get(i);
                if (eliminar.equals(subastaAntiguedades.get(i))) {
                    subastaAntiguedades.remove(i);
                    break;
                }
            }
        } else {
            System.out.println("El elemento no se encuentra en esta subasta");
        }
    }

    public static void productosAntiguos() {
        for (Object[] antiguo : subastaAntiguedades) {

            for (Object antiguos : antiguo
            ) {
                System.out.println(antiguos);
            }
        }
    }

    public static void productosModernos() {
        for (Object[] moderno : subastaModerna) {

            for (Object modernos : moderno
            ) {
                System.out.println(modernos);
            }
        }
    }

    public static void encontrarObjetosModernos() {
        System.out.println("Introduzca objeto a encontrar");
        String objeto = teclado.next();
        Object[] unModerno = {objeto};
        boolean existe = false;
        for (Object[] elemento : subastaModerna) {
            if (elemento[0].equals(objeto)) {
                existe = true;
                break;
            } else {
                existe = false;
            }
        }
        if (existe) {
            System.out.println("El objeto ha sido encontrado");
        } else {
            System.out.println("No se encuentra el objeto,no existe");
        }

    }
    public static void encontrarObjetosAntiguos() {
        System.out.println("Introduzca objeto a encontrar");
        String objeto = teclado.next();
        Object[] unModerno = {objeto};
        boolean existe = false;
        for (Object[] elemento : subastaAntiguedades) {
            if (elemento[0].equals(objeto)) {
                existe = true;
                break;
            } else {
                existe = false;
            }
        }
        if (existe) {
            System.out.println("El objeto ha sido encontrado");
        } else {
            System.out.println("No se encuentra el objeto,no existe");
        }
    }
}
