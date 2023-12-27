import java.util.Scanner;

import model.Criteria;
import service.CriteriaService;
import service.InspectionService;

public class Main {
	// static CriteriaService criService;
	
	
    public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  CriteriaService criService = new CriteriaService();
          int chon;

          do {
            menu();
            chon=Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1:
                	menuAdd();
                    System.out.println("1 them sua xoa cap nhat minh chung");
                    break;
                case 2:
                    InspectionService inspectionService = new InspectionService();
                    inspectionService.menuInspection();
                     System.out.println("2 Tạo cấu trúc một bộ kiểm định");
                     break;
                 case 3:
                     System.out.println("3 xem ds minh chung");
                     break;
                 case 4:
                     System.out.println("4 ds minh chung tao theo ngay");
                     break;
                case 5:
                    criService.getData();
                    break;
                 case 8:
                System.exit(0);
                     System.out.println("Thank for use");
                break;
                 default:
                     System.out.println("Khong co");
            }

          }while (chon != 5);

          sc.close();
    }

    public static void menu(){
        
    	 System.out.println("1.Thêm / cập nhật / xóa, minh chứng ");
         System.out.println("2.Tạo cấu trúc một bộ kiểm định");
         System.out.println("3.Xem DS minh chứng ");
         System.out.println("4.Xem Ds minh chứng  theo ngày tạo");
         System.out.println("5. Hien thi");
         System.out.println("8.Out");
        System.out.print("Mời bạn chọn:");
    }
    public static void menuAdd() {
        CriteriaService criService = new CriteriaService();

        Scanner sc = new Scanner(System.in);
        int chon;
        System.out.println("1. Thêm");
        System.out.println("2. Cập nhật");
        System.out.println("3. Xóa");
        System.out.print("Mời bạn chọn:");
        chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1:
                criService.create();
                break;
            case 2:
                criService.update();
                break;
            case 3:
                criService.delete();
                break;

            default:
                System.out.println("Khong co dau");
                break;
        }

    }


}