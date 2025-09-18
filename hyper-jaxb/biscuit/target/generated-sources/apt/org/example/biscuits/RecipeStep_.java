package org.example.biscuits;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(RecipeStep.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class RecipeStep_ {

	
	/**
	 * @see org.example.biscuits.RecipeStep#getDuration
	 **/
	public static volatile SingularAttribute<RecipeStep, String> duration;
	
	/**
	 * @see org.example.biscuits.RecipeStep#getInstruction
	 **/
	public static volatile SingularAttribute<RecipeStep, String> instruction;
	
	/**
	 * @see org.example.biscuits.RecipeStep#getStepNumber
	 **/
	public static volatile SingularAttribute<RecipeStep, Integer> stepNumber;
	
	/**
	 * @see org.example.biscuits.RecipeStep
	 **/
	public static volatile EntityType<RecipeStep> class_;
	
	/**
	 * @see org.example.biscuits.RecipeStep#getHjid
	 **/
	public static volatile SingularAttribute<RecipeStep, Long> hjid;

	public static final String DURATION = "duration";
	public static final String INSTRUCTION = "instruction";
	public static final String STEP_NUMBER = "stepNumber";
	public static final String HJID = "hjid";

}

