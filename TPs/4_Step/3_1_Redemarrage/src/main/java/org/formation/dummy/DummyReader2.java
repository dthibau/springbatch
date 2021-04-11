package org.formation.dummy;

import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@JobScope
@Component
public class DummyReader2 implements ItemReader<DummyRecord> {

	private int i =0;
	private int nbIterations=100;
	
	public DummyReader2(@Value("#{jobParameters[NB_ITERATIONS]}") String nbIterations) {
		this.nbIterations = Integer.parseInt(nbIterations);
	}
	
	
	
	@Override
	public DummyRecord read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		if ( i < nbIterations ) {
			i++;
			return new DummyRecord();
		}
		i=0;
		return null;
	}

	

}
