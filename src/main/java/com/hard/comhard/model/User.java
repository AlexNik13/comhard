package com.hard.comhard.model;

import lombok.AllArgsConstructor;
import lombok.Data;

//уменьшение кода.
@Data // добаляет к классу досту к поля. sen/get и toString если она небыли созданы
@AllArgsConstructor // дает конструктор со всеми рапаметрами без его написания
public class User {
    private String login;
    private String password;
    private String firstname;
    private String lastname;
    private Integer age;
}
