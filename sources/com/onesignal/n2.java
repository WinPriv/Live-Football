package com.onesignal;

import com.onesignal.v3;

/* compiled from: OSReceiveReceiptController.java */
/* loaded from: classes2.dex */
public final class n2 extends v3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26939a;

    public n2(String str) {
        this.f26939a = str;
    }

    @Override // com.onesignal.v3.c
    public final void a(int i10, String str, Throwable th) {
        e3.b(3, "Receive receipt failed with statusCode: " + i10 + " response: " + str, null);
    }

    @Override // com.onesignal.v3.c
    public final void b(String str) {
        e3.b(6, "Receive receipt sent for notificationID: " + this.f26939a, null);
    }
}
