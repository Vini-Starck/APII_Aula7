package exerciciosaula7;


public class Exercicio1 {
    public static void main(String[] args) {
        int[]a=new int[10000];
        
        
        metodos.inserir(a);
        System.out.println("\n=== Vetor Original ===\n");
        metodos.exibir(a);
        long ti = System.currentTimeMillis();
        metodos.selection(a);
        long tf = System.currentTimeMillis();
        long intervalo = tf-ti;
        System.out.println("\n=== Vetor Organizado ===\n");
        metodos.exibir(a);
        
        System.out.println("Tempo = "+intervalo);
        
    }
    
}
