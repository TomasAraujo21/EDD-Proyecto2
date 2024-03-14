/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Gabriel Flores
 */
public class NodeAVL {
    private int key;
    private int height;
    private NodeAVL left;
    private NodeAVL right;

    public NodeAVL(int key) {
        this.key = key;
        this.height = 1;
        this.left = null;
        this.right = null;
    }
    
    public boolean isFull(){
        return (getRight()!=null && getLeft()!=null);
    }
    
    public boolean isLeaf(){
        return (getRight()==null && getLeft()==null);
    }

    public boolean hasLeft(){
        return (getLeft()!=null);
    }

    public boolean hasRight(){
        return (getRight()!=null);
    }
    
    public NodeAVL getRight() {
        return right;
    }

    public void setRight(NodeAVL right) {
        this.right = right;
    }

    public NodeAVL getLeft() {
        return left;
    }

    public void setLeft(NodeAVL left) {
        this.left = left;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
