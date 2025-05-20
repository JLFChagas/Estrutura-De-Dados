//listavel
public interface Listavel<T> {
void inserir(T dado,int posicao);//c      Insert
void anexar(T dado);//c       Append
T selecionar(int posicao);
T[] selecionarTodos();//R
void atualizar(T dado,int posicao);// uptade
T apagar(int posicao);//D delete

boolean contem();
void limpar();
//int primeiraOcorrencia(Object dado);

boolean estaCheia();
boolean estaVazia();
String imprimir();
}
