public class FilaEstaticaCircular implements Enfileravel {
    private Object[] dados;
    private int ponteiroInicio;
    private int ponteiroFim;
    private int quantidade;
    public FilaEstaticaCircular(){
        this(10);
    }
    public FilaEstaticaCircular(int tamanho){
        dados =new Object[tamanho];
        ponteiroInicio=0;
        ponteiroFim=-1;
        quantidade=0;
    }   
    @Override 
    public boolean estaCheia(){
        return(quantidade==dados.length);
    } 
    @Override
    public boolean estaVazia(){
        return (quantidade==0);

    }
@Override
    public String imprimir(){
		String retorno = "[";
		int ponteiroAux = ponteiroInicio;
		for (int i = 0; i < quantidade; i++) {			
			if (i == quantidade - 1) 
				retorno += dados[ponteiroAux];
			else
				retorno += dados[ponteiroAux] + ",";
			
			ponteiroAux = avancar(ponteiroAux); 
		}
		return retorno + "]";	
	}
	
	private int avancar(int ponteiro) {
		return (ponteiro+1)%dados.length;
	}	

@Override
public void atualizarInicio(Object dado){  
    if(!estaVazia()){
        dados[ponteiroInicio]=dado;
    } else {
        System.err.println("queue  is empty");
    }
} 
// U update
@Override
public void atualizarFim(Object dado){
    if(!estaVazia()){
        dados[ponteiroFim]=dado;
    } else {
        System.err.println("queue  is empty");
    }
} 
@Override
public Object frente(){
    if(!estaVazia()){
        return dados[ponteiroInicio];
    }else{
        return null;
    }
} 
@Override
public Object desenfilerar(){
    Object aux=null;
    ponteiroInicio=(ponteiroInicio+1)%dados.length;
     if(!estaVazia()){
        aux=dados[ponteiroInicio];
        ponteiroInicio++;
        quantidade--;
    } else {
        System.err.println("queue  is empty");
    }
    return aux;
} 
@Override
public void enfileirar(Object dado){
     if(!estaCheia()){
        ponteiroFim=(ponteiroFim+1)%dados.length;
        dados[ponteiroFim]=dado;
        quantidade++;
    } else {
        System.err.println("queue  is empty");
    }  
}

}
