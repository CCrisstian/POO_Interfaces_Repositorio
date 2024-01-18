package org.CCristian.POO_Interfaces;

import org.CCristian.POO_Interfaces.Modelo.Cliente;
import org.CCristian.POO_Interfaces.Repositorio.*;
import org.CCristian.POO_Interfaces.Repositorio.EXCEPCIONES.AccesoDatoEXCEPTION;
import org.CCristian.POO_Interfaces.Repositorio.EXCEPCIONES.Escritura_AccesoDatoEXCEPTION;
import org.CCristian.POO_Interfaces.Repositorio.EXCEPCIONES.Lectura_AccesoDatoEXCEPTION;
import org.CCristian.POO_Interfaces.Repositorio.EXCEPCIONES.RegistroDuplicado_AccesoDatoEXCEPTION;
import org.CCristian.POO_Interfaces.Repositorio.Lista.Cliente_ListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        try {
            ORDENABLE_PAGINABLE_CRUD_Repositorio<Cliente> repo = new Cliente_ListRepositorio();

            repo.Crear(new Cliente("Jano", "Pérez"));    /*Pos: 0*/
            repo.Crear(new Cliente("Bea", "Gonzáles"));  /*Pos: 1*/
            repo.Crear(new Cliente("Luci", "Martínez")); /*Pos: 2*/
//            repo.Crear(new Cliente("Andrés", "Guzmán")); /*Pos: 3*/

            Cliente andres = new Cliente("Andrés", "Guzmán");
            repo.Crear(andres);
            repo.Crear(andres);
//            repo.Crear(null);

            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);

            System.out.println("\n========================PAGINABLE-Desde pos.1 hasta pos.3============================");
            List<Cliente> paginable = repo.listar(1, 3);
            /*Tiene en cuenta la posición dentro de la lista (índice), que comienza en 0.
            No tiene en cuenta el 3*/
            paginable.forEach(System.out::println);


            System.out.println("\n==========================ORDENAR-ASCENDENTE-NOMBRE==========================");
            List<Cliente> clientesOrdenASC = repo.listar("nombre", Direccion.ASC);
            clientesOrdenASC.forEach(System.out::println);


            System.out.println("\n==========================ORDENAR-DESCENDENTE-NOMBRE==========================");
            List<Cliente> clientesOrdenDESCEN = repo.listar("nombre", Direccion.DESC);
            clientesOrdenDESCEN.forEach(System.out::println);


            System.out.println("\n==========================ORDENAR-ASCENDENTE-APELLIDO==========================");
            List<Cliente> clientesApOrdenDESC = repo.listar("apellido", Direccion.ASC);
            clientesApOrdenDESC.forEach(System.out::println);


            System.out.println("\n==========================EDITAR==========================");
            Cliente BeaActualizar = new Cliente("Bea", "Mena");
            BeaActualizar.setId(2);
            repo.Editar(BeaActualizar);
            Cliente bea = repo.BuscarPorId(2);
            System.out.println(bea);
            List<Cliente> clientesEdit = repo.listar();
            clientesEdit.forEach(System.out::println);


            System.out.println("\n==========================CONTAR==========================\n");
            System.out.println(repo.total());


            System.out.println("\n==========================ELIMINAR- Id:2==========================\n");
            repo.Eliminar(2);
            repo.listar().forEach(System.out::println);


            System.out.println("\n==========================CONTAR==========================\n");
            System.out.println(repo.total());

        }
        catch (RegistroDuplicado_AccesoDatoEXCEPTION e){
            System.out.println("REGISTRO DUPLICADO: " + e.getMessage());
            /*Hereda de la clase Escritura_AccesoDatoEXCEPTION*/
            e.printStackTrace();
        }
        catch (Lectura_AccesoDatoEXCEPTION e) {
            System.out.println("LECTURA: " + e.getMessage());
            /*Hereda de la clase AccesoDatoEXCEPTION*/
            e.printStackTrace();
        }
        catch (Escritura_AccesoDatoEXCEPTION e){
            System.out.println("ESCRITURA: " + e.getMessage());
            /*Hereda de la clase AccesoDatoEXCEPTION*/
            e.printStackTrace();
        }
        catch (AccesoDatoEXCEPTION e) {
            System.out.println("GENÉRICA: " + e.getMessage());
            /*Clase padre*/
            e.printStackTrace();
        }

    }
}
