/**
 * 
 */
package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Category;

/**
 * @author matheus
 *
 */
public class CategoryDTO {
	
	private Long id;
	private String name;
	
	
	
	public CategoryDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public CategoryDTO(Category entity) {
		id = entity.getId();
		name = entity.getName();
	}



	public Long getId() {
		return id;
	}



	public String getName() {
		return name;
	}
	
	
	

}
