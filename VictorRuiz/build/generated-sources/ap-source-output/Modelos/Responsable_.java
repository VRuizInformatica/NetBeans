package Modelos;

import Modelos.Sederesponsable;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-02T09:13:57")
@StaticMetamodel(Responsable.class)
public class Responsable_ { 

    public static volatile SingularAttribute<Responsable, String> tipoMisionero;
    public static volatile SingularAttribute<Responsable, String> nomResponsable;
    public static volatile SingularAttribute<Responsable, Integer> codResponsable;
    public static volatile ListAttribute<Responsable, Sederesponsable> sederesponsableList;
    public static volatile SingularAttribute<Responsable, String> tratamiento;

}