package com.learn.reflection;

public class SampleClass {

	private String sampleField;
	   
	   public SampleClass(){
	   }

	   public SampleClass(String sampleField){
	      this.sampleField = sampleField;
	   }

	   public String getSampleField() {
	      return sampleField;
	   }

	   public void setSampleField(String sampleField) {
	      this.sampleField = sampleField;
	   } 

}
