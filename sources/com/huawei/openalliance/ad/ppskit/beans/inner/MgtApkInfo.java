package com.huawei.openalliance.ad.ppskit.beans.inner;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class MgtApkInfo {
    private List<String> certSign;
    private String packageName;

    public final String a() {
        return this.packageName;
    }

    public final List<String> b() {
        return this.certSign;
    }
}
