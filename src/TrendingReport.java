import java.util.Date;

/**
 * Created by hudoassenco on 12/6/15.
 */
public class TrendingReport extends AnyForm {

    private Stock mStock;

    private Date mLongestUpStartDate;
    private Date mLongestUpEndDate;

    private Date currentTrendStart;
    private float currentTrendCoefficient;

    public TrendingReport(int id) {
        super(id);
    }

    public Stock getStock() {
        return mStock;
    }

    public void setStock(Stock stock) {
        mStock = stock;
    }

    public Date getLongestUpStartDate() {
        return mLongestUpStartDate;
    }

    public void setLongestUpStartDate(Date longestUpStartDate) {
        mLongestUpStartDate = longestUpStartDate;
    }

    public Date getLongestUpEndDate() {
        return mLongestUpEndDate;
    }

    public void setLongestUpEndDate(Date longestUpEndDate) {
        mLongestUpEndDate = longestUpEndDate;
    }

    public Date getCurrentTrendStart() {
        return currentTrendStart;
    }

    public void setCurrentTrendStart(Date currentTrendStart) {
        this.currentTrendStart = currentTrendStart;
    }

    public float getCurrentTrendCoefficient() {
        return currentTrendCoefficient;
    }

    public void setCurrentTrendCoefficient(float currentTrendCoefficient) {
        this.currentTrendCoefficient = currentTrendCoefficient;
    }
}
