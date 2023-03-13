package org.lumaSite.Enums;

public enum PageTextLuma {
    pageURL("https://magento.softwaretestingboard.com/"),
    whatsNewURL("https://magento.softwaretestingboard.com/what-is-new.html"),
    womenUrl("https://magento.softwaretestingboard.com/women.html"),
    menUrl("https://magento.softwaretestingboard.com/men.html"),
    gearUrl("https://magento.softwaretestingboard.com/gear.html"),
    trainingUrl("https://magento.softwaretestingboard.com/training.html"),
    saleUrl("https://magento.softwaretestingboard.com/sale.html"),
    whatsNewText("What's New"),
    womenText("Women"),
    menText("Men"),
    gearText("Gear"),
    trainingText("Training"),
    saleText("Sale"),
    createAccountText("Create New Customer Account"),
    customerLoginText("Customer Login"),
    errorMessageTextBox("This is a required field."),
    errorMessagePassword("Minimum of different classes of characters in password is 3. " +
            "Classes of characters: Lower Case, Upper Case, Digits, Special Characters."),
    errorEmaillogin("Minimum of different classes of characters in password is 3. " +
            "Classes of characters: Lower Case, Upper Case, Digits, Special Characters."),
    errorAccountmessage("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");

    private final String value;

    PageTextLuma(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }


}
