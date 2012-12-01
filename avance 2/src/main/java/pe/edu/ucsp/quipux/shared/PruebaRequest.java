package pe.edu.ucsp.quipux.shared;

import java.util.List;

import pe.edu.ucsp.quipux.server.Prueba;

import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;

@Service(Prueba.class)
public interface PruebaRequest extends RequestContext {
	Request<PruebaProxy> findPrueba(Integer id);
	Request<List<PruebaProxy>> findAll();
}
