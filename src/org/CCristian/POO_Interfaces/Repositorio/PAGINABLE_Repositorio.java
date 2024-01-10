package org.CCristian.POO_Interfaces.Repositorio;

import java.util.List;

public interface PAGINABLE_Repositorio<T>{
    List<T> listar(int desde, int hasta);

}
