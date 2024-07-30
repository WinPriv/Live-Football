package com.ironsource.mediationsdk.utils;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25920a = true;

    /* renamed from: b, reason: collision with root package name */
    public String f25921b = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";

    /* renamed from: c, reason: collision with root package name */
    public boolean f25922c = false;

    /* renamed from: d, reason: collision with root package name */
    public int[] f25923d = null;

    /* renamed from: e, reason: collision with root package name */
    public int[] f25924e = null;

    public final void a(String str) {
        zc.d.d(str, "<set-?>");
        this.f25921b = str;
    }

    public final String b() {
        return this.f25921b;
    }

    public final boolean c() {
        return this.f25922c;
    }

    public final int[] d() {
        return this.f25923d;
    }

    public final int[] e() {
        return this.f25924e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f25920a == jVar.f25920a && zc.d.a(this.f25921b, jVar.f25921b) && this.f25922c == jVar.f25922c && zc.d.a(this.f25923d, jVar.f25923d) && zc.d.a(this.f25924e, jVar.f25924e)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        int hashCode;
        boolean z10 = this.f25920a;
        int i10 = 1;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int b10 = e0.i.b(this.f25921b, r02 * 31, 31);
        boolean z11 = this.f25922c;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        int i11 = (b10 + i10) * 31;
        int[] iArr = this.f25923d;
        int i12 = 0;
        if (iArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(iArr);
        }
        int i13 = (i11 + hashCode) * 31;
        int[] iArr2 = this.f25924e;
        if (iArr2 != null) {
            i12 = Arrays.hashCode(iArr2);
        }
        return i13 + i12;
    }

    public final String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f25920a + ", pixelEventsUrl=" + this.f25921b + ", pixelEventsCompression=" + this.f25922c + ", pixelOptOut=" + Arrays.toString(this.f25923d) + ", pixelOptIn=" + Arrays.toString(this.f25924e) + ')';
    }

    public final void a(boolean z10) {
        this.f25920a = z10;
    }

    public final void b(boolean z10) {
        this.f25922c = z10;
    }

    public final void a(int[] iArr) {
        this.f25923d = iArr;
    }

    public final void b(int[] iArr) {
        this.f25924e = iArr;
    }

    public final boolean a() {
        return this.f25920a;
    }
}
