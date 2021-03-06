package com.brunosouza.snackbar.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String description;

	@ManyToMany
	@JoinTable(name = "order_snack", joinColumns = { @JoinColumn(name = "id_order") }, inverseJoinColumns = {
			@JoinColumn(name = "id_snack") })
	private List<Snack> snacks;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Snack> getSnacks() {
		return snacks;
	}

	public void setSnacks(List<Snack> snacks) {
		this.snacks = snacks;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
