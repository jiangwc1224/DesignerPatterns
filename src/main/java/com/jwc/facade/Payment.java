package com.jwc.facade;

import java.math.BigDecimal;

/**
 * 缴费
 *
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 22:41
 * @Description: com.jwc.facade
 * @version: 1.0
 */
public class Payment {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * 可以给外部展示方法
     */
    public void pay(int id, BigDecimal money){
        System.out.println(id + "---缴费" + money.toString() + "成功");
    }

    /**
     * 部门内部之间的方法，不需要给外部展示
     */
    public void notifyToDrugstore(){
        System.out.println("通知取药处："+id + "钱已经缴清，可以发药");
    }
}
