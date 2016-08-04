package com.jnit.domain;

import java.io.Serializable;
import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name= "users")
public class user implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String passwd;
    private LocalTime creationtime;
    private LocalTime changedtime;
    private String username;
    
    @ManyToMany
	
	private course course;
    
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public LocalTime getCreationtime() {
		return creationtime;
	}
	public void setCreationtime(LocalTime creationtime) {
		this.creationtime = creationtime;
	}
	@Override
	public String toString() {
		return "user [username=" + username + ", passwd=" + passwd + ", creationtime=" + creationtime + ", changedtime="
				+ changedtime + "]";
	}
	public LocalTime getChangedtime() {
		return changedtime;
	}
	public void setChangedtime(LocalTime changedtime) {
		this.changedtime = changedtime;
	}
	
    
    
}
