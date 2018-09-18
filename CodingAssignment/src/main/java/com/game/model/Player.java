package com.game.model;

import java.util.ArrayList;
import java.util.List;

import com.game.constants.Constants;

public class Player {

	private Integer money;
	private String name;
	private Integer lastPoint;
	private Integer assetValue;

	public Player(String name) {
		super();
		this.name = name;
		this.money = Constants.INITIAL_PLAYER_MONEY;
		this.lastPoint = 0;
		this.hotels = new ArrayList<>();
	}

	private List<Hotel> hotels;

	public Integer addMout(Integer newAmount) {
		money = money + newAmount;
		return money;
	}

	public Integer subStractAmount(Integer newAmount) {
		money = money - newAmount;
		return money;
	}

	public Integer addAssetAmout(Integer newAmount) {
		this.assetValue = this.assetValue + newAmount;
		return assetValue;
	}

	public Integer subStractAssetAmount(Integer newAmount) {
		this.assetValue = this.assetValue - newAmount;
		return assetValue;
	}

	public Integer getMoney() {
		return money;
	}

	public String getName() {
		return name;
	}

	public Integer getLastPoint() {
		return lastPoint;
	}

	public void setLastPoint(Integer lastPoint) {
		this.lastPoint = lastPoint;
	}

	public Integer getAssetValue() {
		return assetValue;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void addHotel(Hotel hotel) {
		this.hotels.add(hotel);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Player other = (Player) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
