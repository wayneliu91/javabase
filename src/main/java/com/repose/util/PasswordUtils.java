package com.repose.util;

import com.repose.annotations.UseCase;

import java.util.List;

/**
 * @author 11629
 */
public class PasswordUtils {

    @UseCase(id = 47, description = "密码至少包含一个数字")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49, description = "新密民不能等于旧密码")
    public boolean checkForNewPassword(List<String> prevPassword, String password) {
        return !prevPassword.contains(password);
    }

}
