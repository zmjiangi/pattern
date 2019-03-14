package com.gzyijian.decorator;

/**
 * 抽象构建
 * @author zmjiangi
 */
public interface ICar {
	void move();
}

/**
 * ConcreteComponent 具体构件角色(真实对象)
 * @author zmjiangi
 */
class Car implements ICar {
	@Override
	public void move() {
		System.out.println("陆地上跑！");
	}
}

/**
 * Decorator装饰角色
 * @author zmjiangi
 */
class SuperCar implements ICar {
	protected ICar car;
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
	}
}

/**
 * ConcreteDecorator具体装饰角色
 * @author zmjiangi
 */
class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
	}
	
	public void fly(){
		System.out.println("天上飞！");
	}

	@Override
	public void move() {
		super.move();
		fly();
	}
	
}

/**
 * ConcreteDecorator具体装饰角色
 * @author zmjiangi
 */
class WaterCar extends SuperCar {
	
	public WaterCar(ICar car) {
		super(car);
	}
	
	public void swim(){
		System.out.println("水上游！");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
	
}

/**
 * ConcreteDecorator具体装饰角色
 * @author zmjiangi
 */
class AICar extends SuperCar {
	
	public AICar(ICar car) {
		super(car);
	}
	
	public void autoMove(){
		System.out.println("自动跑！");
	}
	
	@Override
	public void move() {
		super.move();
		autoMove();
	}
	
}



