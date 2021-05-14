package patternmvc;


import patternmvc.controller.Controller;
import patternmvc.model.MainModel;
import patternmvc.model.Model;
import patternmvc.view.EditUserView;
import patternmvc.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        editUserView.fireEventUserChanged("NewName", 126L, 73);
        usersView.fireEventShowDeletedUsers();

    }
}