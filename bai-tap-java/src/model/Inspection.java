package model;

import java.time.LocalDate;
import java.util.List;

//todo:kiem dinh
public class Inspection {
    private int verifierId;

    private String verifierName;

    private String description;

    private LocalDate createDate;

    private String additionalPerson;

	private Department department;
	private List<InspectionUsage> inspectionUsageList;
	private List<Standard> standardList;
    
    
    public Inspection() {
		// TODO Auto-generated constructor stub
	}

	public Inspection(int verifierId, String verifierName, String description, LocalDate createDate, String additionalPerson, Department department, List<InspectionUsage> inspectionUsageList, List<Standard> standardList) {
		this.verifierId = verifierId;
		this.verifierName = verifierName;
		this.description = description;
		this.createDate = createDate;
		this.additionalPerson = additionalPerson;
		this.department = department;
		this.inspectionUsageList = inspectionUsageList;
		this.standardList = standardList;
	}

	public Inspection(int verifierId, String verifierName, String description, LocalDate createDate,
					  String additionalPerson) {
		super();
		this.verifierId = verifierId;
		this.verifierName = verifierName;
		this.description = description;
		this.createDate = createDate;
		this.additionalPerson = additionalPerson;
	}



	public int getVerifierId() {
		return verifierId;
	}


	public void setVerifierId(int verifierId) {
		this.verifierId = verifierId;
	}


	public String getVerifierName() {
		return verifierName;
	}


	public void setVerifierName(String verifierName) {
		this.verifierName = verifierName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getCreateDate() {
		return createDate;
	}


	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}


	public String getAdditionalPerson() {
		return additionalPerson;
	}


	public void setAdditionalPerson(String additionalPerson) {
		this.additionalPerson = additionalPerson;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<InspectionUsage> getInspectionUsageList() {
		return inspectionUsageList;
	}

	public void setInspectionUsageList(List<InspectionUsage> inspectionUsageList) {
		this.inspectionUsageList = inspectionUsageList;
	}

	public List<Standard> getStandardList() {
		return standardList;
	}

	public void setStandardList(List<Standard> standardList) {
		this.standardList = standardList;
	}

	@Override
	public String toString() {
		return "Inspection [verifierId=" + verifierId + ", verifierName=" + verifierName + ", description="
				+ description + ", createDate=" + createDate + ", additionalPerson=" + additionalPerson + "]";
	}
    
}
