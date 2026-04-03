package org.example.root_header;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;

@StaticMetamodel(DistanceType.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class DistanceType_ {

	
	/**
	 * @see org.example.root_header.DistanceType#getUnit
	 **/
	public static volatile SingularAttribute<DistanceType, String> unit;
	
	/**
	 * @see org.example.root_header.DistanceType
	 **/
	public static volatile EntityType<DistanceType> class_;
	
	/**
	 * @see org.example.root_header.DistanceType#getValue
	 **/
	public static volatile SingularAttribute<DistanceType, BigDecimal> value;
	
	/**
	 * @see org.example.root_header.DistanceType#getHjid
	 **/
	public static volatile SingularAttribute<DistanceType, Long> hjid;

	public static final String UNIT = "unit";
	public static final String VALUE = "value";
	public static final String HJID = "hjid";

}

