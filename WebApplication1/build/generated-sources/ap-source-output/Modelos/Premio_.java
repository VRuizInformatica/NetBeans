package Modelos;

import Modelos.AutorPremio;
import Modelos.Libro;
import Modelos.Paise;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-24T11:16:00")
@StaticMetamodel(Premio.class)
public class Premio_ { 

    public static volatile SingularAttribute<Premio, Character> tipo;
    public static volatile ListAttribute<Premio, AutorPremio> autorPremioList;
    public static volatile ListAttribute<Premio, Libro> libroList;
    public static volatile SingularAttribute<Premio, String> nomPremio;
    public static volatile SingularAttribute<Premio, Integer> codPremio;
    public static volatile SingularAttribute<Premio, Paise> codPais;

}