public class Pila {

    public Nodo tope;

    public Pila ()
    {
        tope = null;
    }

    // pila esta vacia
    public boolean pilaVacia()
    {
        return tope == null;
    }
    // meter un elemento en la pila
    public void push(int elemento)
    {
        Nodo nodo = new Nodo(elemento);
        nodo.apuntador = tope;
        tope = nodo;
    }
    //Sacar un elemento de la pila
    public int pop()
    {
        int valorTope = 0;
        if(!pilaVacia())
        {
            valorTope = tope.elemento;
            tope = tope.apuntador;
        }
        return valorTope;
    }
    //imprimir contenido de la pila
    public void imprimePila()
    {
        Nodo aux = tope;
        if(!pilaVacia())
        {
            while(aux !=null){
                System.out.println(aux.elemento);
                aux = aux.apuntador;
            }
        }
    }
}
