/**
 * Created by hudoassenco on 12/6/15.
 */
public class Person extends AnyActor {

    private String mName;

    public Person(int id, String userName, String password) {
        super(id, userName, password);
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
