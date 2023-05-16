package com.kdjd.designpatterns.simplefactory;

public class ShapeSimpleFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase(EnumSimpleFactory.CIRCLE.getType())) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase(EnumSimpleFactory.RECTANGLE.getType())) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase(EnumSimpleFactory.SQUARE.getType())) {
            return new Square();
        }
        return null;
    }
}
