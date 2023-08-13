/**
 * 
 */
package com.devsuperior.aula.dto;

import java.util.HashSet;
import java.util.Set;

import com.devsuperior.aula.entities.Category;
import com.devsuperior.aula.entities.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

/**
 * @author matheus
 *
 */
@Entity
@Table(name = "tb_category")
public class CategoryDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
