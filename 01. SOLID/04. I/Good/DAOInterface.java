package Good;

// This is good, we will only include the DAO Operation.
// And we will segregate connection part so consumer can implement required interfaces.

public interface DAOInterface {
    public void createRecord();
    public void deleteRecord();
}
