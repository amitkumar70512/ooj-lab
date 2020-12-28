import java.util.Scanner;


class player {
    int id=0;
       String name ;
    int score=0;
    int no_matches_played=0;
    float average_score=0;
    String end="**** End *****";
    
     Scanner ab= new Scanner (System.in);
     void details(int i)
     {     
         System.out.println("Enter the details for the player"+ i);
         System.out.println("Enter the ID for player :: ");
         id =ab.nextInt();
         System.out.println("enter the name for the player::");
         name =ab.next();
         System.out.println("Total scores :;");
          score=ab.nextInt();
         System.out.println("NO of matches played;:");
         no_matches_played=ab.nextInt();
         calculate(score,no_matches_played);    
     }
            void calculate(int total_score,int total_matches){
               float average=0;
                average=(float)total_score/(float)total_matches;
               average_score=average;


             }
   
         String display (player a){
               
                 
                 System.out.println("\nId::"  + a.id +"\n Name::" + a.name +"\n Matches_played::" + a.no_matches_played+ "\n Average score::" );
                 
                 return "End";
          }
}

public class playerstat {
    public static void main(String args[]){
  player p1= new player();
  player p2= new player();
  p1.details(1);
  p2.details(2);
  p1.display(p1);
  p2.display(p2);
  System.out.println("The details of the player having greatest average ::");
    if(p1.average_score> p2.average_score){
       System.out.println( p1.display(p1)); /* print the all details  of the player p1*/
        }
     else
        System.out.println( p2.display(p2));
  
    }
    
}
