package Modelos;

import Modelos.AutorPremio;
import Modelos.Libro;
import Modelos.Paise;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-24T11:16:00")
@StaticMetamodel(Autor.class)
public class Autor_ { 

    public static volatile SingularAttribute<Autor, Date> fDef;
    public static volatile SingularAttribute<Autor, String> apellido2;
    public static volatile ListAttribute<Autor, AutorPremio> autorPremioList;
    public static volatile SingularAttribute<Autor, String> foto;
    public static volatile SingularAttribute<Autor, Date> fNac;
    public static volatile ListAttribute<Autor, Libro> libroList;
    public static volatile SingularAttribute<Autor, String> apellido1;
    public static volatile SingularAttribute<Autor, String> nomAutor;
    public static volatile SingularAttribute<Autor, String> biografia;
    public static volatile SingularAttribute<Autor, String> localidad;
    public static volatile SingularAttribute<Autor, Integer> codAutor;
    public static volatile SingularAttribute<Autor, Paise> nacionalidad;

}