package ru.CalculateSpring.operations;

import ru.CalculateSpring.interfaces.Operation;

public class OpSubstruct implements Operation {

	@Override
	public long operate(long op1, long op2) {
		
		return op1 - op2;
	}

	@Override
	public String getOpsName() {
		return " minus ";
	}

}
