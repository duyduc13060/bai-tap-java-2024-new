import java.util.Scanner;

import model.Criteria;
import service.CriteriaService;

public class Main {
	// static CriteriaService criService;
	
	
    public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  CriteriaService criService = new CriteriaService();
          int chon;
         
          while (true) {            
            menu();
            chon=Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1:
                	
                	menuAdd();
                    break;
                     case 2:
                    	 System.out.println("2 tim kiem");
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
             
          }
    	
    	
    }
//case 4:
//	criService.getData();
//	break;
    
    public static void menu(){
        
    	 System.out.println("1.Thêm / cập nhật / xóa, minh chứng ");
         System.out.println("2.Tìm kiếm minh chứng");
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