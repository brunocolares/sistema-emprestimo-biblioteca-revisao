package view;

import java.util.List;

import model.entities.Usuario;
import model.exceptions.OpcaoInexistenteException;
import model.services.UsuarioService;

public class TelaConsulta {

	public void verificarOpcaoMenu(int opcaoDesejada) {
		if(opcaoDesejada > GerenciarTela.MAX_OPCAO_MENU_CONSULTA || opcaoDesejada < 1) {
			throw new OpcaoInexistenteException("Opção inválida!");
		}
		
		switch(opcaoDesejada) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4: 
				break;
			case 5:
				listarUsuarios();
				break;
			}
	}
	
	public void listarUsuarios() {
		UsuarioService usuarioService = new UsuarioService();
		List<Usuario> usuarios = usuarioService.listarUsuarios();
		
		for(Usuario usuario : usuarios) {
			System.out.println("Nome: "+ usuario.getNomeCompleto());
			System.out.println("Data de nascimento: "+ usuario.getDataNascimento());
		}
	}
}
