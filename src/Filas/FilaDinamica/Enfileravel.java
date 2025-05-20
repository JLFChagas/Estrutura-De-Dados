public interface Enfileravel<T>{
    
void enfileirarInicio(T dado); // c create
void enfileirarFim(T dado);
void atualizarInicio(T dado);
void atualizarFim(T dado); // U update
T desenfilerarInicio();          // d dequeue
T desenfilerarFim();   

boolean estaCheia();
boolean estaVazia();
String imprimirInicio();
String imprimirFim();

T tras();
T frente();
}