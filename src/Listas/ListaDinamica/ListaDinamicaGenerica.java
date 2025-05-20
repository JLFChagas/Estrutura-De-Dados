public class ListaDinamicaGenerica<T> implements Listavel<T> {
private NodoDuplo<T> ponteiroFim;
private NodoDuplo<T> ponteiroInicio;
private int tamanho;
private int quantidade;
public ListaDinamicaGenerica(int tamanho) {
    ponteiroInicio=null;
    ponteiroFim=null;
    quantidade=0;
    this.tamanho = tamanho;
    
}
@Override
public void atualizar(T dado, int posicao) {
    if(estaVazia){
        throw
    }
    if (posicao>=0&&posicao<quantidade){
        throw

    }
    NodoDuplo<T> ponteiroAuxiliar=ponteiroInicio;
    for(int i=0;i<posicao;i++){
        ponteiroAuxiliar=ponteiroAuxiliar.getProximo();
        
    }
    ponteiroAuxiliar.setDado(dado);
}

public T selecionar(T dado, int posicao) {
    if(estaVazia){
        throw
    }
    if (posicao>=0&&posicao<quantidade){
        throw

    }
    NodoDuplo<T> ponteiroAuxiliar=ponteiroInicio;
    for(int i=0;i<posicao;i++){
        ponteiroAuxiliar=ponteiroAuxiliar.getProximo();
        
    }
    return ponteiroAuxiliar.getDado();
}
/**
 * anexa um dado no final da lista
 * @param dado, refere=se ao dado que sera adicionando 
 *  @throws overflowException laçada quando se tenta
 * adicionar um elemento a uma lista cheia
 */
public void anexar(T dado){
    if(estaCheia()){
    throw new overflowException("lista Cheia");
    }
    NodoDuplo<T> noTemp=new NodoDuplo<>();
    noTemp.setAnteiror(ponteiroFim);
    ponteiroFim.setProximo(noTemp);
    ponteiroFim=noTemp;
    quantidade++;

}
@Override
public T[] selecionarTodos() {
    if(estaVazia()){

    }
    T[] dados=(T[])new Object[quantidade];
    NodoDuplo<T> ponteiroAuxiliar=ponteiroInicio;
    for(int i=0;i<quantidade;i++){
        dados[i]=ponteiroAuxiliar.getDado();
        ponteiroAuxiliar=ponteiroAuxiliar.getProximo();
    }
    return dados;
}
@Override
public void inserir(T dado, int posicao) {
    NodoDuplo<T> ponteiroAuxiliar=ponteiroInicio;
    for(int i=0;i<posicao;i++){
        ponteiroAuxiliar=ponteiroAuxiliar.getProximo();
    }
    NodoDuplo<T> noTemp= new NodoDuplo<>(dado);
    noTemp.setProximo(ponteiroAuxiliar);
    noTemp.setAnteiror(ponteiroAuxiliar.getAnteiror());
    ponteiroAuxiliar.setAnteiror(noTemp);
    ponteiroAuxiliar.getAnteiror().setProximo(noTemp);  
}
@Override
public T apagar( int posicao) {
    NodoDuplo<T> ponteiroAuxiliar=ponteiroInicio;
    for(int i=0;i<posicao;i++){
        ponteiroAuxiliar=ponteiroAuxiliar.getProximo();
    }
    NodoDuplo<T> anterior=ponteiroAuxiliar.getAnteiror();
    NodoDuplo<T> proximo=ponteiroAuxiliar.getProximo();
    anterior.setProximo(proximo);
    proximo.setAnteiror(anterior);
    quantidade--;
    return ponteiroAuxiliar.getDado();
}
}

