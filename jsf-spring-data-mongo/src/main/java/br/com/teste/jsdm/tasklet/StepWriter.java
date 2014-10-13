package br.com.teste.jsdm.tasklet;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class StepWriter implements ItemWriter<Integer> {

	@Override
	public void write(List<? extends Integer> items) throws Exception {
		System.out.println("step writer");
		for(Integer item : items) {
			System.out.println(item);
		}
	}
	
}
