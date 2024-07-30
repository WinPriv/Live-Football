package com.onesignal;

import com.onesignal.z4;

/* compiled from: UserStateSynchronizer.java */
/* loaded from: classes2.dex */
public final class d5 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z4.c f26733s;

    public d5(z4.c cVar) {
        this.f26733s = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z4.c cVar = this.f26733s;
        if (!z4.this.f27226d.get()) {
            z4.this.A(false);
        }
    }
}
