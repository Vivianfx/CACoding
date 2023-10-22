package use_case.clear_users;

import java.util.List;

public class ClearOutputData {
    private final List<String> users;

    public ClearOutputData(List<String> users) {
        this.users = users;
    }

    public List<String> getUsers() { return users;}
}
