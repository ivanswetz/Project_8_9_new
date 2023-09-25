public class Recursions {
    public static void main(String[] args) {
        printNumberBackward(10);
        printNumber(10);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        printArr(arr, 0);
        int sum = arrSum(arr, 0);
        System.out.println(sum);
    }
    //Part 1

    public static void printNumberBackward(int n){
        n--;
        if (n > 0){
            System.out.println(n);
            printNumberBackward(n);
        }
    }
    public static void printNumber(int n){
        if (n > 0) {
            printNumber(n - 1);
            System.out.print(n + " ");
        }
    }
    public static void Stack(){
        System.out.println("Hello");
        Stack();
    }

    //Part 2

    public static void printArr(int[] arr, int i){
        if(i < arr.length - 1){
            System.out.println(arr[i]);
            i++;
            printArr(arr, i);
        }
    }

    public static int arrSum(int[] arr, int i){
        if(i < arr.length - 1){
            arr[0] += arr[i];
            i++;
            printArr(arr, i);
        }
        return arr[0];
    }
//    public static int findElement(int[] arr, int i, int x){
//        i++;
//        if(i == arr.length){
//            return 0;
//        }
//        if(arr[i] == x){
//
//        }
//    }
}