package com.xwx.entity;

import java.io.Serializable;
import java.util.Date;


public class Applicant implements Serializable {

	
	
	
	    /**
	    * @Fields serialVersionUID : 生成序列化id
	    */
	private static final long serialVersionUID = -6111181578804933476L;
	
	
	/**  **/
	private Integer id;
	/**  **/
	private String name;
	/**  **/
	private String gender;
	/**  **/
	private Date birthday;
	/**  **/
	private String college;
	/**  **/
	private String major;
	/**  **/
	private Integer edu;
	/**  **/
	private Integer degree;
	/**  **/
	private Date created;

	private Integer cj;//成绩
	private Integer pjf;//平均分
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Integer getEdu() {
		return edu;
	}
	public void setEdu(Integer edu) {
		this.edu = edu;
	}
	public Integer getDegree() {
		return degree;
	}
	public void setDegree(Integer degree) {
		this.degree = degree;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Integer getCj() {
		return cj;
	}
	public void setCj(Integer cj) {
		this.cj = cj;
	}
	public Integer getPjf() {
		return pjf;
	}
	public void setPjf(Integer pjf) {
		this.pjf = pjf;
	}
	@Override
	public String toString() {
		return "Applicant [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", college="
				+ college + ", major=" + major + ", edu=" + edu + ", degree=" + degree + ", created=" + created
				+ ", cj=" + cj + ", pjf=" + pjf + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Applicant other = (Applicant) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
