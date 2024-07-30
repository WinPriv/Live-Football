package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class Template {
    private String templateContent;
    private String templateId;

    public final boolean a() {
        if (!TextUtils.isEmpty(this.templateId) && !TextUtils.isEmpty(this.templateContent)) {
            return true;
        }
        return false;
    }

    public final String b() {
        return this.templateId;
    }

    public final String c() {
        return this.templateContent;
    }
}
