package com.collection.mapping;

import java.util.Map;

public class CollectionBean { //Alt shift T : getter setter
	private Map<String, String> addressList;

	public Map<String, String> getAddressList() {
		return addressList;
	}

	public void setAddressList(Map<String, String> addressList) {
		this.addressList = addressList;
	}
}
