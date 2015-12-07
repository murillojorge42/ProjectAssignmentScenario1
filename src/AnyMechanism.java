/**
 * Created by hudoassenco on 12/6/15.
 */
public abstract class AnyMechanism {

    protected int mId;
    protected AnyAspect mAnyAspect;

    public AnyMechanism(int id, AnyAspect anyAspect) {
        mId = id;
        mAnyAspect = anyAspect;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public AnyAspect getAnyAspect() {
        return mAnyAspect;
    }

    public void setAnyAspect(AnyAspect anyAspect) {
        mAnyAspect = anyAspect;
    }

    public abstract AnyForm produceReport(AnyContext context);


}
