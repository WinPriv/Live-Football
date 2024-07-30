package com.huawei.openalliance.ad.ipc;

import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.openalliance.ad.annotations.DataKeep;

@DataKeep
@AllApi
/* loaded from: classes2.dex */
public class CallResult<T> {
    private int code = -1;
    private T data;
    private String msg;

    @AllApi
    public int getCode() {
        return this.code;
    }

    @AllApi
    public T getData() {
        return this.data;
    }

    @AllApi
    public String getMsg() {
        return this.msg;
    }

    @AllApi
    public void setCode(int i10) {
        this.code = i10;
    }

    @AllApi
    public void setData(T t10) {
        this.data = t10;
    }

    @AllApi
    public void setMsg(String str) {
        this.msg = str;
    }
}
