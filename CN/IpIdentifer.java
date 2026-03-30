
import java.util.Scanner;

public class IpIdentifer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The IP Add: ");
        String ipAdd=sc.nextLine();

        String[] ipArr=ipAdd.split("\\.");
        // for(String s: ipArr)
        // {
        //     System.out.println(s);
        // }

        int StartingIdx=Integer.parseInt(ipArr[0]);

        //System.out.println(StartingIdx);
        
        if(StartingIdx>=0 && StartingIdx<=127)
        {
            System.out.println("Class A");
        }
        else if(StartingIdx>=128 && StartingIdx<=191)
        {
            System.out.println("Class B");
        }
         else if(StartingIdx>=192 && StartingIdx<=223)
        {
            System.out.println("Class C");
        }
         else if(StartingIdx>=224 && StartingIdx<=239)
        {
            System.out.println("Class D");
        }
        else if(StartingIdx>=240 && StartingIdx<=255)
        {
            System.out.println("Class E");
        }
        else
        {
            System.out.println("Invalid IP");
        }

        sc.close();
    }
}
