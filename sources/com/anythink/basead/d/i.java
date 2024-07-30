package com.anythink.basead.d;

import com.anythink.core.api.BaseAd;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3957a = "i";

    /* renamed from: b, reason: collision with root package name */
    private Map<String, BaseAd> f3958b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final i f3959a = new i(0);

        private a() {
        }
    }

    public /* synthetic */ i(byte b10) {
        this();
    }

    public static i a() {
        return a.f3959a;
    }

    private i() {
        this.f3958b = new HashMap(2);
    }

    public final void a(String str, BaseAd baseAd) {
        this.f3958b.put(str, baseAd);
    }

    public final BaseAd a(String str) {
        return this.f3958b.remove(str);
    }
}
