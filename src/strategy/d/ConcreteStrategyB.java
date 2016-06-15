package strategy.d;

//具体策略类，封装了具体的算法或行为，继承于Strategy类
public class ConcreteStrategyB implements Strategy {

	@Override
	public void algorithmInterface() {
		System.out.println("算法B实现");
	}

}
