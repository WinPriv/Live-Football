package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import e0.i;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@DataKeep
/* loaded from: classes2.dex */
public class LandpageWebBlackList implements Serializable {
    private static final String ALLOW = "-1";
    private static final String REJECT = "-2";
    private static final String TAG = "LandpageWebBlackList";
    private static final long serialVersionUID = -1613710950822978060L;
    private String type = "-1";
    private Set<String> packageList = null;

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (REJECT.equals(str)) {
                this.type = REJECT;
                return;
            }
            if ("-1".equals(str)) {
                this.type = "-1";
                return;
            }
            if (this.packageList == null) {
                this.packageList = new HashSet();
            }
            this.packageList.clear();
            String[] split = str.split(",");
            int length = split.length;
            if (length > 0) {
                for (int i10 = 0; i10 < length; i10++) {
                    if (!TextUtils.isEmpty(split[i10])) {
                        this.packageList.add(split[i10]);
                    }
                }
            }
            if (this.packageList.size() > 0) {
                this.type = null;
            }
        } catch (Throwable th) {
            i.p(th, "fromString:", TAG);
        }
    }

    public final boolean b(String str) {
        if (TextUtils.isEmpty(str) || "-1".equals(this.type)) {
            return false;
        }
        if (REJECT.equals(this.type)) {
            return true;
        }
        Set<String> set = this.packageList;
        if (set == null) {
            return false;
        }
        for (String str2 : set) {
            if (!TextUtils.isEmpty(str2) && str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }
}
