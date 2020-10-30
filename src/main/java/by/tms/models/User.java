package by.tms.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotBlank
    @Size(max = 15, min = 2)
    private String name;

    @NotBlank
    @Size
    private String login;

    @NotBlank
    @Size
    private String password;

    private long Id;

}
