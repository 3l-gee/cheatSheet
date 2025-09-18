package org.example.biscuits;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(Recipe.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Recipe_ {

	
	/**
	 * @see org.example.biscuits.Recipe#getTray
	 **/
	public static volatile SingularAttribute<Recipe, TrayType> tray;
	
	/**
	 * @see org.example.biscuits.Recipe#getRecipeNotesItem
	 **/
	public static volatile SingularAttribute<Recipe, Notes> recipeNotesItem;
	
	/**
	 * @see org.example.biscuits.Recipe#getUpdatedItem
	 **/
	public static volatile SingularAttribute<Recipe, Date> updatedItem;
	
	/**
	 * @see org.example.biscuits.Recipe#getTitle
	 **/
	public static volatile SingularAttribute<Recipe, String> title;
	
	/**
	 * @see org.example.biscuits.Recipe#getSweetener
	 **/
	public static volatile SingularAttribute<Recipe, SweetenerChoice> sweetener;
	
	/**
	 * @see org.example.biscuits.Recipe#getBiscuitNotesItem
	 **/
	public static volatile SingularAttribute<Recipe, Notes> biscuitNotesItem;
	
	/**
	 * @see org.example.biscuits.Recipe#getSteps
	 **/
	public static volatile ListAttribute<Recipe, RecipeStep> steps;
	
	/**
	 * @see org.example.biscuits.Recipe#getHjid
	 **/
	public static volatile SingularAttribute<Recipe, Long> hjid;
	
	/**
	 * @see org.example.biscuits.Recipe#getDifficulty
	 **/
	public static volatile SingularAttribute<Recipe, String> difficulty;
	
	/**
	 * @see org.example.biscuits.Recipe#getIngredients
	 **/
	public static volatile ListAttribute<Recipe, Ingredients> ingredients;
	
	/**
	 * @see org.example.biscuits.Recipe#getCreatedItem
	 **/
	public static volatile SingularAttribute<Recipe, Date> createdItem;
	
	/**
	 * @see org.example.biscuits.Recipe
	 **/
	public static volatile EntityType<Recipe> class_;
	
	/**
	 * @see org.example.biscuits.Recipe#getBiscuitValue
	 **/
	public static volatile SingularAttribute<Recipe, AbstractBiscuit> biscuitValue;
	
	/**
	 * @see org.example.biscuits.Recipe#getBiscuitName
	 **/
	public static volatile SingularAttribute<Recipe, String> biscuitName;

	public static final String TRAY = "tray";
	public static final String RECIPE_NOTES_ITEM = "recipeNotesItem";
	public static final String UPDATED_ITEM = "updatedItem";
	public static final String TITLE = "title";
	public static final String SWEETENER = "sweetener";
	public static final String BISCUIT_NOTES_ITEM = "biscuitNotesItem";
	public static final String STEPS = "steps";
	public static final String HJID = "hjid";
	public static final String DIFFICULTY = "difficulty";
	public static final String INGREDIENTS = "ingredients";
	public static final String CREATED_ITEM = "createdItem";
	public static final String BISCUIT_VALUE = "biscuitValue";
	public static final String BISCUIT_NAME = "biscuitName";

}

