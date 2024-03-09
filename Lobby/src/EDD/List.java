/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author tomasaraujo
 */
public class List {
    private Node pfirst;
    private int size;
    
    public List() {
        this.pfirst = null;
        this.size = 0;
    }
    

    public Node getPfirst() {
        return pfirst;
    }

    public void setPfirst(Node pfirst) {
        this.pfirst = pfirst;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Metodo para indicar si la lista esta vacia o no.
     * @return
     *      Retorna null si la lista se encuentra vacia.
     */
    public boolean isEmpty(){
        return this.pfirst == null;
    }
    
    /**
     * Metodo para agregar al inicio de la lista.
     * @param dato
     *      Objeto que se va a agregar al inicio de la lista.
     */
    public void addStart(Object dato){
        Node pnew = new Node();
        pnew.settInfo(dato);       
        if (isEmpty()){
            pfirst = pnew;
        }else{
            pnew.setpNext(pfirst);
            pfirst = pnew;
        }
        size ++;
    }
    
    /**
     * Metodo para agregar al final de la lista.
     * @param dato 
     *      Objeto que se va a agregar al final de la lista.
     */
    public void addEnd(Object dato){
        Node pNew = new Node();
        pNew.settInfo(dato);
        if (isEmpty()){
            pfirst = pNew;
        }else{
            Node aux = pfirst;
            while(aux.getpNext()!= null){
                aux = aux.getpNext();
            }
            aux.setpNext(pNew);
        }
        size++;
    }
    
    /**
     * Metodo para agregar dependiendo de la posicion que se pase por parametro.
     * @param position
     *      Posicion de la lista.
     * @param dato 
     *      Objeto que se va a agregar dependiendo de la posicion de la lista.
     */
    public void addByPosition(int position,Object dato){
        if (position >= 0 && position <= size){
            Node pNew = new Node();
            pNew.settInfo(dato);
            if (position ==0){
                pNew.settInfo(pfirst);
                pfirst = pNew;
            } else{
                if (position == size){
                    Node aux = pfirst;
                    while (aux.getpNext() != null){
                        aux.getpNext();
                    }
                    aux.setpNext(pNew);
                }else{
                    Node aux = pfirst;
                    for (int i=0;i<(position - 1);i++){
                        aux = aux.getpNext();
                    }
                    Node nextOne = aux.getpNext();
                    aux.setpNext(pNew);
                    pNew.setpNext(nextOne);
                }
            }
            size ++;
        }
    }
    
    /**
     * Metodo para obtener el valor o dato que se encuentra en un indice.
     * @param index
     *      Indice del elemento del dato que se desa obtener.
     * @return
     *      Retorna la informacion del elemento.
     */
    public Object getValor(int index) {
        if (isEmpty()) {
            return -1;
        } else {
            Node pointer = getPfirst();
            int cont = 0;
            while (cont < index && pointer.getpNext() != null) {
                pointer = pointer.getpNext();
                cont++;
            }
            return pointer.gettInfo();
        }
    }
    
    /**
     * Metodo para mostrar el dato de cada elemento de la lista.
     */
    public void show() {
        if(!isEmpty()){
            Node pointer = getPfirst();
            while(pointer!=null){
            System.out.println("["+pointer.gettInfo()+"]");
            pointer = pointer.getpNext();
            }
        }else{
            System.out.println("La lista se encuentra aun vacia.");
        }
    }
    
    /**
     * Metodo para eliminar el primer elemento de la lista.
     * 
     * @return 
     *      Retorna true si el elemento fue eliminado exitosamente.
     */
    public boolean deleteStart(){
        if(!isEmpty()){
            pfirst = pfirst.getpNext();
            size--;
            return true;
        }else{
            return false;
        }
    }
    
    //Primitiva para eliminar al final de una lista simple.
    public void deleteFinal(){
        if (!isEmpty()){
            Node pointer = getPfirst();
            while (pointer.getpNext() != null){
                pointer = pointer.getpNext();
            }
            pointer.setpNext(null);
            size --;
        }
    }
    
    public boolean find(Object reference){
        Node aux = pfirst;
        boolean find = false;
        while(aux != null && find != true){
            if (reference == aux.gettInfo()){ 
                find = true;
            }
            else{
                aux = aux.getpNext();
            }
        }
        return find;
    }
    
    public void deleteByReference(Object reference){
        if (find(reference)) {
            if (pfirst.gettInfo() == reference) {
                pfirst = pfirst.getpNext();
            } else{
                Node aux = pfirst;
                while(aux.getpNext().gettInfo() != reference){
                    aux = aux.getpNext();
                }
                Node nextAux = aux.getpNext().getpNext();
                aux.setpNext(nextAux);  
            }
            size--;
        }
    }
    
        
    public void deleteByIndex(int index){
        if(index>= 0 || index<this.size){
            Node aux = this.pfirst;
            for (int i = 0; i < index-1; i++) {
                aux = aux.getpNext();
            }
            
            Node pNext = aux.getpNext();
            aux.setpNext(pNext.getpNext());
            size --;

        }
    }
    
    public String transform(){
        if(!isEmpty()){
            Node aux = pfirst;
            String expression = "";
            for (int i = 0; i < size; i++) {
                expression += aux.gettInfo().toString() + "\n";
                aux = aux.getpNext();
            }
            return expression;
        }
        return "Lista vacia";
    }
    
    public String transformCity(){
        if(!isEmpty()){
            Node aux = pfirst;
            String expression = "";
            for (int i = 0; i < size; i++) {
                expression += aux.gettInfo().toString() + ", ";
                aux = aux.getpNext();
            }
            return expression;
        }
        return "Lista vacia";
    }
    
    public void clear(){
        pfirst = null;
        size = 0;
    }
}
