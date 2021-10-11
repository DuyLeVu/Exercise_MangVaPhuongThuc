import java.util.Scanner;
public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int array[];
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if (size>20)
                System.out.println("Size should not exceed 20");
        }
        while (size > 20);

        array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.print("Enter element" + (i+1)+" : ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        String indexOf = "";
        for (int j = 0; j<array.length;j++){
            if (array[j] > max) {
                max = array[j];
//                index = j+1;
//                indexOf = indexOf + index +", ";
            }
        }
        for (int j = 0; j<array.length;j++){
            if (array[j] == max) {
                index = j+1;
                indexOf = indexOf + index +" ";
            }
        }
        System.out.println("The largest property value in the list is " + max + " at position: " + indexOf );
    }
}
