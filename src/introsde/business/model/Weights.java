package introsde.business.model;

import introsde.business.model.ItemWeight;

public class Weights {
	private Integer size;
	private ItemWeight[] items;
	private String previous;
	private String next;

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public ItemWeight[] getItems() {
		return items;
	}

	public void setItems(ItemWeight[] items) {
		this.items = items;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

}
