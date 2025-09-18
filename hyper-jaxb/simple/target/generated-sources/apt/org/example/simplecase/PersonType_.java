package org.example.simplecase;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(PersonType.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class PersonType_ {

	
	/**
	 * @see org.example.simplecase.PersonType#getName
	 **/
	public static volatile SingularAttribute<PersonType, String> name;
	
	/**
	 * @see org.example.simplecase.PersonType#getTitle
	 **/
	public static volatile SingularAttribute<PersonType, String> title;
	
	/**
	 * @see org.example.simplecase.PersonType
	 **/
	public static volatile EntityType<PersonType> class_;
	
	/**
	 * @see org.example.simplecase.PersonType#getHjid
	 **/
	public static volatile SingularAttribute<PersonType, Long> hjid;
	
	/**
	 * @see org.example.simplecase.PersonType#getAge
	 **/
	public static volatile SingularAttribute<PersonType, String> age;

	public static final String NAME = "name";
	public static final String TITLE = "title";
	public static final String HJID = "hjid";
	public static final String AGE = "age";

}

