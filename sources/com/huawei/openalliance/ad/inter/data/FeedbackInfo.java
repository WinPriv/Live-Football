package com.huawei.openalliance.ad.inter.data;

import android.text.TextUtils;
import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class FeedbackInfo implements Serializable {
    private static final long serialVersionUID = 30456300;

    /* renamed from: id, reason: collision with root package name */
    private long f22248id;
    private String label;
    private int type;

    public final void Code(String str) {
        this.label = str;
    }

    public final boolean Z() {
        int i10;
        if (!TextUtils.isEmpty(this.label) && ((i10 = this.type) == 1 || i10 == 2 || i10 == 3)) {
            return true;
        }
        return false;
    }

    public final String k() {
        return this.label;
    }

    public final void l(int i10) {
        this.type = i10;
    }

    public final void m(long j10) {
        this.f22248id = j10;
    }

    public final long p() {
        return this.f22248id;
    }

    public final int q() {
        return this.type;
    }
}
