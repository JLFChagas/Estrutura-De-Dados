public class  ListaEstaticaCircular implements Listavel{
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
    private int retroceder(int ponteiro) {
		return (ponteiro-1+dados.length)%dados.length;
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
            if(posicao>=0&&posicao<quantidade){
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
    @Override
    public Object selecionar(int posicao) {
        Object aux=0;;
        if(!estaVazia()){
            if(posicao>=0&&posicao<quantidade){
                int posicaoFisica=mapeamento(posicao);
                 aux=dados[posicaoFisica];
            }else{

                System.err.println("invalid index");
            }
        } 
        return aux;
    }
    @Override
    public Object[] selecionarTOdos() {
        Object[] aux=new Object[quantidade];
        if(!estaVazia()){
            for(int i=0;i< quantidade;i++){
                    aux[i]=dados[(i+ponteiroInicio)%dados.length];
                }
            }
        
        return aux;
    }

    public int primeiraOcorrencia(Object dado){
        int aux=-1;
        if(!estaVazia()){
            for(int i=0;i<quantidade;i++){
                if(dado.equals(dados[i])){
                    aux=i;
                    break;
                }
            }
            
        } 
        return aux;

    }
    @Override
    public boolean contem() {
        // T
        return false;
    }
    public void comparador(){

    }
    @Override
    public void limpar() {
        quantidade=0;
        ponteiroInicio=0;
        ponteiroFim=-1;        
    }

    @Override
    public Object apagar(int posicao){
        Object dadoAux=null;
        if(!estaVazia()){
          
            if(posicao>=0&&posicao<quantidade){
                int posicaoFisica=mapeamento(posicao);
                int x=posicaoFisica;
                dadoAux=dados[posicaoFisica];
                int y=avancar(x);
                for(int i=0;i<quantidade-posicao-1;i++){
                   dados[x]=dados[y];
                   x=avancar(x);
                   y=avancar(y);
                }
                quantidade--;
                ponteiroFim=retroceder(ponteiroFim);
            }

        }
        return dadoAux;
    }
    @Override
        public void inserir(Object dado, int posicao) {
            if(!estaCheia()){
                if(posicao>=0&&posicao<quantidade){
                    int posicaoFisica=mapeamento(posicao);
                    int x=ponteiroFim;
                    int y=avancar(x);
                    for(int i=0;i<quantidade-posicao;i++){
                        dados[y]=dados[x];
                        x=retroceder(x);
                        y=retroceder(y);
                    }
                    dados[posicaoFisica]=dado;
                    quantidade++;
                    avancar(ponteiroFim);
                }
            }
            
        }
    }
