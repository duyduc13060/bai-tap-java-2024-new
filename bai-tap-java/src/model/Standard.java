package model;

//todo:bang tieu chuan
public class Standard {
    private String standardCode;

    private String standardName;

    private String standardContent;
    
    public Standard() {
		// TODO Auto-generated constructor stub
	}

	public Standard(String standardCode, String standardName, String standardContent) {
		super();
		this.standardCode = standardCode;
		this.standardName = standardName;
		this.standardContent = standardContent;
	}

	public String getStandardCode() {
		return standardCode;
	}

	public void setStandardCode(String standardCode) {
		this.standardCode = standardCode;
	}

	public String getStandardName() {
		return standardName;
	}

	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

	public String getStandardContent() {
		return standardContent;
	}

	public void setStandardContent(String standardContent) {
		this.standardContent = standardContent;
	}

	@Override
	public String toString() {
		return "Standard [standardCode=" + standardCode + ", standardName=" + standardName + ", standardContent="
				+ standardContent + "]";
	}
    


}
