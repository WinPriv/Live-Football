package com.onesignal;

import android.content.Context;
import java.security.SecureRandom;
import org.json.JSONObject;

/* compiled from: OSNotificationGenerationJob.java */
/* loaded from: classes2.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public t1 f27212a;

    /* renamed from: b, reason: collision with root package name */
    public Context f27213b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f27214c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27215d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27216e;
    public Long f;

    public z1(Context context) {
        this.f27213b = context;
    }

    public final Integer a() {
        return Integer.valueOf(this.f27212a.f27069b);
    }

    public final void b(t1 t1Var) {
        boolean z10;
        boolean z11 = true;
        if (t1Var.f27069b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            t1 t1Var2 = this.f27212a;
            if (t1Var2 != null) {
                int i10 = t1Var2.f27069b;
                if (i10 == 0) {
                    z11 = false;
                }
                if (z11) {
                    t1Var.f27069b = i10;
                }
            }
            t1Var.f27069b = new SecureRandom().nextInt();
        }
        this.f27212a = t1Var;
    }

    public final String toString() {
        return "OSNotificationGenerationJob{jsonPayload=" + this.f27214c + ", isRestoring=" + this.f27215d + ", isNotificationToDisplay=" + this.f27216e + ", shownTimeStamp=" + this.f + ", overriddenBodyFromExtender=null, overriddenTitleFromExtender=null, overriddenSound=null, overriddenFlags=null, orgFlags=null, orgSound=null, notification=" + this.f27212a + '}';
    }

    public z1(Context context, JSONObject jSONObject) {
        t1 t1Var = new t1(jSONObject);
        this.f27213b = context;
        this.f27214c = jSONObject;
        b(t1Var);
    }
}
