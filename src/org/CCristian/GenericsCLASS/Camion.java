package org.CCristian.GenericsCLASS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Camion<T> implements Iterable<T>{
/*-------------------ATRIBUTOS-----------------------*/
    private List<T> objetos;
    private int max;
/*-------------------ATRIBUTOS-----------------------*/


/*-------------------CONSTRUCTOR-----------------------*/
    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }
/*-------------------CONSTRUCTOR-----------------------*/


/*-------------------MÉTODOS-----------------------*/
    public void add_Camion(T objeto){
        if (this.objetos.size() <= max){
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("NO HAY más espacio en el Camión!! >:(");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
/*-------------------MÉTODOS-----------------------*/
}

/*La interfaz Iterable permite que un objeto sea "iterable", lo que significa que se puede
recorrer mediante un bucle for-each para acceder a sus elementos.
La interfaz Iterable tiene un solo método, iterator(), que devuelve un objeto de tipo Iterator.
El Iterator es responsable de recorrer los elementos de la colección */