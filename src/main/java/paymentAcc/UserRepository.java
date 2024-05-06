package paymentAcc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private final JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveUser(User user) {

        String sql = "INSERT INTO users (name, surname, fin) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getSurname(), user.getFin());
    }
}