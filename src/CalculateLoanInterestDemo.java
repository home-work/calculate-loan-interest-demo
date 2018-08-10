import java.util.Scanner;

public class CalculateLoanInterestDemo {
    public static void main(String[] args) {
        double tienLai = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("TÍNH LÃI SUẤT TIỀN VAY");
        System.out.println("1. Theo tháng");
        System.out.println("2. Theo quý");
        System.out.println("3. Theo năm");
        System.out.println("0. EXIT");
        System.out.println("Chọn mức kì hạn lãi suất");
        while (true){
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Lãi suất tiền vay theo tháng");
                    System.out.println("Nhập vào số tiền cho vay:");
                    double soTien = scanner.nextFloat();
                    System.out.println("Nhập vào tỉ lệ lãi suất cho vay theo tháng:");
                    double laiSuat = scanner.nextFloat();
                    System.out.println("Nhập vào số tháng cho vay:");
                    int soThang = scanner.nextInt();
                    int i = 1;
                    while (i <= soThang) {
                        tienLai = soTien * laiSuat / 100;
                        soTien = soTien + tienLai;
                        i++;
                    }
                    System.out.println(tienLai + "là số tiền lãi mà bạn phải trả sau " + soThang + " tháng");
                    break;
                case 2:
                    System.out.println("Lãi suất tiền vay theo quý");
                    System.out.println("Nhập vào số tiền cho vay:");
                    soTien = scanner.nextFloat();
                    System.out.println("Nhập vào tỉ lệ lãi suất cho vay theo quý:");
                    laiSuat = scanner.nextFloat();
                    System.out.println("Nhập vào số tháng cho vay:");
                    soThang = scanner.nextInt();
                    i = 1;
                    while (i <= (soThang / 3)) {
                        tienLai = soTien * laiSuat / 100;
                        soTien = soTien + tienLai;
                        i++;
                    }
                    System.out.println(tienLai + "là số tiền lãi mà bạn phải trả sau " + soThang + " tháng");
                    break;
                case 3:
                    System.out.println("Lãi suất tiền vay theo năm");
                    System.out.println("Nhập vào số tiền cho vay:");
                    soTien = scanner.nextFloat();
                    System.out.println("Nhập vào tỉ lệ lãi suất cho vay theo năm:");
                    laiSuat = scanner.nextFloat();
                    System.out.println("Nhập vào số tháng cho vay:");
                    soThang = scanner.nextInt();
                    i = 1;
                    while (i <= (soThang / 12)) {
                        tienLai = soTien * laiSuat / 100;
                        soTien = soTien + tienLai;
                        i++;
                    }
                    System.out.println(tienLai + " là số tiền lãi mà bạn phải trả sau " + soThang + " tháng");
                    break;
                default:
                    System.out.println("NO CHOICE");
                    break;
            }
        }
    }
}
