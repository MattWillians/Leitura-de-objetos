import java.util.ArrayList;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) throws Exception {

        Scanner teclas = new Scanner(System.in);
        ArrayList <String> listaName = new ArrayList<String>();

        System.out.println("Digite a quantidade de nomes a ser inseridos!");
        int quantidade = teclas.nextInt();
        
        String nome;

        for(int i = 0; i < quantidade; i++){

            System.out.println("Insira o nome!");
            nome = teclas.next();
            listaName.add(nome);

        }
        
        for (int i = listaName.size() - 1; i >= 0; i--) {

            System.out.println(listaName.get(i));
        }

        teclas.close();

        /* 
          
          Este mesmo FOR é possivel fazer com uma linha de codigo em java, usando a classe Collections.
          é necessario importar o: import java.util.Collections;

          e depois rodar o comando: Collections.reverse(listaName); (ordem reversa.)
         
        */

    }
}
