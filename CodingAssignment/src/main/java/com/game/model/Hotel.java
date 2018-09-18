package com.game.model;

import com.game.constants.HotelType;

public class Hotel implements Comparable<Hotel> {

	private HotelType type;
	private Integer value;
	private Integer rent;

	private Integer indexValue;

	public Hotel(HotelType type, Integer value, Integer rent) {
		super();
		this.type = type;
		this.value = value;
		this.rent = rent;
	}

	public HotelType getType() {
		return type;
	}

	public void setType(HotelType type) {
		this.type = type;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getRent() {
		return rent;
	}

	public void setRent(Integer rent) {
		this.rent = rent;
	}

	public Integer getIndexValue() {
		return indexValue;
	}

	public void setIndexValue(Integer indexValue) {
		this.indexValue = indexValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Hotel other = (Hotel) obj;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public int compareTo(Hotel hotel) {
		return this.value.compareTo(hotel.getValue());
	}

}
