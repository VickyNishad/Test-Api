package com.test.model;





public class User {
	private String name;
	private String job;
	private String Id;
	private String createdAt;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", job=" + job + ", Id=" + Id + ", createdAt=" + createdAt + "]";
	}
	
	

}
