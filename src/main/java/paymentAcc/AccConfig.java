package paymentAcc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class AccConfig {

    @Bean
    UserCheck user_check(){
        return new UserCheck();
    }
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/users");
        dataSource.setUsername("postgres");
        dataSource.setPassword("12345");
        return dataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository(jdbcTemplate());
    }
}