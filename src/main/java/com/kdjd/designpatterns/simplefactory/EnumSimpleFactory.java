package com.kdjd.designpatterns.simplefactory;

public enum EnumSimpleFactory {

    CIRCLE("0", "圆形"),
    RECTANGLE("1", "矩形"),
    SQUARE("2", "正方形");

    private String type;
    private String desc;

    EnumSimpleFactory(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
