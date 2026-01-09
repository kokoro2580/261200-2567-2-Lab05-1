public class Main {
    public static void main(String[] args) {

        // Step 2: User john (เกิด Feb 18, 1954)
        User john = new User("John", 1954, 2, 18);
        john.displayInfo();
        System.out.println("-----");

        // Step 3: Admin nicolas (เกิด Jan 7, 1964)
        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
        nicolas.displayInfo();
        System.out.println("-----");

        // Step 4: Overload test
        nicolas.displayInfo(true);
        System.out.println("-----");
        nicolas.displayInfo(false);
    }
}