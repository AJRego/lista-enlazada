/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author ajrego
 * @param <T>
 */
public class lista<T> {
    private nodo<T> primero;
    private nodo<T> ultimo;
    private int tamaño;

    public lista() {
        primero = null;
        ultimo = null;
        tamaño = 0;
    }
    
    public int getTamaño(){
        return tamaño;
    }
    
    private boolean estaVacia(){
        return tamaño == 0;
    }
}
