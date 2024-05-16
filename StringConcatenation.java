import java.util.Scanner;
public class StringConcatenation {
    public static String concatenate(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        char[] concatenatedChars = new char[chars1.length + chars2.length];
        for (int i = 0; i < chars1.length; i++) {
                concatenatedChars[i] = chars1[i];
            }
        for (int i = 0; i < chars2.length; i++) {
                concatenatedChars[chars1.length + i] = chars2[i];
            }
        return new String(concatenatedChars);
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first string: ");
            String firstString = scanner.nextLine();
            System.out.println("Enter the second string: ");
            String secondString = scanner.nextLine();
            String concatenatedResult = concatenate(firstString, secondString);
            System.out.println("Concatenated result: " + concatenatedResult);
            scanner.close();
        }
