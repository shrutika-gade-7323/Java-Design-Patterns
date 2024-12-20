package Bad;

// This DAO Interface is defined to support data access using file system or database system.
// So we have added openConnection and openFile for it.
// This is bad because we have accomodated all the operations in a single interface.

public interface BadDAOInterface {
    public void openConnection();
    public void createRecord();
    public void openFile();
    public void deleteRecord();
}
