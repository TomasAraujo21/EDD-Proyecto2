/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Gabriel Flores
 */
public class NodeBST {
    private Object info;
    private NodeBST left;
    private NodeBST right;
    private NodeBST father;

    public NodeBST(Object info, NodeBST left, NodeBST right, NodeBST father) {
        this.info = info;
        this.left = left;
        this.right = right;
        this.father = father;
    }

    public NodeBST() {
        this.info = null;
        this.left = null;
        this.right = null;
        this.father = null;
    }
    
    

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
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