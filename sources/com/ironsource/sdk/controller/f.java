package com.ironsource.sdk.controller;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f26102a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26103b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26104c;

    /* renamed from: d, reason: collision with root package name */
    public b f26105d = b.NONE;

    /* renamed from: e, reason: collision with root package name */
    public final String f26106e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final com.ironsource.sdk.k.d f26107g;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f26108a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f26109b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f26110c = 3;

        /* renamed from: s, reason: collision with root package name */
        public static final /* synthetic */ int[] f26111s = {1, 2, 3};

        public static int[] a() {
            return (int[]) f26111s.clone();
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);


        /* renamed from: s, reason: collision with root package name */
        public final int f26118s;

        b(int i10) {
            this.f26118s = i10;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26119a;

        static {
            int[] iArr = new int[a.a().length];
            f26119a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26119a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26119a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(JSONObject jSONObject, String str, String str2, com.ironsource.sdk.k.d dVar) {
        int i10;
        int optInt = jSONObject.optInt("controllerSourceStrategy", -1);
        this.f26103b = optInt;
        if (optInt != 1) {
            if (optInt != 2) {
                i10 = a.f26108a;
            } else {
                i10 = a.f26110c;
            }
        } else {
            i10 = a.f26109b;
        }
        this.f26104c = i10;
        this.f26106e = str;
        this.f = str2;
        this.f26107g = dVar;
    }

    public final void a(b bVar) {
        com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("generalmessage", Integer.valueOf(this.f26103b)).a("controllersource", Integer.valueOf(bVar.f26118s));
        if (this.f26102a > 0) {
            a10.a("timingvalue", Long.valueOf(System.currentTimeMillis() - this.f26102a));
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26015u, a10.f25984a);
    }

    public final void b(com.ironsource.sdk.h.c cVar) {
        com.ironsource.sdk.k.d dVar = this.f26107g;
        if (!dVar.b()) {
            dVar.a(cVar, this.f);
        }
    }

    public final com.ironsource.sdk.h.c c() {
        return new com.ironsource.sdk.h.c(this.f26106e, "mobileController.html");
    }

    public final boolean d() {
        String str = this.f26106e;
        try {
            if (!new com.ironsource.sdk.h.c(str, "fallback_mobileController.html").exists()) {
                return false;
            }
            return IronSourceStorageUtils.renameFile(new com.ironsource.sdk.h.c(str, "fallback_mobileController.html").getPath(), c().getPath());
        } catch (Exception unused) {
            return false;
        }
    }

    public final void e() {
        try {
            com.ironsource.sdk.h.c c10 = c();
            if (!c10.exists()) {
                return;
            }
            com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(this.f26106e, "fallback_mobileController.html");
            if (cVar.exists()) {
                cVar.delete();
            }
            IronSourceStorageUtils.renameFile(c10.getPath(), cVar.getPath());
        } catch (Exception unused) {
        }
    }
}
