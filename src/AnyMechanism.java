/**
 * Created by hudoassenco on 12/6/15.
 */
public abstract class AnyMechanism {

    protected int mId;

    public AnyMechanism(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public abstract AnyForm produceReport(AnyAspect aspect, AnyContext context);

}
