/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG_simulador;

/**
 *
 * @author PC GAMER
 */
public class Item {
    String nome;
    String descricao;
    
    public Item(String nome_item, String descricao_item){
        nome = nome_item;
        descricao = descricao_item;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
}
