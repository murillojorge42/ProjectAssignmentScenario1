/**
 * Created by hudoassenco on 12/6/15.
 */
public abstract class AnyEntity {

    private int mId;

    public AnyEntity(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }
}
