package model;

public class Department {

    private int id;
    private String nameDepartment;
    private String descriptionDepartment;


    public Department() {
    }

    public Department(int id, String nameDepartment, String descriptionDepartment) {
        this.id = id;
        this.nameDepartment = nameDepartment;
        this.descriptionDepartment = descriptionDepartment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getDescriptionDepartment() {
        return descriptionDepartment;
    }

    public void setDescriptionDepartment(String descriptionDepartment) {
        this.descriptionDepartment = descriptionDepartment;
    }
}
