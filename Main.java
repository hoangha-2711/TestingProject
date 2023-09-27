import java.util.Scanner;

public class BowlingTicketPriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập vào độ tuổi của người chơi: ");
        int age = input.nextInt();

        int ticketPrice = calculateTicketPrice(age);

        if (ticketPrice == -1) {
            System.out.println("Độ tuổi không hợp lệ.");
        } else {
            System.out.println("Độ tuổi: " + age + " tuổi");
            System.out.println("Giá vé: " + ticketPrice + " VNĐ");
        }

        input.close();
    }

    public static int calculateTicketPrice(int age) {
        int ticketPrice;

        if (age < 0) {
            ticketPrice = -1; // Độ tuổi không hợp lệ
        } else if (age < 4) {
            ticketPrice = 0; // Dưới 4 tuổi, miễn phí
        } else if (age < 10) {
            ticketPrice = 100000; // Từ 4 đến dưới 10 tuổi, giá vé 100,000 VNĐ
        } else if (age < 18) {
            ticketPrice = 150000; // Từ 10 đến dưới 18 tuổi, giá vé 150,000 VNĐ
        } else {
            ticketPrice = 200000; // Trên hoặc bằng 18 tuổi, giá vé 200,000 VNĐ
        }

        return ticketPrice;
    }
}
