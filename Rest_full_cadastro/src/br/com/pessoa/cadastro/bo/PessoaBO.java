package br.com.pessoa.cadastro.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.pessoa.cadastro.to.PessoaTO;

public class PessoaBO {

	public List<PessoaTO> consultar(){
		List<PessoaTO> lista = new ArrayList<PessoaTO>();
		PessoaTO pessoa;
		
		pessoa = new PessoaTO();
		pessoa.setCodigo(1);
		pessoa.setNome("Michael");
		pessoa.setEndereco("Rua a, 234");
		pessoa.setIdade(35);
		pessoa.setEmail("michael@email.com");
		lista.add(pessoa);
		
		pessoa = new PessoaTO();
		pessoa.setCodigo(2);
		pessoa.setNome("Diego");
		pessoa.setEndereco("Rua net, 4");
		pessoa.setIdade(24);
		pessoa.setEmail("nandoReis@email.com");
		lista.add(pessoa);
		
		pessoa = new PessoaTO();
		pessoa.setCodigo(3);
		pessoa.setNome("Monica");
		pessoa.setEndereco("Rua debora, 4");
		pessoa.setIdade(15);
		pessoa.setEmail("claudiao@email.com");
		lista.add(pessoa);
		
		return lista;
	}
	
}
