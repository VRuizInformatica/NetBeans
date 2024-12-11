package Modelos;

import Modelos.Autor;
import Modelos.AutorPremioPK;
import Modelos.Premio;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-24T11:16:00")
@StaticMetamodel(AutorPremio.class)
public class AutorPremio_ { 

    public static volatile SingularAttribute<AutorPremio, Premio> premio;
    public static volatile SingularAttribute<AutorPremio, AutorPremioPK> autorPremioPK;
    public static volatile SingularAttribute<AutorPremio, Autor> autor;

}