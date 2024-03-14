/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Classes.*;
/**
 *
 * @author Gabriel Flores
 */
public class BST {
    private NodeBST root;
    
    public BST() {
        this.root = null;
    }
    public NodeBST getRoot() {
        return root;
    }

    public void setRoot(NodeBST root) {
        this.root = root;
    }
    
    
    public boolean isEmpty() {
        return this.getRoot() == null;
    }
    
    public void empty() {
        this.setRoot(null);
    }
    
    public void insertNodo(NodeBST root,Reservation reservation) {
        NodeBST node = new NodeBST();
        node.setReservation(reservation);
        if (isEmpty()) {
            setRoot(node);
        } else {
            if (reservation.getClient().getId() <=  root.getReservation().getClient().getId()) {
                if(root.getRight() == null) {
                    root.setRight(node);
                    node.setFather(node);
                } else {
                    insertNodo(root.getLeft(),reservation);
                }
            } else {
                if(root.getRight() == null) {
                    root.setRight(node);
                    node.setFather(root);
                } else {
                    insertNodo(root.getRight(),reservation);
                }
            }
        }
    }
    
    public NodeBST searchNode(int id, NodeBST root){
        if(isEmpty()){
            return null;
        }else{
            if(root.getReservation().getClient().getId() == id){
                return root;
            }else{
                if(id < root.getReservation().getClient().getId()){
                    return searchNode(id, root.getLeft());
                }else{
                    return searchNode(id, root.getLeft());
                }
            }
        }
    }
    
    public void preOrder(NodeBST root) {
        if (root != null) {
            System.out.println("{ "+root.getReservation().toString()+" }");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
    
    public String preOrder2 (NodeBST root, String chain){
        if(root != null){
            chain = chain + root.getReservation().toString() + ",";
            chain = preOrder2(root.getLeft(), chain);
            chain = preOrder2(root.getRight(), chain);
        }
        
        return chain;
    }
    
    public void List(NodeBST root, List list) {
        list.addEnd(root.getReservation());
        
        if(root.getLeft()!= null){
            List(root.getLeft(), list);
        }
        if(root.getRight() != null){
            List(root.getRight(), list);
        }   
    }
    
    public void inOrder(NodeBST root) {
        if (root != null) {
            preOrder(root.getLeft());
            System.out.println("{ "+root.getReservation().toString()+" }");
            preOrder(root.getRight());
        }
    }
    
    public void postOrder (NodeBST root) {
        if (root != null) {
            preOrder(root.getLeft());
            preOrder(root.getRight());
            System.out.println("{ "+root.getReservation().toString()+" }");
        }
    }

}
