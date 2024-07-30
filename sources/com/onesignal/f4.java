package com.onesignal;

import android.content.Context;
import com.onesignal.d4;
import com.onesignal.e3;

/* compiled from: PushRegistratorADM.java */
/* loaded from: classes2.dex */
public final class f4 implements d4 {

    /* renamed from: a, reason: collision with root package name */
    public static d4.a f26828a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f26829b = false;

    public static void c(String str) {
        d4.a aVar = f26828a;
        if (aVar == null) {
            return;
        }
        f26829b = true;
        ((e3.k) aVar).a(1, str);
    }

    @Override // com.onesignal.d4
    public final void a(Context context, String str, e3.k kVar) {
        f26828a = kVar;
        new Thread(new e4(context, kVar)).start();
    }
}
