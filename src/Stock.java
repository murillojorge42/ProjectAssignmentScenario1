/**
 * Created by hudoassenco on 12/6/15.
 */
public class Stock extends AnyEntity {
    
    private String mCode;
    private String mCompanyName;

    public Stock(int id, String code, String companyName) {
        super(id);
        mCode = code;
        mCompanyName = companyName;
    }

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }

    public String getCompanyName() {
        return mCompanyName;
    }

    public void setCompanyName(String companyName) {
        mCompanyName = companyName;
    }

    @Override
    public String toString() {
        return mCode+":"+mCompanyName;
    }
}
