package com.api_rest.jpa_repository.validator;

import com.api_rest.jpa_repository.model.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidation  implements Validator {

    @Autowired
    private MessageSource messageSource;

    @Override
    public boolean supports(Class<?> clazz) {
        return UserDTO.class.isAssignableFrom(clazz);
    }
    @Override
    public void validate(Object target, Errors errors) {
        UserDTO userDTO = (UserDTO) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotBlank.userDTO.name",
                messageSource.getMessage("NotBlank.userDTO.name", null, LocaleContextHolder.getLocale()));

        // Validación manual
        if (userDTO.getLastName() == null || userDTO.getLastName().isBlank()) {
            String message = messageSource.getMessage("NotBlank.userDTO.lastName", null, LocaleContextHolder.getLocale());
            errors.rejectValue("lastName", "NotBlank.userDTO.lastName", message);
        }
    }
}
