package com.onesignal;

import android.content.Context;
import com.huawei.hms.common.ApiException;
import com.onesignal.d4;
import com.onesignal.e3;

/* compiled from: PushRegistratorHMS.java */
/* loaded from: classes2.dex */
public final class j4 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f26878s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d4.a f26879t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k4 f26880u;

    public j4(k4 k4Var, Context context, e3.k kVar) {
        this.f26880u = k4Var;
        this.f26878s = context;
        this.f26879t = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        d4.a aVar = this.f26879t;
        try {
            this.f26880u.c(this.f26878s, aVar);
        } catch (ApiException e10) {
            e3.b(3, "HMS ApiException getting Huawei push token!", e10);
            if (e10.getStatusCode() == 907135000) {
                i10 = -26;
            } else {
                i10 = -27;
            }
            ((e3.k) aVar).a(i10, null);
        }
    }
}
