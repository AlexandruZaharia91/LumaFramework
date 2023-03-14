package org.lumaSite.pages;


import org.lumaSite.pages.MyInfoComponents.Directory;

public class DirectoryPage {
    Directory directory = new Directory();

    public void directoryPage(String value){
        directory.setValue(value);
        directory.employeeName();
        directory.listofRecords();
        directory.reset();
        directory.jobTitle();

    }
}
