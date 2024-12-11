package Modelos;

import Modelos.Autor;
import Modelos.Premio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-24T11:16:00")
@StaticMetamodel(Paise.class)
public class Paise_ { 

    public static volatile ListAttribute<Paise, Premio> premioList;
    public static volatile SingularAttribute<Paise, Integer> codPais;
    public static volatile SingularAttribute<Paise, String> nomPais;
    public static volatile SingularAttribute<Paise, String> bandera;
    public static volatile ListAttribute<Paise, Autor> autorList;

}