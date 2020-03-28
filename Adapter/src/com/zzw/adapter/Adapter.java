package com.zzw.adapter;

public class Adapter {
	//Robot cry() move() 火鸡冒充鸭子（被适配者）
	//Dog wang() run()   机器人冒充狗（被适配者）
	//DogAdapter cry() move()
	public static void main(String[] args) {
		//类适配器模式
//		Dog dog=new Converter() ;
//		dog.wang();
//		dog.run();
//		Robot robot=new DogApater();
//		robot.cry();
//		robot.move();
		//对象适配器模式
		Robot robot=new DogApater02(new Converter());
		robot.cry();
		robot.move();
		
		
	}

}
