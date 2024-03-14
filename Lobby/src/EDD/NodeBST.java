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
public class NodeBST {
    private Reservation reservation;
    private NodeBST left;
    private NodeBST right;
    private NodeBST father;

    public NodeBST(Reservation reservation , NodeBST left, NodeBST right, NodeBST father) {
        this.reservation = reservation;
        this.left = left;
        this.right = right;
        this.father = father;
    }

    public NodeBST() {
        this.reservation = null;
        this.left = null;
        this.right = null;
        this.father = null;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    public NodeBST getLeft() {
        return left;
    }

    public void setLeft(NodeBST left) {
        this.left = left;
    }

    public NodeBST getRight() {
        return right;
    }

    public void setRight(NodeBST right) {
        this.right = right;
    }

    

    public NodeBST getFather() {
        return father;
    }

    public void setFather(NodeBST father) {
        this.father = father;
    }
    
    
}