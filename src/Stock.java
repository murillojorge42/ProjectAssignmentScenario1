/**
 * Created by hudoassenco on 12/6/15.
 */
public class Stock extends AnyEntity {
    
    private String mCode;
    private StockMarket mStockMarket;

    public Stock(int id, String code, StockMarket stockMarket) {
        super(id);
        mCode = code;
        mStockMarket = stockMarket;
    }

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }

    public StockMarket getStockMarket() {
        return mStockMarket;
    }

    public void setStockMarket(StockMarket stockMarket) {
        mStockMarket = stockMarket;
    }
}
