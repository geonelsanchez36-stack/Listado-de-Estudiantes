public class LinkedList implements ListInterface{
    private Nodo cabeza;
    private int size;

    public LinkedList() {
        this.cabeza = null;
        this.size = 0;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void add(Estudiante dato) {
        Nodo cursor=cabeza;
        Nodo nuevo=new Nodo(dato);

        if (isEmpty()){
            cabeza=nuevo;
        }else {
            while (cursor.getNext() != null){
                cursor=cursor.getNext();
            }
            cursor.setNext(nuevo);
        }
        size++;
    }

    @Override
    public boolean isEmpty() {
        return cabeza == null;
    }

    @Override
    public Estudiante get(int index) {
        Nodo cursor=cabeza;
        if (index >= 0 && index < size){
            for (int i = 0; i < index ; i++) {
                cursor=cursor.getNext();
            }
            return cursor.getDato();
        }else {
            throw new UnsupportedOperationException("Indice fuera de rango");
        }
    }

    @Override
    public Estudiante remove(int index) {
        Nodo cursor=cabeza;
        if (index >=0 && index < size){
            Nodo aux;
            if (index==0){
                aux=cabeza;
                cabeza=cabeza.getNext();
            }else {
                for (int i = 0; i <index-1 ; i++) {
                    cursor=cursor.getNext();
                }
                aux=cursor.getNext();
                cursor.setNext(aux.getNext());
            }
            size--;
            return aux.getDato();
        }else {
            throw new UnsupportedOperationException("Indice fuera de rango");
        }
    }

    public void Cumpleaños(String mes){
        Nodo actual=cabeza;
        int contador=0;
        while (actual != null){
            if (actual.getDato().getMesCumple().equals(mes)){
                contador++;
            }
            actual=actual.getNext();
        }
        if (contador ==0){
            System.out.println("No hay estudiantes que cumplen año en el mes: "+mes);
            return;
        }

        actual=cabeza;
        String[] aux=new String[contador];
        int posicion=0;
        while (actual != null){
            if (actual.getDato().getMesCumple().equals(mes)){
                aux[posicion]=actual.getDato().getNombre();
                posicion++;
            }
            actual=actual.getNext();
        }
        System.out.println("Estudiantes que cumplen años en "+mes);
        for (int i = 0; i <aux.length ; i++) {
            System.out.println(aux[i]);
        }

    }
    public void mostrarCantMilitantes(){
        if (isEmpty()){
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo aux=cabeza;
        while (aux != null){
            System.out.println(aux.getDato());
            aux=aux.getNext();
        }
    }

    private LinkedList CantMilitantes(){
        LinkedList resultado =new LinkedList();
        Nodo actual=cabeza;

        while (actual != null){
            if (actual.getDato().isEsMilitanteUJC()){
               insertarOrdenadoPorAño(resultado,actual.getDato());
            }
            actual=actual.getNext();
        }
        return resultado;
    }

    private void insertarOrdenadoPorAño(LinkedList destino,Estudiante e){
        Nodo nuevo=new Nodo(e);

        if (destino.cabeza == null || e.getAño() < destino.cabeza.getDato().getAño()){
            nuevo.setNext(destino.cabeza);
            destino.cabeza=nuevo;
            return;
        }
        Nodo actual=destino.cabeza;
        while (actual.getNext() != null && actual.
                getNext().getDato().getAño() <= e.getAño()){
            actual=actual.getNext();
        }
        nuevo.setNext(actual.getNext());
        actual.setNext(nuevo);
    }

    public int CantBecados(){
        Nodo actual=cabeza;
        int cantBecados=0;
        while (actual != null){
            if (actual.getDato().isEsBecado()){
                cantBecados++;
            }
            actual=actual.getNext();
        }
       return cantBecados;
    }





}
