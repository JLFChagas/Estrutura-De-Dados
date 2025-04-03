public interface DuplamenteEnfileiravel {
    void enfileirarInicio(Object dado);
	void enfileirarFim(Object dado);
	
	Object desenfileirarInicio();
	
	Object desenfileirarFim();
	
	Object frente();
	Object tras();

	void atualizarInicio(Object dado);
	void atualizarFim(Object dado);
	
	boolean estaCheia();
	boolean estaVazia();
	String imprimirDeFrentePraTras();
	//NOVO
	String imprimirDeTrasPraFrente();
}
