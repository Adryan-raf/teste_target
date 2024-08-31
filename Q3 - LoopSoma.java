public class LoopSoma{
    public static void main(String[]args){
        int indice=12, soma=0, k=1;
        
        while(k<indice){
            k++;
            soma+=k;
        }
        System.out.printf("%d",soma);
    }
}
