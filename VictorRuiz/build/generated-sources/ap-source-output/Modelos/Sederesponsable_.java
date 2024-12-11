package Modelos;

import Modelos.Responsable;
import Modelos.Sede;
import Modelos.SederesponsablePK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-02T09:13:57")
@StaticMetamodel(Sederesponsable.class)
public class Sederesponsable_ { 

    public static volatile SingularAttribute<Sederesponsable, SederesponsablePK> sederesponsablePK;
    public static volatile SingularAttribute<Sederesponsable, Responsable> responsable;
    public static volatile SingularAttribute<Sederesponsable, Sede> sede;
    public static volatile SingularAttribute<Sederesponsable, String> telefono;
    public static volatile SingularAttribute<Sederesponsable, Date> fechaFin;
    public static volatile SingularAttribute<Sederesponsable, String> email;

}