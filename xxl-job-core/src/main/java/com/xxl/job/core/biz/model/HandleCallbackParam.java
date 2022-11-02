package com.xxl.job.core.biz.model;

import java.io.Serializable;

/**
 * 服务端（admin）调用客户端（自己写的） 回调函数的实体类
 * Created by xuxueli on 17/3/2.
 */
public class HandleCallbackParam implements Serializable {
    private static final long serialVersionUID = 42L;

    /**
     * 日志id
     */
    private long logId;
    /**
     * 日志时间
     */
    private long logDateTim;

    /**
     * 执行状态
     */
    private int handleCode;
    /**
     * 执行日志
     */
    private String handleMsg;

    public HandleCallbackParam(){}
    public HandleCallbackParam(long logId, long logDateTim, int handleCode, String handleMsg) {
        this.logId = logId;
        this.logDateTim = logDateTim;
        this.handleCode = handleCode;
        this.handleMsg = handleMsg;
    }

    public long getLogId() {
        return logId;
    }

    public void setLogId(long logId) {
        this.logId = logId;
    }

    public long getLogDateTim() {
        return logDateTim;
    }

    public void setLogDateTim(long logDateTim) {
        this.logDateTim = logDateTim;
    }

    public int getHandleCode() {
        return handleCode;
    }

    public void setHandleCode(int handleCode) {
        this.handleCode = handleCode;
    }

    public String getHandleMsg() {
        return handleMsg;
    }

    public void setHandleMsg(String handleMsg) {
        this.handleMsg = handleMsg;
    }

    @Override
    public String toString() {
        return "HandleCallbackParam{" +
                "logId=" + logId +
                ", logDateTim=" + logDateTim +
                ", handleCode=" + handleCode +
                ", handleMsg='" + handleMsg + '\'' +
                '}';
    }

}
