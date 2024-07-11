import java.util.Scanner;

public class ParseInts {

    public static void main(String[] args) {
        int val, sum = 0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a line of text:");
            String line = scan.nextLine();
            try (Scanner scanLine = new Scanner(line)) {
                while (scanLine.hasNext()) {
                    try {
                        val = Integer.parseInt(scanLine.next());
                        sum += val;
                    } catch (NumberFormatException e) {
                        // Do nothing if it's not an integer
                    }
                }
            }
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
}
