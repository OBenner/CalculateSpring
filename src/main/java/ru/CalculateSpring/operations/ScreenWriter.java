package ru.CalculateSpring.operations;

import ru.CalculateSpring.interfaces.ResultWriter;

public class ScreenWriter implements ResultWriter {
	public ScreenWriter() {
	}

	public void showResult(String result) {
		System.out.println(result);
	}
}
