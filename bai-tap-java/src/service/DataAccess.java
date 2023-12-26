package service;

import java.util.ArrayList;
import java.util.List;

public class DataAccess <T>{
    protected List<T> dataList;

    public DataAccess() {
        this.dataList = new ArrayList<>();
    }

    public void create(T item){
        dataList.add(item);
    }

    public void update(int index, T newItem) {
        if (index >= 0 && index < dataList.size()) {
            dataList.set(index, newItem);
        } else {
            System.out.println("Index không hợp lệ");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < dataList.size()) {
            dataList.remove(index);
        } else {
            System.out.println("Index không hợp lệ");
        }
    }

    public int search(T item) {
        return dataList.indexOf(item);
    }


}
