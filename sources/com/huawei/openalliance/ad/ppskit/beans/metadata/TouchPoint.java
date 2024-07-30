package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class TouchPoint {
    private int rawX;
    private int rawY;
    private String taskId;

    public TouchPoint() {
    }

    public TouchPoint(int i10, int i11, String str) {
        this.rawX = i10;
        this.rawY = i11;
        this.taskId = str;
    }
}
