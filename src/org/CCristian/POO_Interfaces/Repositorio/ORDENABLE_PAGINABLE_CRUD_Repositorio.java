package org.CCristian.POO_Interfaces.Repositorio;

public interface ORDENABLE_PAGINABLE_CRUD_Repositorio<T> extends ORDENABLE_Repositorio<T>,
                                                            PAGINABLE_Repositorio<T>,
                                                        CRUD_Repositorio<T>,
                                                    CONTABLE_Repositorio{
}

/*Java no admite la herencia múltiple de clases,
sí permite que una interfaz herede de múltiples interfaces*/