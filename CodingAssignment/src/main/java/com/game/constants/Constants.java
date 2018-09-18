package com.game.constants;

import com.game.model.Hotel;

public class Constants {

	public static final int INITIAL_BANK_MONEY = 5000;
	public static final int INITIAL_PLAYER_MONEY = 1000;
	public static final int JAIL_FINE_MONEY = 150;
	public static final int LOTTERY_VALUE_MONEY = 200;

	// Hotel costs
	public static final int SILVER_VALUE_MONEY = 200;
	public static final int GOLD_VALUE_MONEY = 300;
	public static final int PLATINUM_VALUE_MONEY = 500;

	public static final int SILVER_RENT_MONEY = 50;
	public static final int GOLD_RENT_MONEY = 150;
	public static final int PLATINUM_RENT_MONEY = 300;

	public static Hotel getHotel(HotelType type) {
		if (HotelType.SILVER.equals(type)) {
			return new Hotel(HotelType.SILVER, Constants.SILVER_VALUE_MONEY, Constants.SILVER_RENT_MONEY);
		} else if (HotelType.GOLD.equals(type)) {
			return new Hotel(HotelType.GOLD, Constants.GOLD_VALUE_MONEY, Constants.GOLD_RENT_MONEY);
		} else if (HotelType.PLATINUM.equals(type)) {
			return new Hotel(HotelType.PLATINUM, Constants.PLATINUM_VALUE_MONEY, Constants.PLATINUM_RENT_MONEY);
		} else
			return null;
	}
}
