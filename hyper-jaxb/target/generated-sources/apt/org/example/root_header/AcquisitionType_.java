package org.example.root_header;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AcquisitionType.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class AcquisitionType_ {

	
	/**
	 * @see org.example.root_header.AcquisitionType#getAcquisitionId
	 **/
	public static volatile SingularAttribute<AcquisitionType, String> acquisitionId;
	
	/**
	 * @see org.example.root_header.AcquisitionType
	 **/
	public static volatile EntityType<AcquisitionType> class_;
	
	/**
	 * @see org.example.root_header.AcquisitionType#getHjid
	 **/
	public static volatile SingularAttribute<AcquisitionType, Long> hjid;

	public static final String ACQUISITION_ID = "acquisitionId";
	public static final String HJID = "hjid";

}

