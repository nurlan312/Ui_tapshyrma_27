package com.company;

public class Box <H, L, W> {
    private H height;
    private L length;
    private W width;

    public Box(H height, L length, W width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public <T> T methodBox(Box <H, L, W> box) {
        return (T) box;
    }

    public H getHeight() {
        return height;
    }
    public void setHeight(H height) {
        this.height = height;
    }
    public L getLength() {
        return length;
    }
    public void setLength(L length) {
        this.length = length;
    }
    public W getWidth() {
        return width;
    }
    public void setWidth(W width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Box: \n" + "Box height: " + getHeight() + "\nBox length: " + getLength() +
                "\nBox width: " + getWidth();
    }
}
