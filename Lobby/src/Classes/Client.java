/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author tomasaraujo
 */
public class Client {
    private String name;
    private String lastname;
    private String email;
    private String sex;
    private int id;
    private String phoneNumber;

    public Client(String name, String lastname, String email, String sex, int id, String phoneNumber) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.sex = sex;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public Client(String name, String lastname, String email, String sex, String phoneNumber) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.sex = sex;
        this.id = 0;
        this.phoneNumber = phoneNumber;
    }
    
    
    
    public Client(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.email = null;
        this.sex = null;
        this.id = 0;
        this.phoneNumber = null;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + name + lastname + "\nEmail: " + email + "\nGenero: " + sex + "\nCedula: " + id + "\nTelefono: " + phoneNumber;
    }
}
