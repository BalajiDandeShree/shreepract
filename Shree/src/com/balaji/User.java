package com.balaji;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String name;
	private List<Integer> mobileNos;
	public User(String name) {
		super();
		this.name = name;
		this.mobileNos = new ArrayList<Integer>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User() {
		super();
		this.mobileNos = new ArrayList<Integer>();
	}
	
	public void setMobileNumbers(int... mobiles){
		
		for(int x:mobiles) {
			this.mobileNos.add(x);
		}
	}
		public List getMobile() {
			return mobileNos;
			
		}
	}
	
	
	
	


