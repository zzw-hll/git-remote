package com.zzw.adapter;

//类适配器模式
public class DogApater extends Converter implements Robot{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		wang();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		run();
	}

	
	

	
//	private Dog dog;
//	
//	public DogApater() {
//		this.dog=dog;
//	}

	

}
