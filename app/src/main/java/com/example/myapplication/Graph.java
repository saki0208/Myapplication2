package com.example.myapplication;
import android.graphics.Color;

import java.applet.*;
import java.awt.*;
public class Graph extends Applet{
    public void paint(Graphics g){
        //折れ線を描く
        g.setColor(Color.cyan);
        int x[] = {10,40,70,100,150};
        int y[] = {30,20,50,20,100};
        g.drawPolyline(x,y,7);

    }
}




