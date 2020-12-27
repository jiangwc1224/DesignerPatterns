package com.jwc.facade;

/**
 * 挂号
 *
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 22:41
 * @Description: com.jwc.facade
 * @version: 1.0
 */
public class Register {
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
    public void register(int id){
        this.id = id;
        System.out.println("就诊号：" + id + "---挂号成功");
    }

    /**
     * 部门内部之间的方法，不需要给外部展示
     */
    public void notifyToTreatMent(){
        System.out.println("通知门诊："+"就诊号为" + id +"的患者要来看病，请注意！！！");
    }
}
