package org.CCristian.POO_Interfaces.Repositorio.Lista;

import org.CCristian.POO_Interfaces.Modelo.Cliente;
import org.CCristian.POO_Interfaces.Modelo.Producto;
import org.CCristian.POO_Interfaces.Repositorio.ABASTRACTA_ListRepositorio;
import org.CCristian.POO_Interfaces.Repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class Producto_ListRepositorio extends ABASTRACTA_ListRepositorio<Producto> {
    @Override
    public void Editar(Producto producto) {
        Producto p = BuscarPorId(producto.getId());
        p.setDescripcion(producto.getDescripcion());
        p.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> ListaOrdenada = new ArrayList<>(this.dataSource);
        ListaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC) {
                resultado = ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
                resultado = ordenar(campo, b, a);
            }
            return resultado;
        });

        return ListaOrdenada ;
    }

    public static int ordenar (String campo, Producto a, Producto b){
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "descripcion" -> resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" -> resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }
}