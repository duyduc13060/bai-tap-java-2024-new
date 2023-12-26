import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
          int chon;
         
          while (true) {            
            menu();
            chon=Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1:
                	System.out.println("1 them sua xoa cap nhat minh chung");
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
                    System.exit(0);
                         System.out.println("Thank for use");
                    break;
                    
                     default:
                         System.out.println("Chọn lại");
            }
             
          }
    	
    	
    }
    
    
    public static void menu(){
        
        System.out.println("1.Thêm / cập nhật / xóa, minh chứng ");
       
        System.out.println("2.Tìm kiếm minh chứng");
        System.out.println("3.Xem DS minh chứng ");
        System.out.println("4.Xem Ds minh chứng  theo ngày tạo");
        
        System.out.println("5.Out");
       System.out.print("Mời bạn chọn:");
    }
}