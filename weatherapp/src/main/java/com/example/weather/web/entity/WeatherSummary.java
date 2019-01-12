package com.example.weather.web.entity;

import javax.persistence.*;

@Entity
public class WeatherSummary {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String country;

	@Column
	private String city;

	@Column
	private Integer code;

	@Column
	private String icon;

	@Column
	private double temperature;

	@Column
	private Long timestamp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public WeatherSummary(){

	}

	public WeatherSummary(String country, String city, Integer code, String icon, double temperature) {
		this.country = country;
		this.city = city;
		this.code = code;
		this.icon = icon;
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "WeatherSummary{" +
				"id=" + id +
				", country='" + country + '\'' +
				", city='" + city + '\'' +
				", code=" + code +
				", icon='" + icon + '\'' +
				", temperature=" + temperature +
				'}';
	}
}
