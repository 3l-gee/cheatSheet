package org.example.biscuits;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Notes.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Notes_ {

	
	/**
	 * @see org.example.biscuits.Notes#getLanguage
	 **/
	public static volatile SingularAttribute<Notes, String> language;
	
	/**
	 * @see org.example.biscuits.Notes
	 **/
	public static volatile EntityType<Notes> class_;
	
	/**
	 * @see org.example.biscuits.Notes#getValue
	 **/
	public static volatile SingularAttribute<Notes, String> value;
	
	/**
	 * @see org.example.biscuits.Notes#getHjid
	 **/
	public static volatile SingularAttribute<Notes, Long> hjid;

	public static final String LANGUAGE = "language";
	public static final String VALUE = "value";
	public static final String HJID = "hjid";

}

