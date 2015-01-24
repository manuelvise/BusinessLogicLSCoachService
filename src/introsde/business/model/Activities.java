package introsde.business.model;

import introsde.business.model.ItemActivity;

import java.util.List;

public class Activities {

	private int size;
	
	private List<ItemActivity> items;
	
	public Activities() {
		// TODO Auto-generated constructor stub
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<ItemActivity> getItems() {
		return items;
	}

	public void setItems(List<ItemActivity> items) {
		this.items = items;
	}
	
}
