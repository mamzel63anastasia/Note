package com.example.note.model.form;

public class PageForm {
    private String namePage;
    private String textPage;

    private String shortText;

    public PageForm() {}

    public String getNamePage() {
        return namePage;
    }

    public void setNamePage(String namePage) {
        this.namePage = namePage;
    }

    public String getTextPage() {
        return textPage;
    }

    public void setTextPage(String textPage) {
        this.textPage = textPage;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }
}
