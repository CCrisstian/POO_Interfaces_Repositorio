package org.CCristian.GenericsCLASS;

import java.util.Objects;

public class EjemploGenericos {
    public static void main(String[] args) {

        Camion transporte_Caballos = new Camion(5); /*Cant. max de elementos*/

        transporte_Caballos.add_Camion(new Animal("caballo_1","Caballo_A"));
        transporte_Caballos.add_Camion(new Animal("caballo_2","Caballo_B"));
        transporte_Caballos.add_Camion(new Animal("caballo_3","Caballo_C"));



    }
}
