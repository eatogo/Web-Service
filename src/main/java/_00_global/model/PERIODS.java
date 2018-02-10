package _00_global.model;

import java.sql.Time;

public class PERIODS {
	private String period_id;
	private String period_description;
	private Time period_start;
	private Time period_end;
	
	public PERIODS() {
	}

	public PERIODS(String period_id, String period_description, Time period_start, Time period_end) {
		super();
		this.period_id = period_id;
		this.period_description = period_description;
		this.period_start = period_start;
		this.period_end = period_end;
	}

	public String getPeriod_id() {
		return period_id;
	}

	public void setPeriod_id(String period_id) {
		this.period_id = period_id;
	}

	public String getPeriod_description() {
		return period_description;
	}

	public void setPeriod_description(String period_description) {
		this.period_description = period_description;
	}

	public Time getPeriod_start() {
		return period_start;
	}

	public void setPeriod_start(Time period_start) {
		this.period_start = period_start;
	}

	public Time getPeriod_end() {
		return period_end;
	}

	public void setPeriod_end(Time period_end) {
		this.period_end = period_end;
	}

	@Override
	public String toString() {
		return "PERIODS [period_id=" + period_id + ", period_description=" + period_description + ", period_start="
				+ period_start + ", period_end=" + period_end + "]";
	}
	
}
