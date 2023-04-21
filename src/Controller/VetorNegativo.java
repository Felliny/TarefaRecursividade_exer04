package Controller;

public class VetorNegativo {


    public VetorNegativo(){
        super();
    }

    public int ElementosNegativos(int[] vetor, int tamanho){
        if (tamanho == 1){ //condição de parada
            if (vetor[tamanho - 1] < 0){
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            int negativos= ElementosNegativos(vetor, tamanho - 1); //chamada da recursiva

            if (vetor[tamanho - 1] < 0){
                return negativos + 1;
            }
            else {
                return negativos;
            }
        }

    }
}
