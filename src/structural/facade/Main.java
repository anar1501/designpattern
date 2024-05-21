package structural.facade;

import structural.facade.enums.PhoneType;
import structural.facade.factory.GetPhoneFactory;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        var getPhoneFactory = new GetPhoneFactory();
        System.out.print("========= Mobile Shop ============ \n");
        System.out.print("            1. IPHONE.              \n");
        System.out.print("            2. SAMSUNG.              \n");
        System.out.print("            3. BLACKBERRY.            \n");
        System.out.print("            4. Exit.                     \n");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        String phoneType = scanner.nextLine().toUpperCase();
        var phone = getPhoneFactory.getPhone(PhoneType.valueOf(phoneType));
        phone.doOperation();
    }
}

