package arvores.ArvoresEstaticas.ArvoreBinariaHeap;

import java.util.NoSuchElementException;

public class ArvoreBinariaHeapMaximo {

    private T[]dados;
    private int ponteiroFim;

    public ArvoreBinariaHeapMaximo(int tamanho){
        dados=new T[tamanho];
        ponteiroFim=-1;
    }
    public ArvoreBinariaHeapMaximo(){
        this(10);
    }
    public Object obterRaiz(){
        if(estavazia()){
            throw new NoSuchElementException("heap is empty");
            
        } 
        public void inserir(T dado){
            if(estaCheia()){
                throw new OverflowException("heap cheia")
            }
            ponteirofim++;
            dados[ponteiroFim++]=dado;
        }
        return dados[0];
    }
    public Object extrair(){
        T dadoRaiz=null;
        if(estaVazia()){
            throw new UnderflowException("heapVazia");
        }
        dadoRaiz=dados[0];
        dados[0]=dados[ponteiroFim];
        ponteiroFim--;
        ajustarBaixo(0);
        
        return dadoRaiz;
    }
    public void trocar(int i,int j){
        T temp=dados[i];

    }
    public void ajustarAcimaRec(int indice){
        if(indice !=0){
            int indicePai=indiceGenitor(indice);
            if(dados[indice]>dados[indicePai]){
                trocar(indice, indicePai);
                
            }
            ajustarAcimaRec(indicePai);

        }
    }
    public void ajustarAcima(int indice){
        int indiceFilho=indice;
        int indicePai=indiceGenitor(indice);
        while(indice !=0){
            indicePai=indiceGenitor(indiceFilho)
            if(indiceFilho>indicePai){
                trocar(indiceFilho,indicePai);
        }
        indiceFilho=indicePai;
    }
    }
    public void ajustarBaixoRec(int pai){
        if(pai<ponteiroFim){
        int esquerdo=indiceFilhoEsquerdo(pai);
        int direito=indiceFilhoDireito(pai);
        int indiceMaior=pai;
        if(dados[esquerdo]>dados[indiceMaior]){
            indiceMaior=esquerdo;
        }
        if(dados[direito]>dados[indiceMaior]){
            indiceMaior=direito;
        }
        if(indiceMaior !=pai){
            trocar(indiceMaior,pai);
        }
        if(indiceMaior!=pai){
            trocar(indiceMaior,pai);
            ajustarAcimaRec(indiceMaior);
        }
    }
}
    
    public boolean estavazia(){
        return ponteiroFim==-1;
    }
    public boolean estaCheia(){
        return ponteiroFim==dados.length-1;

    }
    public String imprimir(){
        String resultado="[";
        for(int i=0;i<=ponteiroFim;i++){}
    }
    int indiceGenitor(int filho){ //(filho-1)/2
        return (int)((filho-1)/2);
    }
    int indiceFilhoEsquerdo(int pai){ //return pai*2+1
    return (int)(pai*2+1);
    }
    int indiceFilhoDireito(int pai){// return (pai*2+1) + 1
        return (pai*2+1)+1;
    }
}
