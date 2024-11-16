package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VerificationPages {
    private SelenideElement codeElement = $("[data-test-id='code'] input");
    private SelenideElement codeClick = $("[data-test-id='action-verify']");

    public VerificationPages() {
        codeElement.shouldBe(visible);
    }

    public DashboardPage validVerify(DataHelper.VerificatinCode verificatinCode) {
        codeElement.setValue(verificatinCode.getCode());
        codeClick.click();
        return new DashboardPage();
    }

}
