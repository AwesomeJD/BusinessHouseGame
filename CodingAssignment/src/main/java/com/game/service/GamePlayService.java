package com.game.service;

import com.game.context.Chance;
import com.game.context.GameBoard;
import com.game.model.Cell;
import com.game.model.Player;
import com.game.processor.StrategyProcessor;
import com.game.strategies.EmptyCellStrategy;
import com.game.strategies.HotelCellStrategy;
import com.game.strategies.JailCellStrategy;
import com.game.strategies.LotteryCellStrategy;

public class GamePlayService {

	private GameBoard gameBoard;
	private StrategyProcessor strategyProcessor;

	public GamePlayService(GameBoard gameBoard, StrategyProcessor strategyProcessor) {
		super();
		this.gameBoard = gameBoard;
		this.strategyProcessor = strategyProcessor;
	}

	public void play(String playerName, Integer diceValue) {

		Player player = gameBoard.getPlayers().get(playerName);
		Cell cell = GamePlayServiceHelper.getCellFromGameBoard(gameBoard, player, diceValue);

		Chance context = new Chance(player, cell, diceValue);

		switch (cell.getCellType()) {

		case JAIL:
			strategyProcessor.process(new JailCellStrategy(context, gameBoard));
			break;
		case LOTTERY:
			strategyProcessor.process(new LotteryCellStrategy(context, gameBoard));
			break;
		case HOTEL:
			strategyProcessor.process(new HotelCellStrategy(context, gameBoard));
			break;
		case EMPTY:
			strategyProcessor.process(new EmptyCellStrategy(context, gameBoard));
			break;
		}
	}
}
