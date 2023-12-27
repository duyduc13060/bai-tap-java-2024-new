package service;

import model.Standard;

import java.util.Scanner;

public class StandardService extends DataAccess<Standard> {

    public StandardService(){
        super();
    }


    public static void createStandard(Scanner scanner) {
        System.out.println("Nhập mã tiêu chuẩn:");
        String standardCode = scanner.nextLine();

        System.out.println("Nhập tên tiêu chuẩn:");
        String standardName = scanner.nextLine();


        System.out.println("Nhập nội dung tiêu chuẩn:");
        String standardContent = scanner.nextLine();

        StandardService standardService = new StandardService();
        standardService.create(new Standard(standardCode,standardName,standardContent));

    }

}
