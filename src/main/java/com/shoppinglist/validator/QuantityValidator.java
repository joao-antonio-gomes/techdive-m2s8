package com.shoppinglist.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.shoppinglist.validator.QuantityValidator")
public class QuantityValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object value) throws ValidatorException {
        Float valueParser = (Float) value;
        if (valueParser > 0) {
            return;
        }
        FacesMessage msg = new FacesMessage("Campo precisa ser um decimal maior que 0!");
        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ValidatorException(msg);
    }
}
