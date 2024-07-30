package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class NegativeFb implements Serializable {
    private static final long serialVersionUID = 30456300;

    /* renamed from: id, reason: collision with root package name */
    private long f22460id;
    private String label;
    private int type;

    public final long k() {
        return this.f22460id;
    }

    public final String p() {
        return this.label;
    }

    public final int q() {
        return this.type;
    }
}
