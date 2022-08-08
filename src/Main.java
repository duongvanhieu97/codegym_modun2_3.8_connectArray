import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = makeArr1();
        int[] arr2 = makeArr2();
        int[] arr3 = conCatArr(arr1, arr2);
        for (int j : arr3) {
            System.out.print(j + " ");
        }
    }
//Nhập độ dài với gán từng phần tử vào arr1
    public static int[] makeArr1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai mang dau tien: ");
        int length1;
        length1 = scanner.nextInt();
        int[] arr1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.println("Nhap phan tu vi tri thu " + i);
            arr1[i] = scanner.nextInt();
        }
        return arr1;
    }
//Nhập độ dài với gán từng phần tử vào arr2
    public static int[] makeArr2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai mang thu hai: ");
        int length2;
        length2 = scanner.nextInt();
        int[] arr2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            System.out.println("Nhap phan tu vi tri thu " + i);
            arr2[i] = scanner.nextInt();
        }
        return arr2;
    }

    public static int[] conCatArr(int[] arr1, int[] arr2) {
//        Độ dài tổng của 2 mảng arr1 và arr2
        int[] arrConCat = new int[arr1.length + arr2.length];
        for (int i = 0; i < arrConCat.length; i++) {
            if (i < arr1.length) {
//                Gán vị trí arr1 vào arrConcat
                arrConCat[i] = arr1[i];
            } else {
                //Gán vị trí arr2 vào arrConcat

                arrConCat[i] = arr2[i - arr1.length];
            }
        }
        return arrConCat;
    }
}
