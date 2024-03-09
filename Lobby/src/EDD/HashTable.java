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

    /**
     * @param estado the estado to set
     */
    public void setState(Status[] state) {
        this.state = state;
    }
    
    public void initTable(){
        setState(new Status[getSize()]);
        for (int i = 0; i < size; i++) {
            getState()[i] = null;
        }
    }
    
    public void insertState(Status estado){
        if (!isInHash(estado)) {
            int index = estado.getNum_hab();
            while (getState()[index] != null) {
                index++;
            }
//            JOptionPane.showMessageDialog(null, "La clave del Cliente " + estado.getCliente().getNombre()+ " es: " + index);
            getState()[index] = estado;
        } else{
//            JOptionPane.showMessageDialog(null, "¡ERROR!\nEl estado ya está registrado");
        }
    }
    
    //Verifica si un documento ya existe en la HashTable/
    public boolean isInHash(Status est){
        boolean aux = false;
        for (int i = 0; i < this.getState().length; i++) {
            if (getState()[i] != null){
                if (getState()[i].compareEstado(est)){
                    aux = true;
                }
            }
        }
        return aux;
    }

    //Verifica si un documento ya existe en la HashTable/
    public int isInHashIndex(Status est){
        for (int i = 0; i < this.getState().length; i++) {
            if (getState()[i] != null){
                if (getState()[i].compareEstado(est)){
                    return i;
                }
            }
        }
        
        return -1;
    }
    
    public int isInHashIndexN(Client cliente){
        for (int i = 0; i < this.getState().length; i++) {
            if (getState()[i] != null){
                if (getState()[i].getCliente.getNombre().equalsIgnoreCase(cliente.getNombre()) && getState()[i].getCliente().getSegundo_nombre().equalsIgnoreCase(cliente.getSegundo_nombre())){
                    return i;
                }
            }
        }
        
        return -1;
    }
    public void Avaiables(List hab_disp){
        for (int i = 1; i < this.getState().length; i++) {
            if (getState()[i] == null){
                hab_disp.addEnd(i);
            }

    }
}
}
