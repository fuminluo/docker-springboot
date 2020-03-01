package com.springboot.docker;

/**
 * @Author administered
 * @Description
 * @Date 2020/2/29 22:09
 **/
public class AddressCheckResult {

    private boolean postCodeResult = false;

    public boolean isPostCodeResult() {
        return postCodeResult;
    }

    public void setPostCodeResult(boolean postCodeResult) {
        this.postCodeResult = postCodeResult;
    }
}
