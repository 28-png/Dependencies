import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringManipulation {


    public static void manipulateString() {
    String enter;
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something");
        enter = scanner.next();
        System.out.println("you entered: " + enter + "\n");
        System.out.println("Flipped case: " + StringUtils.swapCase(enter) + "\n");
        System.out.println("Reversed: " + StringUtils.reverse(enter));
    }




    public static void main(String[] args) {
        manipulateString();

    }


}