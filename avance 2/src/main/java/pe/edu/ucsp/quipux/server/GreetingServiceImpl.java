package pe.edu.ucsp.quipux.server;

import pe.edu.ucsp.quipux.client.GreetingService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
    GreetingService {

  public String greetServer(String input) throws IllegalArgumentException {
	Prueba p = new Prueba();
	
	return p.findPrueba(3).getApellido();
  }
}
