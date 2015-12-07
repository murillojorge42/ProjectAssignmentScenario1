import java.util.Date;

/**
 * Created by hudoassenco on 12/6/15.
 */
public class TrendingAspect extends AnyAspect {

    private Stock mStock;
    private Date mStartDate;
    private Date mEndDate;

    public TrendingAspect(int id) {
        super(id);
    }

    public Stock getStock() {
        return mStock;
    }

    public void setStock(Stock stock) {
        mStock = stock;
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
}
