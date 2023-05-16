package com.kdjd.designpatterns.factory;

public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase(EnumFactory.CIRCLE.getType())) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase(EnumFactory.RECTANGLE.getType())) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase(EnumFactory.SQUARE.getType())) {
            return new Square();
        }
        return null;
    }
}