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

/**
 * The persistent class for the prueba database table.
 * 
 */
@Entity(name="Prueba")
public class Prueba implements IsSerializable {
//	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "PRUEBA_ID_GENERATOR", sequenceName = "PRUEBA_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRUEBA_ID_GENERATOR")
	private Integer id;

	private String apellido;

	private String nombre;

	public Prueba() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public static List<Prueba> findAll() {
		//Prueba c = null;
		EntityManager em = entityManager();
		try {
			em.getTransaction().begin();
			TypedQuery<Prueba> query = em.createQuery("SELECT p FROM Prueba p", Prueba.class);
			return query.getResultList();
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		} finally {
			em.close();
		}
		return Collections.emptyList();
	}

	public static Prueba findPrueba(Integer id) {
		Prueba c = null;
		EntityManager em = entityManager();
		try {
			em.getTransaction().begin();
			c = em.find(Prueba.class, id);
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

