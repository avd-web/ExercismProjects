import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        System.out.print("Input Name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("test" + name);

        // To be able to add an empty space (" ") you need scanner.nextLINE() instead of scanner.next().
 */
        System.out.println(twofer(readString()));

    }

        public static String twofer(String name) {
                if(name == null || name.equals(" ")) name = "you";
                String str = String.format("One for %s, one for me.", name);
                return str;

        }

        public static String readString() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input name: ");
            return scanner.nextLine();
        }



}
