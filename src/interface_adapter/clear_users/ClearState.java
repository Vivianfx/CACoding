package interface_adapter.clear_users;

import java.util.ArrayList;
import java.util.List;

public class ClearState {

    private List<String> users = new ArrayList<String>();

    private String clearError = null;

    public ClearState(ClearState copy) {
        users = copy.users;
    }

    public ClearState() {}

    public List<String> getUsers() { return users; }

    public String getClearError() { return clearError; }

    public void setUsers(List<String> users) { this.users = users; }

    public void setClearError(String clearError) { this.clearError = clearError; }
}
