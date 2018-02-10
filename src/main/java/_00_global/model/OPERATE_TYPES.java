package _00_global.model;

public class OPERATE_TYPES {
	private String operate_type;
	private String operate_type_description;
	private String operate_rest_mode;
	private String operate_period;
	
	public OPERATE_TYPES() {
	}

	public OPERATE_TYPES(String operate_type, String operate_type_description, String operate_rest_mode,
			String operate_period) {
		super();
		this.operate_type = operate_type;
		this.operate_type_description = operate_type_description;
		this.operate_rest_mode = operate_rest_mode;
		this.operate_period = operate_period;
	}

	public String getOperate_type() {
		return operate_type;
	}

	public void setOperate_type(String operate_type) {
		this.operate_type = operate_type;
	}

	public String getOperate_type_description() {
		return operate_type_description;
	}

	public void setOperate_type_description(String operate_type_description) {
		this.operate_type_description = operate_type_description;
	}

	public String getOperate_rest_mode() {
		return operate_rest_mode;
	}

	public void setOperate_rest_mode(String operate_rest_mode) {
		this.operate_rest_mode = operate_rest_mode;
	}

	public String getOperate_period() {
		return operate_period;
	}

	public void setOperate_period(String operate_period) {
		this.operate_period = operate_period;
	}

	@Override
	public String toString() {
		return "OPERATE_TYPES [operate_type=" + operate_type + ", operate_type_description=" + operate_type_description
				+ ", operate_rest_mode=" + operate_rest_mode + ", operate_period=" + operate_period + "]";
	}
	
}
