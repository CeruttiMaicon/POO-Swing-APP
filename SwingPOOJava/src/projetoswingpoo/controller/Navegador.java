package projetoswingpoo.controller;

import projetoswingpoo.view.Cadastro;
import projetoswingpoo.view.CadastroFoto;
import projetoswingpoo.view.CadastroPronto;
import projetoswingpoo.view.Calendario;
import projetoswingpoo.view.MenuLogin;
import projetoswingpoo.view.TelaContinueAoCadastro;
import projetoswingpoo.view.TelaInicioDoAPP;
import projetoswingpoo.view.TelaLocais;
import projetoswingpoo.view.TelaPerfil;

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
	public static void toTelaPerfil(){
		TelaPerfil perfil = new TelaPerfil();
	}
	public static void toTelaLocais(){
		TelaLocais locais = new TelaLocais();
	}
	public static void toTelaCalendario(){
		Calendario calendario = new Calendario();
	}
}
