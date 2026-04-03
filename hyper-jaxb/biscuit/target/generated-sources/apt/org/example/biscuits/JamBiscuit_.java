package org.example.biscuits;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(JamBiscuit.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class JamBiscuit_ extends org.example.biscuits.AbstractBiscuit_ {

	
	/**
	 * @see org.example.biscuits.JamBiscuit#getJamFlavor
	 **/
	public static volatile SingularAttribute<JamBiscuit, String> jamFlavor;
	
	/**
	 * @see org.example.biscuits.JamBiscuit
	 **/
	public static volatile EntityType<JamBiscuit> class_;

	public static final String JAM_FLAVOR = "jamFlavor";

}

