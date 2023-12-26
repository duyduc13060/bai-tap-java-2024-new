package model;

//todo: bang tieu chi
public class Criteria {
	
	private int criteriaId;
    private String criteriaName;
    private String criteriaContent;
    private Standard standard;
	
    //to do
  public Criteria() {
	// TODO Auto-generated constructor stub
}

public Criteria(int criteriaId, String criteriaName, String criteriaContent, Standard standard) {
	super();
	this.criteriaId = criteriaId;
	this.criteriaName = criteriaName;
	this.criteriaContent = criteriaContent;
	this.standard = standard;
}

public int getCriteriaId() {
	return criteriaId;
}

public void setCriteriaId(int criteriaId) {
	this.criteriaId = criteriaId;
}

public String getCriteriaName() {
	return criteriaName;
}

public void setCriteriaName(String criteriaName) {
	this.criteriaName = criteriaName;
}

public String getCriteriaContent() {
	return criteriaContent;
}

public void setCriteriaContent(String criteriaContent) {
	this.criteriaContent = criteriaContent;
}

public Standard getStandard() {
	return standard;
}

public void setStandard(Standard standard) {
	this.standard = standard;
}

@Override
public String toString() {
	return "Criteria [criteriaId=" + criteriaId + ", criteriaName=" + criteriaName + ", criteriaContent="
			+ criteriaContent + ", standard=" + standard + "]";
}


public void display() {
	System.out.println( "Criteria [criteriaId=" + criteriaId + ", criteriaName=" + criteriaName + ", criteriaContent="
			+ criteriaContent + ", standard=" + standard + "]");
}

  
    
    

}
