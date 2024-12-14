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
    Inimigo inimigos;
    Area Prox_area;
    
    public Area(String nome_area, String descricao_area,  Boolean bau_na_area, Inimigo inimigos_area){
        nome = nome_area;
        descricao = descricao_area;
        bau = bau_na_area;
        inimigos = inimigos_area;
        Prox_area = null;
    }
    
    public void opcoes_area(Scanner scanner, Dados dadosUtil, Bolsa bolsa){
        System.out.println(nome);
        System.out.println(descricao);
        System.out.println("Deseja fazer o que?");
        if(bau == true){
            System.out.println("OP 1: Ir para proxima area, OP 2: Checar bau proximo");
            System.out.println("Qual opcao deseja? ");
            String resposta = scanner.nextLine();
            if(resposta == "1"){
                Prox_area.opcoes_area(scanner, dadosUtil, bolsa);
            } else {
                Checar_bau(scanner, dadosUtil, bolsa);
            }
        } else {
            System.out.println("Indo para proxima area");
            scanner.nextLine();
            Prox_area.opcoes_area(scanner, dadosUtil, bolsa);
        }
    }

    public void Checar_bau(Scanner scanner, Dados dadosUtil, Bolsa bolsa){
        System.out.println("Você se aproxima do bau");
        scanner.nextLine();
        System.out.println("Deseja abrilo? S / N");
        String resposta = scanner.nextLine();
        if(resposta == "S" || resposta == "s"){
            conteudo_aleatorio(scanner, dadosUtil, bolsa);
        } else {
            opcoes_area(scanner, dadosUtil, bolsa);
        }
    }
    
    public void conteudo_aleatorio(Scanner scanner, Dados dadosUtil, Bolsa bolsa){
        Item pedra_de_cura = new Item("pedra de cura", "pedra simples que solta uma fraca magia de cura ao ser quebrada");
        Item dente_dourado = new Item("Dente dourado", "Um dente dourado no formato da presa de algum animal, para que será que serve?");
        int resultado = dadosUtil.rolarDados(scanner, 1, 2);
        if(resultado == 1){
            System.out.println("Você achou o item: " + pedra_de_cura);
            //Onde os itens deveria ser adicionados a bolsa
        } else {
            System.out.println("Você achou o item: " + dente_dourado);
            //Onde os itens deveria ser adicionados a bolsa
        }
        opcoes_area(scanner, dadosUtil, bolsa);
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
    
    public Inimigo getInimigos(){
        return inimigos;
    }
}
