package com.ironsource.sdk.g;

/* loaded from: classes2.dex */
public class d {

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f26491a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f26492b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f26493c = 3;

        /* renamed from: s, reason: collision with root package name */
        public static final /* synthetic */ int[] f26494s = {1, 2, 3};

        public static int[] a() {
            return (int[]) f26494s.clone();
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        /* JADX INFO: Fake field, exist only in values array */
        Failed
    }

    /* loaded from: classes2.dex */
    public enum c {
        Web,
        Native,
        None
    }

    /* renamed from: com.ironsource.sdk.g.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0343d {
        MODE_0(0),
        MODE_1(1),
        /* JADX INFO: Fake field, exist only in values array */
        MODE_2(2),
        MODE_3(3);


        /* renamed from: d, reason: collision with root package name */
        public int f26508d;

        EnumC0343d(int i10) {
            this.f26508d = i10;
        }
    }

    /* loaded from: classes2.dex */
    public enum e {
        Banner,
        OfferWall,
        Interstitial,
        OfferWallCredits,
        RewardedVideo,
        /* JADX INFO: Fake field, exist only in values array */
        None
    }

    public d() {
        new com.ironsource.mediationsdk.adunit.a.a();
    }

    public void a(int i10) {
        com.ironsource.mediationsdk.adunit.a.a.a("sdia", Integer.valueOf(i10));
    }

    public void b(int i10) {
        com.ironsource.mediationsdk.adunit.a.a.a("sdra", Integer.valueOf(i10));
    }

    public void c(int i10) {
        com.ironsource.mediationsdk.adunit.a.a.a("sdba", Integer.valueOf(i10));
    }
}
