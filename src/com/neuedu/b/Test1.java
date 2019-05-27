package com.neuedu.b;

public class Test1 {
    private int iWidth;
    private int iHeight;
    public Test1(){
        this.iHeight = 1;
        this.iWidth = 1;
    }
    public Test1(int iIndex){
        this.iWidth = iIndex;
        this.iHeight = iIndex;
    }
    public Test1(int iWidth, int iHeight){
        this.iHeight = iHeight;
        this.iWidth = iWidth;
    }
    public int getLength(){
        return 2*(this.iHeight+this.iWidth);
    }
    public int getSquare(){
        return this.iHeight*this.iWidth;
    }

}
