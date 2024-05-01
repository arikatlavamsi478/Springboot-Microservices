package com.example.SpringRestApi.entity;

import javax.persistence.*;

import lombok.Data;
@Data
@Entity
@Table(name="REST_ACTOR")
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer actorId;
	@Column
	private String actorName;
	@Column
	private String category;
	@Column
	private Long mobileNo;

}
