package org.example.biscuits;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(SweetenerChoice.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class SweetenerChoice_ {

	
	/**
	 * @see org.example.biscuits.SweetenerChoice#getHoney
	 **/
	public static volatile SingularAttribute<SweetenerChoice, IngredientAmount> honey;
	
	/**
	 * @see org.example.biscuits.SweetenerChoice#getSyrup
	 **/
	public static volatile SingularAttribute<SweetenerChoice, IngredientAmount> syrup;
	
	/**
	 * @see org.example.biscuits.SweetenerChoice
	 **/
	public static volatile EntityType<SweetenerChoice> class_;
	
	/**
	 * @see org.example.biscuits.SweetenerChoice#getSugar
	 **/
	public static volatile SingularAttribute<SweetenerChoice, IngredientAmount> sugar;
	
	/**
	 * @see org.example.biscuits.SweetenerChoice#getHjid
	 **/
	public static volatile SingularAttribute<SweetenerChoice, Long> hjid;

	public static final String HONEY = "honey";
	public static final String SYRUP = "syrup";
	public static final String SUGAR = "sugar";
	public static final String HJID = "hjid";

}

