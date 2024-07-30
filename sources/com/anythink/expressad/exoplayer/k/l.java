package com.anythink.expressad.exoplayer.k;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private String[] f9058a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9059b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9060c;

    private l(String... strArr) {
        this.f9058a = strArr;
    }

    private void a(String... strArr) {
        a.b(!this.f9059b, "Cannot set libraries after loading");
        this.f9058a = strArr;
    }

    private boolean a() {
        if (this.f9059b) {
            return this.f9060c;
        }
        this.f9059b = true;
        try {
            for (String str : this.f9058a) {
                System.loadLibrary(str);
            }
            this.f9060c = true;
        } catch (UnsatisfiedLinkError unused) {
        }
        return this.f9060c;
    }
}
