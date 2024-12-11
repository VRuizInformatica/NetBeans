package Modelos;

import Modelos.Autor;
import Modelos.Premio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-24T11:16:00")
@StaticMetamodel(Libro.class)
public class Libro_ { 

    public static volatile SingularAttribute<Libro, String> nomLibro;
    public static volatile SingularAttribute<Libro, Integer> ano;
    public static volatile SingularAttribute<Libro, String> pelicula;
    public static volatile SingularAttribute<Libro, Integer> codLibro;
    public static volatile ListAttribute<Libro, Premio> premioList;
    public static volatile SingularAttribute<Libro, String> nomArchivo;
    public static volatile SingularAttribute<Libro, String> comentario;
    public static volatile SingularAttribute<Libro, String> portada;
    public static volatile ListAttribute<Libro, Autor> autorList;

}