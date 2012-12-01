package pe.edu.ucsp.quipux.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GreetingServiceAsync {

	void greetServer(String name, AsyncCallback<String> callback);

}
