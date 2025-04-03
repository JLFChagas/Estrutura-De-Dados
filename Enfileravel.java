public interface Enfileravel{
void enfileirar(Object dado); // c create
Object frente();                // r Front
void atualizarInicio(Object dado);
void atualizarFim(Object dado); // U update
Object desenfilerar();          // d dequeue

boolean estaCheia();
boolean estaVazia();
String imprimir();
}