/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author tomasaraujo
 */
public class Reservation {
    private Client client;
    private String roomType;
    private String checkIn;
    private String checkOut;

    public Reservation(Client client, String roomType, String checkIn, String checkOut) {
        this.client = client;
        this.roomType = roomType;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
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
     * @return the roomType
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * @param roomType the roomType to set
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * @return the checkIn
     */
    public String getCheckIn() {
        return checkIn;
    }

    /**
     * @param checkIn the checkIn to set
     */
    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    /**
     * @return the checkOut
     */
    public String getCheckOut() {
        return checkOut;
    }

    /**
     * @param checkOut the checkOut to set
     */
    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Nombre cliente: " + client.getName() + client.getLastname() + "Cedula cliente: " + client.getId() + "LLegada: " + checkIn + "Salida: " + checkOut;
    }
}
