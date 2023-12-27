package model;

public class InspectionUsage {

    private int id;
    private Inspection inspection;
    private Standard standard;


    public InspectionUsage() {

    }

    public InspectionUsage(int id, Inspection inspection, Standard standard) {
        this.id = id;
        this.inspection = inspection;
        this.standard = standard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Inspection getInspection() {
        return inspection;
    }

    public void setInspection(Inspection inspection) {
        this.inspection = inspection;
    }

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }
}
