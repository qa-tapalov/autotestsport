import com.google.common.math.Quantiles;

import java.util.Scanner;

public class TextField {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a code: ");
        int code = in.nextInt();
        int x = 11;

        System.out.print(x + code);
        in.close();



    }

}
