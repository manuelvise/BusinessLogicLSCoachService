package introsde.business.model;

public class ItemWeight {
	
	private String uri;
	private String timestamp;
	private Double weight;
	private Double free_mass;
	private Double fat_percent;
	private Double mass_weight;
	private Double bmi;
	
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getFree_mass() {
		return free_mass;
	}
	public void setFree_mass(Double free_mass) {
		this.free_mass = free_mass;
	}
	public Double getFat_percent() {
		return fat_percent;
	}
	public void setFat_percent(Double fat_percent) {
		this.fat_percent = fat_percent;
	}
	public Double getMass_weight() {
		return mass_weight;
	}
	public void setMass_weight(Double mass_weight) {
		this.mass_weight = mass_weight;
	}
	public Double getBmi() {
		return bmi;
	}
	public void setBmi(Double bmi) {
		this.bmi = bmi;
	}
	
	
}
