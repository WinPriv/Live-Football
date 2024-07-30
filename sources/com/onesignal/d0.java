package com.onesignal;

import android.content.Context;
import com.onesignal.y1;
import org.json.JSONObject;

/* compiled from: NotificationBundleProcessor.java */
/* loaded from: classes2.dex */
public final class d0 implements y1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f26720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f26721c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f26723e;
    public final /* synthetic */ long f;

    public d0(boolean z10, JSONObject jSONObject, Context context, int i10, String str, long j10) {
        this.f26719a = z10;
        this.f26720b = jSONObject;
        this.f26721c = context;
        this.f26722d = i10;
        this.f26723e = str;
        this.f = j10;
    }

    @Override // com.onesignal.y1.a
    public final void a(boolean z10) {
        boolean z11 = this.f26719a;
        if (!z11 && z10) {
            return;
        }
        OSNotificationWorkManager.a(this.f26721c, c3.g(this.f26720b), this.f26722d, this.f26723e, this.f, this.f26719a);
        if (z11) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }
}
