/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan33.userlogin;

/**
 *
 * @author User
 */
public class userNama {
    private  String password,username;
    private boolean statusAkun;
    
    
    

   
   public boolean isStatusAkun() {
        return statusAkun;
    }

    public void setStatusAkun(boolean statusAkun) {
        this.statusAkun = statusAkun;
    }
    
    
    
    
   // private boolean cekAkun(String parUserName,String perPassword){
    
     // if (username="RIZKIADAM",password="TERBAIKSELALU"; {
       //   this.setStatusAkun(true);
     
      //}
      //return this.isStatusAkun();
    //}
    
        
    
    private void hasilLogin(boolean status, String parUserName){
      if(status){
        System.out.println("Masukkan password = ");
        System.out.println("******HALLO"+parUserName+"******");
        System.out.println("Selamat Datang di Aplikasi ini");
      }else{
          System.out.println("ooops username atau password anda salah!");
      } 
    }
   
     public void pengecekanLogin(String parUserName,String parPassword){
         this.hasilLogin(this.hasilLogin(parUserName, parPassword), parUserName);
        
     }

    private boolean hasilLogin(String parUserName, String parPassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
