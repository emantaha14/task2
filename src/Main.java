import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of day");
        int n = sc.nextInt();
        switch (n){
            case 0 :
                printPyramid();
                break;
            case 1 :
            case 2 :
                printAverage();
                break;
            case 3 :
                System.out.println("i am not doing anything");
                break;
            case 4 :
                printTwoDimensionalArray();
                break;
            case 5 :
                int arr [] = new int[4];
                for(int i =0 ; i<arr.length ;i++){
                    System.out.print("Enter the number "+(i+1)+" ");
                    arr[i]=sc.nextInt();
                }
                addNumber5(arr);
                break;
            case 6 :
                oopMethod(3);
                oopMethod(3.5f );
                oopMethod("eman");
        }


    }
    public static void addNumber5(int arr []){
        for(int i =0 ; i<arr.length;i++){
            arr[i]+=5;
        }
        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void printPyramid(){
        for(int i =0 ; i<=5; i++){
            for(int j =0 ; j<(5-i);j++){
                System.out.print(" ");
            }
            for(int j =0 ;j<(i*2-1);j++){
                if(i==3){
                    continue;
                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void printAverage(){
        Scanner sc = new Scanner(System.in);
        int sum =0 ;
        System.out.println("enter the length of array");
        int N = sc.nextInt();
        int arr [] =new int[N--];
        for(int i =0 ;i<arr.length; i++){
            System.out.println("enter the number " +(i+1));
            arr[i]=sc.nextInt();
        }
        for(int i =0 ; i<arr.length ; i++){
            sum+=arr[i];
        }
        System.out.println("average is "+((float)sum/(float) N));
    }
    public static void printTwoDimensionalArray(){
        Scanner sc = new Scanner(System.in);
        int arr [][]= new int[2][3];
        for(int i =0 ; i<2;i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.print("enter the row"+(i+1)+" colum"+(j+1)+" ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i =0 ;i<2;i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void oopMethod(int n ){
        for(int i =0 ; i < n; i++){
            System.out.println("oop");
        }
    }
    public static void oopMethod(float x){
        System.out.println(x*3);
    }
    public static void oopMethod(String name){
        System.out.println("Hello "+name);
    }
}