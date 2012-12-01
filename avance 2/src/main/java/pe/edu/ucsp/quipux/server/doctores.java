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

import pe.edu.ucsp.quipux.server.UnitPersistence;
//import pe.edu.ucsp.quipux.server;

import com.google.gwt.user.client.rpc.IsSerializable;

@Entity(name="doctores")
public class doctores implements IsSerializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "PRUEBA_ID_GENERATOR", sequenceName = "PRUEBA_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRUEBA_ID_GENERATOR")
	private Integer id;

	private String apellido;
	private Integer Roster_Medicos ;
	private String nombre;

	public doctores() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoter_Medicos() {
		return this.Roster_Medicos;
	}

	public void setRoster_Medicos(Integer Roster_Medicos) {
		this.Roster_Medicos = Roster_Medicos;
	}
	
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static EntityManager entityManager() {
		return (new UnitPersistence()).get();
	}

	public static List<doctores> findAll() {
		doctores c = null;
		EntityManager em = entityManager();
		try {
			em.getTransaction().begin();
			TypedQuery<doctores> query = em.createQuery("SELECT p FROM doctores d", doctores.class);
			return query.getResultList();
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		} finally {
			em.close();
		}
		return Collections.emptyList();
	}

	public static doctores finddoctores(Integer id) {
		doctores c = null;
		EntityManager em = entityManager();
		try {
			em.getTransaction().begin();
			c = em.find(doctores.class, id);
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
