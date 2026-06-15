import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SearchEngine engine = new SearchEngine();

        while (true) {

            System.out.println("\n===== SEARCH ENGINE =====");
            System.out.println("1. Search");
            System.out.println("2. Recent Searches");
            System.out.println("3. Popular Searches");
            System.out.println("4. Show All Keywords");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Enter keyword: ");
                    engine.search(sc.nextLine());
                    break;

                case 2:
                    engine.showRecent();
                    break;

                case 3:
                    engine.showPopular();
                    break;

                case 4:
                    engine.showAll();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}