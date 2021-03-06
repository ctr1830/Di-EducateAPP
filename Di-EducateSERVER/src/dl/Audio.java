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
 * Audio generated by hbm2java
 */

@Entity
@NamedQueries({
	@NamedQuery(name="Audio.findAll", query="SELECT a FROM Audio a"),
	@NamedQuery(name="Audio.findAllByDatosEjercicio", query="SELECT a FROM Audio a  WHERE a.datosEjercicio= :datosEjercicio")
})


@Table(name = "AUDIO")
public class Audio implements java.io.Serializable {

	private Integer idAudio;
	private DatosEjercicio datosEjercicio;
	private String url;

	public Audio() {
	}

	public Audio(DatosEjercicio datosEjercicio, String url) {
		this.datosEjercicio = datosEjercicio;
		this.url = url;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idAUDIO", unique = true, nullable = false)
	public Integer getIdAudio() {
		return this.idAudio;
	}

	public void setIdAudio(Integer idAudio) {
		this.idAudio = idAudio;
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
