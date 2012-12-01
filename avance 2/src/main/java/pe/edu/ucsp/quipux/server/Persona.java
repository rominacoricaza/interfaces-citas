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

@Entity(name="Persona")
public class Persona implements IsSerializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "PRUEBA_ID_GENERATOR", sequenceName = "PRUEBA_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRUEBA_ID_GENERATOR")
	private Integer id;

	private String apellido;

	private String nombre;

	private String direccion;
	
	private Integer telefono;
	
	public Persona() {
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

	public Integer gettelefono() {
		return this.telefono;
	}

	public void settelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	public String getdirecion() {
		return this.direccion;
	}

	public void setdireccion(String direccion) {
		this.direccion = direccion;
	}
	public static EntityManager entityManager() {
		return (new UnitPersistence()).get();
	}

	public static List<Persona> findAll() {
		Persona c = null;
		EntityManager em = entityManager();
		try {
			em.getTransaction().begin();
			TypedQuery<Persona> query = em.createQuery("SELECT p FROM Persona p", Persona.class);
			return query.getResultList();
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		} finally {
			em.close();
		}
		return Collections.emptyList();
	}

	public static Persona findPersona(Integer id) {
		Persona c = null;
		EntityManager em = entityManager();
		try {
			em.getTransaction().begin();
			c = em.find(Persona.class, id);
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



