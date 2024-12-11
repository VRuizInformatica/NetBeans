package Modelos;

import Modelos.Inspectoria;
import Modelos.Proyecto;
import Modelos.Sederesponsable;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-02T09:13:57")
@StaticMetamodel(Sede.class)
public class Sede_ { 

    public static volatile SingularAttribute<Sede, String> codSede;
    public static volatile SingularAttribute<Sede, String> nomSede;
    public static volatile ListAttribute<Sede, Proyecto> proyectoList;
    public static volatile SingularAttribute<Sede, String> ciudad;
    public static volatile SingularAttribute<Sede, String> socioLocal;
    public static volatile SingularAttribute<Sede, String> direccion;
    public static volatile SingularAttribute<Sede, Inspectoria> codInspectoria;
    public static volatile ListAttribute<Sede, Sederesponsable> sederesponsableList;
    public static volatile SingularAttribute<Sede, String> telefono;
    public static volatile SingularAttribute<Sede, String> pais;

}