import java.util.Scanner;
public class ThemPhanTu {
    public static void main(String[] args) {
        int[] array = {10,4,6,7,8};
        int index;
        int number;
        System.out.println("Mảng ban đầu: ");
        for (int i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập giá trị cần thêm vào mảng");
        number = sc.nextInt();
        System.out.println("Nhập vào vị trí cần thêm: ");
        index = sc.nextInt();
        if ((index <= 1) || (index >= array.length-1)) System.out.println("Không chèn được phần tử vào mảng");
        else {array = addValue(array, index, number);
        for (int i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        }
    }
    static int[] addValue(int[] array, int index, int number){
        int[] newArray = new int[array.length+1];
        for (int i=0; i<index; i++){
            newArray[i] = array[i];
        }
        for (int i=0; i<=index; i++){
            newArray[index] = number;
        }
        for (int i=index +1; i< array.length+1; i++){
            newArray[i] = array[i-1];
        }
        return newArray;
    }
}
