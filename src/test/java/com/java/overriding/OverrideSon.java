package com.java.overriding;

/*
 *
 * @ClassName:OverrideDemo2.java
 * @author   : Administrator
 * @date     : 2019年3月26日 下午6:45:26
 * 
 */
public class OverrideSon extends OverrideParent {
	/**
	 * 重写的注意事项： 
	 * 1、子类在重写父类的方法，参数列表必须一模一样 
	 * 2、子类覆盖父类的方法，必须保证权限大于等于父类
	 * 3、pravite和final修饰的方法不能被覆盖 私有的方法只能在本类访问，final修饰的是成员变量，不能可能存在覆盖
	 * 4、static关键字，静态只能覆盖静态，或者被静态覆盖，静态方法属于类，不属于对象
	 * 
	 */
	// 用户继承父类
	@Override
	public void engineStart(String str) {
		// TODO Auto-generated method stub
		// super关键字调用父类的方法
		// super.engineStart("str");
		System.out.println("这是子类重写的方法,被调用的两种方式，1、子类创建子类的对象应用，2、父类类型创建子类的类型");
	}

	public void engineStart() {
		// super.engineStart();
		System.out.println("这是子类重写的方法，覆盖父类的方法，父类创建父类的对象不会调用子类方法");
	}

	public static void main(String[] args) {
		// 创建本类的对象，调用父类的方法，
		OverrideParent o = new OverrideParent();
		// 调用的方法名也是子类的
		o.engineStart("2");
		o.engineStart();

		// 子类new一个对象，调用子类的方法，调用的方法名还是子类的
		OverrideSon p = new OverrideSon();
		p.engineStart();

		// 多态：父类类型的应用 创建子类类型的对象,执行就是子类的方法
		OverrideParent op = new OverrideSon();
		op.engineStart("1");
	}
}
