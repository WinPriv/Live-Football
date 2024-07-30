package com.ironsource.sdk.controller;

import android.content.Context;
import android.media.AudioManager;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class u {

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AudioManager f26240s;

        public a(AudioManager audioManager) {
            this.f26240s = audioManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f26240s.abandonAudioFocus(null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AudioManager f26241s;

        public b(AudioManager audioManager) {
            this.f26241s = audioManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f26241s.requestAudioFocus(null, 3, 2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public u() {
        new com.ironsource.mediationsdk.adunit.a.a();
    }

    public void a(int i10) {
        com.ironsource.mediationsdk.adunit.a.a.a("itp", Integer.valueOf(i10));
    }

    public void b(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("medv", str);
    }

    public void c(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("sid", str);
    }

    public void d(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("plugin", str);
    }

    public void e(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("usid", str);
    }

    public void f(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("audt", str);
    }

    public void a(Context context) {
        com.ironsource.mediationsdk.adunit.a.a.a(context);
    }

    public void b(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adunit.a.a.a("tkgp", (Object) jSONObject);
    }

    public void a(com.ironsource.c.b bVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("omv", com.ironsource.c.b.b());
            hashMap.put("ompv", com.ironsource.c.b.c());
            hashMap.put("sdkv", com.ironsource.c.b.a());
            com.ironsource.mediationsdk.adunit.a.a.a(hashMap);
        } catch (Exception unused) {
        }
    }

    public void b(boolean z10) {
        com.ironsource.mediationsdk.adunit.a.a.a("gpi", Boolean.valueOf(z10));
    }

    public void a(Boolean bool) {
        com.ironsource.mediationsdk.adunit.a.a.a("fs", bool);
    }

    public void a(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("apky", str);
    }

    public void a(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adunit.a.a.a("md", (Object) jSONObject);
    }

    public void a(boolean z10) {
        com.ironsource.mediationsdk.adunit.a.a.a("cnst", Boolean.valueOf(z10));
    }
}
