
package metodos;

/**
 *
 * @author ajrego
 * @param <T>
 */
public class nodo<T> {
    private T dato;
    private nodo<T> siguiente;

    public nodo(T dato, nodo<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
