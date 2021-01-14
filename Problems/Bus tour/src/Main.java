import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //height of the bus
        int N = in.nextInt();
        int bridges = in.nextInt();
        in.nextLine();
        String b = in.nextLine();
        String [] bridgeList = b.split(" ");

        for (int i = 0; i < bridgeList.length; i++) {
            if (N >= Integer.parseInt(bridgeList[i])) {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            } else if (i == bridgeList.length - 1) {
                System.out.println("Will not crash");
            }
        }
    }
}