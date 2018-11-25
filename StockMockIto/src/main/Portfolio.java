package main;

import java.util.List;

public class Portfolio implements PortfolioInterface {
		private StockService stockService;
	   private List<Stock> stocks;

	   /* (non-Javadoc)
	 * @see main.PortfolioInterface#getStockService()
	 */
	@Override
	public StockService getStockService() {
	      return stockService;
	   }
	   
	   /* (non-Javadoc)
	 * @see main.PortfolioInterface#setStockService(main.StockService)
	 */
	@Override
	public void setStockService(StockService stockService) {
	      this.stockService = stockService;
	   }

	   /* (non-Javadoc)
	 * @see main.PortfolioInterface#getStocks()
	 */
	@Override
	public List<Stock> getStocks() {
	      return stocks;
	   }

	   /* (non-Javadoc)
	 * @see main.PortfolioInterface#setStocks(java.util.List)
	 */
	@Override
	public void setStocks(List<Stock> stocks) {
	      this.stocks = stocks;
	   }

	   /* (non-Javadoc)
	 * @see main.PortfolioInterface#getMarketValue()
	 */
	@Override
	public double getMarketValue(){
	      double marketValue = 0.0;
	      
	      for(Stock stock:stocks){
	         marketValue += stockService.getPrice(stock) * stock.getQuantity();
	      }
	      return marketValue;
	   }

}
