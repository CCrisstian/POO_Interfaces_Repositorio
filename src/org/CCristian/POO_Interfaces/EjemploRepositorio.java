package org.CCristian.POO_Interfaces;

import org.CCristian.POO_Interfaces.Modelo.Cliente;
import org.CCristian.POO_Interfaces.Repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        CRUD_Repositorio repo = new ClienteListRepositorio();

        repo.Crear(new Cliente("Jano","Pérez"));    /*Pos: 0*/
        repo.Crear(new Cliente("Bea","Gonzáles"));  /*Pos: 1*/
        repo.Crear(new Cliente("Luci","Martínez")); /*Pos: 2*/
        repo.Crear(new Cliente("Andrés","Guzmán")); /*Pos: 3*/

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("\n========================PAGINABLE============================\n");
        List<Cliente> paginable = ((PAGINABLE_Repositorio)repo).listar(1,3);
        /*Tiene en cuenta la posición dentro de la lista (indice), que comienza en 0.
        No tiene en cuenta el 3*/
        paginable.forEach(System.out::println);

        System.out.println("\n==========================ORDENAR-ASCENDENTE-NOMBRE==========================\n");
        List<Cliente> clientesOrdenASC = ((ORDENABLE_Repositorio)repo).listar("nombre", Direccion.ASC);
        clientesOrdenASC.forEach(System.out::println);

        System.out.println("\n==========================ORDENAR-DESCENDENTE-NOMBRE==========================\n");
        List<Cliente> clientesOrdenDESCEN = ((ORDENABLE_Repositorio)repo).listar("nombre", Direccion.DESC);
        clientesOrdenDESCEN.forEach(System.out::println);

        System.out.println("\n==========================ORDENAR-ASCENDENTE-APELLIDO==========================\n");
        List<Cliente> clientesApOrdenDESC = ((ORDENABLE_Repositorio)repo).listar("apellido", Direccion.ASC);
        clientesApOrdenDESC.forEach(System.out::println);

        System.out.println("\n==========================EDITAR==========================\n");
        Cliente BeaActualizar = new Cliente("Bea","Mena");
        BeaActualizar.setId(2);
        repo.Editar(BeaActualizar);
        Cliente bea = repo.BuscarPorId(2);
        System.out.println(bea);
        List<Cliente> clientesEdit = repo.listar();
        clientesEdit.forEach(System.out::println);


        System.out.println("\n==========================ELIMINAR==========================\n");
        repo.Eliminar(2);
        repo.listar().forEach(System.out::println);

    }
}
