package steps;

import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import elementos.Elementos;
import metodos.Metodos;

public class Steps {
	Metodos m = new Metodos();
	Elementos e = new Elementos();
	
	@Dado("^que o usuario acesse a url \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_url(String arg1) throws Throwable {
	m.ExecutarNavegador(arg1);
	}

	@Dado("^selecione o campo abra a sua conta$")
	public void selecione_o_campo_abra_a_sua_conta() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Dado("^preencha os dados$")
	public void preencha_os_dados() throws Throwable {
	}

	@Dado("^selecione a politica de privacidade$")
	public void selecione_a_politica_de_privacidade() throws Throwable {
	}

	@Quando("^selecionar o botao continuar$")
	public void selecionar_o_botao_continuar() throws Throwable {
	}

	@Entao("^realizo a validacao do texto Prontinho! Recebemos os seus dados$")
	public void realizo_a_validacao_do_texto_Prontinho_Recebemos_os_seus_dados() throws Throwable {
	}

	
}
