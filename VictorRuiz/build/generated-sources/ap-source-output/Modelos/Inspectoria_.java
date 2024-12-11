package Modelos;

import Modelos.Proyecto;
import Modelos.Sede;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-02T09:13:57")
@StaticMetamodel(Inspectoria.class)
public class Inspectoria_ { 

    public static volatile SingularAttribute<Inspectoria, String> nomInspectoria;
    public static volatile ListAttribute<Inspectoria, Proyecto> proyectoList;
    public static volatile SingularAttribute<Inspectoria, Integer> codigo;
    public static volatile SingularAttribute<Inspectoria, String> opd;
    public static volatile SingularAttribute<Inspectoria, Integer> opdContactoNombre;
    public static volatile ListAttribute<Inspectoria, Sede> sedeList;
    public static volatile SingularAttribute<Inspectoria, Integer> responsableLegal;
    public static volatile SingularAttribute<Inspectoria, String> opdContactoTelefono;
    public static volatile SingularAttribute<Inspectoria, String> socioLocal;
    public static volatile SingularAttribute<Inspectoria, String> opdContactoMail;
    public static volatile SingularAttribute<Inspectoria, String> codInspectoria;

}