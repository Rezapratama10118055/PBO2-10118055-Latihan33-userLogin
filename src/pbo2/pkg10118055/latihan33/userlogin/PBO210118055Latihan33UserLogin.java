/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118055Latihan33UserLogin {
    private  final String username="RIZKIADAM"
                ,password="TERBAIKSELALU";

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Username =");
        String input = userInput.next();
        
        System.out.print("Masukan Password: ");
        Scanner password = new Scanner(System.in);
        String pass = password.nextLine();
        
        
        userNama user = new userNama();
        user.pengecekanLogin(input, pass);
        
    }

    
   

   
    
}
