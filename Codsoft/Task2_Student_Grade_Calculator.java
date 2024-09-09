import java.util.Scanner;

public class Task2_Student_Grade_Calculator {
    public static void main(String[] args) {
        System.out.println("enter the number of subject");
        Scanner sc=new Scanner(System.in);
        int numsubject=sc.nextInt();
        int []marks=new int[numsubject];
        for (int i = 0; i < numsubject; i++) {
            System.out.print("enter the mark of subject "+(i+1)+" of 100 ");
            marks[i]=sc.nextInt();
        }
        int totalmarks=0;
        for(int mark:marks){
            totalmarks+=mark;
        }
        double percentage=(double) totalmarks/numsubject;
        char grade;
        if (percentage >= 90) {
           grade='A';
        }
        else if (percentage >= 80) {
            grade='B';
        }
        else if (percentage >=70) {
            grade='C';
        }
        else if (percentage >= 60) {
            grade='D';
        }
        else{
            grade='F';
        }
        System.out.println("\n-----result------");
        System.out.println("the total marks of this subjects is:"+totalmarks);
        System.out.println("the overall percentage is: "+percentage);
        System.out.println("grade is:"+grade);

    }
}
