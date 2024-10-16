public class PilhaVetores {

    private Integer[] dados;

    private int qt;

    PilhaVetores (int tamanho) {
        dados = new Integer[tamanho];
        qt = 0;
    }


    boolean vazia(){
        return qt == 0;
    }

    void empilha (Integer item) {
      if (qt != dados.length) {
        dados[qt] = item;
        qt++;
      } else{System.out.println("Pilha cheia");
    }

    }

    Integer desempilha (){
        if (qt != 0) {
            Integer item = dados[qt - 1];
            dados[qt - 1] = null;
            qt--;
            return item;
        }
        return null;
       
    }

    void imprimePilha(){
        for (int i = 0; i < dados.length; i++){
            System.out.println(dados[i]);
        }
    }

}
