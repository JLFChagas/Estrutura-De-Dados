public class FilaComPilhas implements Enfileravel {
    private Empilhavel p1;
    private Empilhavel p2;

    public FilaComPilhas(){
        this(10);
    }
    public FilaComPilhas(int tamanho){
        p1=new PilhaEstatica();
        p2=new PilhaEstatica();
    }
    
    @Override
    public void enfileirar(Object dado){
        if(!estaCheia()){
            while(!p1.estaVazia()){
                p2.empilhar(p1.desempilhar());
         }
         
        p1.empilhar(dado);
            while (!p2.estaVazia()) {
                p1.empilhar(p1.desempilhar());
        } 
        }else {
            System.err.println("fila cheia");
        }
    }

    
    @Override
    public Object desenfilerar() {
        Object dadoInicio=null;
        if(!estaVazia()){
                dadoInicio=p1.desempilhar();
        }else{
            System.err.println("não tem dados para desempilihar");
        }
        return dadoInicio;
    }
    @Override
    public void atualizarInicio(Object dado) {
    }
    @Override
    public void atualizarFim(Object dado) {   
    }
    @Override
    public Object frente() {
        Object dadoInicio=null;
        if(!estaVazia()){
            dadoInicio=p1.espiar();
        }else{
            System.err.println();
        }
        return dadoInicio;
    }
    @Override
    public boolean estaCheia() {
        
        return p1.estaCheia();
    }
    public boolean estaVazia(){
        return p1.estaVazia();
    }
    @Override
    public String imprimir() {
    
        return p1.imprimir();
    }
}
