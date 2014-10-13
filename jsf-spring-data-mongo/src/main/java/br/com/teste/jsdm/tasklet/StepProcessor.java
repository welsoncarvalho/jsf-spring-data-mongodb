package br.com.teste.jsdm.tasklet;

import org.springframework.batch.item.ItemProcessor;

public class StepProcessor implements ItemProcessor<String, Integer> {

	@Override
	public Integer process(String value) throws Exception {
		System.out.println("step processor");
		return Integer.parseInt(value);
	}

}
