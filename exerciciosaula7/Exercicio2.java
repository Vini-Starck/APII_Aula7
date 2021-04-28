package exerciciosaula7;


public class Exercicio2 {
    public static void main(String args[]){
        char [] a = new char[10];
        
        metodos.inserir2(a);
        System.out.println("\n=== Vetor Original ===\n");
        metodos.exibir2(a);
        long ti = System.currentTimeMillis();
        metodos.selection2(a);
        long tf = System.currentTimeMillis();
        long intervalo = tf-ti;
        System.out.println("\n=== Vetor Organizado ===\n");
        metodos.exibir2(a);
        
        System.out.println("Tempo = "+intervalo);
    }
}
