package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final d f26536a;

    /* renamed from: b, reason: collision with root package name */
    public C0345a f26537b = new C0345a();

    /* renamed from: com.ironsource.sdk.service.Connectivity.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0345a extends BroadcastReceiver {
        public C0345a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String a10 = com.ironsource.d.a.a(context);
            boolean equals = a10.equals("none");
            a aVar = a.this;
            if (equals) {
                aVar.f26536a.a();
                return;
            }
            d dVar = aVar.f26536a;
            new JSONObject();
            dVar.a(a10);
        }
    }

    public a(d dVar) {
        this.f26536a = dVar;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void a() {
        this.f26537b = null;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void b(Context context) {
        try {
            context.unregisterReceiver(this.f26537b);
        } catch (IllegalArgumentException unused) {
        } catch (Exception e10) {
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e10);
        }
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final JSONObject c(Context context) {
        return new JSONObject();
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void a(Context context) {
        try {
            context.registerReceiver(this.f26537b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
