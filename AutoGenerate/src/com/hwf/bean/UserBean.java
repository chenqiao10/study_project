package com.hwf.bean;

public class UserBean{

	private	Integer	id;
	private	String	name;
	private	Integer	age;
	public	Integer	getId(){
		return	id;
	}
	public	String	getName(){
		return	name;
	}
	public	Integer	getAge(){
		return	age;
	}
	public void	setId(Integer id){
		this.id = id;
	}
	public void	setName(String name){
		this.name = name;
	}
	public void	setAge(Integer age){
		this.age = age;
	}
	public	UserBean(){
		super();
	}
	public UserBean(Integer id,String name,Integer age){
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}