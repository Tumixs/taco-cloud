package tumix.tacos.data;

import tumix.tacos.Ingredient;
import java.util.Optional;
// import org.springframework.data


public interface IngredientRepository{
    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
