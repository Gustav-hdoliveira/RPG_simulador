/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG_simulador;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class Area {
    String nome;
    String descricao;
    Boolean atalho;
    Boolean bau;
    String[] inimigos;
    
    public Area(String nome_area, String descricao_area, Boolean atalho_presente,  Boolean bau_na_area, String[] inimigos_area){
        nome = nome_area;
        descricao = descricao_area;
        atalho = atalho_presente;
        bau = bau_na_area;
        inimigos = inimigos_area;
    }
   
    
    
    public void realizar_atalho(Area area){
       if(atalho == true){
           
       }
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public Boolean getAtalho(){
        return atalho;
    }
    
    public Boolean getBau(){
        return bau;
    }
    
    public String[] getInimigos(){
        return inimigos;
    }
}
