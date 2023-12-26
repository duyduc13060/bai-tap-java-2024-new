package model;
//bang quyen
public class Authority {
		
	private int authorityId;
	private String name;
	
	public Authority() {
	
	}

	public Authority(int authorityId, String name) {
		super();
		this.authorityId = authorityId;
		this.name = name;
	}

	
	
	public int getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(int authorityId) {
		this.authorityId = authorityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Authority [authorityId=" + authorityId + ", name=" + name + "]";
	}
	
}
