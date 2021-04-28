package com.example.demo.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



 @Entity
public class Player {
	 @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	 @Column(name="nombre")
	private String name = "anonymous";
	 @Column(name="creacion")
	private java.sql.Timestamp creationDate = new java.sql.Timestamp(System.currentTimeMillis());
	 


	@OneToMany(cascade=CascadeType.ALL)
	 List <Game> games;
	
	public long getRankingPosition() {
		return rankingPosition;
	}
	public void setRankingPosition(long rankingPosition) {
		this.rankingPosition = rankingPosition;
	}
	public double getAverageSuccess() {
		return averageSuccess;
	}
	public void setAverageSuccess(double averageSuccess) {
		this.averageSuccess = averageSuccess;
	}
	private long rankingPosition;
	private double averageSuccess;
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

}
