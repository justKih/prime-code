//a prime number is a number evenly divisbile only by itself and 1

import javax.swing.JOptionPane;

public class primesBuild
{   
   
   
   public static void isPrime()
   {
      String daNumber = JOptionPane.showInputDialog(null, "Enter a number Please:");
      double numberChosen = Double.parseDouble(daNumber);
      double n;
      boolean bPrime = false;
      
      
      for(n=2; n<= numberChosen/2; n++)
      {
        double testedNumber = numberChosen%2;
        if(testedNumber == 0)
        {
            bPrime = true;
            break;
        }
            
      }
      
      if(!bPrime)
      {
         JOptionPane.showMessageDialog(null, daNumber + ": you got a prime number.");
      }
      else
      {
         JOptionPane.showMessageDialog(null, daNumber + ": you didnt get a prime number.");
      }
      
   }
   
   public static void main(String args[])
   {
      isPrime();
   }
}
