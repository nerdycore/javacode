import java.util.Scanner;
public class calculatorproj {
    static int addition(Scanner sc) {
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter first number: ");
        int y = sc.nextInt();
        System.out.print(x + " + " + y + " = ");
        return x + y;
    }

    static int subtraction(Scanner sc) {
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter first number: ");
        int y = sc.nextInt();
        System.out.print(x + " - " + y + " = ");
        return x - y;
    }

    static float multiplication(Scanner sc) {
        System.out.print("Enter first number: ");
        float x = sc.nextFloat();
        System.out.print("Enter first number: ");
        float y = sc.nextFloat();
        System.out.print(x + " * " + y + " = ");
        return x * y;
    }

    static double division(Scanner sc) {
        System.out.print("Enter first number: ");
        double x = sc.nextDouble();
        System.out.print("Enter first number: ");
        double y = sc.nextDouble();
        System.out.print(x + " / " + y + " = ");
        return x / y;
    }

    static int modulo(Scanner sc) {
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter first number: ");
        int y = sc.nextInt();
        System.out.print(x + " % " + y + " = ");
        return x % y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****CALCULATOR*****");
        do {
            System.out.print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo\n6. Exit\nChoose: ");
            int choose = sc.nextInt();
            switch(choose) {
                case 1:
                    //System.out.println("Addition\n");
                    System.out.println(addition(sc));
                    System.out.println();
                    //sc.close();
                    break;
                case 2:
                    //System.out.println("Subtraction\n");
                    System.out.println(subtraction(sc));
                    System.out.println();
                    //sc.close();
                    break;
                case 3:
                    //System.out.println("Multiplication\n");
                    System.out.println(multiplication(sc));
                    System.out.println();
                    //sc.close();
                    break;  
                case 4:
                    //System.out.println("Division\n");
                    System.out.println(division(sc));
                    System.out.println();
                    //sc.close();
                    break;
                case 5:
                    //System.out.println("Modulo\n");
                    System.out.println(modulo(sc));
                    System.out.println();
                    //sc.close();
                    break;
                case 6:
                    System.out.println("Exiting the program...\n");
                    return;
                default:
                    System.out.println("Invalid Input. Try Again\n");
                    break;                  
            }
        }while(true);
    }
}