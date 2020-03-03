package com.cubic.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class CustomerEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@Column(name = "name")
		private String name;

		@Column(name = "email")
		private String email;

		@Column(name = "address")
		private String address;

		@Column(name = "city")
		private String city;

		@Column(name = "state")
		private String state;

		@Column(name = "zipcode")
		private String zipcode;
		
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getZipcode() {
			return zipcode;
		}

		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}

		@Override
		public String toString() {
			return "CustomerEntity [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", city="
					+ city + ", state=" + state + ", zipcode=" + zipcode + "]";
		}


}
