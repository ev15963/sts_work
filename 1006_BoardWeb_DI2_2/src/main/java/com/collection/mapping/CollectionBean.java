package com.collection.mapping;

import java.util.Set;

public class CollectionBean { //Alt shift T : getter setter
	private Set<String> addressList;

	public Set<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(Set<String> addressList) {
		this.addressList = addressList;
	}
}