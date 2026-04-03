package org.example.biscuits;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;

@StaticMetamodel(IngredientAmount.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class IngredientAmount_ {

	
	/**
	 * @see org.example.biscuits.IngredientAmount#getUnit
	 **/
	public static volatile SingularAttribute<IngredientAmount, String> unit;
	
	/**
	 * @see org.example.biscuits.IngredientAmount
	 **/
	public static volatile EntityType<IngredientAmount> class_;
	
	/**
	 * @see org.example.biscuits.IngredientAmount#getValue
	 **/
	public static volatile SingularAttribute<IngredientAmount, BigDecimal> value;
	
	/**
	 * @see org.example.biscuits.IngredientAmount#getHjid
	 **/
	public static volatile SingularAttribute<IngredientAmount, Long> hjid;

	public static final String UNIT = "unit";
	public static final String VALUE = "value";
	public static final String HJID = "hjid";

}

