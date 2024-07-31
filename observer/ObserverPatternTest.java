package observer;

public class ObserverPatternTest 
{
	 public static void main(String[] args) {
	        
	        StockMarket stockMarket = new StockMarket("TechCorp", 100.00);

	        
	        Observer mobileApp = new MobileApp("MobileApp1");
	        Observer webApp = new WebApp("WebApp1");

	        
	        stockMarket.registerObserver(mobileApp);
	        stockMarket.registerObserver(webApp);

	        
	        stockMarket.setStockPrice(105.00);

	        
	        stockMarket.deregisterObserver(mobileApp);
	        stockMarket.setStockPrice(110.00);
	    }
}
