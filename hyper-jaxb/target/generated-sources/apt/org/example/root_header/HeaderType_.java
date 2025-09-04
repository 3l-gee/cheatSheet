package org.example.root_header;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(HeaderType.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class HeaderType_ {

	
	/**
	 * @see org.example.root_header.HeaderType
	 **/
	public static volatile EntityType<HeaderType> class_;
	
	/**
	 * @see org.example.root_header.HeaderType#getHjid
	 **/
	public static volatile SingularAttribute<HeaderType, Long> hjid;
	
	/**
	 * @see org.example.root_header.HeaderType#getHeaderId
	 **/
	public static volatile SingularAttribute<HeaderType, String> headerId;

	public static final String HJID = "hjid";
	public static final String HEADER_ID = "headerId";

}

