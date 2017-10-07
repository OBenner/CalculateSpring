package ru.CalculateSpring.operations;

import ru.CalculateSpring.interfaces.Operation;

public class OpAdd implements Operation {

	OpAdd(){
		
	}
	
	@Override
	public long operate(long op1, long op2) {
		
		return op1 + op2;
	}

	@Override
	public String getOpsName() {
		return " plus ";
	}

}
