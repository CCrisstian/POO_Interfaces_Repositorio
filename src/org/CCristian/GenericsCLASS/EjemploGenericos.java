package org.CCristian.GenericsCLASS;

public class EjemploGenericos {
    public static void main(String[] args) {

        Camion<Animal> transporte_Caballos = new Camion<>(5); /*Cant. max de elementos*/

        transporte_Caballos.add_Camion(new Animal("Peregrino","Caballo"));  /*1*/
        transporte_Caballos.add_Camion(new Animal("Grillo","Caballo"));     /*2*/
        transporte_Caballos.add_Camion(new Animal("Tunquen","Caballo"));    /*3*/
        transporte_Caballos.add_Camion(new Animal("Topocalma","Caballo"));  /*4*/
        transporte_Caballos.add_Camion(new Animal("Longotoma","Caballo"));  /*5*/
        System.out.println("=================transporte_Caballos==================");
        Imprimir_Camion(transporte_Caballos);

        Camion<Maquinaria> transporte_Maquinas = new Camion<>(3);
        transporte_Maquinas.add_Camion(new Maquinaria("Bulldozer"));        /*1*/
        transporte_Maquinas.add_Camion(new Maquinaria("Grúa Horquilla"));   /*2*/
        transporte_Maquinas.add_Camion(new Maquinaria("Perforadora"));      /*3*/
        System.out.println("\n=================transporte_Maquinas==================");
        Imprimir_Camion(transporte_Maquinas);

        Camion<Automovil> transporte_Autos = new Camion<>(3);
        transporte_Autos.add_Camion(new Automovil("Toyota"));        /*1*/
        transporte_Autos.add_Camion(new Automovil("Mitsubishi"));   /*2*/
        transporte_Autos.add_Camion(new Automovil("Chevrolet"));      /*3*/
        System.out.println("\n=================transporte_Autos==================");
        Imprimir_Camion(transporte_Autos);
    }

    public static <T> void Imprimir_Camion(Camion<T> camion){
        for (T c: camion){
            if (c instanceof Animal){
                System.out.println("Nombre: '"+((Animal)c).getNombre()+"'\t\tTipo: '"+ ((Animal)c).getTipo()+"'");
            } else if (c instanceof Maquinaria) {
                System.out.println("Tipo: '"+ ((Maquinaria)c).getTipo()+"'");
            } else if (c instanceof Automovil) {
                System.out.println("Marca: '"+ ((Automovil)c).getMarca()+"'");
            }
        }
    }
}
