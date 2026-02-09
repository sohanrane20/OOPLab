package com.liang;

import java.util.Scanner;

class Stock {
	String symbol, name;
	double previousClosingPrice, currentPrice;
	Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
}
public class StockManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String symbol, name;
		System.out.print("Enter symbol of stock: ");
		symbol = input.nextLine();
		System.out.print("Enter name of stock: ");
		name = input.nextLine();
		Stock stock = new Stock(symbol, name);
		System.out.print("Enter previous closing price: ");
		stock.previousClosingPrice = input.nextDouble();
		System.out.print("Enter current price: ");
		stock.currentPrice = input.nextDouble();
		System.out.println("Change percent = " + stock.getChangePercent());
		input.close();
	}
}
