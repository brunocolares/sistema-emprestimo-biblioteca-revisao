package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Usuario;
import model.exceptions.OpcaoInexistenteException;
import model.services.UsuarioService;

public class Tela {
	
	private Scanner sc = new Scanner(System.in);
	private GerenciarTela gerenciarTela = new GerenciarTela();
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public void exibirMenuInicial() {
		while(true) {
			System.out.println("Sistema Gerenciador de Emprestimo de Livros");
			System.out.println("-------------------------------------------");
			System.out.println("Menu:");
			System.out.println("[1] Cadastrar usuário");
			System.out.println("[2] Cadastrar livro");
			System.out.println("[3] Realizar emprestimo");
			System.out.println("[4] Registrar devolução");
			System.out.println("[5] Consultar");
			System.out.print("Digite a opção desejada: ");
			try {
				int opcaoDesejada = sc.nextInt();
				sc.nextLine();

				verificarOpcaoMenu(opcaoDesejada);
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("Digite uma opção válida.");
				sc.nextLine();
			} catch (OpcaoInexistenteException e) {
				System.out.println(e.getMessage() + " Digite uma opção válida, de 1 a "+GerenciarTela.MAX_OPCAO_MENU_INICIAL);
				sc.nextLine();
			}
		}
		
	}
	
	public void verificarOpcaoMenu(int opcaoDesejada) {
		if(opcaoDesejada > GerenciarTela.MAX_OPCAO_MENU_INICIAL || opcaoDesejada < 1) {
			throw new OpcaoInexistenteException("Opção inválida!");
		}
		
			switch(opcaoDesejada) {
			case 1:
				exibirTelaCadastrarUsuario();
				break;
			case 2:
				exibirTelaCadastrarLivro();
				break;
			case 3:
				break;
			case 4: 
				break;
			case 5:
				exibirMenuConsultas();
				break;
				
			}
	}
	
	public void exibirTelaCadastrarUsuario() {
		UsuarioService usuarioService = new UsuarioService();

		while(true) {
				System.out.println("* Cadastro de usuário:");
				System.out.print("Digite o nome completo do usuário: ");
				String nomeCompleto = sc.nextLine();
				System.out.print("Digite o CPF: ");
				String cpf = sc.nextLine();
				try {
					System.out.print("Digite a data de nascimento(DD/MM/YYYY): ");
					Date dataNascimento = sdf.parse(sc.nextLine());
					usuarioService.cadastrarUsuario(new Usuario(nomeCompleto, cpf, dataNascimento));

				} catch (ParseException e) {
					System.out.println("Digite a data de nascimento no formato correto: dia/mês/ano");
				} finally {
					exibirMenuInicial();
				}
				break;


		}
		
	}
	
	public void exibirTelaCadastrarLivro() {
		
	}
	
	public void exibirMenuConsultas() {

		while(true) {
			System.out.println("O que você deseja consultar?");
			System.out.println("[1] Listar livros por título");
			System.out.println("[2] Listar livros por autor");
			System.out.println("[3] Listar emprestimos por usuário");
			System.out.println("[4] Listar usuários bloqueados");
			System.out.println("[5] Listar usuários");
			System.out.print("* Digite a opção desejada: ");
			try {
				int opcaoDesejada = sc.nextInt();
				sc.nextLine();
				
				TelaConsulta telaConsulta = new TelaConsulta();
				telaConsulta.verificarOpcaoMenu(opcaoDesejada);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Digite uma opção válida.");
				sc.nextLine();
			} catch (OpcaoInexistenteException e) {
				System.out.println(e.getMessage() + " Digite uma opção válida, de 1 a "+GerenciarTela.MAX_OPCAO_MENU_INICIAL);
				sc.nextLine();
			}
		}
		
		
	}
}
