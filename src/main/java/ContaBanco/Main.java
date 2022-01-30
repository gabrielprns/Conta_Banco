/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaBanco;

/**
 *
 * @author Usuario
 */
public class Main {
    
    public static void main(String[] args) {
        ContaBanco p1= new ContaBanco();
        p1.setNumConta(11111);
        p1.setDono("Kleber");
        p1.abrirConta("CC");
        p1.depositar(700);
        p1.sacar(750);
        p1.fecharConta();
        p1.estadoAtual();
    }
    
}
