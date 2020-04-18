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

    public int getTamaño() {
        return tamaño;
    }

    private boolean estaVacia() {
        return tamaño == 0;
    }

    public void agregarPrimero(T dato) {

        nodo<T> agregado = new nodo<>(dato, primero);

        if (estaVacia()) {
            primero = agregado;
            ultimo = agregado;
        } else {
            primero = agregado;
        }

        tamaño++;
    }

    public void agregarUltimo(T dato) {

        if (estaVacia()) {
            agregarPrimero(dato);
        } else {
            nodo<T> agregado = new nodo<>(dato, null);

            ultimo.setSiguiente(agregado);
            ultimo = agregado;

            tamaño++;
        }
    }
    
    public String getDatosLista(){
        String datos="[ ";
        
        nodo<T> temporal = primero;
        
        while(temporal != null){
            datos+=temporal.getDato().toString()+" ] -> [ ";
            
            temporal = temporal.getSiguiente();
        }
        
        datos+="null ]";
        
        return datos;
    }
}
