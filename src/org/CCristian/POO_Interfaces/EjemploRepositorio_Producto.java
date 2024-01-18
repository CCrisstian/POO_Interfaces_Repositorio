package org.CCristian.POO_Interfaces;

import org.CCristian.POO_Interfaces.Modelo.Producto;
import org.CCristian.POO_Interfaces.Repositorio.Direccion;
import org.CCristian.POO_Interfaces.Repositorio.EXCEPCIONES.AccesoDatoEXCEPTION;
import org.CCristian.POO_Interfaces.Repositorio.EXCEPCIONES.Lectura_AccesoDatoEXCEPTION;
import org.CCristian.POO_Interfaces.Repositorio.Lista.Producto_ListRepositorio;
import org.CCristian.POO_Interfaces.Repositorio.ORDENABLE_PAGINABLE_CRUD_Repositorio;

import java.util.List;

public class EjemploRepositorio_Producto {
    public static void main(String[] args) {

        try {
            ORDENABLE_PAGINABLE_CRUD_Repositorio<Producto> repo = new Producto_ListRepositorio();

            repo.Crear(new Producto("Mesa", 50.52));         /*Pos: 0*/
            repo.Crear(new Producto("Silla", 18D));          /*Pos: 1*/
            repo.Crear(new Producto("Lámpara", 15.5));       /*Pos: 2*/
            repo.Crear(new Producto("Notebook", 400.89));    /*Pos: 3*/

            List<Producto> productos = repo.listar();
            productos.forEach(System.out::println);

            System.out.println("\n========================PAGINABLE-pos1 -> pos4============================\n");
            List<Producto> paginable = repo.listar(1, 4);
            /*Tiene en cuenta la posición dentro de la lista (índice), que comienza en 0*/
            paginable.forEach(System.out::println);


            System.out.println("\n==========================ORDENAR-ASCENDENTE-DESCRIPCIÓN==========================\n");
            List<Producto> productosOrdenASC = repo.listar("descripcion", Direccion.ASC);
            productosOrdenASC.forEach(System.out::println);


            System.out.println("\n==========================ORDENAR-DESCENDENTE-DESCRIPCIÓN==========================\n");
            List<Producto> productosOrdenDESCEN = repo.listar("descripcion", Direccion.DESC);
            productosOrdenDESCEN.forEach(System.out::println);


            System.out.println("\n==========================ORDENAR-ASCENDENTE-PRECIO==========================\n");
            List<Producto> productos_Precio_OrdenASC = repo.listar("precio", Direccion.ASC);
            productos_Precio_OrdenASC.forEach(System.out::println);


            System.out.println("\n==========================ORDENAR-DESCENDENTE-PRECIO==========================\n");
            List<Producto> productos_Precio_OrdenDESC = repo.listar("precio", Direccion.DESC);
            productos_Precio_OrdenDESC.forEach(System.out::println);


            System.out.println("\n==========================EDITAR==========================\n");
            System.out.println("*-----------Antes---------------*");
            Producto L = repo.BuscarPorId(3);
            System.out.println(L);
            System.out.println("*-----------Antes---------------*");
            Producto Lampara_Actualizar = new Producto("Lámpara de escritorio", 23D);
            Lampara_Actualizar.setId(3);
            repo.Editar(Lampara_Actualizar);
            Producto Lámpara = repo.BuscarPorId(3);
            System.out.println("*\n-----------Después---------------*");
            System.out.println(Lámpara);
            System.out.println("*-----------Después---------------\n*");
            List<Producto> productos_Edit = repo.listar();
            productos_Edit.forEach(System.out::println);


            System.out.println("\n==========================CONTAR==========================\n");
            System.out.println(repo.total());


            System.out.println("\n==========================ELIMINAR==========================\n");
            repo.Eliminar(2);
            repo.listar().forEach(System.out::println);


            System.out.println("\n==========================CONTAR==========================\n");
            System.out.println(repo.total());
        } catch (Lectura_AccesoDatoEXCEPTION e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoEXCEPTION e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
