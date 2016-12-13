package br.com.pessoa.cadastro.applicationConfig;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/rest")
public class ApplicationConfig extends ResourceConfig {

	public ApplicationConfig(){
		packages("br.com.pessoa.cadastro.config");
	}
	
}
