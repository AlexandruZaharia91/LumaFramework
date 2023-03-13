package org.lumaSite.pages;

import org.lumaSite.pages.MyInfoComponents.MyInfoPage;

public class MyInfo{
    MyInfoPage myInfoPage = new MyInfoPage();


    public void accessMyInfo() {
        myInfoPage.goToPage();
    }

    public void myInfo(String name, String middleName, String driverLicense, String nationality, String maritalStatus,
                       String gender, String bloodType, String fileName, String fileNameEdit) {

        myInfoPage.personalDetails().name(name);
        myInfoPage.personalDetails().middleName(middleName);
        myInfoPage.personalDetails().driverLicense(driverLicense);
        myInfoPage.personalDetails().licenseDate();
        myInfoPage.personalDetails().nationality(nationality);
        myInfoPage.personalDetails().maritalStatus(maritalStatus);
        myInfoPage.personalDetails().dateofBirth();
        myInfoPage.personalDetails().gender(gender);
        myInfoPage.personalDetails().smoker();
        myInfoPage.personalDetails().save();
        myInfoPage.personalDetails().bloodType(bloodType);
        myInfoPage.personalDetails().uploadDoc(fileName);
        //myInfoPage.personalDetails().edit(fileNameEdit);
        myInfoPage.personalDetails().deleteFile();



    }
}
