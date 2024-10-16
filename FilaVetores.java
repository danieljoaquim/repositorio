public class FilaVetores {

private Integer inicio, qt;
private Integer[] dados;

FilaVetores(int tam) {
    dados = new Integer[tam];
    qt = 0;
    inicio = 0; //literalmente indica o primeiro elemento da fila (FIFO) e é incrementado ou decrementado ao longo do funcionamento do código
}

void insereFila(int item){

if (qt != dados.length) {
    int pos = (inicio + qt) % dados.length;
    dados[pos] = item;
    qt++;


} else{System.out.println("A fila está cheia");}

}

void imprimeFila () {
    for (int i = 0; i < dados.length; i++) {
        System.out.println(dados[i]);
    }
    System.out.println("Início: " + inicio);
    System.out.println("Quantidade: " + qt);
}
 
void removeFila() {
    if (qt > 0) {
        dados[inicio] = null;
        inicio = (inicio + 1) % dados.length;
        qt--;
        
    }
}

void imprimeCircular(){
    int i = 0;
    int fim = qt;
    int pos = inicio;
    
    while (i < fim) {
        System.out.print(dados[pos] + ", ");
        i++;
        pos = (pos + 1) % dados.length;
    }
    System.out.println();
}



}
