package org.example.biscuits;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ChocolateBiscuit.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ChocolateBiscuit_ extends org.example.biscuits.AbstractBiscuit_ {

	
	/**
	 * @see org.example.biscuits.ChocolateBiscuit#getCocoaContent
	 **/
	public static volatile SingularAttribute<ChocolateBiscuit, Integer> cocoaContent;
	
	/**
	 * @see org.example.biscuits.ChocolateBiscuit
	 **/
	public static volatile EntityType<ChocolateBiscuit> class_;

	public static final String COCOA_CONTENT = "cocoaContent";

}

