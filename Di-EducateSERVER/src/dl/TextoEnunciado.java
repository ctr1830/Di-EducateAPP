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
 * TextoEnunciado generated by hbm2java
 */
@Entity
@NamedQueries({
	@NamedQuery(name="TextoEnunciado.findAll", query="SELECT t FROM TextoEnunciado t"),
	@NamedQuery(name="TextoEnunciado.findAllByDatosEjercicio", query="SELECT t FROM TextoEnunciado t  WHERE t.datosEjercicio= :datosEjercicio")
})

@Table(name = "TEXTO_ENUNCIADO")
public class TextoEnunciado implements java.io.Serializable {

	private Integer idTextoEnunciado;
	private DatosEjercicio datosEjercicio;
	private String textoEnunciado;

	public TextoEnunciado() {
	}

	public TextoEnunciado(DatosEjercicio datosEjercicio, String textoEnunciado) {
		this.datosEjercicio = datosEjercicio;
		this.textoEnunciado = textoEnunciado;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idTEXTO_ENUNCIADO", unique = true, nullable = false)
	public Integer getIdTextoEnunciado() {
		return this.idTextoEnunciado;
	}

	public void setIdTextoEnunciado(Integer idTextoEnunciado) {
		this.idTextoEnunciado = idTextoEnunciado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDATOS_EJERCICIO", nullable = false)
	public DatosEjercicio getDatosEjercicio() {
		return this.datosEjercicio;
	}

	public void setDatosEjercicio(DatosEjercicio datosEjercicio) {
		this.datosEjercicio = datosEjercicio;
	}

	@Column(name = "TEXTO_ENUNCIADO", nullable = false, length = 250)
	public String getTextoEnunciado() {
		return this.textoEnunciado;
	}

	public void setTextoEnunciado(String textoEnunciado) {
		this.textoEnunciado = textoEnunciado;
	}

}
