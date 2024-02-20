package com.bookStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="MyBooks")
public class MyBookList {
	
	@Id
	private int id;
	private String name;
	private String author;
	private double price;
}
