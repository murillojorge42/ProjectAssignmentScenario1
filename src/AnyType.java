import java.util.List;

/**
 * Created by hudoassenco on 12/6/15.
 */
public abstract class AnyType {

    protected int mId;

    public AnyType(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public abstract List<? extends AnyEntity> getEntities();
    public abstract void setEntities(List<? extends AnyEntity> entities);
    public abstract void addEntity(AnyEntity entity);
    public abstract boolean removeEntity(AnyEntity entity);

}
