package com.jwc.observer.awtexample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/13 - 12 - 13 - 20:27
 * @Description: com.jwc.observer.awtexample
 * @version: 1.0
 */
public class TestFrame extends Frame {
    public void launch(){
        Button button= new Button("press me");
        // 给按钮添加监听者
        button.addActionListener(new MyListener1());
        button.addActionListener(new MyListener2());

        // 给窗口添加监听者
        this.addWindowListener(new MyWindowAdapter());

        // 把这个按钮加到frame窗口里
        this.add(button);
        // 让按钮充满窗口
        this.pack();
        // 窗口出现的位置
        this.setLocation(1000,500);
        // 窗口的显示
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TestFrame().launch();
    }
}

// ActionListener  抽象观察者类
// ActionEvent  抽象事件类
// MyListener1，2  具体观察者类
class MyListener1 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("listener1:监听到按钮被点击了");
    }
}

class MyListener2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Listener2:监听到按钮被点击了");
    }
}

class MyWindowAdapter extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("关窗口咯");
        System.exit(0);
    }
}