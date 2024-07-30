package com.onesignal;

import com.onesignal.v3;

/* compiled from: UserStateSynchronizer.java */
/* loaded from: classes2.dex */
public final class a5 extends v3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z4 f26665a;

    public a5(z4 z4Var) {
        this.f26665a = z4Var;
    }

    @Override // com.onesignal.v3.c
    public final void a(int i10, String str, Throwable th) {
        e3.b(4, "Failed last request. statusCode: " + i10 + "\nresponse: " + str, null);
        z4 z4Var = this.f26665a;
        if (z4.a(z4Var, i10, str, "already logged out of email")) {
            z4.b(z4Var);
        } else if (z4.a(z4Var, i10, str, "not a valid device_type")) {
            z4.c(z4Var);
        } else {
            z4.d(z4Var, i10);
        }
    }

    @Override // com.onesignal.v3.c
    public final void b(String str) {
        z4.b(this.f26665a);
    }
}
