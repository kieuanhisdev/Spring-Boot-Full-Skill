package dev.kieuanh.SpringBootFullSkill.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import dev.kieuanh.SpringBootFullSkill.util.PhoneNumber;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

    public UserRequestDTO() {
    }

    public UserRequestDTO(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserRequestDTO(String firstName, String lastName, String email, String phone, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
