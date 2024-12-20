package Bad;
public class BadDBDaoConnection implements BadDAOInterface{
    @Override
    public void openConnection() {
        // Connection Logic
    }

    @Override
    public void createRecord() {
        // Create Record Logic
    }

    @Override
    public void openFile() {
        // We are in DB Connection so no need to support open file
        throw new UnsupportedOperationException("Open File Not Supported");
    }

    @Override
    public void deleteRecord() {
        // This is Fine
    }
}
