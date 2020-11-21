/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author jairo
 */
public class Main {
    public static void main(String[] args) {
        Arbol arbolito = new Arbol();
        arbolito.insertar(50);
        arbolito.insertar(30);
        arbolito.insertar(20);
        arbolito.insertar(40);
        arbolito.insertar(70);
        arbolito.insertar(60);
        arbolito.insertar(80);
        arbolito.encontrar(70);
        arbolito.eliminar(0);
        
        //arbolito.inorder();
    }
    
}
