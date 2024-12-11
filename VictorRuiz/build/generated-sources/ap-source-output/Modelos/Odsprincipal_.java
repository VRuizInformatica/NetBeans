package Modelos;

import Modelos.Proyecto;
import Modelos.Sector;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-02T09:13:57")
@StaticMetamodel(Odsprincipal.class)
public class Odsprincipal_ { 

    public static volatile ListAttribute<Odsprincipal, Proyecto> proyectoList;
    public static volatile SingularAttribute<Odsprincipal, String> nomOds;
    public static volatile SingularAttribute<Odsprincipal, Integer> codOds;
    public static volatile ListAttribute<Odsprincipal, Sector> sectorList;

}