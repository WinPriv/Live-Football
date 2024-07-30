package com.huawei.openalliance.ad.ppskit.beans.metadata;

import a3.l;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class Om implements Serializable {
    private static final long serialVersionUID = -3949617175593568464L;
    private String resourceUrl;
    private String vendorKey;
    private String verificationParameters;

    public final String a() {
        return this.vendorKey;
    }

    public final String c() {
        return this.verificationParameters;
    }

    public final String k() {
        return this.resourceUrl;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Om{vendorKey='");
        sb2.append(this.vendorKey);
        sb2.append("', resourceUrl='");
        sb2.append(this.resourceUrl);
        sb2.append("', verificationParameters='");
        return l.p(sb2, this.verificationParameters, "'}");
    }
}
