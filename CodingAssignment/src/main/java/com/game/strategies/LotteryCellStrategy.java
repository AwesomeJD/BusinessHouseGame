package com.game.strategies;

import com.game.constants.Constants;
import com.game.context.Chance;
import com.game.context.GameBoard;
import com.game.model.Player;

public class LotteryCellStrategy implements CellStrategy {

	private Chance context;
	private GameBoard gameBoard;

	public LotteryCellStrategy(Chance context, GameBoard gameBoard) {
		super();
		this.context = context;
		this.gameBoard = gameBoard;
	}

	@Override
	public void process() {
		gameBoard.substractAmountFromBank(Constants.LOTTERY_VALUE_MONEY);
		Player player = context.getPlayer();
		player.addMout(Constants.LOTTERY_VALUE_MONEY);
		player.setLastPoint(player.getLastPoint() + context.getDiceValue());
		gameBoard.setPlayer(player);
	}
}
