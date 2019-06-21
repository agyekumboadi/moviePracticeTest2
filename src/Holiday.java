/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agyek
 */
 
public class Holiday {
    private String Name;
    private int Day;
    private String Month;
    
    public Holiday(String n,int d, String m){
        Name = "Independence Day";
        Day = 4;
        Month = "July";
    }

    private Holiday(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
        
   public boolean inSameMonth(Holiday hol){
       boolean sameMonth = false;
       
      return this.Month.equals(hol.Month);
   }

 
    
            
    public static double avgDate(Holiday[] hol){
                
                int sum = 0;
        for (Holiday hol1 : hol) {
            sum = hol1.Day + sum;
        }
                return((double) sum)/ hol.length;
            }
       
         public static void main(String[] args) {
        
    
           Holiday hol = new Holiday("Independence Day 4" + "July");
           
       }
}
     
   


    
    


