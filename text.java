import java.util.*;
public class text {
    public static void main(String[] args) {
        byte ASCIIcode;
        Scanner input = new Scanner(System.in);
        System.out.print("Input ASCII code: ");
        ASCIIcode = input.nextByte();
        System.out.println("ASCII: " + ASCIIcode+ "is" + (char)ASCIIcode);
    }
}
