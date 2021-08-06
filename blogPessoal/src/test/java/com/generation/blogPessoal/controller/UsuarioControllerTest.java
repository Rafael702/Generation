package com.generation.blogPessoal.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.time.format.DateTimeFormatter;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment =  WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioControllerTest {
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	private Usuario usuario;
	private Usuario usuarioUpdate;
	private Usuario usuarioAdmin;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	public void start() throws ParseException {

		
        usuarioAdmin = new Usuario(0L, "Administrador", "admin@email.com.br", "admin123");

		if(!usuarioRepository.findByUsuario(usuarioAdmin.getUsuario()).isPresent()) {

            HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuarioAdmin);
			testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST, request, Usuario.class);
			
		}
		
		
        usuario = new Usuario(0L, "Rafael Santos", "joao@email.com.br", "13465278");
        
		
        usuarioUpdate = new Usuario(2L, "João da Silva dos Santos Souza", "joao@email.com.br", "joao123");
	}
		
	
	@Disabled
	@Test
	@DisplayName("✔ Cadastrar Usuário")
	public void deveRealizarPostUsuario() {
		HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuario);
		ResponseEntity<Usuario> resposta = testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST,request, Usuario.class);
		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());	
		
	}
	
	@Test
	@DisplayName("👍 Listar todos os Usuários!")
	public void deveMostrarTodosUsuarios() {
		ResponseEntity<String> resposta = testRestTemplate.withBasicAuth("admin@email.com.br","admin123").exchange("/usuarios/all", HttpMethod.GET,null, String.class);
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
	
	@Test
	@DisplayName("😭 Alterar Usuario")
	public void deveRealizarPutUsario() {
		HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuarioUpdate);
		ResponseEntity<Usuario> resposta = testRestTemplate.withBasicAuth("admin@email.com.br", "adimin123").exchange("/usuario/alterar",HttpMethod.PUT,request, Usuario.class);
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
	
}
