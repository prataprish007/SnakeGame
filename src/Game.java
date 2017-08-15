import java.io.*;
import java.util.*;
import java.lang.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RISHI
 */
public class Game {
    int pos=1;
    int i=1;
    int[] s1={13, 9};
    int[] s2={21, 11};
    int[] s3={50, 3};
    int[] s4={99, 10};
    int[] L1={8, 98};
    int[] L2={23, 45};
    int[] L3={51, 96};
    int[] L4={65, 82};
    void game()
    {
        int temp=0;
        if(pos<=100)
        {
        temp=pos;
        }
        int x=0;
        Random ran = new Random();
        System.out.println("POSITION "+pos);
        System.out.println("enter a character");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c=='d' || c=='D')
        {

             x = ran.nextInt(6) + 1;
             System.out.println("Dice "+x);
             pos=pos+x;
             if(pos==s1[0])
             {
                 pos=s1[1];
                 System.out.println("Sanke Bite");
             }
             else if(pos==s2[0])
             {
                 pos=s2[1];
                 System.out.println("Sanke Bite");
             }
             else if(pos==s3[0])
             {
                 pos=s3[1];
                 System.out.println("Sanke Bite");
             }
             else if(pos==s4[0])
             {
                 pos=s4[1];
                 System.out.println("Sanke Bite");
             }
             else if(pos==L1[0])
             {
                 pos=L1[1];
                 System.out.println("Ladder Found");                
             }
             else if(pos==L2[0])
             {
                 pos=L2[1];
                 System.out.println("Ladder Found");    
             }
             else if(pos==L3[0])
             {
                 pos=L3[1];
                 System.out.println("Ladder Found");    
             }
             else if(pos==L4[0])
             {
                 pos=L4[1];
                 System.out.println("Ladder Found");    
             }
             
        }
        if(pos>=1 && pos<100)
        {
              game();
        }
        if(pos>100)
        {
            pos=temp;
            game();
        }
        if(pos==100)
        {
            while(i!=0)
            {
            System.out.println("Game Complete");
            i--;
            }
           
        }
        
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Game g=new Game();
        int x, j=1;
        Random ran = new Random();
         while(j!=0)
        {
        System.out.println("enter a character");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        
       
            if(c=='d' || c=='D')
            {
                x = ran.nextInt(6) + 1;
                if(x==6)
                {
                    System.out.println("Game Start and Dice is "+x);
                    g.game();
                    j--;
                }
                else
                {
                    System.out.println("THROW AGAIN");
                }

            }
        }
        
        // TODO code application logic here
    }
    
}
