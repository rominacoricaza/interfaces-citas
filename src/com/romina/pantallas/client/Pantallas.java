package com.romina.pantallas.client;

import java.util.Vector;

import com.romina.pantallas.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Pantallas implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		

		
		
		final Button ingresar = new Button("Ingresar");
		final Button salir	  = new Button("Salir");
		final Button consultar	  = new Button("consultar");
		RootPanel.get("ingresar").add(ingresar);
		RootPanel.get("salir").add(salir);
		RootPanel.get("consultar").add(consultar);
		
		RootPanel.get("cuadro_1").setVisible(false);
		RootPanel.get("cuadro_2").setVisible(false);
		RootPanel.get("cuadro_3").setVisible(false);
		RootPanel.get("cuadro_4").setVisible(false);
		RootPanel.get("cuadro_5").setVisible(false);
		
		consultar.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
					RootPanel.get("cuadro_5").setVisible(true);
					RootPanel.get("cuadro_0").setVisible(false);
				
				
					}
				});

		
		ingresar.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				RootPanel.get("cuadro_0").setVisible(false);
				RootPanel.get("cuadro_1").setVisible(true);
				RootPanel.get("cuadro_2").setVisible(true);
				RootPanel.get("cuadro_3").setVisible(true);
				RootPanel.get("cuadro_4").setVisible(true);
				
				final TextBox dni = new TextBox();
				final TextBox app = new TextBox();
				final TextBox apm = new TextBox();
				final TextBox nombre = new TextBox();
				final TextBox edad = new TextBox();
				
				RootPanel.get("dni").add(dni);
				RootPanel.get("app").add(app);
				RootPanel.get("apm").add(apm);
				RootPanel.get("nombre").add(nombre);
				RootPanel.get("edad").add(edad);
				
				final Vector<String> doctores = new Vector<String>(); 
				doctores.add("Pepe");			
				doctores.add("Juana");
				doctores.add("Smit");
				
				final Vector<String> especialidades = new Vector<String>(); 
				especialidades.add("Pediatria");			
				especialidades.add("Geriatria");
				especialidades.add("Medicina General");
				
				final ListBox listaEspecialidades = new ListBox();
				final ListBox listaUbicacion = new ListBox();
				final ListBox listaDoctores = new ListBox();
				final TextBox numeroAtencion = new TextBox();
				
				for (int i = 0; i < especialidades.size(); i++) {
				      listaEspecialidades.addItem(especialidades.get(i));
				}
				
				for (int i = 0; i < doctores.size(); i++) {
				      listaDoctores.addItem(doctores.get(i));
				}
				RootPanel.get("doctor").add(listaDoctores);
				RootPanel.get("especialidad").add(listaEspecialidades);
				RootPanel.get("ubicacion").add(listaUbicacion);
				RootPanel.get("atencion").add(numeroAtencion);
				
				
				final Button aceptarBoton = new Button("Aceptar");
				final Button cancelarBoton = new Button("Cancelar");
				
				RootPanel.get("aceptar").add(aceptarBoton);
				RootPanel.get("cancelar").add(cancelarBoton);
				
				cancelarBoton.addClickHandler(new ClickHandler() {
					public void onClick(ClickEvent event){
						
						RootPanel.get("dni").clear();
						RootPanel.get("app").clear();
						RootPanel.get("apm").clear();
						RootPanel.get("nombre").clear();
						RootPanel.get("edad").clear();
						RootPanel.get("especialidad").clear();
						RootPanel.get("ubicacion").clear();
						RootPanel.get("atencion").clear();
						RootPanel.get("aceptar").clear();
						RootPanel.get("cancelar").clear();
						
						RootPanel.get("cuadro_1").setVisible(false);
						RootPanel.get("cuadro_2").setVisible(false);
						RootPanel.get("cuadro_3").setVisible(false);
						RootPanel.get("cuadro_4").setVisible(false);
						RootPanel.get("cuadro_0").setVisible(true);
						
					}
				});

			}
		});
		
		
	}
}
