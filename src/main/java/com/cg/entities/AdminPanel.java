package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="AdminPanel")
@Entity
public class AdminPanel {
	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String Name;
		private int Age;
		private int ContactNum;
		private String Address;
		
		
		public int getId() 
		{
			return id;
		}
		public void setId(int id) 
		{
			this.id = id;
		}
		public String getName() 
		{
			return Name;
		}
		public void setName(String name) 
		{
			Name = name;
		}
		public int getContactNum() 
		{
			return ContactNum;
		}
		public void setContactNum(int contactNum) 
		{
			ContactNum = contactNum;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		@Override
		public String toString() {
			return "AdminPanel [id=" + id + ", Name=" + Name + ", Age=" + Age + ", ContactNum=" + ContactNum
					+ ", Address=" + Address + "]";
		}
		
	}


