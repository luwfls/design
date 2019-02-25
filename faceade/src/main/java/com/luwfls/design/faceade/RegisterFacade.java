package com.luwfls.design.faceade;

/**
 * 办理注册公司的门面
 */
public class RegisterFacade {

    public void register(){
        工商局 工商局 = new 工商局();
        工商局.checkName();
        税务局 税务局 = new 税务局();
        税务局.taxCertiFicate();
        质监局 质监局 = new 质监局();
        税务局.taxCertiFicate();
        中国工商银行 中国工商银行 = new 中国工商银行();
        中国工商银行.openAccount();
    }
}
