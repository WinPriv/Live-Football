package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class CtrlExt implements Serializable {
    public static final int DEF_MAX_DELAY_CLICK_TIME = 2000;
    public static final int DEF_MIN_DELAY_CLICK_TIME = 0;
    public static final String SMART = "1";
    public static final String UNSMART = "0";
    private static final long serialVersionUID = 30464300;
    private String impSmartCtrl;

    public final String k() {
        return this.impSmartCtrl;
    }
}
