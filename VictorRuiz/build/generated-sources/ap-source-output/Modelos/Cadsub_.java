package Modelos;

import Modelos.Cad;
import Modelos.Crs;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-02T09:13:57")
@StaticMetamodel(Cadsub.class)
public class Cadsub_ { 

    public static volatile SingularAttribute<Cadsub, String> nomSubcad;
    public static volatile SingularAttribute<Cadsub, String> informacionESP;
    public static volatile SingularAttribute<Cadsub, String> informacionING;
    public static volatile SingularAttribute<Cadsub, String> nomsubcadING;
    public static volatile SingularAttribute<Cadsub, Cad> codCad;
    public static volatile SingularAttribute<Cadsub, Integer> codSubcad;
    public static volatile ListAttribute<Cadsub, Crs> crsList;

}