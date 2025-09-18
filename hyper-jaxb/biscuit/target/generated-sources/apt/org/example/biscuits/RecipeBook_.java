package org.example.biscuits;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(RecipeBook.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class RecipeBook_ {

	
	/**
	 * @see org.example.biscuits.RecipeBook#getRecipe
	 **/
	public static volatile ListAttribute<RecipeBook, Recipe> recipe;
	
	/**
	 * @see org.example.biscuits.RecipeBook
	 **/
	public static volatile EntityType<RecipeBook> class_;
	
	/**
	 * @see org.example.biscuits.RecipeBook#getHjid
	 **/
	public static volatile SingularAttribute<RecipeBook, Long> hjid;

	public static final String RECIPE = "recipe";
	public static final String HJID = "hjid";

}

