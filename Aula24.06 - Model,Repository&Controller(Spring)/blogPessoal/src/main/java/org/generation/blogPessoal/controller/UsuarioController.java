package org.generation.blogPessoal.controller;

import java.util.Optional;

import org.generation.blogPessoal.model.UsarioLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.generation.blogPessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/logar")
	public ResponseEntity<UsarioLogin> Authentication(@RequestBody Optional<UsarioLogin> usuario){
		return usuarioService.Logar(usuario).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	//Ajuste para o Heroku
//	@PostMapping("/cadastrar")
//	public ResponseEntity<Usuario> Post(@RequestBody Usuario usuario){
//		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.CadastrarUsuario(usuario));
//	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity <Usuario> Post(@RequestBody Usuario usuario) {
		
		Usuario usuarioResp = usuarioService.CadastrarUsuario(usuario);
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(usuarioResp);
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}
		
}
