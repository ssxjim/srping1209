package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tp.iocean.CustomerBo;

public class Main {
	public static void main(String args[]) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		CustomerBo customer = (CustomerBo) context.getBean("customerBo");
		customer.getCustomer();
		customer.getCustomerReturnValue();
		customer.addCustomerThrowException();
		customer.addCustomerAround("momo");
	}

}