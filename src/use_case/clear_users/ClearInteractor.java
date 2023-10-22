package use_case.clear_users;

import java.util.List;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface userDataAccessObject;

    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessObject,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = clearUserDataAccessObject;
        this.userPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData) {
        userDataAccessObject.deleteAll();
        ClearOutputData clearOutputData = new ClearOutputData(userDataAccessObject.getUsers());
        userPresenter.prepareSuccessView(clearOutputData);
    }
}
