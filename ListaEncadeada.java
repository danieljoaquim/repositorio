public class ListaEncadeada {

    private Nodo inicio;

    private class Nodo {
        Integer dado;
        Nodo prox;
    }


    public ListaEncadeada() {
        inicio = null;    
    }

    public void insereInicioListaEncadeada(Integer valor) {
        Nodo novo = new Nodo();

        novo.dado = valor;
        novo.prox = inicio;
        inicio = novo;
    }

    void imprimeLista() {
        for (Nodo i = inicio; i != null; i = i.prox) {

        System.out.print(i.dado + " ,");
        }
        System.out.println();
    }

    Integer retiraInicio() {

        if (inicio != null) {
            Nodo retirado = inicio;
            inicio = inicio.prox;
            return retirado.dado;
        }

        else {
            return null;
        }
    }

    Integer removeElementoMeio (Integer valor) {

        Nodo anterior = null;
        Nodo temp = inicio;

        while (temp != null && temp.dado != valor) {
            anterior = temp;
            temp = temp.prox;
        }

        if (temp == null) {
            return null; //elemento não existe
        }

        if (anterior == null) {

            Integer retira = temp.dado;
            inicio = inicio.prox; //inicio = temp.prox
            return retira;
        }

        //encontra um elemento no meio ou no final

        Integer retira = temp.dado;
        anterior.prox = temp.prox;
        return retira;
    }

    


}
