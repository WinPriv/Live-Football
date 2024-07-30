package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class FeedbackInfo implements Serializable {
    private static final long serialVersionUID = 30456300;

    /* renamed from: id, reason: collision with root package name */
    private long f22459id;
    private String label;
    private int type;

    public final String a() {
        return this.label;
    }

    public final void b(long j10) {
        this.f22459id = j10;
    }

    public final void c(String str) {
        this.label = str;
    }

    public final long k() {
        return this.f22459id;
    }

    public final void a(int i10) {
        this.type = i10;
    }

    public final int b() {
        return this.type;
    }
}
