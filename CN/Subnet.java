import java.util.Scanner;

public class Subnet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the IP Address of STCET: ");
        String stcetIP = sc.nextLine();

        String[] stcetIpArr = stcetIP.split("\\.");
        int lastOctet = Integer.parseInt(stcetIpArr[3]);

        // Subnet mask after reserving 1 bit
        String subnetMask = "255.255.255.128";

        // Determine subnet
        if (lastOctet < 128) {
            System.out.println("Belongs to Subnet 1");
            System.out.println("Network Address: " + stcetIpArr[0] + "." + stcetIpArr[1] + "." + stcetIpArr[2] + ".0");
            System.out.println("Broadcast Address: " + stcetIpArr[0] + "." + stcetIpArr[1] + "." + stcetIpArr[2] + ".127");
            System.out.println("Usable Range: " + stcetIpArr[0] + "." + stcetIpArr[1] + "." + stcetIpArr[2] + ".1 - " +
                               stcetIpArr[0] + "." + stcetIpArr[1] + "." + stcetIpArr[2] + ".126");
        } else {
            System.out.println("Belongs to Subnet 2");
            System.out.println("Network Address: " + stcetIpArr[0] + "." + stcetIpArr[1] + "." + stcetIpArr[2] + ".128");
            System.out.println("Broadcast Address: " + stcetIpArr[0] + "." + stcetIpArr[1] + "." + stcetIpArr[2] + ".255");
            System.out.println("Usable Range: " + stcetIpArr[0] + "." + stcetIpArr[1] + "." + stcetIpArr[2] + ".129 - " +
                               stcetIpArr[0] + "." + stcetIpArr[1] + "." + stcetIpArr[2] + ".254");
        }

        System.out.println("Subnet Mask: " + subnetMask);
        System.out.println("Number of Usable Hosts per Subnet: 126");

        sc.close();
    }
}

