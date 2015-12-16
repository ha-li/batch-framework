package com.gecko.batch;

public enum BatchJobType {
	MyOwnProcessor;
	
	public static BatchJobType toValue(String pValue) {
		for(BatchJobType val : values() ) {
			if(val.name().equalsIgnoreCase(pValue)) {
				return val;
			}
		}
		throw new RuntimeException("BatchJobType of value " + pValue + " cannot be found.");
	}
}
