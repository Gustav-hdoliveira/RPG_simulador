/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package RPG_simulador;
import java.util.Scanner;

public class App {
    
    void menu_combate(Personagem persona, Inimigo inimigo, Scanner scanner, Dados dadosUtil){
        int dado_resultado;
        double poder_inimigoATQ;
        double velocidade_inimigoATQ;
        while(inimigo.getVida() > 0 || persona.getVidaAtual() > 0){
            
        }
    }

    public static void main(String[] args) {
        Dados dadosUtil = new Dados();
        Scanner enter = new Scanner(System.in);
        Personagem character = new Personagem("Null", 0, 0, 0.1, 0.1,0,0.1,0,0,0,0,0,0,0.1,0,0, "null", "null");
        Persona_criacao PerCri = new Persona_criacao();
        PerCri.Persona_criacao_menu(character);
        
    }
}