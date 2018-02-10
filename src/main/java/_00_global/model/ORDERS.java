package _00_global.model;

import java.util.Date;

public class ORDERS {
	private Integer order_id;
	private Integer order_user;
	private String order_note;
	private Date order_time;
	private java.sql.Date order_reserve_date;
	private Integer order_store;
	private Integer order_confirm_user;
	private Date order_confirm_time;
	private String order_takeout_period;
	private String order_status;
	private Date order_finished_time;
	private String order_serial_no;
	
	public ORDERS() {
	}

	public ORDERS(Integer order_id, Integer order_user, String order_note, Date order_time,
			java.sql.Date order_reserve_date, Integer order_store, Integer order_confirm_user, Date order_confirm_time,
			String order_takeout_period, String order_status, Date order_finished_time, String order_serial_no) {
		super();
		this.order_id = order_id;
		this.order_user = order_user;
		this.order_note = order_note;
		this.order_time = order_time;
		this.order_reserve_date = order_reserve_date;
		this.order_store = order_store;
		this.order_confirm_user = order_confirm_user;
		this.order_confirm_time = order_confirm_time;
		this.order_takeout_period = order_takeout_period;
		this.order_status = order_status;
		this.order_finished_time = order_finished_time;
		this.order_serial_no = order_serial_no;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Integer getOrder_user() {
		return order_user;
	}

	public void setOrder_user(Integer order_user) {
		this.order_user = order_user;
	}

	public String getOrder_note() {
		return order_note;
	}

	public void setOrder_note(String order_note) {
		this.order_note = order_note;
	}

	public Date getOrder_time() {
		return order_time;
	}

	public void setOrder_time(Date order_time) {
		this.order_time = order_time;
	}

	public java.sql.Date getOrder_reserve_date() {
		return order_reserve_date;
	}

	public void setOrder_reserve_date(java.sql.Date order_reserve_date) {
		this.order_reserve_date = order_reserve_date;
	}

	public Integer getOrder_store() {
		return order_store;
	}

	public void setOrder_store(Integer order_store) {
		this.order_store = order_store;
	}

	public Integer getOrder_confirm_user() {
		return order_confirm_user;
	}

	public void setOrder_confirm_user(Integer order_confirm_user) {
		this.order_confirm_user = order_confirm_user;
	}

	public Date getOrder_confirm_time() {
		return order_confirm_time;
	}

	public void setOrder_confirm_time(Date order_confirm_time) {
		this.order_confirm_time = order_confirm_time;
	}

	public String getOrder_takeout_period() {
		return order_takeout_period;
	}

	public void setOrder_takeout_period(String order_takeout_period) {
		this.order_takeout_period = order_takeout_period;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public Date getOrder_finished_time() {
		return order_finished_time;
	}

	public void setOrder_finished_time(Date order_finished_time) {
		this.order_finished_time = order_finished_time;
	}

	public String getOrder_serial_no() {
		return order_serial_no;
	}

	public void setOrder_serial_no(String order_serial_no) {
		this.order_serial_no = order_serial_no;
	}

	@Override
	public String toString() {
		return "ORDERS [order_id=" + order_id + ", order_user=" + order_user + ", order_note=" + order_note
				+ ", order_time=" + order_time + ", order_reserve_date=" + order_reserve_date + ", order_store="
				+ order_store + ", order_confirm_user=" + order_confirm_user + ", order_confirm_time="
				+ order_confirm_time + ", order_takeout_period=" + order_takeout_period + ", order_status="
				+ order_status + ", order_finished_time=" + order_finished_time + ", order_serial_no=" + order_serial_no
				+ "]";
	}
	
}
