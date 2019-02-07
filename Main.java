import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Введите строку ");
        String string = scanner.nextLine();
        String [] max = string.split(" ");
        ArrayList <String> strings = new ArrayList(Arrays.asList(max));
        String a;
        for (int j = 0; j < strings.size(); j++) {
            for (int i = 1; i < strings.size(); i++) {
                if (strings.get(i).charAt(0) < strings.get(i - 1).charAt(0)) {
                   a = strings.get(i);
                   strings.set(i, strings.get(i-1));
                   strings.set(i-1,a);
                }
            }
        }
        String  sum = "";
        for (int i =0; i<strings.size(); i++){
            sum = sum +  " " + strings.get(i);
        }
        System.out.println( sum);
        scanner.close();
        }
    }
