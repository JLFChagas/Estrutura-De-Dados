import java.util.NoSuchElementException;

public class FilaDinamicaGenerica<T> implements Enfileravel<T>{
   
        private NodoDuplo<T> ponteiroInicio;
        private NodoDuplo<T> ponteiroFim;
        private int quantidade;
        private int tamanho;

        public FilaDinamicaGenerica(int tamanho) {
            this.tamanho = tamanho;
            ponteiroInicio=null;
            ponteiroFim=null;
            quantidade=0;
            
            
        }
        public FilaDinamicaGenerica() {
            this(10);
            
        }
        @Override
        public void enfileirarInicio(T dado) {
            throw new UnsupportedOperationException("Operação não suportada");
        }
        @Override
        public T desenfilerarFim() {
            throw new UnsupportedOperationException("Operação não suportada");
        }
        @Override
        public String imprimirFim() {
            throw new UnsupportedOperationException("Operação não suportada");
        }
        @Override
        public T tras() {
            throw new UnsupportedOperationException("Operação não suportada"); 
        }
        @Override
        public boolean estaCheia() {
        // TODO Auto-generated method stub
        return quantidade==tamanho;
        }
        @Override
        public boolean estaVazia() {
        // TODO Auto-generated method stub
        return quantidade==0;
        }

        @Override
        public T frente() {
        if(estaVazia()){
            throw new NoSuchElementException("Operação não suportada");
        }
        return ponteiroInicio.getDado();
        }
        /**
         * atualiza o elemento do inicio da Fila
         * @param
         * @throws
         * @return
         */
        @Override
        public void atualizarInicio(T dado) {
        if(estaVazia()){
            throw new NoSuchElementException("sem elementos");
        }
        ponteiroFim.setDado(dado);
        }
          /**
         * atualiza o elemento do fim da fila
         * @param
         * @throws
         * @return
         */
        @Override
        public void atualizarFim(T dado) {
        if(estaVazia()){
            throw new NoSuchElementException("sem elemento");
        }
        ponteiroFim.setDado(dado);
        
        }
        @Override
        public T desenfilerarInicio() {
        if(estaVazia()){
            throw new NoSuchElementException("a fila esta vazia");
        }
        T dadoIncio=ponteiroInicio.getDado();
        ponteiroInicio=ponteiroInicio.getProximo();
        ponteiroInicio.setAnteiror(null);
        quantidade--;
        return dadoIncio;

        
        }
        @Override
        public void enfileirarFim(T dado) {
        if(estaCheia()){

        }
        NodoDuplo<T> novoNodo=new NodoDuplo<>(dado);
        novoNodo.setAnteiror(ponteiroFim);
       
        if(!estaVazia()){
            ponteiroFim.setProximo(novoNodo);
        }else{
            ponteiroInicio=novoNodo;
        }
        ponteiroFim=novoNodo;
        quantidade++;
        }
        @Override
        public String imprimirInicio() {        
            NodoDuplo<T> aux=ponteiroInicio;
            String retorno="[";
            for(int i=0;i<quantidade;i++){
                retorno+=aux.getDado();
                
            
            }
            return null;
        }
}

