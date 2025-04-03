public class FilaEstatica implements Enfileravel{
private Object[] dados;
private int ponteiroInicio;
private int ponteiroFim;
// construtores
public FilaEstatica(){
}
public FilaEstatica(int tamanho){
dados=new Object[tamanho];

ponteiroInicio=0; //cabeça=head
ponteiroFim=-1;   //head=tail
}
@Override
public void enfileirar(Object dado){
     if(!estaCheia()){
        dados[ponteiroInicio]=dado;
        ponteiroFim++;
    } else {
        System.err.println("queue  is empty");
    }
}
// c create
@Override
public Object frente(){
    if(!estaVazia()){
        return dados[ponteiroInicio];
    }else{
        return null;
    }
}             // r Front
@Override
public void atualizarInicio(Object dado){
    if(!estaVazia()){
        dados[ponteiroInicio]=dado;
    } else {
        System.err.println("queue  is empty");
    }
} // U update
public void atualizarFim(Object dado){
    if(!estaVazia()){
        dados[ponteiroFim]=dado;
    } else {
        System.err.println("queue  is empty");
    }
} 
@Override
public Object desenfilerar(){
    Object aux=null;
     if(!estaVazia()){
        aux=dados[ponteiroInicio];
        ponteiroInicio++;
    } else {
        System.err.println("queue  is empty");
    }
     return aux;
}          // d dequeue

@Override
public boolean estaCheia(){
    
    return (ponteiroFim==dados.length-1);
}
@Override
public boolean estaVazia(){
    return(ponteiroFim== ponteiroInicio-1);
}
@Override
public String imprimir(){
    String retorno= "[";
    for(int i = ponteiroInicio;i<= ponteiroFim;i++){
        if(i==ponteiroFim){
            retorno+=dados[i];
        } else {
        retorno +=dados[i]+ ",";
    }
    
}
    return retorno+"]";
}
}