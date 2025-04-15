public class Selecao {
    int[] numeros = { 8, 2, 3, 4, 5, 1, 9, 6 };

    public void imprimirtela() {
        for (int dado : numeros) {
            System.out.println(dado);
        }
        System.out.println("");
    }

    private void troca(int indice1, int indice2) {
        int temp = numeros[indice1];
        numeros[indice1] = numeros[indice2];
        numeros[indice1] = temp;
    }

    public void BubbleSortMetodo() {
        for (int i = 0; i <= numeros.length - 1; i++)
            for (int j = 0; i <= (numeros.length - 1) - i; i++)
                if (numeros[j] > numeros[j + 1])
                    troca(j, j + 1);

    }
    public void selectionSort(){
        
        for(int j=0;j<numeros.length;j++){
            int menor=j;
        for(int i=1+j;i<numeros.length;i++){
            if(numeros[menor]>numeros[i]){
                menor=i;
            }
            troca(j, menor);
        }
    }
    }
    public void insertionSort(){
        for(int j=0;j<numeros.length;j++){
            for(int i=j-1;i>0;i--){
                if(numeros[i+1]<numeros[i]){
                    troca(i, i+1);
                } else {
                    break;
                }
            }
            
        }
    }

}
