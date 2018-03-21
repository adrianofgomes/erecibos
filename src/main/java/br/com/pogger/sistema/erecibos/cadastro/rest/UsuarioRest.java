package br.com.pogger.sistema.erecibos.cadastro.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.pogger.sistema.erecibos.cadastro.entity.Usuario;

@Path("/usuario")
public class UsuarioRest {

	@GET
	@Path("/")
	@Produces({ "application/json" })
	public List<Usuario> findAll(){
		List<Usuario> listaUsuarios = new ArrayList<>();
		
		Usuario user1 = new Usuario();
		user1.setNome("Fulano");
		user1.setLogin("fulano");
		user1.setPassword("****");
		listaUsuarios.add(user1);
		
		Usuario user2 = new Usuario();
		user2.setNome("Beltrano");
		user2.setLogin("beltrano");
		user2.setPassword("xxxx");
		listaUsuarios.add(user2);
		
		return listaUsuarios;
	}
}
