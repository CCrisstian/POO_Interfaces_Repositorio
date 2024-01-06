package org.CCristian.POO_Interfaces.Repositorio;

public interface ORDENABLE_PAGINABLE_CRUD_Repositorio extends ORDENABLE_Repositorio,
                                                            PAGINABLE_Repositorio,
                                                        CRUD_Repositorio,
                                                    CONTABLE_Repositorio{
}

/*Java no admite la herencia múltiple de clases,
sí permite que una interfaz herede de múltiples interfaces*/