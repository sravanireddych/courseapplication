package com.jnit.domain;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="coursetable")
public class course implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String coursename;
	private String coursedescription;
	private String courseprerequsites;
	private String creationtime;
	private String changedtime;
	private String username;
	private int courseid;
	
	public enum skilllevel{
		BEGINNER,
		INTERMEDIATE,
		EXPERT;
	}
	
	 @OneToMany(mappedBy="course")
	 private Set<topic> topics;
	 
	 @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
     @JoinTable(name="course_users",joinColumns=@JoinColumn(name="CourseId", referencedColumnName="courseid"), inverseJoinColumns=@JoinColumn(name= "UserName", referencedColumnName="username"))
	 private Set<user> user;
	
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCoursedescription() {
		return coursedescription;
	}
	public void setCoursedescription(String coursedescription) {
		this.coursedescription = coursedescription;
	}
	public String getCourseprerequsites() {
		return courseprerequsites;
	}
	public void setCourseprerequsites(String courseprerequsites) {
		this.courseprerequsites = courseprerequsites;
	}
	
	public String getCreationtime() {
		return creationtime;
	}
	public void setCreationtime(String creationtime) {
		this.creationtime = creationtime;
	}
	public String getChangedtime() {
		return changedtime;
	}
	public void setChangedtime(String changedtime) {
		this.changedtime = changedtime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "course [coursename=" + coursename + ", coursedescription=" + coursedescription + ", courseprerequsites="
				+ courseprerequsites + ", creationtime=" + creationtime + ", changedtime=" + changedtime + ", username="
				+ username + ", courseid=" + courseid + ", topics=" + topics + ", user=" + user + "]";
	}
}
