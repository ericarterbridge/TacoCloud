package sia.tacocloud.Repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sia.tacocloud.Taco;

@Repository
public class JdbcTacoRepository implements TacoRepository {

    private JdbcTemplate jdbc;

    public JdbcTacoRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }
    @Override
    public Taco save(Taco design) {
        return null;
    }
}
