package org.example.biscuits;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Ingredients.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Ingredients_ {

	
	/**
	 * @see org.example.biscuits.Ingredients#getAmount
	 **/
	public static volatile SingularAttribute<Ingredients, IngredientAmount> amount;
	
	/**
	 * @see org.example.biscuits.Ingredients#getName
	 **/
	public static volatile SingularAttribute<Ingredients, String> name;
	
	/**
	 * @see org.example.biscuits.Ingredients
	 **/
	public static volatile EntityType<Ingredients> class_;
	
	/**
	 * @see org.example.biscuits.Ingredients#getHjid
	 **/
	public static volatile SingularAttribute<Ingredients, Long> hjid;
	
	/**
	 * @see org.example.biscuits.Ingredients#getAllergens
	 **/
	public static volatile ListAttribute<Ingredients, String> allergens;

	public static final String AMOUNT = "amount";
	public static final String NAME = "name";
	public static final String HJID = "hjid";
	public static final String ALLERGENS = "allergens";

}

