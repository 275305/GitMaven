package com.collection;

public class SetGetTest {
	
	public static void main(String[] args) {
		SetGetExp setGetObj=new SetGetExp();
		
		  setGetObj.setEmpAddress("hyd");
		  setGetObj.setEmpName("Scoot");
		  setGetObj.setEmpAge(27);
		  System.out.println(setGetObj.getEmpName()+"\t"+
		                           setGetObj.getEmpAddress()+"\t"+
				                    setGetObj.getEmpAge());
	}

}
