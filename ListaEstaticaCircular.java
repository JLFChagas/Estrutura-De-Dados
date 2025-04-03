public abstract class  ListaEstaticaCircular implements Listavel{
    private Object[] dados;
    private int ponteiroInicio;
    private int ponteiroFim;
    private int quantidade;
    public ListaEstaticaCircular(){
        this(10);
    }
    public ListaEstaticaCircular(int tamanho){
    dados=new Object[tamanho];
    
    ponteiroInicio=0; //cabeça=head
    ponteiroFim=-1;   //head=tail
    quantidade=0;
    }
    @Override
    public boolean estaCheia() {
     
        return (quantidade==dados.length);
    }
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
    public void anexar(Object dado) {
        if(!estaCheia()){
            ponteiroFim=(ponteiroFim+1)%dados.length;
            dados[ponteiroInicio]=dado;
            quantidade++;
        } else {
            System.err.println("queue  is empty");
        }  
    }
    @Override
    public void atualizar(Object dado, int posicao) {
        if(!estaVazia()){
            if(posicao>=0&&posicao<=quantidade){
                int posicaOFisica=mapeamento(posicao);
                dados[posicaOFisica]=dado;
                
            }else{

                System.err.println("invalid index");
            }
        }
        
    }
    int mapeamento(int logica){
        return (logica + ponteiroInicio)%dados.length;
    }
}
