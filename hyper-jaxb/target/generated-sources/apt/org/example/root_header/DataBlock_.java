package org.example.root_header;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DataBlock.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class DataBlock_ {

	
	/**
	 * @see org.example.root_header.DataBlock#getSensingStartTime
	 **/
	public static volatile SingularAttribute<DataBlock, String> sensingStartTime;
	
	/**
	 * @see org.example.root_header.DataBlock#getSensingStopTime
	 **/
	public static volatile SingularAttribute<DataBlock, String> sensingStopTime;
	
	/**
	 * @see org.example.root_header.DataBlock#getListOfDumps
	 **/
	public static volatile SingularAttribute<DataBlock, ListOfDumps> listOfDumps;
	
	/**
	 * @see org.example.root_header.DataBlock#getType
	 **/
	public static volatile SingularAttribute<DataBlock, String> type;
	
	/**
	 * @see org.example.root_header.DataBlock
	 **/
	public static volatile EntityType<DataBlock> class_;
	
	/**
	 * @see org.example.root_header.DataBlock#getListOfAcquisitions
	 **/
	public static volatile SingularAttribute<DataBlock, ListOfAcquisitions> listOfAcquisitions;
	
	/**
	 * @see org.example.root_header.DataBlock#getHjid
	 **/
	public static volatile SingularAttribute<DataBlock, Long> hjid;

	public static final String SENSING_START_TIME = "sensingStartTime";
	public static final String SENSING_STOP_TIME = "sensingStopTime";
	public static final String LIST_OF_DUMPS = "listOfDumps";
	public static final String TYPE = "type";
	public static final String LIST_OF_ACQUISITIONS = "listOfAcquisitions";
	public static final String HJID = "hjid";

}

