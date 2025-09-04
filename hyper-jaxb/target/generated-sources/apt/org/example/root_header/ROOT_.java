package org.example.root_header;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ROOT.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ROOT_ {

	
	/**
	 * @see org.example.root_header.ROOT#getName
	 **/
	public static volatile SingularAttribute<ROOT, String> name;
	
	/**
	 * @see org.example.root_header.ROOT#getDataBlock
	 **/
	public static volatile ListAttribute<ROOT, DataBlock> dataBlock;
	
	/**
	 * @see org.example.root_header.ROOT#getHeader
	 **/
	public static volatile SingularAttribute<ROOT, HeaderType> header;
	
	/**
	 * @see org.example.root_header.ROOT
	 **/
	public static volatile EntityType<ROOT> class_;
	
	/**
	 * @see org.example.root_header.ROOT#getHjid
	 **/
	public static volatile SingularAttribute<ROOT, Long> hjid;

	public static final String NAME = "name";
	public static final String DATA_BLOCK = "dataBlock";
	public static final String HEADER = "header";
	public static final String HJID = "hjid";

}

