/**
 * Created by hudoassenco on 12/6/15.
 */
public abstract class AnyForm {

    private int mId;

    public AnyForm(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }
}
