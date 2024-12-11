package Modelos;

import Modelos.Cadsub;
import Modelos.Proyecto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-02T09:13:57")
@StaticMetamodel(Crs.class)
public class Crs_ { 

    public static volatile ListAttribute<Crs, Proyecto> proyectoList;
    public static volatile SingularAttribute<Crs, Cadsub> codCadsub;
    public static volatile SingularAttribute<Crs, Integer> codCrs;
    public static volatile SingularAttribute<Crs, String> nomCrs;
    public static volatile SingularAttribute<Crs, String> nomcrsIngles;
    public static volatile SingularAttribute<Crs, String> informacionesESP;
    public static volatile SingularAttribute<Crs, String> informacionesING;

}