package use_case.clear_users;

// TODO Complete me

import java.util.List;

public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData users);

    void prepareFailView(String error);
}
