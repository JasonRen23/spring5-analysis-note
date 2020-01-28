package base.factory.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author renzhicheng
 * @since 2020-01-28 16:33.
 */
public class FactoryBeanBootstrap {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("factory.bean/factoryBean.xml");
		Car car = (Car) context.getBean("carFactoryBean");
		System.out.println(car.toString());
	}
}
