

import java.util.Scanner;
public class Taksimetre
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km;
        double perkm = 2.20, total = 10, min = 20;
        System.out.print("Lütfen KM cinsinden giriniz");
        km = input.nextInt();

        total += (perkm * km);

        total = total < 20 ? 20 : total;

System.out.print(total);




    }
}
