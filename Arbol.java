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
public class Arbol {

    Nodo raiz = null;

    public void insertar(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        if (raiz == null) {
            raiz = nuevo;
        }else{
            Nodo aux = raiz;
            Nodo ant = null;
            while(aux != null){
                ant = aux;                
                if (nuevo.dato > aux.dato) {
                    aux = aux.derecha;
                }else{
                    aux = aux.izquierda;
                }
            }
            if (nuevo.dato > ant.dato) {
                ant.derecha = nuevo;
            }else{
                ant.izquierda = nuevo;
            }
            
            
        }
    }

    public void inorder(Nodo raiz) {
        if (raiz != null) {
            inorder(raiz.izquierda);
            System.out.println(" " + raiz.dato);
            inorder(raiz.derecha);
        }        
    }

    public void inorder() {        
        inorder(raiz);
    }

}
