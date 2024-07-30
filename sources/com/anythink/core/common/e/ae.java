package com.anythink.core.common.e;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    public int f5457a;

    /* renamed from: b, reason: collision with root package name */
    public String f5458b;

    /* renamed from: c, reason: collision with root package name */
    public int f5459c;

    /* renamed from: d, reason: collision with root package name */
    public int f5460d;

    /* renamed from: e, reason: collision with root package name */
    public long f5461e;
    public ConcurrentHashMap<String, a> f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f5462a;

        /* renamed from: b, reason: collision with root package name */
        public String f5463b;

        /* renamed from: c, reason: collision with root package name */
        public String f5464c;

        /* renamed from: d, reason: collision with root package name */
        public int f5465d;

        /* renamed from: e, reason: collision with root package name */
        public int f5466e;
        public long f;
    }

    public final a a(String str) {
        ConcurrentHashMap<String, a> concurrentHashMap = this.f;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }
}
