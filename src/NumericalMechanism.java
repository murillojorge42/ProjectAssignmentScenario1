import java.util.Date;
import java.util.List;

/**
 * Created by hudoassenco on 12/6/15.
 */
public class NumericalMechanism extends AnyMechanism {

    public NumericalMechanism(int id, AnyAspect anyAspect) {
        super(id, anyAspect);
    }

    @Override
    public AnyForm produceReport(AnyContext context) {
        TrendingAspect trendingAspect = (TrendingAspect) mAnyAspect;
        StockContext stockContext = (StockContext) context;
        TrendingReport report = new TrendingReport(0);

        final Stock stock = trendingAspect.getStock();
        final Date startDate = trendingAspect.getStartDate();
        final Date endDate = trendingAspect.getEndDate();
        List<Float> prices = stockContext.getStockPrice(stock, startDate, endDate);
        //TODO: Implement Statistical algorithm for trends

        report.setStock(stock);
        report.setCurrentTrendCoefficient(1.0f);
        report.setCurrentTrendStart(new Date());
        report.setLongestUpEndDate(new Date());
        report.setLongestUpStartDate(new Date());

        return report;
    }

}
