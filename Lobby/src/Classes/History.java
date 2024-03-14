/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author tomasaraujo
 */
public class History {
    private Client client;
    private String dateIn;
    private String dateOut;
    private String roomNumber;

    public History(Client client, String dateIn, String dateOut, String roomNumber) {
        this.client = client;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.roomNumber = roomNumber;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the dateIn
     */
    public String getDateIn() {
        return dateIn;
    }

    /**
     * @param dateIn the dateIn to set
     */
    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    /**
     * @return the dateOut
     */
    public String getDateOut() {
        return dateOut;
    }

    /**
     * @param dateOut the dateOut to set
     */
    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    /**
     * @return the roomNumber
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public void show() {
        
    }
}
