package com.onesignal;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.onesignal.FCMBroadcastReceiver;
import com.onesignal.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FCMBroadcastReceiver.java */
/* loaded from: classes2.dex */
public final class l implements e0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0.c f26892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f26893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f26894c;

    public l(Context context, Bundle bundle, FCMBroadcastReceiver.a aVar) {
        this.f26892a = aVar;
        this.f26893b = context;
        this.f26894c = bundle;
    }

    @Override // com.onesignal.e0.c
    public final void a(e0.d dVar) {
        boolean z10;
        int i10;
        e0.c cVar = this.f26892a;
        if (dVar != null && dVar.a()) {
            cVar.a(dVar);
            return;
        }
        Context context = this.f26893b;
        int i11 = FCMBroadcastReceiver.f26596s;
        StringBuilder sb2 = new StringBuilder("startFCMService from: ");
        sb2.append(context);
        sb2.append(" and bundle: ");
        Bundle bundle = this.f26894c;
        sb2.append(bundle);
        e3.b(6, sb2.toString(), null);
        boolean z11 = true;
        if (!e0.b(bundle, "licon") && !e0.b(bundle, "bicon") && bundle.getString("bg_img", null) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            e3.b(6, "startFCMService with no remote resources, no need for services", null);
            androidx.transition.r rVar = new androidx.transition.r(5);
            FCMBroadcastReceiver.a(bundle, rVar);
            e3.y(context);
            try {
                String l10 = rVar.l();
                if (l10 == null) {
                    e3.b(3, "json_payload key is nonexistent from mBundle passed to ProcessFromFCMIntentService: " + rVar, null);
                } else {
                    JSONObject jSONObject = new JSONObject(l10);
                    boolean i12 = rVar.i();
                    long longValue = rVar.k().longValue();
                    if (rVar.f()) {
                        i10 = rVar.j().intValue();
                    } else {
                        i10 = 0;
                    }
                    e3.D(context, jSONObject, new d0(i12, jSONObject, context, i10, l10, longValue));
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        } else {
            if (Integer.parseInt(bundle.getString("pri", "0")) <= 9) {
                z11 = false;
            }
            if (!z11 && Build.VERSION.SDK_INT >= 26) {
                FCMBroadcastReceiver.b(context, bundle);
            } else {
                try {
                    FCMBroadcastReceiver.c(context, bundle);
                } catch (IllegalStateException unused) {
                    FCMBroadcastReceiver.b(context, bundle);
                }
            }
        }
        cVar.a(dVar);
    }
}
