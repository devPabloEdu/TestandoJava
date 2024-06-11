import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

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
            System.out.println(mensagem + "testando");
            
            int nota = 50;
            //se a nota for maior doq ou igual a 70 entao ele esta aprovado
            //usaremos if else, e else if
            if(nota >= 70 ) {
                System.out.println("lkuno aprovado");

            } else {
                System.out.println("aluno reprovado");
            }

            String nome2 = "jessé";
            System.out.println(nome2.toUpperCase());
            System.out.println(nome2.toLowerCase());
            System.out.println(nome2.length());

            String nomeOutro = "Jessé";
            System.out.println(nome2.equalsIgnoreCase(nomeOutro));

            String nome3 = "Pablo";
            //iso 
            LocalDate hoje = LocalDate.now();
            Locale brasil = new Locale("pt", "BR");
            //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
            String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
            String saudacao = " ";
            LocalDateTime agora = LocalDateTime.now();
            //System.out.println("bom dia " + nome2 + " hoje é  " + diaSemana + " e são  " + agora.getHour());
            if (agora.getHour() >= 0 && agora.getHour() < 12) {
                saudacao = "bom dia";
            } else if (agora.getHour() >= 12 && agora.getHour() <10){
                saudacao = "boa tarde";
            } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
                saudacao = "Boa noite";
            }

            System.out.printf("ola, %s. Hoje é %s, %s.%n", nome3, diaSemana, saudacao);
            
            // 1 2 3 4 5 6 7 8 9 10
            // para uma variavel q inicia em 1 e vai ate dez, mudando um por um, faça:
            for (int numeroFor = 1; numeroFor <= 10; numeroFor++)  {
                System.out.println(numeroFor);
            }

            for (int i = 0; i <=10; i++){
                for(int j = 1; j <=10; j++){
                    System.out.println(j + " X " + i + " = " + j * i);
                }
            }
        }    
}
