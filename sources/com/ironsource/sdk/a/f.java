package com.ironsource.sdk.a;

import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static a f25997a = new a(2001, a("initsdk"));

    /* renamed from: b, reason: collision with root package name */
    public static a f25998b = new a(2026, a("sdkrecoverstart"));

    /* renamed from: c, reason: collision with root package name */
    public static a f25999c = new a(2002, a("createcontrollerweb"));

    /* renamed from: d, reason: collision with root package name */
    public static a f26000d = new a(2003, a("createcontrollernative"));

    /* renamed from: e, reason: collision with root package name */
    public static a f26001e = new a(2004, a("controllerstageready"));
    public static a f = new a(IronSourceConstants.IS_INSTANCE_OPENED, a("loadad"));

    /* renamed from: g, reason: collision with root package name */
    public static a f26002g = new a(2006, a("loadadfailed"));

    /* renamed from: h, reason: collision with root package name */
    public static a f26003h = new a(2007, a("initproduct"));

    /* renamed from: i, reason: collision with root package name */
    public static a f26004i = new a(AdError.REMOTE_ADS_SERVICE_ERROR, a("initproductfailed"));

    /* renamed from: j, reason: collision with root package name */
    public static a f26005j = new a(AdError.INTERSTITIAL_AD_TIMEOUT, a("loadproduct"));

    /* renamed from: k, reason: collision with root package name */
    public static a f26006k = new a(2010, a("parseadmfailed"));

    /* renamed from: l, reason: collision with root package name */
    public static a f26007l = new a(2011, a("loadadsuccess"));

    /* renamed from: m, reason: collision with root package name */
    public static a f26008m = new a(2027, a("destroyproduct"));

    /* renamed from: n, reason: collision with root package name */
    public static a f26009n = new a(2013, a("controllerfailed"));
    public static a o = new a(2015, a("appendnativefeaturesdatafailed"));

    /* renamed from: p, reason: collision with root package name */
    public static a f26010p = new a(2016, a("adunitcouldnotloadtowebview"));

    /* renamed from: q, reason: collision with root package name */
    public static a f26011q = new a(2017, a("webviewcleanupfailed"));

    /* renamed from: r, reason: collision with root package name */
    public static a f26012r = new a(2018, a("removewebviewfailed"));

    /* renamed from: s, reason: collision with root package name */
    public static a f26013s;

    /* renamed from: t, reason: collision with root package name */
    public static a f26014t;

    /* renamed from: u, reason: collision with root package name */
    public static a f26015u;

    /* renamed from: v, reason: collision with root package name */
    public static a f26016v;

    /* renamed from: w, reason: collision with root package name */
    public static a f26017w;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f26018a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26019b;

        public a(int i10, String str) {
            this.f26019b = i10;
            this.f26018a = str;
        }
    }

    static {
        a("banneralreadydestroyed");
        f26013s = new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, a("fialedregactlifecycle"));
        f26014t = new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_FAILED, a("loadcontrollerhtml"));
        f26015u = new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, a("controllerhtmlsuccess"));
        f26016v = new a(2024, a("controllerhtmlfailed"));
        f26017w = new a(2025, a("webviewcrashrpg"));
    }

    public static String a(String str) {
        return "n_".concat(str);
    }
}
