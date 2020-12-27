package com.jwc.facade;

/**
 * 门诊
 *
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 22:42
 * @Description: com.jwc.facade
 * @version: 1.0
 */
public class TreatMent {
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
    public void treat(int id){
        System.out.println(id + "---就诊中");
    }

    /**
     * 部门内部之间的方法，不需要给外部展示
     */
    public void notifyToPayment(){
        System.out.println("通知缴费处："+id + "就诊结束，药钱共200元");
    }

    /**
     * 部门内部之间的方法，不需要给外部展示
     */
    public void notifyToDrugstore(){
        System.out.println("通知取药处："+id + "就诊结束，药单已经打过去，请准备");
    }
}
