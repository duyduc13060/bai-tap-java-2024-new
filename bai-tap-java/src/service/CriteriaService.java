package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.Criteria;

public class CriteriaService {
	
	private List<Criteria> listCri;
	private Criteria criteria;
	private int input;
	private Scanner sc = new Scanner(System.in);
	
	public CriteriaService() {
		listCri = new ArrayList<>();
		Criteria criteria = new Criteria(1, "test 1", "hehehe", null);
		listCri.add(criteria);
		criteria = new Criteria(2, "test 2", "hihihi", null);
		listCri.add(criteria);
		criteria = new Criteria(3, "test 3", "kekeke", null);
		listCri.add(criteria);
	}
	
	
	public void create() {
		System.out.println("Mời bạn nhập số lượng tiêu chí: ");
		input = Integer.parseInt(sc.nextLine());	
		for (int i = 0; i < input; i++) {
			criteria = new Criteria();
			System.out.println("Mời bạn nhập ID:");
			criteria.setCriteriaId(Integer.parseInt(sc.nextLine()));
			
			System.out.println("Mời bạn nhập tên tiêu chí:");
			criteria.setCriteriaName(sc.nextLine());
			
			System.out.println("Mời bạn nhập nội dung tiêu chí:");
			criteria.setCriteriaContent(sc.nextLine());
			listCri.add(criteria);
			
		}
		
		getData();
		
	}

	public void delete() {
		int temp = getIndex();
		if (temp == -1) {
			System.out.println("Mã không tồn tại");
			return;
		}
		listCri.remove(temp);
		System.out.println("Xóa thành công");
	}

	public void update() {
		 String inp;
		int temp = getIndex();
		if (temp == -1) {
			System.out.println("Mã không tồn tại");
			return;
		}
		System.out.println("Menu sửa");
		System.out.println("1.Sửa tên tiêu chí");
		System.out.println("2.Sửa nội dung tiêu chí");
		System.out.println("Mời bạn chọn thuộc tính muốn sửa:");
		inp = sc.nextLine();
		switch (inp) {
		case "1":
				System.out.println("Mời nhập lại tên tiêu chí");
				listCri.get(temp).setCriteriaName(sc.nextLine());
			break;
		case "2":
			System.out.println("Mời nhập lại nội dung tiêu chí");
			listCri.get(temp).setCriteriaContent(sc.nextLine());
			break;
		default:
			System.out.println("Mời chọn lại");
			break;
		}
		System.out.println("Sửa thành công");
	}
	
	public int search(){
		input = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < listCri.size(); i++) {
			if (input == criteria.getCriteriaId()) {
				getData();
				return 1;
			}
		}
		System.out.println("không tìm thấy");
		return -1;
	}
	
	private int getIndex() {
		System.out.println("Mời bạn nhập mã: ");
		input = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < listCri.size(); i++) {
			if (listCri.get(i).getCriteriaId() == input) {
				return i;
			}
		}
		return -1;
	}
	public void getData() {
		for(Criteria x:listCri) {
			x.display();
		}
	}
}
