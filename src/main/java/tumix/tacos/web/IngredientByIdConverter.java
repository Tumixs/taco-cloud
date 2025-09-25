package tumix.tacos.web;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import tumix.tacos.Ingredient;
import tumix.tacos.data.IngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient>{
    
	private IngredientRepository ingredientRepo;

	public IngredientByIdConverter(IngredientRepository ingredientRepo){
		this.ingredientRepo = ingredientRepo;
	}

	@Override 
	public Ingredient convert (String id) {
		return ingredientRepo.findById(id).orElse(null);
	}
	
}
