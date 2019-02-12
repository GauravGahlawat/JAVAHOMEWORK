import java.util.Scanner;
public class Diamond{
 
    public static void main(String[] args) {
        int number, i, k, count = 1;
        number = 5;
        count = number - 1;
        for (k = 1; k <= number; k++)
        {
            for (i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();
        }
        count = 1;
        for (k = 1; k <= number - 1; k++)
        {
            for (i = 1; i <= count; i++)
                System.out.print(" ");
            count++;
            for (i = 1; i <= 2 * (number - k) - 1; i++)
                System.out.print("*");
            System.out.println();
        }
    }
}

/*

    public static void main(String[] args) {
        int i, j, k;
        
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++)
                System.out.print(" ");
 
            for (k = 1; k <= i; k++)
                System.out.print(k + " ");
 
            System.out.println();
        }
 
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(" ");
 
            for (k = 1; k <= 5 - i; k++)
                System.out.print(k + " ");
 
            System.out.println();
        }
 
    }
}