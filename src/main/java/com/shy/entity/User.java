package com.shy.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	private Integer id;
	private String name;
	private String password;
	private Integer age;
	private Integer sex;
	private Set<Work> designSet = new HashSet<Work>();
//	private Set valuatorSet;
	private Integer sum;

	@Column(name="name", length=30, nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="password", length=20, nullable=false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="age", length=10)
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = 0;
		if (age != null) {
			this.age = age;
		}
	}

	@Column(name="sex", length=10)
	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = 0;
		if (sex != null) {
			this.sex = sex;
		}
	}
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public Set<Work> getDesignSet() {
		return designSet;
	}

	public void setDesignSet(Set<Work> designSet) {
		this.designSet = designSet;
	}
	
//	public Set getValuatorSet() {
//		return valuatorSet;
//	}
//
//	public void setValuatorSet(Set valuatorSet) {
//		this.valuatorSet = valuatorSet;
//	}

	@Column(name="sum", length=10)
	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	@Id
	//采用数据库自增方式生成主键
	//@GeneratedValue(strategy=GenerationType.AUTO)
//	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
