package com.huawei.hms.ads;

import android.text.TextUtils;
import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class DefaultTemplate implements Serializable {
    private static final String INVALID_ID = "-1";
    private static final long serialVersionUID = 3193003283515036853L;
    private String defTptId;
    private Integer tptFcCtl;

    public String Code() {
        return this.defTptId;
    }

    public boolean I() {
        if (!TextUtils.isEmpty(this.defTptId) && !"-1".equals(this.defTptId)) {
            return true;
        }
        return false;
    }

    public Integer V() {
        return this.tptFcCtl;
    }

    public void Code(Integer num) {
        this.tptFcCtl = num;
    }

    public void Code(String str) {
        this.defTptId = str;
    }
}
