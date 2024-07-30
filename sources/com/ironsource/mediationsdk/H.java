package com.ironsource.mediationsdk;

import android.content.Context;
import com.huawei.openalliance.ad.constant.bj;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24800a = new a(0);

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        public final C1429t a(Context context) {
            JSONObject jSONObject;
            zc.d.d(context, bj.f.o);
            try {
                jSONObject = new JSONObject(IronSourceUtils.getLastResponse(context));
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            String optString = jSONObject.optString("appKey");
            String optString2 = jSONObject.optString("userId");
            String optString3 = jSONObject.optString("response");
            zc.d.c(optString, "cachedAppKey");
            zc.d.c(optString2, "cachedUserId");
            zc.d.c(optString3, "cachedSettings");
            return new C1429t(optString, optString2, optString3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ironsource.mediationsdk.utils.l a(android.content.Context r4) {
        /*
            java.lang.String r0 = "context"
            zc.d.d(r4, r0)
            com.ironsource.mediationsdk.H$a r0 = com.ironsource.mediationsdk.H.f24800a
            com.ironsource.mediationsdk.t r0 = r0.a(r4)
            java.lang.String r1 = r0.f25864a
            int r1 = r1.length()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L17
            r1 = r2
            goto L18
        L17:
            r1 = r3
        L18:
            if (r1 == 0) goto L28
            java.lang.String r1 = r0.f25866c
            int r1 = r1.length()
            if (r1 <= 0) goto L24
            r1 = r2
            goto L25
        L24:
            r1 = r3
        L25:
            if (r1 == 0) goto L28
            goto L29
        L28:
            r2 = r3
        L29:
            r1 = 0
            if (r2 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r1
        L2e:
            if (r0 != 0) goto L31
            return r1
        L31:
            com.ironsource.mediationsdk.utils.l r1 = new com.ironsource.mediationsdk.utils.l
            java.lang.String r2 = r0.f25865b
            java.lang.String r3 = r0.f25866c
            java.lang.String r0 = r0.f25864a
            r1.<init>(r4, r0, r2, r3)
            int r4 = com.ironsource.mediationsdk.utils.l.a.f25942b
            r1.f25938e = r4
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.H.a(android.content.Context):com.ironsource.mediationsdk.utils.l");
    }

    public static final boolean b(Context context) {
        boolean z10;
        boolean z11;
        zc.d.d(context, bj.f.o);
        C1429t a10 = f24800a.a(context);
        if (a10.f25864a.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (a10.f25866c.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }
}
