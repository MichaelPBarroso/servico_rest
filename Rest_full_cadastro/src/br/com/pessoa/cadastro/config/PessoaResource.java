package br.com.pessoa.cadastro.config;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import br.com.pessoa.cadastro.bo.PessoaBO;

@Path("/pessoa")
public class PessoaResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String buscarPessoa(){
		PessoaBO bo = new PessoaBO();
		
		return new Gson().toJson(bo.consultar());
	}
	
	@POST
	public String buscarPorIdPessoa(){
		return "outro buscar";
	}
	
	@PUT
	public String atualizarPessoa(){
		return "atualizar";
	}
	
	@DELETE
	public String deletarPessoa(){
		return "deletar";
	}
}
