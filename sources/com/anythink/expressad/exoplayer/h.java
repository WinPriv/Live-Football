package com.anythink.expressad.exoplayer;

import android.os.Looper;
import com.anythink.expressad.exoplayer.w;
import com.anythink.expressad.exoplayer.x;

/* loaded from: classes.dex */
public interface h extends w {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f8139a = 1;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f8140b = 2;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f8141c = 3;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f8142d = 4;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f8143e = 0;

    @Deprecated
    public static final int f = 1;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f8144g = 2;

    @Deprecated
    /* loaded from: classes.dex */
    public interface a extends w.c {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b extends x.b {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final x.b f8322a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8323b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f8324c;

        @Deprecated
        private c(x.b bVar, int i10, Object obj) {
            this.f8322a = bVar;
            this.f8323b = i10;
            this.f8324c = obj;
        }
    }

    Looper a();

    x a(x.b bVar);

    void a(ac acVar);

    void a(com.anythink.expressad.exoplayer.h.s sVar);

    void a(com.anythink.expressad.exoplayer.h.s sVar, boolean z10, boolean z11);

    @Deprecated
    void a(c... cVarArr);

    @Deprecated
    void b(c... cVarArr);
}
