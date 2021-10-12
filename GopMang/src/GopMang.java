import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số phần tử mảng thứ nhất: ");
        n = sc.nextInt();
        int[] array1 = new int[n];
        int i = 0;
        while (i < n) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
            i++;
        }
        int m;
        System.out.println("Nhập số phần tử mảng thứ hai: ");
        m = sc.nextInt();
        int[] array2 = new int[m];
        int j = 0;
        while (j < m) {
            System.out.println("Nhap phan tu thu " + (j + 1) + ": ");
            array2[j] = sc.nextInt();
            j++;
        }
        int[] array3 = new int[n + m];
        for (int g = 0; g < array1.length; g++) {
            array3[g] = array1[g];
        }
        for (int g = 0; g < array2.length; g++) {
            array3[array2.length+g] = array2[g];
        }
        System.out.println("Mảng sau khi gộp");
        for (int g = 0; g < array3.length; g++){
            System.out.print(array3[g] + " ");
        }
    }
}
