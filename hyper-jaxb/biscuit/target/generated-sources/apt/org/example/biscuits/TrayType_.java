package org.example.biscuits;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;

@StaticMetamodel(TrayType.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class TrayType_ {

	
	/**
	 * @see org.example.biscuits.TrayType#getMaterial
	 **/
	public static volatile SingularAttribute<TrayType, String> material;
	
	/**
	 * @see org.example.biscuits.TrayType#getLength
	 **/
	public static volatile SingularAttribute<TrayType, BigDecimal> length;
	
	/**
	 * @see org.example.biscuits.TrayType#getWidth
	 **/
	public static volatile SingularAttribute<TrayType, BigDecimal> width;
	
	/**
	 * @see org.example.biscuits.TrayType
	 **/
	public static volatile EntityType<TrayType> class_;
	
	/**
	 * @see org.example.biscuits.TrayType#getHjid
	 **/
	public static volatile SingularAttribute<TrayType, Long> hjid;

	public static final String MATERIAL = "material";
	public static final String LENGTH = "length";
	public static final String WIDTH = "width";
	public static final String HJID = "hjid";

}

