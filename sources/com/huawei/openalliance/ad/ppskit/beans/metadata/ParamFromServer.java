package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import ma.a;

@DataKeep
/* loaded from: classes2.dex */
public class ParamFromServer extends RspBean {

    /* renamed from: a, reason: collision with root package name */
    @a
    private String f22461a;

    @a
    private String sig;

    /* renamed from: t, reason: collision with root package name */
    @a
    private String f22462t;

    public final String c() {
        return this.sig;
    }

    public final String k() {
        return this.f22461a;
    }
}
