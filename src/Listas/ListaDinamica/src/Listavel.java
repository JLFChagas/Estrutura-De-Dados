//listavel
public interface Listavel<T> {
void inserir(int posicao,T dado);//c      Insert
void anexar(T dado);//c       Append
T selecionar(int posicao);
T[] selecionarTodos();//R
void atualizar(int posicao,T dado);// uptade
T apagar(int posicao);//D delete

//int primeiraOcorrencia(Object dado);

boolean estaCheia();
boolean estaVazia();
String imprimir();
}
