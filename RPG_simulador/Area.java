/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG_simulador;
import java.util.Scanner;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class Area {
    String nome;
    String descricao;
    Boolean bau;
    Inimigo[] inimigos;
    Area Prox_area;
    
    public Area(String nome_area, String descricao_area,  Boolean bau_na_area, Inimigo[] inimigos_area, Area Proxima_area){
        nome = nome_area;
        descricao = descricao_area;
        bau = bau_na_area;
        inimigos = inimigos_area;
        Prox_area = Proxima_area;
    }
    
    public void opcoes_area(Scanner scanner){
        System.out.println(nome);
        System.out.println(descricao);
        System.out.println("Deseja fazer o que?");
        if(bau == true){
        System.out.println("OP 1: Abrir bau, OP 2: Ir para proxima area");
        } else {
            System.out.println("Indo para proxima area");
            scanner.nextLine();
            Prox_area.opcoes_area(scanner);
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public Boolean getBau(){
        return bau;
    }
    
    public Inimigo[] getInimigos(){
        return inimigos;
    }
}
