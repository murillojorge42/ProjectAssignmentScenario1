/**
 * Created by hudoassenco on 12/6/15.
 */
public abstract class AnyActor {

    protected int mId;
    protected String mUserName;
    protected String mPassword;

    public AnyActor(int id, String userName, String password) {
        mId = id;
        mUserName = userName;
        mPassword = password;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }
}
