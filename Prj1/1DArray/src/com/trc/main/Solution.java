package com.trc.main;

import java.util.Scanner;

public class Solution {

	public static boolean canWin(int leap, int[] game) {
		try {
			int gamelen = game.length;
			int i = 0;
			while((i + leap) < gamelen) {
				if (game[i + leap] == 0) {
					i = i + leap;
					continue;
				} else if (game[i + 1] == 0) {
					i = i + 1;
					continue;
				} else if (game[i - 1] == 0) {
					i = i - 1;
					if (i == 0)
						return false;
					continue;
				} else
					return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}
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