package Modelos;

import Modelos.Proyecto;
import Modelos.Sector;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-02T09:13:57")
@StaticMetamodel(Subsector.class)
public class Subsector_ { 

    public static volatile SingularAttribute<Subsector, String> nomSubsector;
    public static volatile ListAttribute<Subsector, Proyecto> proyectoList;
    public static volatile SingularAttribute<Subsector, Sector> codSector;
    public static volatile SingularAttribute<Subsector, Integer> codSubsector;

}