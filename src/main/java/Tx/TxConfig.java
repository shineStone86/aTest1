package Tx;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ComponentScan(basePackages = "Tx")
@EnableTransactionManagement
public class TxConfig {

	@Bean
	public DataSource dataSource() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setUser( "root" );
		dataSource.setPassword( "cmbc1234@" );
		dataSource.setDriverClass( "com.mysql.cj.jdbc.Driver" );
		dataSource.setJdbcUrl( "jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useUnicode=true&zeroDateTimeBehavior=convertToNull&autoReconnect=true&characterEncoding=utf-8" );
		return dataSource;

	}

	@Bean
	public JdbcTemplate jdbcTemplate() throws Exception {
		JdbcTemplate jdbcTemplate = new JdbcTemplate( dataSource() );
		return jdbcTemplate;
	}

	public PlatformTransactionManager transactionManager() throws Exception {
		return new DataSourceTransactionManager( dataSource() );
	}
}
