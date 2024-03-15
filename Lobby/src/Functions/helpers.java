/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

/**
 *
 * @author Gabriel Flores
 * 
 */
public class helpers {
    public boolean validateLyrics(String letter){
        return letter.matches("[a-zA-Zñ]*");
    }
    
    private boolean validateNumbers(String num){
        return num.matches("[0-9]*");
    }
    
    
    public int ValidateNumbers(String number){
        if(validateNumbers(number)== true){
            int num = Integer.parseInt(number);
            return num;
        }else{
            return -1;
        }
    }
    //Escribir un validar nombre y validar sexo ya que tienen algunos simbolos y daba error
    public String ValidateLyrics(String letter){
        if (validateLyrics(letter) == true) {
            return letter;
        } else {
            return null;
        }
    }
    
    public int ValidateID(String id){
        String replaceAll = id.replace(".", "");
        if(validateLyrics(replaceAll)== true){
            if(replaceAll.length() >= 7 && replaceAll.length()<= 9){
                int num = Integer.parseInt(replaceAll);
                return num;
            }else{
                return -1;
            }
        }else{
            return -1;
        }
    }
    
    public String ValidateDate(String date){
            return null;
    }
    
    public String Validatetelf(String telf){
        String cell = telf.replaceAll(" ", "");
        if (cell.charAt(0) == '(') {
            if (cell.charAt(4) == ')') {
                String cell_uno = cell.replace('(', '0');
                String cell_dos = cell_uno.replace(')', '0');
                if (validateNumbers(cell_dos) == true) {
                    return telf;
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
    
    public String ValidateEmail(String email){
        int count = 0;
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@'){
                count++;
            }
        }
        if(count == 1){
            return email;
        }else{
            return null;
        }
    }
    
    public String Validate_RoomType(String roomType){
        if(roomType.equalsIgnoreCase("simple") || roomType.equalsIgnoreCase("doble") || roomType.equalsIgnoreCase("triple") || roomType.equalsIgnoreCase("suite")){
            return roomType;
        }else{
            return null;
        }
    }
}
