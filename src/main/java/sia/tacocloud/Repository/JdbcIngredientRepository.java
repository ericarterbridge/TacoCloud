package sia.tacocloud.Repository;

import org.springframework.stereotype.Repository;
import sia.tacocloud.Ingredient;

@Repository
public class JdbcIngredientRepository implements IngredientRepository {
    @Override
    public Iterable<Ingredient> findAll() {
        return null;
    }

    @Override
    public Ingredient findOne(String id) {
        return null;
    }

    @Override
    public Ingredient save(Ingredient ingredient) {
        return null;
    }
}
