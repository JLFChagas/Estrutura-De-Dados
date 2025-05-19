public class NodoDuplo<T> {
    private NodoDuplo<T> anteiror;
    private T dado;
    private NodoDuplo<T> proximo;
    public NodoDuplo(T dado) {
        this.dado = dado;
    }
    public NodoDuplo() {
        
    }
    public T getDado() {
        return dado;
    }
    public void setDado(T dado) {
        this.dado = dado;
    }
    public NodoDuplo<T> getAnteiror() {
        return anteiror;
    }
    public void setAnteiror(NodoDuplo<T> anteiror) {
        this.anteiror = anteiror;
    }
    public NodoDuplo<T> getProximo() {
        return proximo;
    }
    public void setProximo(NodoDuplo<T> proximo) {
        this.proximo = proximo;
    }

}
