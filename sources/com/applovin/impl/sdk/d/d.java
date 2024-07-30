package com.applovin.impl.sdk.d;

import android.annotation.TargetApi;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final p f18799a;

    /* renamed from: b, reason: collision with root package name */
    private final g f18800b;

    public d(AppLovinAdImpl appLovinAdImpl, p pVar) {
        if (appLovinAdImpl != null) {
            if (pVar != null) {
                this.f18799a = pVar;
                this.f18800b = pVar.P();
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad specified");
    }

    @TargetApi(24)
    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void a(long j10) {
    }

    public void b(long j10) {
    }

    public void c(long j10) {
    }

    public void d(long j10) {
    }

    public static void a(long j10, AppLovinAdBase appLovinAdBase, p pVar) {
    }

    public static void a(AppLovinAdBase appLovinAdBase, p pVar) {
    }

    public static void a(e eVar, AppLovinAdBase appLovinAdBase, p pVar) {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }
}
