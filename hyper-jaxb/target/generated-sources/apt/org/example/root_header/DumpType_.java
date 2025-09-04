package org.example.root_header;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DumpType.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class DumpType_ {

	
	/**
	 * @see org.example.root_header.DumpType#getDumpId
	 **/
	public static volatile SingularAttribute<DumpType, String> dumpId;
	
	/**
	 * @see org.example.root_header.DumpType
	 **/
	public static volatile EntityType<DumpType> class_;
	
	/**
	 * @see org.example.root_header.DumpType#getHjid
	 **/
	public static volatile SingularAttribute<DumpType, Long> hjid;

	public static final String DUMP_ID = "dumpId";
	public static final String HJID = "hjid";

}

