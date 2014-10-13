package br.com.teste.jsdm.tasklet;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class StepReader implements ItemReader<String> {

	@Override
	public String read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {
		System.out.println("step reader");
		String teste = "123";
		return teste;
	}

}
