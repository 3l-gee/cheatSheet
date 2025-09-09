package org.example.biscuits;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AbstractBiscuit.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class AbstractBiscuit_ {

	
	/**
	 * @see org.example.biscuits.AbstractBiscuit#getShape
	 **/
	public static volatile SingularAttribute<AbstractBiscuit, BiscuitShape> shape;
	
	/**
	 * @see org.example.biscuits.AbstractBiscuit#getFlour
	 **/
	public static volatile SingularAttribute<AbstractBiscuit, FlourType> flour;
	
	/**
	 * @see org.example.biscuits.AbstractBiscuit
	 **/
	public static volatile EntityType<AbstractBiscuit> class_;
	
	/**
	 * @see org.example.biscuits.AbstractBiscuit#getHjid
	 **/
	public static volatile SingularAttribute<AbstractBiscuit, Long> hjid;

	public static final String SHAPE = "shape";
	public static final String FLOUR = "flour";
	public static final String HJID = "hjid";

}

