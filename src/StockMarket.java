import java.util.ArrayList;
import java.util.List;

/**
 * Created by hudoassenco on 12/6/15.
 */
public class StockMarket extends AnyType {

    private String mName;
    private String mCountryName;
    private int mOpenHour;
    private int mCloseHour;
    private List<Stock> mStocks;

    public StockMarket(int id) {
        super(id);
        mStocks = new ArrayList<Stock>();
    }

    @Override
    public List<? extends AnyEntity> getEntities() {
        return mStocks;
    }

    @Override
    public void setEntities(List<? extends AnyEntity> entities) {
        mStocks = (List<Stock>) entities;
    }

    @Override
    public void addEntity(AnyEntity entity) {
        mStocks.add((Stock) entity);
    }

    @Override
    public boolean removeEntity(AnyEntity entity) {
        return mStocks.remove(entity);
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getCountryName() {
        return mCountryName;
    }

    public void setCountryName(String countryName) {
        mCountryName = countryName;
    }

    public int getOpenHour() {
        return mOpenHour;
    }

    public void setOpenHour(int openHour) {
        mOpenHour = openHour;
    }

    public int getCloseHour() {
        return mCloseHour;
    }

    public void setCloseHour(int closeHour) {
        mCloseHour = closeHour;
    }

    @Override
    public String toString() {
        return mName;
    }
}
