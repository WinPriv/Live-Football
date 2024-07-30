package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import e0.i;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@DataKeep
/* loaded from: classes2.dex */
public class ExsplashUndismissList implements Serializable {
    private static final String TAG = "ExsplashUndismissList";
    private static final long serialVersionUID = -1613710950822978151L;
    private Set<String> packageList = null;

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
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
        } catch (Throwable th) {
            i.p(th, "updateConfig:", TAG);
        }
    }
}
