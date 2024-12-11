package Modelos;

import Modelos.Cadsub;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-02T09:13:57")
@StaticMetamodel(Cad.class)
public class Cad_ { 

    public static volatile SingularAttribute<Cad, Integer> codCad;
    public static volatile SingularAttribute<Cad, String> nomCad;
    public static volatile ListAttribute<Cad, Cadsub> cadsubList;

}