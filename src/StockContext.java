import com.sun.org.apache.bcel.internal.generic.FLOAD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by hudoassenco on 12/6/15.
 */
public class StockContext extends AnyContext{

    private Date mStartDate;
    private Date mEndDate;
    private List<StockMarket> mMarkets;

    public StockContext(int id) {
        super(id);
        mMarkets = new ArrayList<StockMarket>();
    }

    public Date getStartDate() {
        return mStartDate;
    }

    public void setStartDate(Date startDate) {
        mStartDate = startDate;
    }

    public Date getEndDate() {
        return mEndDate;
    }

    public void setEndDate(Date endDate) {
        mEndDate = endDate;
    }

    public List<Float> getStockPrice(Stock stock, Date initialDate, Date endDate) {
        List<Float> prices = new ArrayList<Float>();
        Calendar cal = Calendar.getInstance();

        cal.setTime(initialDate);
        int initialMonth = cal.get(Calendar.MONTH);
        int initialDay = cal.get(Calendar.DAY_OF_MONTH);
        int initialYear = cal.get(Calendar.YEAR);

        cal.setTime(endDate);
        int finalMonth = cal.get(Calendar.MONTH);
        int finalDay = cal.get(Calendar.DAY_OF_MONTH);
        int finalYear = cal.get(Calendar.YEAR);


        String quotes="http://ichart.finance.yahoo.com/table.csv?s="+
                stock.getCode()+"&d="+finalMonth+
                "&e="+finalDay+"&f="+finalYear+"&g=d&a="+
                initialMonth+"&b="+initialDay+"&c="+initialYear+"&ignore=.csv";
        try {
            URL url = new URL(quotes);
            URLConnection urlConn = url.openConnection();
            InputStreamReader inputStreamReader = new InputStreamReader(urlConn.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String nextLine = bufferedReader.readLine(); //header
            while(true) {
                nextLine = bufferedReader.readLine();
                if(nextLine != null) {
                    float closePrice = Float.valueOf(nextLine.split(",")[4]);
                    prices.add(closePrice);
                } else {
                    break;
                }
            }

            bufferedReader.close();
            inputStreamReader.close();
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

        return prices;
    }

    @Override
    public List<? extends AnyType> getTypes() {
        return mMarkets;
    }

    @Override
    public void setTypes(List<? extends AnyType> types) {
        mMarkets = (List<StockMarket>) types;
    }

    @Override
    public void addType(AnyType type) {
        mMarkets.add((StockMarket) type);
    }

    @Override
    public boolean removeType(AnyType type) {
        return mMarkets.remove(type);
    }
}
