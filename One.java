import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        double price = 10.99D;
        System.out.println("hello world" + price);
        Date now = new Date();
        System.out.println(now);
        String a = "ali gooz";
        System.out.println(a.replace("ali" , "mohammad"));
        // int [] arr = new int [5];
        // arr[0] = 8;
        // arr[1] = 1;
        // arr[2] = 3;
        // arr[3] = 0;
        int [] arr = {5,2,0,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String [] arr2 = {"ali" , "abbas"};
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2.length);
        boolean [] arr3 = new boolean[5];
        System.out.println(Arrays.toString(arr3));
        char [][] arr4 = new char [2][2];
        arr4 [0][0] = 'a';
        arr4 [1][1] = 'b';
        int [][] arr5 = {{1,2} , {3,4}};
        System.out.println(Arrays.deepToString(arr4));
        System.out.println(Arrays.deepToString(arr5));
        String c = "5.3";
        double s = Double.parseDouble(c) + 5;
        System.out.println(s);
        int y = (int)(Math.random() * 100);
        System.out.println(y);
        NumberFormat n = NumberFormat.getPercentInstance();
        NumberFormat n1 = NumberFormat.getInstance();
        String res = n.format(5);
        String res1 = n1.format(48414916);
        System.out.println(res);
        System.out.println(res1);
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a name : ");
        String name = scan.nextLine();
        System.out.println("your name is :" + name);
        scan.close();
        int r = 54;
        boolean isr = r > 50 && r < 60;
        System.out.println(isr);
        String isra = r > 50 ? "yes" : "no";
        System.out.println(isra);
    }
}hi ali
bye ali
hi mamad
