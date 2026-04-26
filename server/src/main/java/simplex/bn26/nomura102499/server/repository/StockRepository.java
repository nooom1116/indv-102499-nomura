package simplex.bn26.nomura102499.server.repository;

import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import simplex.bn26.nomura102499.server.models.Stock;

import java.util.List;

@Repository
public class StockRepository {
    private final JdbcTemplate jdbcTemplate;

    public StockRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Stock> selectAll() {
        return jdbcTemplate.query("select ticker, name, exchange_market, shares_issued from stock",
        new DataClassRowMapper<>(Stock.class));
    }
}
