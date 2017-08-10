package com.pattern.core.proxy;

public class ProxyDbData implements ImageInterface{
	
	private RealDbData realDbData;
	private String fileName;
	
	

	public ProxyDbData(String fileName) {
		super();
		this.fileName = fileName;
	}



	@Override
	public void display() {
		if (realDbData==null){
			 realDbData=new RealDbData(fileName);
	
		}
		realDbData.display();
		
	}
	

}
