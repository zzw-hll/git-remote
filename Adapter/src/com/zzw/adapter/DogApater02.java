package com.zzw.adapter;

//对象适配器模式
public class DogApater02 implements Robot {
	private Dog dog;
	public DogApater02(Dog dog) {
		this.dog=dog;
	}
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		dog.wang();
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		dog.run();
	}

	

}
