package service;

import model.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class InspectionService  {

    private int input;

    public InspectionService(){
        super();
    }

    public void vewDetail(Inspection inspection){
        // Hiển thị thông tin Bộ Kiểm
        System.out.println("Thông tin Bộ Kiểm Định:");
        System.out.println("ID: " + inspection.getVerifierId());
        System.out.println("Tên: " + inspection.getVerifierName());
        System.out.println("Mô Tả: " + inspection.getDescription());
        System.out.println("Thuộc Khoa: " + inspection.getDepartment().getNameDepartment());

        System.out.println("Danh sách Tiêu Chuẩn:");
        for (Standard tc : inspection.getStandardList()) {
            System.out.println("  - Mã: " + tc.getStandardCode());
            System.out.println("    Tên: " + tc.getStandardName());
            System.out.println("    Nội Dung: " + tc.getStandardContent());
        }

        System.out.println("Danh sách Bộ Kiểm Định Sử Dụng:");
        for (InspectionUsage bkdsd : inspection.getInspectionUsageList()) {
            System.out.println("  - ID Bộ Kiểm Định Sử Dụng: " + bkdsd.getId());
            System.out.println("    ID Tiêu Chuẩn: " + bkdsd.getStandard().getStandardCode());
        }
    }


    public void menuInspection(){

        InspectionService inspectionService = new InspectionService();

        Scanner sc = new Scanner(System.in);
        int chon;
        System.out.println("1. Cấu hình kiểm định ");
        System.out.println("2. Cập nhật");
        System.out.println("3. Xóa");
        System.out.print("Mời bạn chọn:");
        chon = Integer.parseInt(sc.nextLine());

        switch (chon) {
            case 1:
                inspectionService.createInspection();
                break;
            case 2:
//                criService.update();
                break;
            case 3:
//                criService.delete();
                break;
            default:
                System.out.println("Khong co dau");
                break;
        }
    }


    public void createInspection(){
        Scanner scanner = new Scanner(System.in);

        // Tạo đối tượng Khoa
        Department department = new Department(
                1, "Khoa ABC", "Mô tả về Khoa ABC"
        );

        System.out.print("Mời bạn nhập số lCấu hình kiểm định: ");
        input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i++) {
            System.out.print("Nhập ID Bộ Kiểm Định: ");
            int idInspection = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nhập Tên Bộ Kiểm Định: ");
            String nameInspection = scanner.nextLine();

            System.out.print("Nhập Mô Tả Bộ Kiểm Định: ");
            String descriptionInspection = scanner.nextLine();

            System.out.print("Nhập Người Kiểm Định: ");
            String additionalPerson = scanner.nextLine();


            System.out.print("Nhập Mã Tiêu Chuẩn: ");
            String maTieuChuan = scanner.nextLine();
//            scanner.nextLine();

            System.out.print("Nhập Tên Tiêu Chuẩn: ");
            String tenTieuChuan = scanner.nextLine();

            System.out.print("Nhập Nội Dung Tiêu Chuẩn: ");
            String noiDungTieuChuan = scanner.nextLine();




            System.out.print("Nhập ID Bộ Kiểm Định Sử Dụng: ");
            int id = scanner.nextInt();


            Inspection inspection = new Inspection(
                    idInspection,
                    nameInspection,
                    descriptionInspection,LocalDate.now(),
                    additionalPerson
            );

            // Tạo đối tượng Tiêu Chuẩn
            Standard standard = new Standard(maTieuChuan, tenTieuChuan, noiDungTieuChuan);


            InspectionUsage boKiemDinhSuDung = new InspectionUsage(id, inspection, standard);

            // Thêm Tiêu Chuẩn và Bộ Kiểm Định Sử Dụng vào Bộ Kiểm Định
            inspection.getStandardList().add(standard);
            inspection.getInspectionUsageList().add(boKiemDinhSuDung);

        }

    }




}
