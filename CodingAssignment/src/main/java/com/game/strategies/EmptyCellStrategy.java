package com.game.strategies;

import com.game.context.Chance;
import com.game.context.GameBoard;

public class EmptyCellStrategy implements CellStrategy {

	private Chance context;
	private GameBoard gameBoard;

	public EmptyCellStrategy(Chance context, GameBoard gameBoard) {
		super();
		this.context = context;
		this.gameBoard = gameBoard;
	}

	@Override
	public void process() {

	}

}
