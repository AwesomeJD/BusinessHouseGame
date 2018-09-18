package com.game.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.game.context.GameBoard;
import com.game.model.Cell;
import com.game.model.EmptyCell;
import com.game.model.HotelCell;
import com.game.model.Input;
import com.game.model.JailCell;
import com.game.model.LotteryCell;
import com.game.model.Player;
import com.game.processor.StrategyProcessor;
import com.game.service.GamePlayService;

public class Client {

	public static void main(String[] args) {

		GameBoard gameBoard = new GameBoard();

		List<Cell> cells = getCells();
		gameBoard.setCells(cells);

		addPlayers(gameBoard);
		
		GamePlayService service = new GamePlayService(gameBoard, new StrategyProcessor());
		List<Input> inputvalues = getInputValues();

		for (Input input : inputvalues) {
			service.play(input.getPlayerName(), input.getCellValue());
		}

		printResult(gameBoard);

	}

	private static void addPlayers(GameBoard gameBoard) {
		Player player1 = new Player("Player-1");
		Player player2 = new Player("Player-2");
		Player player3 = new Player("Player-3");
		Map<String, Player> playerMap = new HashMap<>();
		playerMap.put("Player-1", player1);
		playerMap.put("Player-2", player2);
		playerMap.put("Player-3", player3);
		gameBoard.setPlayers(playerMap);
	}

	private static List<Cell> getCells() {
		List<Cell> cells = new ArrayList<>();
		cells.add(new JailCell(0));
		cells.add(new HotelCell(1));
		cells.add(new LotteryCell(2));
		cells.add(new HotelCell(3));
		cells.add(new EmptyCell(4));
		cells.add(new LotteryCell(5));
		cells.add(new HotelCell(6));
		cells.add(new LotteryCell(7));
		cells.add(new HotelCell(8));
		cells.add(new JailCell(9));
		return cells;
	}

	private static List<Input> getInputValues() {
		List<Input> inputvalues = new ArrayList<>();
		inputvalues.add(new Input("Player-1", 2));
		inputvalues.add(new Input("Player-2", 2));
		inputvalues.add(new Input("Player-3", 1));

		inputvalues.add(new Input("Player-1", 4));
		inputvalues.add(new Input("Player-2", 4));
		inputvalues.add(new Input("Player-3", 2));

		inputvalues.add(new Input("Player-1", 4));
		inputvalues.add(new Input("Player-2", 4));
		inputvalues.add(new Input("Player-3", 2));

		inputvalues.add(new Input("Player-1", 2));
		inputvalues.add(new Input("Player-2", 2));
		inputvalues.add(new Input("Player-3", 1));

		inputvalues.add(new Input("Player-1", 4));
		inputvalues.add(new Input("Player-2", 4));
		inputvalues.add(new Input("Player-3", 2));

		inputvalues.add(new Input("Player-1", 4));
		inputvalues.add(new Input("Player-2", 4));
		inputvalues.add(new Input("Player-3", 2));

		inputvalues.add(new Input("Player-1", 2));
		inputvalues.add(new Input("Player-2", 2));
		inputvalues.add(new Input("Player-3", 1));
		return inputvalues;
	}

	private static void printResult(GameBoard gameBoard) {
		Collection<Player> result = gameBoard.getPlayers().values();
		for (Player player : result) {
			StringBuilder sb = new StringBuilder();
			sb.append(player.getName());
			sb.append(" has total money ");
			sb.append(player.getMoney());
			sb.append(" and asset value of amount :  ");
			sb.append(player.getAssetValue());
			System.out.println(sb.toString());
		}
	}
}
