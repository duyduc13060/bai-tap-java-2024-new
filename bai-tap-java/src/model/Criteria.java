package model;

//todo: bang tieu chi
public class Criteria {

    private String criteriaName;
    private String criteriaContent;
	
    //to do
    public Criteria(String criteriaName, String criteriaContent) {
		super();
		this.criteriaName = criteriaName;
		this.criteriaContent = criteriaContent;
	}
    public Criteria() {
		
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
	
	
	@Override
	public String toString() {
		return "Criteria [criteriaName=" + criteriaName + ", criteriaContent=" + criteriaContent + "]";
	}
    
    

}
