
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agyek
 */
public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String t, String s, String r){
    title = t;
    studio = s;
    rating = r;
    }
   
    public Movie(String t, String s){
     title = t;
     studio = s;
     rating = "PG"; 
    }
    
   public Movie[] getPG(Movie[] mov){
       Movie[] myMov = new Movie[mov.length];
       int Array = 0;
       for(int i = 0; i<mov.length; i++){
           if(mov[i].rating.equals("PG")){
               myMov[Array] = mov[i];
               Array++;
                     
         }
        
   }    
        return myMov;
       
   }

   
    public static void main(String[] args) {
        
        System.out.println("Casino Royale, " + "Eon Productions, " + "PG-13");
    }
        
    }

    
    
    
    

