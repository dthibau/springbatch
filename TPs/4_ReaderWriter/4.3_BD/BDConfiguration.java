package org.formation;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class BDConfiguration {

    @Autowired
    private Environment env;
 
    @Primary
    @Bean
    public DataSource batchDataSource() {
 
        DriverManagerDataSource dataSource
          = new DriverManagerDataSource();

        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));

        return dataSource;
    }
    
    @Bean
    public DataSource inputProductDataSource() {
 
        DriverManagerDataSource dataSource
          = new DriverManagerDataSource();

        dataSource.setUrl(env.getProperty("appli.input"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));

        return dataSource;
    }

    @Bean
    public DataSource outputProductDataSource() {
 
        DriverManagerDataSource dataSource
          = new DriverManagerDataSource();
//        dataSource.setDriverClassName(
//          env.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(env.getProperty("appli.output.jdbc.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));

        return dataSource;
    }

}
