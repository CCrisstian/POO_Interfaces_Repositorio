package org.CCristian.GENERICS;

import org.CCristian.POO_Interfaces.Modelo.Cliente;
import org.CCristian.POO_Interfaces.Modelo.Cliente_PREMIUM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejemplo_Genericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Cristian","Cristaldo"));

        /*Formas de OBTENER un cliente de la Lista*/
        Cliente cristian = clientes.get(0);
        cristian = clientes.iterator().next();

        Cliente[] clientesArreglo = {new Cliente("Cristian","Cristaldo"),
                                    new Cliente("Andres","Guzmán")};

        Integer[] enteros = {1,2,3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enteros);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andrés","Pepe","Luci","Bea","John"},
                                                enteros);
        List<Cliente_PREMIUM> clientePremiumList = fromArrayToList(new Cliente_PREMIUM[]{new Cliente_PREMIUM("Cristian","Cristaldo")});


        ImprimirClientes(clientes);
        ImprimirClientes(clientesLista);
        ImprimirClientes(clientePremiumList);

        System.out.println("Máximo de 1, 9 y 4 es: " + maximo(1,9,4));
        System.out.println("Máximo de 3.9, 11.6 y 7.79 es: " + maximo(3.9,11.6,7.79));
        System.out.println("Máximo de de zanahoria, arándanos y manzana es: " + maximo("zanahoria","arándanos","manzana"));
    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g){
        for (G elemento: g){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void ImprimirClientes (List< ? extends Cliente> cliente){
        cliente.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if ((b.compareTo(max)) > 0) {
            max = b;
        }
        if ((c.compareTo(max)) > 0){
            max = c;
        }
        return max;
    }
}
