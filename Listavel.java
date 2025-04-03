//listavel
public interface Listavel {
void inserir(Object dado,int posicao);//c      Insert
void anexar(Object dado);//c       Append
Object selecionar(int posicao);
Object[] selecionarTOdos();//R
void atualizar(Object dado,int posicao);// uptade
Object apagar(int posicao);//D delete

boolean contem();
void limpar();
//int primeiraOcorrencia(Object dado);

boolean estaCheia();
boolean estaVazia();
String imprimir();

}
