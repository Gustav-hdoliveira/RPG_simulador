/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG_simulador;
import java.util.Scanner;  // Import the Scanner class


/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class Persona_criacao {
    
    public void Persona_criacao_menu(Personagem meuPersonagem){
        System.out.println("Classes iniciais:");
        System.out.println("Nome:             |           Numero de rodadas no dado    | Armas iniciais");
        System.out.println("                    lvl|  Vig| Vit| sint| for|  des|  vel|  int|  fe|");
        System.out.println("Guerreiro     12|    2|   2|     1|   4|   3 |      2|   1|   1| Broken Straight Sword, Iron Parma");
        System.out.println("Cavaleiro,    13|	3|   2|     1|  3|    2|    3|   1|   1| Broadsword, nenhuma");
        System.out.println("Espadachim,12|	 1|   3|     1|   2|   4|    4|   1|   1| scimitar +1, shortsword +1");
        System.out.println("Bandido,      11|     2|   3|     2|   2|   3|    3|   1|   2| Hand axe, Short bow");
        System.out.println("Clerigo,        14|     2|    2|   2|   3|    1|    1|   2|   3| Mace, Sino sagrado do clérigo");
        System.out.println("Feiticeiro,    11|	  1|   2|   3|   4|    2|    2| 3|   2| Adaga, Cajado do feiticeiro");
        System.out.println("Explorador,  10|	  2|   2|     2|   2|    2|  4|   1|   1| Adaga, nenhuma");
        System.out.println("Depravado,  1 |	  1|   1|     1|   1|    1|    1|   1|   1| Nenhuma, Nenhuma");

        Scanner myClasseeInicial = new Scanner(System.in);  // Create a Scanner object
        String classe = myClasseeInicial.nextLine();  // Read user input
        Dados dadosCriacao = new Dados();
        
        switch(classe){
            case "Guerreiro":
                 meuPersonagem.level = 12;
                 meuPersonagem.PTvigor = dadosCriacao.rolarDados(myClasseeInicial, 2, 6);
                 meuPersonagem.PTvitalidade = dadosCriacao.rolarDados(myClasseeInicial, 2, 6);
                 meuPersonagem.PTsintonização = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 meuPersonagem.PTforca = dadosCriacao.rolarDados(myClasseeInicial, 4, 6);
                 meuPersonagem.PTdestreza = dadosCriacao.rolarDados(myClasseeInicial, 3, 6);
                 meuPersonagem.PTvelocidade = dadosCriacao.rolarDados(myClasseeInicial, 2, 6);
                 meuPersonagem.PTinteligencia = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 meuPersonagem.PTfe = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 break;
            case "Cavaleiro":
                meuPersonagem.level = 13;
                 meuPersonagem.PTvigor = dadosCriacao.rolarDados(myClasseeInicial, 3, 6);
                 meuPersonagem.PTvitalidade = dadosCriacao.rolarDados(myClasseeInicial, 2, 6);
                 meuPersonagem.PTsintonização = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 meuPersonagem.PTforca = dadosCriacao.rolarDados(myClasseeInicial, 3, 6);
                 meuPersonagem.PTdestreza = dadosCriacao.rolarDados(myClasseeInicial, 2, 6);
                 meuPersonagem.PTvelocidade = dadosCriacao.rolarDados(myClasseeInicial, 3, 6);
                 meuPersonagem.PTinteligencia = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 meuPersonagem.PTfe = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 break;
            case "Espadachim":
                meuPersonagem.level = 12;
                 meuPersonagem.PTvigor = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 meuPersonagem.PTvitalidade = dadosCriacao.rolarDados(myClasseeInicial, 3, 6);
                 meuPersonagem.PTsintonização = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 meuPersonagem.PTforca = dadosCriacao.rolarDados(myClasseeInicial, 2, 6);
                 meuPersonagem.PTdestreza = dadosCriacao.rolarDados(myClasseeInicial, 4, 6);
                 meuPersonagem.PTvelocidade = dadosCriacao.rolarDados(myClasseeInicial, 4, 6);
                 meuPersonagem.PTinteligencia = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 meuPersonagem.PTfe = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 break;
            case "Depravado":
                 meuPersonagem.level = 1;
                 meuPersonagem.PTvigor = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 meuPersonagem.PTvitalidade = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 meuPersonagem.PTsintonização = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 meuPersonagem.PTforca = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 meuPersonagem.PTdestreza = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 meuPersonagem.PTvelocidade = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 meuPersonagem.PTinteligencia = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 meuPersonagem.PTfe = dadosCriacao.rolarDados(myClasseeInicial, 1, 6);
                 break;
            default:
                System.out.println("selecionado incorretamente, tente novamente");
                     Persona_criacao_menu(meuPersonagem);

        }
        
    }
    
}
