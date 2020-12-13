package com.jwc.facade;

import java.math.BigDecimal;

/**
 * 门面角色
 *
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 22:43
 * @Description: com.jwc.facade
 * @version: 1.0
 */
public class HospitalFacade {
    Register register;
    TreatMent treatMent;
    Payment payment;
    Drugstore drugstore;

    public HospitalFacade() {
        this.register = new Register();
        this.treatMent = new TreatMent();
        this.payment = new Payment();
        this.drugstore = new Drugstore();
    }

    public void register(int id){
        register.register(id);
    }

    public void treat(int id){
        treatMent.treat(id);
    }

    public void pay(int id, BigDecimal money){
        payment.pay(id,money);
    }

    public void getMedicine(int id){
        drugstore.getMedicine(id);
    }
}
