import java.util.Scanner;

class Leap_year{
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if((year%4==0 && year%100!=0) ||(year%100==0 && year%400==0)){
            System.out.println("Its leap year");
        }
    }
}