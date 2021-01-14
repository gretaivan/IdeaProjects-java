import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        int currentNo = 1;
        int tracker = 1;


        for (int i = 1; i <= input; i++){
            if (tracker != 0 && currentNo >= tracker) {
                System.out.print(currentNo + " ");
                tracker--;
            } else{
                tracker = currentNo;
                System.out.print(++currentNo + " ");
            }
        }
    }
}