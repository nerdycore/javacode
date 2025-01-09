import java.util.Scanner;
public class loginProj {
    //private array userinfo
    private String[] user;
    private String[] pass;

    //setter
    public void setUser(String user[]) {
        this.user = user;
    }
    //getter
    public String[] getUser() {
        return user;
    }

    //main menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--------------------");
            System.out.println("     LOGIN FORM     ");
            System.out.println("--------------------");
            System.out.println("1. Sign up          ");
            System.out.println("2. Sign in          ");
            System.out.println("3. User List        ");
            System.out.println("4. Active User      ");
            System.out.println("5. Exit             ");
            System.out.println("--------------------");
            System.out.print("Choose: ");
            int choose = sc.nextInt();
            switch(choose) {
                case 1:
                    System.out.println("--------------------");
                    System.out.println("       SIGN UP      ");
                    System.out.println("--------------------");
                    //loginProj set = new loginProj();
                    break;
                case 2:
                    System.out.println("--------------------");
                    System.out.println("       SIGN IN      ");
                    System.out.println("--------------------");
                    break;
                case 3:
                    System.out.println("--------------------");
                    System.out.println("      USER LIST     ");
                    System.out.println("--------------------");
                    break;
                case 4:
                    System.out.println("--------------------");
                    System.out.println("    ACTIVE USER     ");
                    System.out.println("--------------------");
                    break;
                case 5:
                    System.out.println("--------------------");
                    System.out.println("   EXITING PROGRAM  ");
                    System.out.println("--------------------");
                    return;
                default:
                    System.out.println("--------------------");
                    System.out.println("   INVALID INPUT    ");
                    System.out.println("--------------------");
                    break;                            
            }
             
        }while(true);
    }
}