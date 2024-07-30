package com.huawei.openalliance.ad.ppskit.beans.feedback;

import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import ma.a;

@DataKeep
/* loaded from: classes2.dex */
public class ComplainAddInfo {

    @a
    private String appId = w.cK;
    private String sceneId = "2";
    private String subSceneId = "6";

    @a
    private String deviceId = "";
    private boolean disableUserUpload = true;
    private AdditionalContext additionalContext = new AdditionalContext();

    public final void a(AdditionalContext additionalContext) {
        this.additionalContext = additionalContext;
    }

    public final void b(String str) {
        this.deviceId = str;
    }
}
