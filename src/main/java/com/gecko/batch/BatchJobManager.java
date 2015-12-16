package com.gecko.batch;

public final class BatchJobManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		runJob(args[0]);
	}

	
	/**
	 * 
	 * @return the job id
	 */
	public static String runJob(String clazs) {
		// add command line args
		System.out.println("running job " + clazs);
		return executeCommand("batch", clazs, "arg1", "arg2", "arg3");
	}
	
	public static String executeCommand(String runType, String ... args) {
		String jobId = "";
		new BatchJobManager().executeBatchJob(args);
		return jobId;
	}
	
	
	/* 
	 * instance level execute
	 * 
	 */
	public void executeBatchJob(String ... args) {
		System.out.println("JR running specific instance of batch job");
		// need to create a specific instance of the batch processor and then execute
		BatchJobProcessor processor = (BatchJobProcessor)ReflectionUtils.createInstance(args[0], null, null);
		processor.execute();
	}
}
