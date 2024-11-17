package ru.netology.test;

import org.junit.jupiter.api.Test;
import ru.netology.data.DataHelper;
import ru.netology.page.LoginPage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NegativeTest {


    @Test
    void invalidPassword() {
        open("http:localhost:9999");
        var loginPage = new LoginPage();
        loginPage.invalidUser(DataHelper.getRandomPassword());
        loginPage.errorMessage("Ошибка! Неверно указан логин или пароль");


    }

    @Test
    void invalidLogin() {
        open("http:localhost:9999");
        var loginPage = new LoginPage();
        loginPage.invalidUser(DataHelper.getRandomLogin());
        loginPage.errorMessage("Ошибка! Неверно указан логин или пароль");

    }

}
