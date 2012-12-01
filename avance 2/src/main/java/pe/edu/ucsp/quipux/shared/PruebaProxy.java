package pe.edu.ucsp.quipux.shared;

import pe.edu.ucsp.quipux.server.Prueba;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(Prueba.class)
public interface PruebaProxy extends EntityProxy {
	public Integer getId();
	public void setId(Integer id);
	public String getApellido();
	public void setApellido(String apellido);
	public String getNombre();
	public void setNombre(String nombre);
	public Integer getVersion();
	public void setVersion(Integer version);
}
