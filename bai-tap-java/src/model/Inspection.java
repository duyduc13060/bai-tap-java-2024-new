package model;

import java.time.LocalDate;

//todo:kiem dinh
public class Inspection {
    private int verifierId;

    private String verifierName;

    private String description;

    private LocalDate createDate;

    private String additionalPerson;
    
    
    public Inspection() {
		// TODO Auto-generated constructor stub
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



	@Override
	public String toString() {
		return "Inspection [verifierId=" + verifierId + ", verifierName=" + verifierName + ", description="
				+ description + ", createDate=" + createDate + ", additionalPerson=" + additionalPerson + "]";
	}
    
}
