import java.util.Arrays;
import java.util.Scanner;

public class MinMaxOdev {
    public static void main(String[] args) {
        int[] arr = {5,3,8,6,9,2,1};

        Scanner scanner = new Scanner(System.in);
        System.out.println("num : ");
        int input = scanner.nextInt();
        int min = input - 1;
        int max = input + 1;

        for (int i : arr){
            if (min < input){
                if (i < min){
                    min = i;
                    break;
                }
            }
            if (max > input){
                if (i > max){
                    max = i;
                    break;
                }
            }
        }
        System.out.println("Max : " + max + "\n" + "Min : " + min);




    }
}


/*
        for (int i = 0; i < input; i++){
            if (i < min){
                i = min;
            }
        }
        for (int i = 0; input < i; i++){
            if (i > max){
                i = max;
            }
        }

 */

