import java.util.List;

/**
 * Created by hudoassenco on 12/6/15.
 */
public abstract class AnyContext {

    protected int mId;

    public AnyContext(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public abstract List<? extends AnyType> getTypes();
    public abstract void setTypes(List<? extends AnyType> types);
    public abstract void addType(AnyType type);
    public abstract boolean removeType(AnyType type);
}
