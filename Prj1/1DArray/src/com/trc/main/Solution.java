package com.trc.main;

import java.util.Scanner;

public class Solution {

	public static boolean canWin(int leap, int[] game) {
		boolean canWin = false;
		boolean backToIndexZero = false;

		int gamelen = game.length;
		for (int i = 0; i < gamelen;) {
			if (backToIndexZero && i == 0)
				return false;
			if ((i + leap) >= gamelen) {
				return true;
			}
			if ((i + leap) < gamelen) {
				if (game[i + leap] == 0) {
					i = i + leap;
					backToIndexZero = true;
					continue;
				} else if (game[i + 1] == 0) {
					i = i + 1;
					backToIndexZero = true;
					continue;
				} else if ((i - 1) != -1) {
					if (game[i - 1] == 0) {
						i = i - 1;
						backToIndexZero = true;
						continue;
					}
				} else
					return false;
			}
		}

		return canWin;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}
}