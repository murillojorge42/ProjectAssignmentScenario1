import java.util.ArrayList;
import java.util.List;

/**
 * Created by hudoassenco on 12/6/15.
 */
public class TrendingFactory extends AnalysisAbstractFactory {

    private List<Stock> getNasdaqStocks() {
        List<Stock> stocks = new ArrayList<Stock>();

        stocks.add(new Stock(0, "AAL", "America Airlines Group Inc"));
        stocks.add(new Stock(1, "AAPL", "Apple Inc"));
        stocks.add(new Stock(2, "ADBE", "Adobe Systems Inc"));
        stocks.add(new Stock(3, "ADI", "Analog Devices Inc"));
        stocks.add(new Stock(4, "ADP", "Automatic Data Processing Inc"));

        return stocks;
    }

    private List<Stock> getNyseStocks() {
        List<Stock> stocks = new ArrayList<Stock>();

        stocks.add(new Stock(5, "AAC", "AAC Holdings Inc"));
        stocks.add(new Stock(6, "AAMC", "Altisource Asset Management Corp"));
        stocks.add(new Stock(7, "AAN", "Aaron's Inc"));
        stocks.add(new Stock(8, "AAP", "Advance Auto Parts Inc"));
        stocks.add(new Stock(9, "AAPRB", "Alcoa Inc Pref Share"));

        return stocks;
    }

    @Override
    public AnyContext createAnyContext() {
        StockContext context = new StockContext(0);

        StockMarket nasdaqMarket = new StockMarket(0);
        nasdaqMarket.setName("NASDAQ");
        nasdaqMarket.setCountryName("United States");
        nasdaqMarket.setOpenHour(9);
        nasdaqMarket.setCloseHour(16);
        nasdaqMarket.setEntities(getNasdaqStocks());

        StockMarket nyseMarket = new StockMarket(1);
        nyseMarket.setName("NYSE");
        nyseMarket.setOpenHour(9);
        nyseMarket.setCloseHour(16);
        nyseMarket.setEntities(getNyseStocks());

        context.addType(nasdaqMarket);
        context.addType(nyseMarket);

        return context;
    }

    @Override
    public AnyMechanism createAnyMechanism() {
        return new NumericalMechanism(0);
    }
}
