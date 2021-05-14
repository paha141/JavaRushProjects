package patternmvc.view;

import patternmvc.bean.User;
import patternmvc.controller.Controller;
import patternmvc.model.ModelData;

public class UsersView implements View {

    private Controller controller;

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void refresh(ModelData modelData) {
        if (!modelData.isDisplayDeletedUserList())
        System.out.println("All users:");
        else System.out.println("All deleted users:");
        for (User u : modelData.getUsers()) {
            System.out.println("\t" + u.toString());
        }
        System.out.println("===================================================");

    }

    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() { controller.onShowAllDeletedUsers(); }

    public void fireEventOpenUserEditForm(long id) { controller.onOpenUserEditForm(id); }


}
