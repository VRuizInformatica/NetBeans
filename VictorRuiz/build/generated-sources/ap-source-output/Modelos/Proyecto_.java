package Modelos;

import Modelos.Crs;
import Modelos.Entidad;
import Modelos.Envio;
import Modelos.Inspectoria;
import Modelos.Odsprincipal;
import Modelos.Sector;
import Modelos.Sede;
import Modelos.Subsector;
import Modelos.Tecnico;
import Modelos.Tipoentidad;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-02T09:13:57")
@StaticMetamodel(Proyecto.class)
public class Proyecto_ { 

    public static volatile SingularAttribute<Proyecto, String> descripcion;
    public static volatile SingularAttribute<Proyecto, Double> ciMs;
    public static volatile SingularAttribute<Proyecto, String> justificacion;
    public static volatile SingularAttribute<Proyecto, String> socioLocal;
    public static volatile SingularAttribute<Proyecto, Short> parte;
    public static volatile SingularAttribute<Proyecto, Sector> sectorMS;
    public static volatile SingularAttribute<Proyecto, Integer> numBeneficiariosMujeres;
    public static volatile SingularAttribute<Proyecto, String> ingles;
    public static volatile SingularAttribute<Proyecto, Boolean> cerrado;
    public static volatile SingularAttribute<Proyecto, String> instrumento;
    public static volatile SingularAttribute<Proyecto, Integer> tipoProyecto;
    public static volatile SingularAttribute<Proyecto, Double> dineroConcedido;
    public static volatile SingularAttribute<Proyecto, String> comentarios;
    public static volatile SingularAttribute<Proyecto, String> codigo;
    public static volatile SingularAttribute<Proyecto, String> opd;
    public static volatile SingularAttribute<Proyecto, Double> cdSedeLocal;
    public static volatile SingularAttribute<Proyecto, String> opdContactoTelefono;
    public static volatile ListAttribute<Proyecto, Crs> crsList;
    public static volatile SingularAttribute<Proyecto, Integer> duracionReal;
    public static volatile SingularAttribute<Proyecto, Date> fechaFin;
    public static volatile SingularAttribute<Proyecto, Integer> anyo;
    public static volatile SingularAttribute<Proyecto, Double> apoCdMs;
    public static volatile SingularAttribute<Proyecto, Date> fechaConcesion;
    public static volatile SingularAttribute<Proyecto, Integer> numProyecto;
    public static volatile SingularAttribute<Proyecto, Integer> codProyecto;
    public static volatile SingularAttribute<Proyecto, Short> subcategoria;
    public static volatile SingularAttribute<Proyecto, Inspectoria> inspectoria;
    public static volatile SingularAttribute<Proyecto, Date> fechaFinAmpliacion;
    public static volatile SingularAttribute<Proyecto, String> subsectorJYD;
    public static volatile SingularAttribute<Proyecto, Integer> status;
    public static volatile SingularAttribute<Proyecto, Tipoentidad> tipoEntidad;
    public static volatile SingularAttribute<Proyecto, String> numEntidadesBeneficiarias;
    public static volatile SingularAttribute<Proyecto, Double> dineroSolicitado;
    public static volatile SingularAttribute<Proyecto, Integer> duracionIF;
    public static volatile SingularAttribute<Proyecto, String> titulo;
    public static volatile SingularAttribute<Proyecto, String> opdContactoMail;
    public static volatile SingularAttribute<Proyecto, Tecnico> tecSeg;
    public static volatile SingularAttribute<Proyecto, Subsector> subsectorMS;
    public static volatile SingularAttribute<Proyecto, Integer> responsableLocal;
    public static volatile SingularAttribute<Proyecto, Double> ciSocioLocal;
    public static volatile SingularAttribute<Proyecto, String> sectorJYD;
    public static volatile SingularAttribute<Proyecto, Boolean> informeDonante;
    public static volatile SingularAttribute<Proyecto, Date> fechaInicio;
    public static volatile SingularAttribute<Proyecto, Integer> duracionTrasAmpliacion;
    public static volatile SingularAttribute<Proyecto, String> localizacion;
    public static volatile SingularAttribute<Proyecto, Boolean> extinguido;
    public static volatile ListAttribute<Proyecto, Envio> envioList;
    public static volatile SingularAttribute<Proyecto, Integer> sectorCAD;
    public static volatile SingularAttribute<Proyecto, Double> cd;
    public static volatile SingularAttribute<Proyecto, String> docConcesion;
    public static volatile SingularAttribute<Proyecto, Integer> responsableLegal;
    public static volatile SingularAttribute<Proyecto, Double> ci;
    public static volatile SingularAttribute<Proyecto, Sede> sede;
    public static volatile SingularAttribute<Proyecto, Short> categoria;
    public static volatile ListAttribute<Proyecto, Odsprincipal> odsprincipalList;
    public static volatile SingularAttribute<Proyecto, Double> costoTotal;
    public static volatile SingularAttribute<Proyecto, Boolean> aprobado;
    public static volatile SingularAttribute<Proyecto, String> ong;
    public static volatile SingularAttribute<Proyecto, String> descripcionBeneficiarios;
    public static volatile SingularAttribute<Proyecto, Integer> numBeneficiarioInd;
    public static volatile SingularAttribute<Proyecto, String> pais;
    public static volatile SingularAttribute<Proyecto, Date> fechamaximaIF;
    public static volatile SingularAttribute<Proyecto, String> target;
    public static volatile SingularAttribute<Proyecto, Date> fechaCierre;
    public static volatile SingularAttribute<Proyecto, Integer> numBeneficiarios;
    public static volatile SingularAttribute<Proyecto, String> regionSdb;
    public static volatile SingularAttribute<Proyecto, Integer> opdContactoNombre;
    public static volatile SingularAttribute<Proyecto, Integer> numBeneficiariosHombres;
    public static volatile SingularAttribute<Proyecto, Entidad> entidad;
    public static volatile SingularAttribute<Proyecto, Tecnico> tecFor;
    public static volatile SingularAttribute<Proyecto, String> referencia;

}