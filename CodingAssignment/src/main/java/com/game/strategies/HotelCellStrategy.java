package com.game.strategies;

import java.util.Comparator;
import java.util.Objects;

import com.game.constants.Constants;
import com.game.constants.HotelType;
import com.game.context.Chance;
import com.game.context.GameBoard;
import com.game.model.Cell;
import com.game.model.Hotel;
import com.game.model.Player;

public class HotelCellStrategy implements CellStrategy {

	private Chance context;
	private GameBoard gameBoard;

	public HotelCellStrategy(Chance context, GameBoard gameBoard) {
		super();
		this.context = context;
		this.gameBoard = gameBoard;
	}

	@Override
	public void process() {
		Player player = context.getPlayer();
		player.setLastPoint(player.getLastPoint() + context.getDiceValue());
		Cell cell = context.getCell();

		if (cell.getOwnedBy().equals(player)) {
			if (player.getHotels().isEmpty()) {
				if (player.getMoney() >= Constants.SILVER_VALUE_MONEY) {
					updateGameBoard(player, cell, HotelType.SILVER);
				}
			} else {
				if (cell.getCellIndex().equals(player.getLastPoint() + context.getDiceValue())) {
					Hotel hotel = player.getHotels().stream().max(Comparator.comparing(Hotel::getValue)).get();
					if (hotel.getType().equals(HotelType.SILVER)) {
						updateGameBoard(player, cell, HotelType.GOLD);
					} else if (hotel.getType().equals(HotelType.GOLD)) {
						updateGameBoard(player, cell, HotelType.PLATINUM);
					}
				}
			}
		} else {

			Player owner = cell.getOwnedBy();
			if(Objects.isNull(owner)) {
				return;
			}
			
			Integer cellIndex = cell.getCellIndex();
			for(Hotel hotel : owner.getHotels()) {
				
			}
			
		}
		gameBoard.setPlayer(player);
	}

	private void updateGameBoard(Player player, Cell cell, HotelType type) {
		Hotel newHotel = Constants.getHotel(type);
		newHotel.setIndexValue(cell.getCellIndex());
		player.addHotel(newHotel);
		gameBoard.addAmountToBank(newHotel.getValue());
		player.subStractAmount(newHotel.getValue());
		player.addAssetAmout(newHotel.getValue());
		cell.setOwnedBy(player);
		gameBoard.updateCell(cell.getCellIndex(), cell);
	}
}
