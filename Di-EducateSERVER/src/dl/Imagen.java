package dl;
// Generated 23-nov-2016 15:49:48 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Imagen generated by hbm2java
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Imagen.findAll", query="SELECT i FROM Imagen i"),
	@NamedQuery(name="Imagen.findAllByDatosEjercicio", query="SELECT i FROM Imagen i  WHERE i.datosEjercicio= :datosEjercicio")
})



@Table(name = "IMAGEN")
public class Imagen implements java.io.Serializable {

	private Integer idImagen;
	private DatosEjercicio datosEjercicio;
	private String url;

	public Imagen() {
	}

	public Imagen(DatosEjercicio datosEjercicio, String url) {
		this.datosEjercicio = datosEjercicio;
		this.url = url;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idIMAGEN", unique = true, nullable = false)
	public Integer getIdImagen() {
		return this.idImagen;
	}

	public void setIdImagen(Integer idImagen) {
		this.idImagen = idImagen;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDATOS_EJERCICIO", nullable = false)
	public DatosEjercicio getDatosEjercicio() {
		return this.datosEjercicio;
	}

	public void setDatosEjercicio(DatosEjercicio datosEjercicio) {
		this.datosEjercicio = datosEjercicio;
	}

	@Column(name = "url", nullable = false, length = 250)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
