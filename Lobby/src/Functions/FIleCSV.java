/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;
import EDD.*;
import Classes.*;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel Flores
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCSV {
    private helpers help = new helpers();
    
    //funcion para leer archivo TXT
    public void Read_bookings(BST tree_reserv){ 
        String line;
        String expresion_txt = "";
        String path = "test\\bookings.csv";
        File file = new File(path);
        try{
            if(!file.exists()){
               file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine())!= null){
                    if(!line.isEmpty()){
                        expresion_txt += line + "\n";
                    }
                }
                if (!"".equals(expresion_txt)){
                    String[] expresion_split = expresion_txt.split("\n");
                    for(int i =0;i < expresion_split.length;i++){
                        String[] info = expresion_split[i].split(",");
                        if(help.ValidateID(info[0]) != -1 && help.Validate_RoomType(info[5]) != null && help.ValidateEmail(info[3]) != null && help.Validatetelf(info[6]) != null){
                            int id = help.ValidateID(info[0]);
                            String name = info[1];
                            String last_name = info[2];
                            String email = help.ValidateEmail(info[3]);
                            String sex = info[4];
                            String cellphone_number = help.Validatetelf(info[6]);
                            
                            Client client = new Client(name,last_name,email,sex,id,cellphone_number);
                            
                            String roomType = help.Validate_RoomType(info[5]);
                            String departure_date = info[7];
                            String arrival_date = info[8];
                            
                            Reservation booking = new Reservation(client, roomType, departure_date, arrival_date);
                            
                            tree_reserv.insertNodo(tree_reserv.getRoot(), booking);
                        }else{
                            JOptionPane.showMessageDialog(null, "Existe un error en alguno de los datos");
                            break;
                        }   
                    }
                }
                br.close();
            }  
        } catch (HeadlessException | IOException ex){
            JOptionPane.showMessageDialog(null, "Error al leer la expresion");
        }

    }
    public void Read_rooms(List list_rooms){
        String line;
        String expresion_txt = "";
        String path = "test\\rooms.csv";
        File file = new File(path);
        try{
            if(!file.exists()){
               file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine())!= null){
                    if(!line.isEmpty()){
                        expresion_txt += line + "\n";
                    }
                }
                if (!"".equals(expresion_txt)){
                    String[] expresion_split = expresion_txt.split("\n");
                    for(int i =0;i < expresion_split.length;i++){
                        String[] info = expresion_split[i].split(",");
                        if(help.ValidateNumbers(info[0]) != -1 && help.ValidateNumbers(info[2]) != -1 && help.Validate_RoomType(info[1]) != null){
                            int num_room = help.ValidateNumbers(info[0]);
                            String roomType = help.Validate_RoomType(info[1]);
                            int floor_number = help.ValidateNumbers(info[2]);
                            
                            Room room = new Room(num_room, roomType, floor_number);
                            
                            list_rooms.addEnd(room);
                        }else{
                            JOptionPane.showMessageDialog(null, "Existe un error en alguno de los datos");
                            break;
                        }   
                    }
                }
                br.close();
            }  
        } catch (HeadlessException | IOException ex){
            JOptionPane.showMessageDialog(null, "Error al leer la expresion");
        }
    }
    
    public void Read_state(HashTable table){
        String line;
        String expresion_txt = "";
        String path = "test\\state2.csv";
        File file = new File(path);
        try{
            if(!file.exists()){
               file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine())!= null){
                    if(!line.isEmpty()){
                        expresion_txt += line + "\n";
                    }
                }
                if (!"".equals(expresion_txt)){
                    String[] expresion_split = expresion_txt.split("\n");
                    for(int i =0;i < expresion_split.length-1;i++){
                        String[] info = expresion_split[i].split(",");
                        if(!info[0].equalsIgnoreCase("")){
                            if(help.ValidateNumbers(info[0]) != -1 &&  help.ValidateEmail(info[3]) != null && help.Validatetelf(info[5]) != null){
                                int num_room = help.ValidateNumbers(info[0]);
                                
                                String name = info[1];
                                System.out.println(name);
                                String last_name = info[2];
                                String email = help.ValidateEmail(info[3]);
                                String sex = info[4];
                                String cellphone_number = help.Validatetelf(info[5]);
                                Client client = new Client(name,last_name,email,sex,cellphone_number);
                                
                                String arrival_date = info[6];
                                
                                Status state = new Status(num_room, client,arrival_date);
                                
                                table.insertState(state);  
                            }else{
                                JOptionPane.showMessageDialog(null, "Hay un error en algun dato");
                                break;
                            }
                        }    
                    }
                }
                br.close();
            }  
        } catch (HeadlessException | IOException ex){
            JOptionPane.showMessageDialog(null, "Error al leer la expresion");
        }
    }
}
