package patternmvc.view;

import patternmvc.controller.Controller;
import patternmvc.model.ModelData;

public interface View {

    void refresh(ModelData modelData);

    void setController(Controller controller);
}
