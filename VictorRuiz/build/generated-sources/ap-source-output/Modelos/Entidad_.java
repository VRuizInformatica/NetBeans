package Modelos;

import Modelos.Proyecto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-02T09:13:57")
@StaticMetamodel(Entidad.class)
public class Entidad_ { 

    public static volatile ListAttribute<Entidad, Proyecto> proyectoList;
    public static volatile SingularAttribute<Entidad, Integer> codigo;
    public static volatile SingularAttribute<Entidad, String> nomEntidad;
    public static volatile SingularAttribute<Entidad, Integer> tipoEntidad;

}