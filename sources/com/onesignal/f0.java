package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import com.onesignal.e0;
import com.onesignal.y1;
import org.json.JSONObject;

/* compiled from: NotificationBundleProcessor.java */
/* loaded from: classes2.dex */
public final class f0 implements y1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f26821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f26822c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.b f26823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ JSONObject f26824e;
    public final /* synthetic */ long f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e0.d f26825g;

    public f0(boolean z10, Context context, Bundle bundle, e0.a aVar, JSONObject jSONObject, long j10, boolean z11, e0.d dVar) {
        this.f26820a = z10;
        this.f26821b = context;
        this.f26822c = bundle;
        this.f26823d = aVar;
        this.f26824e = jSONObject;
        this.f = j10;
        this.f26825g = dVar;
    }

    @Override // com.onesignal.y1.a
    public final void a(boolean z10) {
        int i10;
        boolean z11 = this.f26820a;
        e0.b bVar = this.f26823d;
        Bundle bundle = this.f26822c;
        if (!z11 && z10) {
            e3.b(6, "startNotificationProcessing returning, with context: " + this.f26821b + " and bundle: " + bundle, null);
            e0.a aVar = (e0.a) bVar;
            e0.d dVar = aVar.f26734a;
            dVar.f26737b = true;
            aVar.f26735b.a(dVar);
            return;
        }
        JSONObject jSONObject = this.f26824e;
        String g6 = c3.g(jSONObject);
        if (bundle.containsKey("android_notif_id")) {
            i10 = bundle.getInt("android_notif_id");
        } else {
            i10 = 0;
        }
        OSNotificationWorkManager.a(this.f26821b, g6, i10, jSONObject.toString(), this.f, this.f26820a);
        this.f26825g.f26739d = true;
        e0.a aVar2 = (e0.a) bVar;
        aVar2.f26735b.a(aVar2.f26734a);
    }
}
