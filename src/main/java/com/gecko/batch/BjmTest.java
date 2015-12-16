package com.gecko.batch;

public class BjmTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BatchJobManager.runJob(/*BatchJobType.MyOwnProcessor.toString()*/ "com.gecko.batch.MyOwnProcessor");
	}

}
