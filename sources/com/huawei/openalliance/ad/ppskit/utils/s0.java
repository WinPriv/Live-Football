package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import ka.c7;
import ka.n7;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class s0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SourceParam f23011s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n1 f23012t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f23013u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f23014v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f23015w;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean r10;
            s0 s0Var = s0.this;
            Context context = s0Var.f23013u;
            SourceParam sourceParam = s0Var.f23011s;
            String str = s0Var.f23014v;
            String str2 = s0Var.f23015w;
            String str3 = v0.f23046a;
            if (!y1.t(sourceParam.r())) {
                if (y1.h(sourceParam.r())) {
                    r10 = false;
                } else {
                    r10 = x.r(context, sourceParam.r(), "normal");
                }
                v0.p(sourceParam.r());
                v0.n(context, 2, sourceParam, "fromNet url is not http | " + sourceParam.G(), String.valueOf(r10));
                return;
            }
            n7.e("ImageUtil", "loadImageFromNet");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("content_id", str);
                jSONObject.put("slotid", str2);
                jSONObject.put("content", y0.q(null, sourceParam));
                c7.l(context).k(com.huawei.openalliance.ad.constant.s.L, jSONObject.toString(), new t0(context, sourceParam), String.class);
            } catch (JSONException unused) {
                n7.g("ImageUtil", "loadImageInfo jsonex");
            }
        }
    }

    public s0(Context context, SourceParam sourceParam, n1 n1Var, String str, String str2) {
        this.f23011s = sourceParam;
        this.f23012t = n1Var;
        this.f23013u = context;
        this.f23014v = str;
        this.f23015w = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String r10;
        boolean containsKey;
        byte[] bArr = v0.f23047b;
        synchronized (bArr) {
            r10 = this.f23011s.r();
            synchronized (bArr) {
                containsKey = v0.f23048c.containsKey(r10);
            }
        }
        if (containsKey) {
            v0.i(r10, this.f23012t);
            return;
        }
        v0.i(r10, this.f23012t);
        if (!v0.j(this.f23013u, this.f23011s.r(), this.f23011s.r(), this.f23011s.C(), this.f23011s)) {
            p2.a(new a(), 1);
        }
    }
}
