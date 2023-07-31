public class Operadores{

    public static void main(String[] args) {
        
        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        
        /*
        String nomeUm = "Gleyson";
        String nomeDois = new String("Gleyson");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){
            System.out.println("A nossa condição é verdadeira.");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);
    */
    }

}