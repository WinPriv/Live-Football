package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class DeviceExt {
    private List<String> aVideoCodec;
    private String bootMark;
    private String updateMark;

    public final void a(String str) {
        this.bootMark = str;
    }

    public final void b(List<String> list) {
        this.aVideoCodec = list;
    }

    public final void c(String str) {
        this.updateMark = str;
    }
}
