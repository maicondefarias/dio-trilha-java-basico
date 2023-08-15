public class ComentariosDois {
    public static void main(String[] args) {
        
    }
    public int somaMultipica(int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if(m == "M"){ //M = Multiplicação
            r = n * x;
        }else{ //se não soma mesma
            r = n + x;
        }
        return r;

        /*
         * ERRADO!
         * No exemplo acima percebe-se que o código não é claro
         * e por conta disso usa-se o comentário para  tapar 
         * a falta de clareza na declaração das variáveis.
         * 
         * As variáveis devem ter nomes claros e objetivos
         */
    }
}
