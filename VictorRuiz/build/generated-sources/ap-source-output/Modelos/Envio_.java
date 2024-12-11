package Modelos;

import Modelos.EnvioPK;
import Modelos.Proyecto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-02T09:13:57")
@StaticMetamodel(Envio.class)
public class Envio_ { 

    public static volatile SingularAttribute<Envio, EnvioPK> envioPK;
    public static volatile SingularAttribute<Envio, Boolean> acuseReciboMs;
    public static volatile SingularAttribute<Envio, Proyecto> proyecto;
    public static volatile SingularAttribute<Envio, Double> cantidad;
    public static volatile SingularAttribute<Envio, Boolean> acuseBanco;
    public static volatile SingularAttribute<Envio, String> comentario;

}