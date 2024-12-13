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
    Boolean bau;
    String[] inimigos;
    Area Prox_area;
    
    public Area(String nome_area, String descricao_area,  Boolean bau_na_area, String[] inimigos_area, Area Proxima_area){
        nome = nome_area;
        descricao = descricao_area;
        bau = bau_na_area;
        inimigos = inimigos_area;
        Prox_area = Proxima_area;
    }
    
    public void opcoes_area(){
        System.out.println(nome);
        System.out.println(descricao);
        System.out.println("Deseja fazer o que?");
        if(bau == true){
        System.out.println("OP 1: Abrir bau, OP 2: Ir para proxima area");
        }
    }
    
    public void realizar_caminho(Area area){
        Prox_area.opcoes_area();
        
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
