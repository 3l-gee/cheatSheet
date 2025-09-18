package org.example.simplecase;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Person.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Person_ {

	
	/**
	 * @see org.example.simplecase.Person#getName
	 **/
	public static volatile SingularAttribute<Person, String> name;
	
	/**
	 * @see org.example.simplecase.Person#getTitle
	 **/
	public static volatile SingularAttribute<Person, String> title;
	
	/**
	 * @see org.example.simplecase.Person
	 **/
	public static volatile EntityType<Person> class_;
	
	/**
	 * @see org.example.simplecase.Person#getHjid
	 **/
	public static volatile SingularAttribute<Person, Long> hjid;
	
	/**
	 * @see org.example.simplecase.Person#getAge
	 **/
	public static volatile SingularAttribute<Person, String> age;

	public static final String NAME = "name";
	public static final String TITLE = "title";
	public static final String HJID = "hjid";
	public static final String AGE = "age";

}

