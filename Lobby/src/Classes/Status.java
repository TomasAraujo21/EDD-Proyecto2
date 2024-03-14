/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author tomasaraujo
 */
public class Status {
    private int num_hab;
    private Client client;
    private String arrive;

    public Status(int num_hab, Client client, String arrive) {
        this.num_hab = num_hab;
        this.client = client;
        this.arrive = arrive;
    }

    public int getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(int num_hab) {
        this.num_hab = num_hab;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    @Override
    public String toString() {
        return "Status{" + "num_hab=" + num_hab + ", client=" + client + ", arrive=" + arrive + '}';
    }
    
    
    
    public boolean compareState(Status state){
        return (state.getClient().getPhoneNumber() == null ? this.client.getPhoneNumber() == null : state.getClient().getPhoneNumber().equals(this.client.getPhoneNumber())) && state.getClient().getName().equalsIgnoreCase(this.client.getName());
    }
}
