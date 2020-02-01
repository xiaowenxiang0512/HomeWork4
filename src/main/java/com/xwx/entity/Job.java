package com.xwx.entity;

import java.io.Serializable;

public class Job implements Serializable {

	
	    /**
	    * @Fields serialVersionUID : 生成序列化id
	    */
	    
	private static final long serialVersionUID = -5753925105002413216L;
	/**  **/
	private Integer id;
	/**  **/ 
	private String name;
	/** 最低学历要求 **/
	private Integer require_edu;
	/** 最低学位要求 **/
	private Integer require_degree;
	/**  **/
	private String intro;
	@Override
	public String toString() {
		return "Job [id=" + id + ", name=" + name + ", require_edu=" + require_edu + ", require_degree="
				+ require_degree + ", intro=" + intro + "]";
	}
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
	public Integer getRequire_edu() {
		return require_edu;
	}
	public void setRequire_edu(Integer require_edu) {
		this.require_edu = require_edu;
	}
	public Integer getRequire_degree() {
		return require_degree;
	}
	public void setRequire_degree(Integer require_degree) {
		this.require_degree = require_degree;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
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
		Job other = (Job) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
