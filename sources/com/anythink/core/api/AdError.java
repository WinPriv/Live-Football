package com.anythink.core.api;

import a3.l;
import android.text.TextUtils;
import e0.i;

/* loaded from: classes.dex */
public class AdError {
    protected String code;
    protected String desc;
    protected String itemsErrorInfo = "";
    protected String platformCode;
    protected String platformMSG;

    public AdError(String str, String str2, String str3, String str4) {
        this.code = str;
        this.desc = str2;
        this.platformCode = str3;
        this.platformMSG = str4;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getFullErrorInfo() {
        if (TextUtils.isEmpty(this.itemsErrorInfo)) {
            StringBuilder sb2 = new StringBuilder("code:[ ");
            sb2.append(this.code);
            sb2.append(" ]desc:[ ");
            sb2.append(this.desc);
            sb2.append(" ]platformCode:[ ");
            sb2.append(this.platformCode);
            sb2.append(" ]platformMSG:[ ");
            return l.p(sb2, this.platformMSG, " ]");
        }
        StringBuilder sb3 = new StringBuilder("\ncode[ ");
        sb3.append(this.code);
        sb3.append(" ]\ndesc[ ");
        sb3.append(this.desc);
        sb3.append(" ]\ndetail[ ");
        return l.p(sb3, this.itemsErrorInfo, " \n]");
    }

    public String getPlatformCode() {
        return this.platformCode;
    }

    public String getPlatformMSG() {
        return this.platformMSG;
    }

    public String printStackTrace() {
        StringBuilder sb2 = new StringBuilder("code:[ ");
        sb2.append(this.code);
        sb2.append(" ]desc:[ ");
        sb2.append(this.desc);
        sb2.append(" ]platformCode:[ ");
        sb2.append(this.platformCode);
        sb2.append(" ]platformMSG:[ ");
        return l.p(sb2, this.platformMSG, " ]");
    }

    public void putNetworkErrorMsg(String str, int i10, String str2, AdError adError) {
        this.platformCode = adError.platformCode;
        this.platformMSG = adError.platformMSG;
        StringBuilder sb2 = new StringBuilder();
        i.o(sb2, this.itemsErrorInfo, "\n  { ad_source_id[ ", str, " ];network_firm_id[ ");
        sb2.append(i10);
        sb2.append(" ];network_name=[ ");
        sb2.append(str2);
        sb2.append(" ];network_error:[ ");
        sb2.append(adError.printStackTrace());
        sb2.append(" ] }");
        this.itemsErrorInfo = sb2.toString();
    }

    public String toString() {
        return printStackTrace();
    }
}
