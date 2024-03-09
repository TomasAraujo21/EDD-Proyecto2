/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author tomasaraujo
 */
public class Node {
    private Object tInfo;
    private Node  pNext;

    public Node() {
        this.tInfo = null;
        this.pNext = null;
    }
    /**
     * Creacion del constructor de la clase 'Node'
     * @param tInfo
     *      Indica el atributo que se le esta pasando al Nodo.
     * @param pNext 
     *      Indica el apuntador hacia el siguiente Nodo.
     */
    
    public Node(Object tInfo, Node pNext) {
        this.tInfo = tInfo;
        this.pNext = pNext;
    }

    public Node(Object tInfo) {
        this.tInfo = tInfo;
        this.pNext = null;
    }
    public Object gettInfo() {
        return tInfo;
    }

    public void settInfo(Object tInfo) {
        this.tInfo = tInfo;
    }

    public Node getpNext() {
        return pNext;
    }

    public void setpNext(Node pNext) {
        this.pNext = pNext;
    }

    @Override
    public String toString() {
        return "Node{" + "tInfo=" + tInfo + ", pNext=" + pNext + '}';
    }
}
