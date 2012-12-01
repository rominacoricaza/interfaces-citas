package pe.edu.ucsp.quipux.server;

import java.util.Collections;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.TypedQuery;

import com.google.gwt.user.client.rpc.IsSerializable;

@Entity(name="Roster_Medicos")
public class Roster_Medicos implements IsSerializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "PRUEBA_ID_GENERATOR", sequenceName = "PRUEBA_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRUEBA_ID_GENERATOR")
	private Integer idRoster_Medicos;
	private Integer id;
	private String horario_trabajo;

	private Integer mes;
	private Integer anio;
	private Integer dia;
	
	

	public Roster_Medicos() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String gethorario_trabajo() {
		return this.horario_trabajo;
	}

	public void sethorario_trabajo(String horario_trabajo) {
		this.horario_trabajo = horario_trabajo;
	}

	public Integer getmes() {
		return this.mes;
	}

	public void setmes(Integer mes) {
		this.mes = mes;
	}
	public Integer getanio() {
		return this.anio;
	}

	public void setanio(Integer anio) {
		this.anio = anio;
	}

	public Integer getdia() {
		return this.dia;
	}

	public void setdia(Integer dia) {
		this.dia = dia;
	}
	
	
	public static EntityManager entityManager() {
		return (new UnitPersistence()).get();
	}

	public static List<Roster_Medicos> findAll() {
		Roster_Medicos c = null;
		EntityManager em = entityManager();
		try {
			em.getTransaction().begin();
			TypedQuery<Roster_Medicos> query = em.createQuery("SELECT p FROM Roster_Manager r", Roster_Medicos.class);
			return query.getResultList();
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		} finally {
			em.close();
		}
		return Collections.emptyList();
	}

	public static Roster_Medicos findRoster_Medicos(Integer id) {
		Roster_Medicos c = null;
		EntityManager em = entityManager();
		try {
			em.getTransaction().begin();
			c = em.find(Roster_Medicos.class, id);
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		} finally {
			em.close();
		}
		return c;
	}

	public Integer getVersion() {
		return 0;
	}

	public void setVersion(Integer version) {

	}

}

