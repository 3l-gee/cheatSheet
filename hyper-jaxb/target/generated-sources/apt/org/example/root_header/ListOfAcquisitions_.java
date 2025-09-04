package org.example.root_header;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ListOfAcquisitions.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ListOfAcquisitions_ {

	
	/**
	 * @see org.example.root_header.ListOfAcquisitions#getCount
	 **/
	public static volatile SingularAttribute<ListOfAcquisitions, Integer> count;
	
	/**
	 * @see org.example.root_header.ListOfAcquisitions#getAcquisition
	 **/
	public static volatile ListAttribute<ListOfAcquisitions, AcquisitionType> acquisition;
	
	/**
	 * @see org.example.root_header.ListOfAcquisitions
	 **/
	public static volatile EntityType<ListOfAcquisitions> class_;
	
	/**
	 * @see org.example.root_header.ListOfAcquisitions#getHjid
	 **/
	public static volatile SingularAttribute<ListOfAcquisitions, Long> hjid;

	public static final String COUNT = "count";
	public static final String ACQUISITION = "acquisition";
	public static final String HJID = "hjid";

}

