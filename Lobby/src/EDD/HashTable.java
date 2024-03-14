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
        
public class HashTable {
    private int size;
    private Status[] state;

    public HashTable() {
        this.size = 300;
        this.state = new Status[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Status[] getState() {
        return state;
    }

    public void setState(Status[] state) {
        this.state = state;
    }
    
    public void initTable(){
        setState(new Status[getSize()]);
        for (int i = 0; i < size; i++) {
            getState()[i] = null;
        }
    }
    
    public void insertState(Status state){
         if (!isInHash(state)) {
            int index = state.getNum_hab();
            while (getState()[index] != null) {
                index++;
            }
//            JOptionPane.showMessageDialog(null, "La clave del Cliente " + estado.getCliente().getNombre()+ " es: " + index);
            getState()[index] = state;
        } else{
//            JOptionPane.showMessageDialog(null, "¡ERROR!\nEl estado ya está registrado");
        }

    }
    
    public boolean isInHash(Status state){
        boolean aux = false;
        for (int i = 0; i < this.getState().length; i++) {
            if (getState()[i] != null){
                if (getState()[i].compareState(state)){
                    aux = true;
                }
            }
        }
        return aux;

    }
    
    public int isInHashIndex(Status state){
        for (int i = 0; i < this.getState().length; i++) {
            if (getState()[i] != null){
                if (getState()[i].compareState(state)){
                    return i;
                }
            }
        }
        
        return -1;
    }
 
    public int isInHashIndexN(Client client){
        for (int i = 0; i < this.getState().length; i++) {
            if (getState()[i] != null){
                if (getState()[i].getClient().getName().equalsIgnoreCase(client.getName()) && getState()[i].getClient().getLastname().equalsIgnoreCase(client.getLastname())){
                    return i;
                }
            }
        }
        
        return -1;
    }
    
    public void Availables(List room_availables){
        for (int i = 1; i < this.getState().length; i++) {
            if (getState()[i] == null){
                room_availables.addEnd(i);
            }
        }
    }
}
