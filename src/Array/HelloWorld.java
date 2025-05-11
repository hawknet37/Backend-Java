package Array;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\Java\\re_f00\\src\\input.txt"));
        PrintWriter pw = new PrintWriter(new File("D:\\Java\\re_f00\\src\\output.txt"));
        int sumValue = 00;
        while(sc.hasNext()) {
            sumValue += sc.nextInt();
        }
        pw.println(sumValue);

        pw.close();
    }
}
