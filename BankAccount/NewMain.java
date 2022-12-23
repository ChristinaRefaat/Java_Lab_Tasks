
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Options
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Customer Name: ");
        String custName = scan.nextLine();
        System.out.println("Enter the Customer ID: ");
        String custId = scan.nextLine();
        BankAccount x = new BankAccount(custId, custName);
        int ope;
        do {
            int ammount1;
            //System.out.println("Enter the Litter of the oberation(d/w/g/e): ");
            //ope = scan.nextLine().charAt(0);
            System.out.println("Enter the Number of the oberation ");
            System.out.println("1. Diposite ");
            System.out.println("2. WithDraw ");
            System.out.println("3. Preivious Trannsaction ");
            System.out.println("4. End ");
            ope = scan.nextInt();
            switch (ope) {
                case 1:                    //case 'd':
                    System.out.println("Enter the ammount: ");
                    ammount1 = scan.nextInt();
                    x.Diposite(ammount1);
                    break;
                case 2:                    //case 'w':
                    System.out.println("Enter the ammount: ");
                    ammount1 = scan.nextInt();
                    x.WithDraw(ammount1);
                    break;
                case 3:                    //case 'g':
                    x.preiviousTrannsaction();
                    break;
                case 4:                    //case 'e':
                    break;
            }
        } while (ope != 4);
    }
}
