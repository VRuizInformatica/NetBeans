package Modelos;

import Modelos.Odsprincipal;
import Modelos.Proyecto;
import Modelos.Subsector;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-02T09:13:57")
@StaticMetamodel(Sector.class)
public class Sector_ { 

    public static volatile SingularAttribute<Sector, String> sectorCad;
    public static volatile ListAttribute<Sector, Proyecto> proyectoList;
    public static volatile SingularAttribute<Sector, String> nomSector;
    public static volatile SingularAttribute<Sector, String> nomsectorIng;
    public static volatile SingularAttribute<Sector, Integer> codSector;
    public static volatile ListAttribute<Sector, Subsector> subsectorList;
    public static volatile SingularAttribute<Sector, String> explicacion;
    public static volatile ListAttribute<Sector, Odsprincipal> odsprincipalList;
    public static volatile SingularAttribute<Sector, String> explicacionIng;

}