package com.mariuszilinskas.streamix.comms.email.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static com.mariuszilinskas.streamix.web.constant.ValidationMessages.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmailRequest {

    @NotBlank(message = "type " + CANNOT_BE_BLANK)
    private String type;

    @NotBlank(message = "firstName " + CANNOT_BE_BLANK)
    private String firstName;

    @NotBlank(message = "email " + CANNOT_BE_BLANK)
    @Email(message = INVALID_EMAIL)
    private String email;

}


