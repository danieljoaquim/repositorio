public class Testafila {
    public static void main(String[] args) throws Exception {

        FilaVetores fila = new FilaVetores(5);

        fila.insereFila(1);
        fila.insereFila(2);
        fila.insereFila(3);
        fila.insereFila(4);
        fila.insereFila(5);

        fila.imprimeFila();

        fila.removeFila();
        fila.removeFila();

        fila.imprimeFila();

    }
}
