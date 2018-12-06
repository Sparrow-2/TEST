import java.util.Scanner;

public class Z7 {
    public static void main(String[] args) {
        System.out.println("podaj wyraz");
        Scanner Xd = new Scanner(System.in);
        String name = Xd.nextLine();
        System.out.println(new StringBuilder(name).reverse().toString());

    }
}
