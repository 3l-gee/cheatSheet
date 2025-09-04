package org.example.root_header;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ListOfDumps.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ListOfDumps_ {

	
	/**
	 * @see org.example.root_header.ListOfDumps#getCount
	 **/
	public static volatile SingularAttribute<ListOfDumps, String> count;
	
	/**
	 * @see org.example.root_header.ListOfDumps#getDump
	 **/
	public static volatile ListAttribute<ListOfDumps, DumpType> dump;
	
	/**
	 * @see org.example.root_header.ListOfDumps
	 **/
	public static volatile EntityType<ListOfDumps> class_;
	
	/**
	 * @see org.example.root_header.ListOfDumps#getHjid
	 **/
	public static volatile SingularAttribute<ListOfDumps, Long> hjid;

	public static final String COUNT = "count";
	public static final String DUMP = "dump";
	public static final String HJID = "hjid";

}

