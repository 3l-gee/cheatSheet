package org.example.simplecase;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Group.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Group_ {

	
	/**
	 * @see org.example.simplecase.Group#getPerson
	 **/
	public static volatile ListAttribute<Group, PersonType> person;
	
	/**
	 * @see org.example.simplecase.Group
	 **/
	public static volatile EntityType<Group> class_;
	
	/**
	 * @see org.example.simplecase.Group#getHjid
	 **/
	public static volatile SingularAttribute<Group, Long> hjid;

	public static final String PERSON = "person";
	public static final String HJID = "hjid";

}

