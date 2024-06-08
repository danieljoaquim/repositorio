package classes;

public class Endereco {
String cidade, bairro;

public Endereco(String cidade, String bairro) {

	this.cidade = cidade;
	this.bairro = bairro;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public String getBairro() {
	return bairro;
}

public void setBairro(String bairro) {
	this.bairro = bairro;
}
}