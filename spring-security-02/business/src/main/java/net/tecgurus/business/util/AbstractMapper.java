package net.tecgurus.business.util;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractMapper<D,E>{
	
	private Class<D> dtoClass;
	private Class<E> entityClass;
	private static final Logger log = LoggerFactory.getLogger(AbstractMapper.class);
	
	public AbstractMapper() {
		 this.dtoClass = (Class<D>) ((ParameterizedType) getClass()  
                 .getGenericSuperclass()).getActualTypeArguments()[0];  
	    this.entityClass = (Class<E>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[1];
	 }
	
	public D getDTO(E entity) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		D domain = dtoClass.newInstance();
		for(Field f : dtoClass.getDeclaredFields()) {
			try {
				f.setAccessible(true);
				String fieldName = f.getName();
				Field targetField = entity.getClass().getField(fieldName);
				targetField.setAccessible(true);
				Object value = targetField.get(entity);
				f.set(domain, value);
			}catch(Exception e) {
				log.error("Error extracting data: {}", e.getMessage());
			}
			
		}
		return domain;
	}
	
	public E getEntity(D dto) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		E entity = entityClass.newInstance();
		for(Field f : entityClass.getDeclaredFields()) {
			try {
				f.setAccessible(true);
				String fieldName = f.getName();
				Field targetField = dto.getClass().getField(fieldName);
				targetField.setAccessible(true);
				Object value = targetField.get(entity);
				f.set(entity, value);
			}catch(Exception e) {
				log.error("Error extracting data: {}", e.getMessage());
			}
			
		}
		return entity;
	}
}
