public class TestaPilha {
    public static void main(String[] args) throws Exception {

        PilhaVetores pilha = new PilhaVetores(5);

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        pilha.empilha(4);
        pilha.empilha(5);


        pilha.imprimePilha();

        pilha.desempilha();
        pilha.desempilha();


        System.out.println();

        pilha.imprimePilha();
    }
}
