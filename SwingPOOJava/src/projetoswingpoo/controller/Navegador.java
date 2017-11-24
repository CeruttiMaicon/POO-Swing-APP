package projetoswingpoo.controller;

import projetoswingpoo.view.Cadastro;
import projetoswingpoo.view.CadastroFoto;
import projetoswingpoo.view.CadastroPronto;
import projetoswingpoo.view.MenuLogin;
import projetoswingpoo.view.TelaContinueAoCadastro;
import projetoswingpoo.view.TelaInicioDoAPP;

public class Navegador {
	
	public static void toLogin(){
		MenuLogin login = new MenuLogin();
	}
	public static void toCadastro(){
		ClienteCadastro controller = new ClienteCadastro();
		controller.initcontroller();
	}
	public static void toCadastroFoto(){
		CadastroFoto cadastrofoto = new CadastroFoto();
	}
	public static void toCadastropronto(){
		CadastroPronto cadastropronto = new CadastroPronto();	
	}
	public static void toTelaContinuarCadastro(){
		TelaContinueAoCadastro continuar = new TelaContinueAoCadastro();
	}
	public static void toTelaInicio(){
		TelaInicioDoAPP inicio = new TelaInicioDoAPP();
	}
	
}
