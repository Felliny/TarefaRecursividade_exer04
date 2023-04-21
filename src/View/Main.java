package View;

import Controller.VetorNegativo;

public class Main {
    public static void main(String[] args) {
        int vetor[]= {-1, -11, -23, 32, -1, 4};
        int tamanho= vetor.length;
        VetorNegativo re= new VetorNegativo();
        System.out.println("Total de números negativos: "+ re.ElementosNegativos(vetor, tamanho));
    }
}
