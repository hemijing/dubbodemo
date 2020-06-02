package com.qinghuo.prj;

/**
 * @author  hehuan.
 */
public class DubboServiceFacade {

    public String route(String serviceName) {
        if (serviceName.equals("OpenAcc")) {
            System.out.println("****************************");
            return "OpenAcc";
        }
        return "Others";
    }
}
