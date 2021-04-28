package exerciciosaula7;

import java.util.Random;


public class metodos {
    
     public static void inserir(int[]a){
        Random rd = new Random();
        for(int i=0; i<a.length; i++){
            a[i] = rd.nextInt(100)+1;
            
        }
    }
     
     public static void exibir(int[]a){
        for(int i=0; i<a.length; i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
     
     public static void selection(int[]a){
        int menor, i, temp;  // Índice
        
        for(int j=0; j<a.length-1; j++){
            menor=j;
            for(i=1+j; i<a.length; i++){   // Responsável pelas comparações
                if(a[menor] > a[i]){
                    menor = i;
                }
            }
            temp=a[menor];
            a[menor]=a[j];
            a[j]=temp;
        }
    }
     
     public static void selection2(char[]a){
        int menor, i;  // Índice
        char temp;
        for(int j=0; j<a.length-1; j++){
            menor=j;
            for(i=1+j; i<a.length; i++){   // Responsável pelas comparações
                if(a[menor] > a[i]){
                    menor = i;
                }
            }
            temp=a[menor];
            a[menor]=a[j];
            a[j]=temp;
        }
     }
        
        public static void inserir2(char[]a){
        Random rd = new Random();
        for(int i=0; i<a.length; i++){
            a[i] = (char)(rd.nextInt(25)+97);
            
        }
    }
        
        public static void exibir2(char[]a){
        for(int i=0; i<a.length; i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
}