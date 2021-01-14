import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int durationInDays = scanner.nextInt();
         int foodCost = scanner.nextInt();
         int oneWayFlight = scanner.nextInt();
         int hotelRate = scanner.nextInt();
         int durationNights = durationInDays - 1;

         //calculate the total amount
        int total = oneWayFlight * 2 + foodCost * durationInDays + hotelRate * durationNights;
        System.out.println(total);
    }
}