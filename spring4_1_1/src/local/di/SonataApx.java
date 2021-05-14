package local.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SonataApx {

	public static void main(String[] args) {
		Sonata herCar = new Sonata();
		ApplicationContext context = 
							new ClassPathXmlApplicationContext("SsonataBean.xml");
		Sonata myCar = null;
		myCar = (Sonata)context.getBean("myCar");
		System.out.println(myCar.toString());
		
		Sonata yourCar = null;
		yourCar = (Sonata)context.getBean("yourCar");
		System.out.println(yourCar.toString());
	}

}
