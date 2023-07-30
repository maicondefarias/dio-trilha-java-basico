public class Operadores {

    public static void main(String[] args){
        /*
        int numero = 5;
        numero++; // numero 6

        String nomeCompleto = "Osmar " + "Criado";

        System.out.println(nomeCompleto);
        System.out.println(numero++); // imprime o numero e depois incrementa
        System.out.println(numero); //numero atualizado
        System.out.println(++numero); //incrementa e imprime
        */
        boolean variavel = true;
        variavel = !variavel; //inverter valor da variavel em boolean
        // System.out.println(!variavel);
        // System.out.println(variavel);
        int a, b;
        a = 5;
        b = 6;

        /*String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */
        int resultado = a==b ? 1 : 0;

        System.out.println(resultado);
    }
}
