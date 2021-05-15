package com.trc.main;

import java.util.Scanner;

public class Solution {

	int n;
	int[] game;
	int nQueries;
	int[] arrInsert;
	int delPos;

	public static void main(String[] args) {

	}

	public InputModel captureInput() {
		try {
			Scanner scan = new Scanner(System.in);
			n = scan.nextInt();

			game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			nQueries = scan.nextInt();
			arrInsert = new int[2];

			for (int i = 0; i < (2 * nQueries); i++) {
				String opType = scan.next();
				switch (opType.toUpperCase()) {
				case "INSERT":
					arrInsert[0] = scan.nextInt();
					arrInsert[1] = scan.nextInt();
					break;
				case "DELETE":
					delPos = scan.nextInt();
				}
			}
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return initInputModel();
	}

	private InputModel initInputModel() {
		InputModel inputModel = new InputModel();
		inputModel.setN(n);
		inputModel.setArrInsert(arrInsert);
		inputModel.setDelPos(delPos);
		inputModel.setGame(game);
		inputModel.setnQueries(nQueries);
		return inputModel;
	}
}
