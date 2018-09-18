package com.game.service;

import com.game.context.GameBoard;
import com.game.model.Cell;
import com.game.model.Player;

public class GamePlayServiceHelper {

	public static Cell getCellFromGameBoard(GameBoard gameBoard, Player player, Integer cellIndex) {
		Integer lastIndex = player.getLastPoint();
		return gameBoard.getCells().get(lastIndex + cellIndex);
	}
}
