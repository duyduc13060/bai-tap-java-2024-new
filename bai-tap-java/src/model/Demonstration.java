package model;

import java.util.Date;

//todo: bang minh chung
public class Demonstration {

    private int  demonStrationCode;
    private String nameDemonstration;//ten minh chung
    private String issuePlace;//noi ban hanh 
    private Date dateIssue;//ngay ban hanh
    private String responsibleDepartment; //phong ban chiu trach nhiem
    private Date dateProvided;//ngay cung cap minh chung
    private Date dateCreated;
    //todo
    public Demonstration() {
		// TODO Auto-generated constructor stub
	}
    
    
    
	public Demonstration(int demonStrationCode, String nameDemonstration, String issuePlace, Date dateIssue,
			String responsibleDepartment, Date dateProvided, Date dateCreated) {
		super();
		this.demonStrationCode = demonStrationCode;
		this.nameDemonstration = nameDemonstration;
		this.issuePlace = issuePlace;
		this.dateIssue = dateIssue;
		this.responsibleDepartment = responsibleDepartment;
		this.dateProvided = dateProvided;
		this.dateCreated = dateCreated;
	}



	public int getDemonStrationCode() {
		return demonStrationCode;
	}
	public void setDemonStrationCode(int demonStrationCode) {
		this.demonStrationCode = demonStrationCode;
	}
	public String getNameDemonstration() {
		return nameDemonstration;
	}
	public void setNameDemonstration(String nameDemonstration) {
		this.nameDemonstration = nameDemonstration;
	}
	public String getIssuePlace() {
		return issuePlace;
	}
	public void setIssuePlace(String issuePlace) {
		this.issuePlace = issuePlace;
	}
	public Date getDateIssue() {
		return dateIssue;
	}
	public void setDateIssue(Date dateIssue) {
		this.dateIssue = dateIssue;
	}
	public String getResponsibleDepartment() {
		return responsibleDepartment;
	}
	public void setResponsibleDepartment(String responsibleDepartment) {
		this.responsibleDepartment = responsibleDepartment;
	}
	public Date getDateProvided() {
		return dateProvided;
	}
	public void setDateProvided(Date dateProvided) {
		this.dateProvided = dateProvided;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	@Override
	public String toString() {
		return "Demonstration [demonStrationCode=" + demonStrationCode + ", nameDemonstration=" + nameDemonstration
				+ ", issuePlace=" + issuePlace + ", dateIssue=" + dateIssue + ", responsibleDepartment="
				+ responsibleDepartment + ", dateProvided=" + dateProvided + ", dateCreated=" + dateCreated + "]";
	}
    

}
