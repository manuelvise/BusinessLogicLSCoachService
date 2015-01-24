package introsde.business.model;

import java.util.Date;

public class ItemActivity {

	private String type;
	private String start_time;
	private int utc_offset;
	private double total_distance;
	private double duration;
	private double total_calories;
	private String source;
	private String entry_mode;
	private Boolean has_path;
	private String uri;
	
	public ItemActivity() {
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public int getUtc_offset() {
		return utc_offset;
	}

	public void setUtc_offset(int utc_offset) {
		this.utc_offset = utc_offset;
	}

	public double getTotal_distance() {
		return total_distance;
	}

	public void setTotal_distance(double total_distance) {
		this.total_distance = total_distance;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getTotal_calories() {
		return total_calories;
	}

	public void setTotal_calories(double total_calories) {
		this.total_calories = total_calories;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getEntry_mode() {
		return entry_mode;
	}

	public void setEntry_mode(String entry_mode) {
		this.entry_mode = entry_mode;
	}

	public Boolean getHas_path() {
		return has_path;
	}

	public void setHas_path(Boolean has_path) {
		this.has_path = has_path;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	
}
