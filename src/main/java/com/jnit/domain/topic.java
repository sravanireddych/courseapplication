package com.jnit.domain;

import java.io.Serializable;
import java.time.Duration;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="topics")
public class topic implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private String topicname;
	private Duration topicduration;
	private String topicid;
	
	@ManyToOne
	@JoinColumn(name="CourseId")
	private course course;
	
	public course getCourse() {
		return course;
	}
	public void setCourse(course course) {
		this.course = course;
	}
	public String getTopicid() {
		return topicid;
	}
	public void setTopicid(String topicid) {
		this.topicid = topicid;
	}
	public String getTopicname() {
		return topicname;
	}
	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}
	public Duration getTopicduration() {
		return topicduration;
	}
	public void setTopicduration(Duration topicduration) {
		this.topicduration = topicduration;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "topic [topicname=" + topicname + ", topicduration=" + topicduration + ", topicid=" + topicid
				+ ", course=" + course + "]";
	}

	

}
