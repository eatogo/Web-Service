package _00_global.model;

public class IDENTITIES {
	private String identity_type;
	private String identity_description;

	public IDENTITIES() {
	}

	public IDENTITIES(String identity_type, String identity_description) {
		super();
		this.identity_type = identity_type;
		this.identity_description = identity_description;
	}

	public String getIdentity_type() {
		return identity_type;
	}

	public void setIdentity_type(String identity_type) {
		this.identity_type = identity_type;
	}

	public String getIdentity_description() {
		return identity_description;
	}

	public void setIdentity_description(String identity_description) {
		this.identity_description = identity_description;
	}

	@Override
	public String toString() {
		return "IDENTITIES [identity_type=" + identity_type + ", identity_description=" + identity_description + "]";
	}

}
