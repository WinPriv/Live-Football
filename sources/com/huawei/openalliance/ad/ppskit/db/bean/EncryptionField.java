package com.huawei.openalliance.ad.ppskit.db.bean;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import com.huawei.openalliance.ad.ppskit.utils.m2;
import com.huawei.openalliance.ad.ppskit.utils.u1;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import java.io.Serializable;
import ka.n7;

@OuterVisible
/* loaded from: classes2.dex */
public class EncryptionField<DATA> implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public final Class f22471s;

    /* renamed from: t, reason: collision with root package name */
    public final Class f22472t;

    /* renamed from: u, reason: collision with root package name */
    public DATA f22473u;

    /* renamed from: v, reason: collision with root package name */
    public String f22474v;

    public EncryptionField() {
        this.f22471s = String.class;
    }

    public final DATA a(Context context) {
        DATA data;
        Class cls = this.f22471s;
        try {
            if (cls == String.class) {
                if (TextUtils.isEmpty((String) this.f22473u)) {
                    data = (DATA) m2.d(this.f22474v, u1.h(context));
                    this.f22473u = data;
                }
                return this.f22473u;
            }
            if (this.f22473u == null) {
                data = (DATA) y0.o(null, m2.d(this.f22474v, u1.h(context)), cls, this.f22472t);
                this.f22473u = data;
            }
            return this.f22473u;
        } catch (Throwable th) {
            n7.h("EncryptionField", "cbcDecrypt failed: %s, reset ", th.getClass().getSimpleName());
            n7.a();
            u1.f23033c = null;
            return null;
        }
        n7.h("EncryptionField", "cbcDecrypt failed: %s, reset ", th.getClass().getSimpleName());
        n7.a();
        u1.f23033c = null;
        return null;
    }

    public final DATA b(byte[] bArr) {
        DATA data;
        Class cls = this.f22471s;
        try {
            if (cls == String.class) {
                if (TextUtils.isEmpty((String) this.f22473u)) {
                    data = (DATA) m2.d(this.f22474v, bArr);
                    this.f22473u = data;
                }
                return this.f22473u;
            }
            if (this.f22473u == null) {
                data = (DATA) y0.o(null, m2.d(this.f22474v, bArr), cls, this.f22472t);
                this.f22473u = data;
            }
            return this.f22473u;
        } catch (Throwable th) {
            n7.h("EncryptionField", "cbcDecrypt failed: %s, reset ", th.getClass().getSimpleName());
            n7.a();
            u1.f23033c = null;
            return null;
        }
        n7.h("EncryptionField", "cbcDecrypt failed: %s, reset ", th.getClass().getSimpleName());
        n7.a();
        u1.f23033c = null;
        return null;
    }

    public EncryptionField(Class cls, Class cls2) {
        this.f22471s = cls;
        this.f22472t = cls2;
    }
}
