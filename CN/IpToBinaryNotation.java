import java.util.Scanner;

public class IpToBinaryNotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The IP Add: ");
        String ipAdd=sc.nextLine();

        String[] ipArr=ipAdd.split("\\.");
       
        if(ipArr.length !=4)
        {
            System.out.println("Invalid IP Address");
            return;
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<4;i++)
        {
            int Idx=Integer.parseInt(ipArr[i]);
            str.append(String.format("%8s", Integer.toBinaryString(Idx)).replace(' ', '0'));
            if(i!=3)
            {
                str.append(".");
            }
        }
        System.out.println("Converted Binary string: ");
        System.out.println(str);
        sc.close();
    }
}
