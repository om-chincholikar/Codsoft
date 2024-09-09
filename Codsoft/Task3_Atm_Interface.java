import java.util.Scanner;

class Bankaccount{
    private double balence;
    public Bankaccount(double initialbalence){
        this.balence=initialbalence;
    }
    public void deposite(double amount){
        if (amount > 0) {
            balence+=amount;
            System.out.println("deposite amount is:"+amount);
        }
        else{
           System.out.println("Invalid deposite amount");
        }
    }
    public void withdrawl(double amount){
        if (amount > 0 && amount <= balence) {
            balence-=amount;
            System.out.println("withdrawl $"+amount);
        }
        else if (amount > balence) {
            System.out.println("Insufficient amount of balence");
        }
        else{
            System.out.println("invalid withdrawl amount");
        }
    }
    public double checkbalence(){
        return balence;
    }
}
class ATM{
    private Bankaccount account;
    public ATM(Bankaccount account){
        this.account=account;
    }
    public void displaymenu(){
           Scanner sc=new Scanner(System.in);
           int opotion;
           do{
            System.out.println("\n---ATM Menu-----");
            System.out.println("1. withdraw");
            System.out.println("2. Deposite");
            System.out.println("3. Checkbalence");
            System.out.println("4. Exit");
            System.out.println("choose an option");
            opotion=sc.nextInt();
            switch (opotion) {
                case 1:
                    handlewithdraw(sc);
                    break;
                case 2:
                    handleDeposite(sc);
                    break;
                case 3:
                    handlecheckBalence(sc);
                    break;
                case 4:
                    System.out.println("Exit Tnak you for using ATM");
                    break;
                default:
                    System.out.println("Invalid option please try again");
                    break;
            }
           }while(opotion !=4);
           sc.close();
    }
    public void handlewithdraw(Scanner sc){
        System.out.println("enter the amount to withdraw");
        double amount= sc.nextInt();
        account.withdrawl(amount);
    }
    public void handleDeposite(Scanner sc){
        System.out.println("enter the amount to deposite");
        double amount= sc.nextInt();
       account.deposite(amount);
    }
    public void  handlecheckBalence(Scanner sc){
        double balence= account.checkbalence();
        System.out.println("your current balence is:"+balence);
    }
}
public class Task3_Atm_Interface {
    public static void main(String[] args) {
        Bankaccount account=new Bankaccount(5000.0);
        ATM atm=new ATM(account);
        atm.displaymenu();

    }
}
