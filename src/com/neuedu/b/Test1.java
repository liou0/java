package com.neuedu.b;

public class Test1 {
    private int iWidth;
    private int iHeight;
    //构造器1
    public Test1(){
        this.iHeight = 1;
        this.iWidth = 1;
    }
    //构造器2
    public Test1(int iIndex){
        this.iWidth = iIndex;
        this.iHeight = iIndex;
    }
    //构造器3
    public Test1(int iWidth, int iHeight){
        this.iHeight = iHeight;
        this.iWidth = iWidth;
    }
    //求周长
    public int getLength(){
        return 2*(this.iHeight+this.iWidth);
    }
    //求面积
    public int getSquare(){
        return this.iHeight*this.iWidth;
    }

}
