/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG_simulador;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class Inimigo {
    String nome;
    String classe_monstro;
    double vida;
    double ataque;
    int defesa;
    int carga;
    double velocidade;
    
    public Inimigo(String nome_per, String classeM, double Vitalidade, double Poder_Ataque, int armadura, String Classe_per, int Carga, double velocidade_Media){
        nome = nome_per;
        classe_monstro = classeM;
        vida = Vitalidade;
        ataque = Poder_Ataque;
        defesa = armadura;
        carga = Carga;
        velocidade = velocidade_Media;
    };
    
    public void getInimigo(){
        System.out.println("O inimigo: " + nome + " possui: " + ataque + " pts de ataque, " + vida + " pts de vida e " + defesa + "pts de defesa.");
    }
    
    public String getNome(){
        return nome;
    }
    
    public boolean estaVivo(){
        if(vida > 0){
            return true;
        } 
        return false;
    }
    
    public double calcularDanoMonstro(double danocalculo){
        double calculo = danocalculo - getDefesa();
        if (calculo > 0) {
            return calculo;
        } else {
            double danoreal = danocalculo / 10;
            return danoreal;
        }
        
    }

    public void sofrerDanoMonstro(double dano){
        double danoCalculado = getVida() - calcularDanoMonstro(dano);
        vida = danoCalculado;
        System.out.println(nome + " sofreu " + calcularDanoMonstro(dano) + " de dano.");
    }
    
    public double ataque_rapido(int escolha_stat){
        double ataqueleve = getAtaque() * 0.75;
        double ataqueRapVel = getVelocidade() * 1.50;
        if (escolha_stat == 1){
            return ataqueleve;
        } else {
            return ataqueRapVel;
        }
    }
    public double ataque_medio(int escolha_stat){
        if(escolha_stat ==  1){
            return getAtaque();
        } else {
            return  getVelocidade();
        }
    }
    public double ataque_pesado( int escolha_stat){
        double ataquepesado = getAtaque() * 1.5;
        double ataquePesVel = getVelocidade() * 0.75;
        if (escolha_stat == 1){
            return ataquepesado;
        } else {
            return ataquePesVel;
        }
    }
    public double ataque_ULTIMATE(int escolha_stat){
        double ataqueULT = getAtaque() * 2;
        double ataqueULTVel = getVelocidade() * 0.95;
        if (escolha_stat == 1){
            return ataqueULT;
        } else {
            return ataqueULTVel;
        }
    }
    public int getDefesa(){
        return defesa;
    }
    
    public String classeM(){
        return classe_monstro;
    }
    
    public double getVida(){
        return vida;
    }
    
    public int getCarga(){
        return carga;
    }
    
    public double getAtaque(){
        return ataque;
    }
    
    public double getVelocidade(){
        return velocidade;
    }
    
}