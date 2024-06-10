public class Main {
        public static void main(String[] args) {
            //write your code here

            String nome = "pablo";
            double num1 = 1.5;
            float num2 = 1.9f;
            double resultado = num1 + num2;
            System.out.println("ola " + nome + " voce tem " + num1 + " e eu tenho " + num2);
            System.out.println("o resultado de sua soma é  " + resultado);

            int a = 1;
            int b = 2;
            float divisao = (float) a/b;
            System.out.println(divisao);
            
            //operadores lógicos
            boolean resultado2 = false;
            System.out.println(resultado2);
            
            //aprendendo condicionais com teste de ir a praia com operadores lógicos
            boolean fimDeSemana = true; 
            boolean fazendoSol = true;
            boolean vamosAPraia = fimDeSemana  && fazendoSol;
            System.out.println(vamosAPraia);
            
            //tabela verdade
            // operadore && AND
            // true && true = true
            //false && false = false
            //true && false = false
            // a unica situação onde sera verdade ´q auando ambos os termos são verdade

            String mensagem = fimDeSemana ? "é fim de semana" : "não é fim de semana"; //se a variavel tiver valor verdadeiro, um texto sera atribuido, caso n, sera o outro texto
            System.out.println(mensagem);
            
        }    
}
