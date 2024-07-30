package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.exoplayer2.g;
import java.io.IOException;

/* loaded from: classes.dex */
public final class p extends ak {

    /* renamed from: h */
    public static final g.a<p> f16579h = new b0(6);

    /* renamed from: a */
    public final int f16580a;

    /* renamed from: b */
    public final String f16581b;

    /* renamed from: c */
    public final int f16582c;

    /* renamed from: d */
    public final v f16583d;

    /* renamed from: e */
    public final int f16584e;
    public final com.applovin.exoplayer2.h.o f;

    /* renamed from: g */
    final boolean f16585g;

    private p(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    public static p a(IOException iOException, int i10) {
        return new p(0, iOException, i10);
    }

    public static /* synthetic */ p b(Bundle bundle) {
        return new p(bundle);
    }

    private p(int i10, Throwable th, String str, int i11, String str2, int i12, v vVar, int i13, boolean z10) {
        this(a(i10, str, str2, i12, vVar, i13), th, i11, i10, str2, i12, vVar, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    public static p a(Throwable th, String str, int i10, v vVar, int i11, boolean z10, int i12) {
        return new p(1, th, null, i12, str, i10, vVar, vVar == null ? 4 : i11, z10);
    }

    @Deprecated
    public static p a(RuntimeException runtimeException) {
        return a(runtimeException, 1000);
    }

    private p(Bundle bundle) {
        super(bundle);
        this.f16580a = bundle.getInt(ak.a(1001), 2);
        this.f16581b = bundle.getString(ak.a(1002));
        this.f16582c = bundle.getInt(ak.a(1003), -1);
        this.f16583d = (v) com.applovin.exoplayer2.l.c.a(v.F, bundle.getBundle(ak.a(1004)));
        this.f16584e = bundle.getInt(ak.a(1005), 4);
        this.f16585g = bundle.getBoolean(ak.a(1006), false);
        this.f = null;
    }

    public static p a(RuntimeException runtimeException, int i10) {
        return new p(2, runtimeException, i10);
    }

    public p a(com.applovin.exoplayer2.h.o oVar) {
        return new p((String) com.applovin.exoplayer2.l.ai.a(getMessage()), getCause(), this.f13189i, this.f16580a, this.f16581b, this.f16582c, this.f16583d, this.f16584e, oVar, this.f13190j, this.f16585g);
    }

    private static String a(int i10, String str, String str2, int i11, v vVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + vVar + ", format_supported=" + h.a(i12);
        }
        return !TextUtils.isEmpty(str) ? e0.i.f(str3, ": ", str) : str3;
    }

    private p(String str, Throwable th, int i10, int i11, String str2, int i12, v vVar, int i13, com.applovin.exoplayer2.h.o oVar, long j10, boolean z10) {
        super(str, th, i10, j10);
        com.applovin.exoplayer2.l.a.a(!z10 || i11 == 1);
        com.applovin.exoplayer2.l.a.a(th != null || i11 == 3);
        this.f16580a = i11;
        this.f16581b = str2;
        this.f16582c = i12;
        this.f16583d = vVar;
        this.f16584e = i13;
        this.f = oVar;
        this.f16585g = z10;
    }
}
