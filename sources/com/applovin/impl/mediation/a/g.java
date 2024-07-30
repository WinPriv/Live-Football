package com.applovin.impl.mediation.a;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final h f17564a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17565b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17566c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17567d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17568e;

    /* loaded from: classes.dex */
    public interface a {
        void a(g gVar);
    }

    private g(h hVar, com.applovin.impl.mediation.g gVar, String str, String str2) {
        this.f17564a = hVar;
        this.f17567d = str;
        this.f17568e = str2;
        if (gVar != null) {
            this.f17565b = gVar.h();
            this.f17566c = gVar.i();
        } else {
            this.f17565b = null;
            this.f17566c = null;
        }
    }

    public static g a(h hVar, com.applovin.impl.mediation.g gVar, String str) {
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (gVar != null) {
            return new g(hVar, gVar, str, null);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public static g b(h hVar, com.applovin.impl.mediation.g gVar, String str) {
        if (hVar != null) {
            return new g(hVar, gVar, null, str);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public String c() {
        return this.f17566c;
    }

    public String d() {
        return this.f17567d;
    }

    public String e() {
        return this.f17568e;
    }

    public String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder("SignalCollectionResult{mSignalProviderSpec=");
        sb2.append(this.f17564a);
        sb2.append(", mSdkVersion='");
        sb2.append(this.f17565b);
        sb2.append("', mAdapterVersion='");
        sb2.append(this.f17566c);
        sb2.append("', mSignalDataLength='");
        String str = this.f17567d;
        if (str != null) {
            i10 = str.length();
        } else {
            i10 = 0;
        }
        sb2.append(i10);
        sb2.append("', mErrorMessage=");
        sb2.append(this.f17568e);
        sb2.append('}');
        return sb2.toString();
    }

    public String b() {
        return this.f17565b;
    }

    public static g a(h hVar, String str) {
        return b(hVar, null, str);
    }

    public h a() {
        return this.f17564a;
    }
}
