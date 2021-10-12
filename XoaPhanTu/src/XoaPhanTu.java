import java.util.Scanner;
public class XoaPhanTu {
    public static void main(String[] args) {
        int [] array =  {10,4,6,7,8,6};
        System.out.println("Dãy số ban đầu: ");
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập số cần xóa trong mảng: ");
        number = sc.nextInt();
        int index = timViTriCanXoa(array,number);
        if (index == -1) System.out.println("Số cần xóa không có trong mảng");
        else  {
            array = xoaPhanTu(array, index);
        }
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
    static int timViTriCanXoa(int [] array, int number){
        int index = -1;
        for (int i = 0; i<array.length; i++){
            if (array[i] == number) {
                index = i;
            }
        }
        return index;
    }
    static int [] xoaPhanTu (int [] array, int index) {
        int[] newArray = new int [array.length-1];
        for (int i=0; i<index; i++){
            newArray[i] = array[i];
        }
        for (int i=index + 1; i<array.length; i++){
            newArray[i-1] = array[i];
        }
        return newArray;
    }

}
