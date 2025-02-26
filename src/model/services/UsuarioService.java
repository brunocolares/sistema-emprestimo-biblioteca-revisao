package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Usuario;

public class UsuarioService {
	
	private List<Usuario> usuarios = new ArrayList<>();
	
	public void cadastrarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public List<Usuario> listarUsuarios() {
		return usuarios;
	}
}
