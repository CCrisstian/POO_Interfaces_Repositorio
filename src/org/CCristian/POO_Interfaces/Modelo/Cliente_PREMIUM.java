package org.CCristian.POO_Interfaces.Modelo;

public class Cliente_PREMIUM extends Cliente implements Comparable<Cliente_PREMIUM>{
    public Cliente_PREMIUM(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public int compareTo(Cliente_PREMIUM o) {
        return 0;
    }
}

    /*La interfaz Comparable en Java se encuentra en el paquete java.lang y se utiliza para proporcionar
    una forma de comparar objetos de una clase. Al implementar la interfaz Comparable, una clase permite
    que sus instancias sean comparadas y ordenadas automáticamente.

    La interfaz Comparable tiene un único método, compareTo, que toma un objeto como argumento y devuelve
    un valor entero. */