/**
 * Created by hudoassenco on 12/6/15.
 */
public class Analysis {

    private AnyContext mContext;
    private AnyMechanism mMechanism;

    public Analysis(AnyContext context, AnyMechanism mechanism) {
        mContext = context;
        mMechanism = mechanism;
    }

    public AnyForm doAnalysis() {
        return mMechanism.produceReport(mContext);
    }

    public AnyContext getContext() {
        return mContext;
    }

    public void setContext(AnyContext context) {
        mContext = context;
    }

    public AnyMechanism getMechanism() {
        return mMechanism;
    }

    public void setMechanism(AnyMechanism mechanism) {
        mMechanism = mechanism;
    }
}
