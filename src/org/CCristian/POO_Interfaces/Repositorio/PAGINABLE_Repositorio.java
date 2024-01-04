package org.CCristian.POO_Interfaces.Repositorio;

import org.CCristian.POO_Interfaces.Modelo.Cliente;

import java.util.List;

public interface PAGINABLE_Repositorio {
    List<Cliente> listar(int desde, int hasta);

}
