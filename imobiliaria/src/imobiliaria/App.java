package imobiliaria;
import java.util.Scanner;
import classes.*;
public class App {
    public static void main(String[] args) throws Exception {
        
    	Scanner sc = new Scanner (System.in);
    	Imobiliaria imobiliaria = new Imobiliaria();
    	
    	
    	imobiliaria.adicionaImovel(sc);
    	imobiliaria.listagemImoveis();
    	imobiliaria.listagemPorCondicao(sc);
    	
    }
}