package main;

import java.util.List;

public interface PortfolioInterface {

	StockService getStockService();

	void setStockService(StockService stockService);

	List<Stock> getStocks();

	void setStocks(List<Stock> stocks);

	double getMarketValue();

}