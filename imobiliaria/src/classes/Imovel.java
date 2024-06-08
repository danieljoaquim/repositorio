package classes;

public class Imovel {
private int codigo, numeroQuartos, tipo;
private float areaConstruida, areaTotal, preco;
private Endereco localizacao;


public Imovel (int codigo, int numeroQuartos, int tipo, float areaConstruida, float areaTotal, float preco, Endereco localizacao){

    this.areaConstruida = areaConstruida;
    this.areaTotal = areaTotal;
    this.codigo = codigo;
    this.localizacao = localizacao;
    this.numeroQuartos = numeroQuartos;
    this.preco = preco;
    this.tipo = tipo;
}


public String getCidade() {
return localizacao.getCidade();	
}

public String getBairro() {
	return localizacao.getCidade();
}

public int getCodigo() {
    return codigo;
}


public void setCodigo(int codigo) {
    this.codigo = codigo;
}


public int getNumeroQuartos() {
    return numeroQuartos;
}


public void setNumeroQuartos(int numeroQuartos) {
    this.numeroQuartos = numeroQuartos;
}


public int getTipo() {
    return tipo;
}


public void setTipo(int tipo) {
    this.tipo = tipo;
}


public float getAreaConstruida() {
    return areaConstruida;
}


public void setAreaConstruida(float areaConstruida) {
    this.areaConstruida = areaConstruida;
}


public float getAreaTotal() {
    return areaTotal;
}


public void setAreaTotal(float areaTotal) {
    this.areaTotal = areaTotal;
}


public float getPreco() {
    return preco;
}


public void setPreco(float preco) {
    this.preco = preco;
}


public Endereco getLocalizacao() {
    return localizacao;
}


public void setLocalizacao(Endereco localizacao) {
    this.localizacao = localizacao;
}



}