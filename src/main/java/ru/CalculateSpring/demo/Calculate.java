package ru.CalculateSpring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.CalculateSpring.interfaces.Operation;
import ru.CalculateSpring.interfaces.ResultWriter;

public class Calculate {

	private Operation ops;
	private ResultWriter wtr;

	public void setOps(Operation ops) {
		this.ops = ops;
	}

	public void setWriter(ResultWriter writer) {
		wtr = writer;
	}

	
	
	public void execute(String[] args) {
		/*
		 initialization members op1 and op2
		*/
		long op1 = 6;
		long op2 = 2;
		wtr.showResult("The result of " + op1 + ops.getOpsName() + op2 + " is " + ops.operate(op1, op2) + "!");

	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		BeanFactory factory = (BeanFactory) context;
		Calculate calc = (Calculate) factory.getBean("addbean");
		Calculate calc1 = (Calculate) factory.getBean("multiplybean");
		Calculate calc2 = (Calculate) factory.getBean("substructbean");

		calc.execute(args);
		calc1.execute(args);
		calc2.execute(args);

	}
}