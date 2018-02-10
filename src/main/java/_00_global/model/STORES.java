package _00_global.model;

public class STORES {
	private Integer store_id;
	private String store_name;
	private String store_address;
	private String store_phone;
	private String store_email;
	private String store_logo;
	private String store_open_hour;
	private String store_intro;
	private Double store_latitude;
	private Double store_longitude;
	private Integer store_area;
	private String store_operate_type;
	private String store_status;

	public STORES() {
	}

	public STORES(Integer store_id, String store_name, String store_address, String store_phone, String store_email,
			String store_logo, String store_open_hour, String store_intro, Double store_latitude,
			Double store_longitude, Integer store_area, String store_operate_type, String store_status) {
		this.store_id = store_id;
		this.store_name = store_name;
		this.store_address = store_address;
		this.store_phone = store_phone;
		this.store_email = store_email;
		this.store_logo = store_logo;
		this.store_open_hour = store_open_hour;
		this.store_intro = store_intro;
		this.store_latitude = store_latitude;
		this.store_longitude = store_longitude;
		this.store_area = store_area;
		this.store_operate_type = store_operate_type;
		this.store_status = store_status;
	}

	public Integer getStore_id() {
		return store_id;
	}

	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getStore_address() {
		return store_address;
	}

	public void setStore_address(String store_address) {
		this.store_address = store_address;
	}

	public String getStore_phone() {
		return store_phone;
	}

	public void setStore_phone(String store_phone) {
		this.store_phone = store_phone;
	}

	public String getStore_email() {
		return store_email;
	}

	public void setStore_email(String store_email) {
		this.store_email = store_email;
	}

	public String getStore_logo() {
		return store_logo;
	}

	public void setStore_logo(String store_logo) {
		this.store_logo = store_logo;
	}

	public String getStore_open_hour() {
		return store_open_hour;
	}

	public void setStore_open_hour(String store_open_hour) {
		this.store_open_hour = store_open_hour;
	}

	public String getStore_intro() {
		return store_intro;
	}

	public void setStore_intro(String store_intro) {
		this.store_intro = store_intro;
	}

	public Double getStore_latitude() {
		return store_latitude;
	}

	public void setStore_latitude(Double store_latitude) {
		this.store_latitude = store_latitude;
	}

	public Double getStore_longitude() {
		return store_longitude;
	}

	public void setStore_longitude(Double store_longitude) {
		this.store_longitude = store_longitude;
	}

	public Integer getStore_area() {
		return store_area;
	}

	public void setStore_area(Integer store_area) {
		this.store_area = store_area;
	}

	public String getStore_operate_type() {
		return store_operate_type;
	}

	public void setStore_operate_type(String store_operate_type) {
		this.store_operate_type = store_operate_type;
	}

	public String getStore_status() {
		return store_status;
	}

	public void setStore_status(String store_status) {
		this.store_status = store_status;
	}

	@Override
	public String toString() {
		return "STORES [store_id=" + store_id + ", store_name=" + store_name + ", store_address=" + store_address
				+ ", store_phone=" + store_phone + ", store_email=" + store_email + ", store_logo=" + store_logo
				+ ", store_open_hour=" + store_open_hour + ", store_intro=" + store_intro + ", store_latitude="
				+ store_latitude + ", store_longitude=" + store_longitude + ", store_area=" + store_area
				+ ", store_operate_type=" + store_operate_type + ", store_status=" + store_status + "]";
	}

}
