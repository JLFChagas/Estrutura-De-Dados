import java.util.NoSuchElementException;

public class PilhaDinamicaGenerica<T> implements Empilhavel<T>{

     private NodoDuplo<T> ponteiroTopo;
     private int quantidade;
     int tamanho;
     public PilhaDinamicaGenerica() {
        this(10);
     }
    public PilhaDinamicaGenerica(int tamanho){
        ponteiroTopo=null;
        quantidade=0;
        this.tamanho=tamanho;
        
    }
    @Override
    public boolean estaVazia(){
        return quantidade==0;
    }
    @Override
    public boolean estaCheia(){
        return quantidade==tamanho;
    }
    @Override
    public String imprimir(){
        String retorno="[ ";
        NodoDuplo<T> aux=ponteiroTopo;
        for(int i=0;i<=quantidade;i++){
            retorno+=aux.getDado();
            if(i!=quantidade-1){
                retorno=",";
            }
        }
        return retorno+" ]";
    }
    @Override
    public T espiar(){
        if(estaVazia()){
            throw new NoSuchElementException("Pilha vazia");
        }
        return ponteiroTopo.getDado();

    }
    @Override
    public void atualizar(T novoDado){
        if(estaVazia()){
            throw new NoSuchElementException("Pilha vazia");
        }
        ponteiroTopo.setDado(novoDado);
    }
    @Override
    public T desempilhar(){
        
        if(estaVazia()){

        }
        T aux=ponteiroTopo.getDado();
        ponteiroTopo=ponteiroTopo.getAnteiror();
        ponteiroTopo.setProximo(null);
        quantidade--;
        return aux;
    }
    @Override
        public void empilhar(T dado) {
            if(estaVazia()){
                throw new NoSuchElementException("sem exeção");
            }
            NodoDuplo<T> novoNodo=new NodoDuplo<>();
            novoNodo.setDado(dado);
            novoNodo.setAnteiror(ponteiroTopo);
            ponteiroTopo.setProximo(novoNodo);
            ponteiroTopo=novoNodo;
        }
}
