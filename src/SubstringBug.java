import java.util.Scanner;

public class SubstringBug {

//    Given two binary strings, A (of length 10) and B (of length 5),
//    output 1 if B is a substring of A and 0 otherwise.
//    Example
//
//    First two lines of input:
//
//            1010110010 10110
//            1110111011 10011
//
//    First two lines of output:
//            1
//            0

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("String 1");
        String string1 = scanner.nextLine();

        System.out.println("String to comapre");
        String string2 = scanner.nextLine();

        int ans = 0;

        for (int i = 0; i < string1.length()-string2.length(); i++) {
            String temp = string1.substring(i, (string2.length()+i));
            if (temp.equals(string2)) ans = 1;
        }

        System.out.println(ans);

    }


}
