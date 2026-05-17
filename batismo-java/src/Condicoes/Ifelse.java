package Condicoes;

public class Ifelse {
  public static void main(String[] args) {
      /*
      IF e ELSE - condicoes
       Objetivo: passar o ninja de acordo com o numero de misssoes

       */
      String nome = "Naruto Uzumaki";
      int idade = 14;
      boolean hokage = false;
      short numeroDeMissoes = 20;


      // se (condição) for verdadeira {faca isso }
      if (numeroDeMissoes == 10 && idade > 15) {
          System.out.println("Naruto esta pronto para psssar nível ");
      }

        else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin ");

      } else {
          System.out.println("O não completou o mínimo de missoes minimas para pssar de vível ");
      }


  }

    }

