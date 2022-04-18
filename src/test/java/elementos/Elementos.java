package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirSuaConta = By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[3]/div/button");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("celular");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By cammpoNascimento = By.id("dataNascimento");
	private By tratamentoDados = By.xpath("/html/body/div[5]/div[2]/div/div[2]/form/div/div[6]/div/label");
	private By btnContinuar = By.xpath("/html/body/div[5]/div[2]/div/div[2]/form/div/div[7]/button");
	public By getBtnAbrirSuaConta() {
		return btnAbrirSuaConta;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoTelefone() {
		return campoTelefone;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoCpf() {
		return campoCpf;
	}
	public By getCammpoNascimento() {
		return cammpoNascimento;
	}
	public By getTratamentoDados() {
		return tratamentoDados;
	}
	public By getBtnContinuar() {
		return btnContinuar;
	}
	
}
