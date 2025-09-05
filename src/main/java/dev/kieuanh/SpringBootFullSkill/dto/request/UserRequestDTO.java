package dev.kieuanh.SpringBootFullSkill.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import dev.kieuanh.SpringBootFullSkill.util.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import static dev.kieuanh.SpringBootFullSkill.util.Gender.*;

@Getter
public class UserRequestDTO implements Serializable {
    @NotBlank(message = "firstName không được null, không được rỗng, và không chỉ chứa khoảng trắng.")
    private String firstName;
    @NotNull(message = "lastName Không được null, nhưng chuỗi rỗng \"\" vẫn ok.")
    private String lastName;
    @Email(message = "email is invalid")
    private String email;
//    @Pattern(regexp = "^[0-9]{10,11}$", message = "Phone number must be 10 or 11 digits")
    @PhoneNumber
    private String phone;

    @NotNull(message = "birdDate must be not null")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "MM/dd/yyyy")
    private Date birthDate;

    @NotEmpty
    List<String> permissions;

    //NEU LA ENUM THI SE KO DUNG @patter dc
    @EnumPattern(name = "status", regexp = "ACTIVE|INACTIVE|NONE")
    private UserStatus status;

    @GenderSubset(anyOf = {MALE, FEMALE, OTHER})
    private Gender gender;

    @NotNull(message = "type must be not null")
    @EnumValue(name = "type", enumClass = UserType.class)
    private String type;


}
