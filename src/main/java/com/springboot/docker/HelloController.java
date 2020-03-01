package com.springboot.docker;

import org.kie.api.KieBase;
import org.kie.api.definition.type.FactType;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author administered
 * @Description
 * @Date 2019/7/7 21:01
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "<h1>Hello Spring-Boot Docker ！！！自动化部署 6666</h1>";
    }


    @Resource
    private KieSession kieSession;


    @Resource
    private KieBase kieBase;

    @ResponseBody
    @RequestMapping("/address")
    public void test(){
        Address address = new Address();
        address.setPostcode("99425");

        Object obj = address;

        AddressCheckResult result = new AddressCheckResult();
        kieSession.insert(obj);
        kieSession.insert(result);
        int ruleFiredCount = kieSession.fireAllRules();
        System.out.println("触发了" + ruleFiredCount + "条规则");

        if(result.isPostCodeResult()){
            System.out.println("规则校验通过");
        }

    }

    @ResponseBody
    @RequestMapping("/factType")
    public void factType() throws IllegalAccessException, InstantiationException {
        FactType factType = kieBase.getFactType("com.ytooo.declar","Entity");
        Object obj = factType.newInstance();
        factType.set(obj,"feel","sad");
        factType.set(obj,"continued","永远");
        factType.set(obj,"para1","para1");
        kieSession.insert(obj);
        kieSession.fireAllRules();

    }

}
