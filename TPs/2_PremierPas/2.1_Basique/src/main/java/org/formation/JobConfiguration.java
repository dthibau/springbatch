package org.formation;

import org.formation.io.DummyReader;
import org.formation.model.DummyRecord;
import org.formation.io.DummyWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class JobConfiguration {

	@Autowired
	DummyReader dummyReader;
	@Autowired
	DummyWriter dummyWriter;

	@Autowired
	JobRepository jobRepository;

	@Autowired
	PlatformTransactionManager transactionManager;
	

	// A compléter
	
}
