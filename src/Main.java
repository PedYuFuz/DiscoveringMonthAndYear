import java.util.Scanner; 

public class Main {
    public static void main(String args[]){
        //Input variable
        Scanner inputYear = new Scanner(System.in); 
        System.out.print("Type the year: ");

        //Read input and save it in year variable
        int year = inputYear.nextInt();
        
        //Input Month
        Scanner monthScan = new Scanner(System.in);
        System.out.print("\nType the month you want: ");

        //Read and save the month
        int month = monthScan.nextInt();

        //Make sure the month is available
        if(month < 0 || month > 12){
            month = 0;
            monthScan = new Scanner(System.in);
            System.out.print("\nType a correct month: ");
            month = monthScan.nextInt();
        //If it's a leap year and february as the month...
        }else if(year%4==0 && month==2){
            System.out.println("\nIt's a leap year!");            
            System.out.println("So... February has 29 days"); 
        //If its not a leap year...
        }else if(month==2){
            System.out.println("February has 28 days in a normal year.");
        }else{
            if(month==4 || month==6 || month==9 || month==11){
                System.out.println("This month has 30 days.");
            }else if(month != 2){
                System.out.println("This month has 31 days.");
            }
        }
    }
}
