public class PilhaComFilas implements Empilhavel {
    private Enfileravel f1;
    private Enfileravel f2;

    public PilhaComFilas(){
        this(10);
    }
    public PilhaComFilas(int tamanho){
        f1=new FilaEstaticaCircular(tamanho);
        f2=new FilaEstaticaCircular(tamanho);
    }
    @Override
    public void empilhar(Object dado) {
        if(!estaCheia()){
            while (!f1.estaVazia()) {
                f2.enfileirar(f1.desenfilerar());
            }
            f1.enfileirar(dado);
            while (!f2.estaVazia()) {
                f1.enfileirar(f2.desenfilerar());
            } 

        } else {
            System.err.println("a pilha esta cheia");
        }
    }
    @Override
    public Object desempilhar() {
        Object dadoAux=null;
        if(!estaVazia()){
            dadoAux= f1.desenfilerar();
        } else {
            System.err.println("não existem dados para desempilhar");
        }
        
        return dadoAux;
    }
    @Override
    public Object espiar() {
        Object dadoAux=null;
        if(!estaVazia()){
            dadoAux=f1.frente();
        } else{
            System.err.println("não existem dados para ver");
        }
        return dadoAux;
    }
    @Override
    public boolean estaCheia() {
        // 
        return f1.estaCheia();
    } @Override
    public boolean estaVazia() {
     return f1.estaVazia();
    }  
    @Override
    public String imprimir() {
        return f1.imprimir();
    }
    @Override
    public void atualizar(Object dado) {
        if(!estaVazia()){
            f1.atualizarInicio(dado);
        } else {
            System.err.println("não é possivel atualizar pois fila esta vazia");
        }
        
    }
    
}
