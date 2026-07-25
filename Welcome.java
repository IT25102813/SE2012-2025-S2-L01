import java.util.Scanner;

public class Welcome{
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Getting input - first name
        System.out.print("Enter your first name ");
        String f_name = scanner.nextLine();

        //Getting input - last name
        System.out.print("Enter your last name ");
        String l_name = scanner.nextLine();

        //printing output
        System.out.printf("Welcome to Second Year %s %s\n", f_name, l_name);
        scanner.close();
        }
}
