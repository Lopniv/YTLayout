package com.example.ytlayout.model;

public class Menu {
    private int icon;
    private String titleText, desc;

    public Menu(int icon, String titleText, String desc) {
        this.icon = icon;
        this.titleText = titleText;
        this.desc = desc;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
