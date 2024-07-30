package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GlideExperiments.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, Object> f19733a;

    /* compiled from: GlideExperiments.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f19734a = new HashMap();
    }

    public i(a aVar) {
        this.f19733a = Collections.unmodifiableMap(new HashMap(aVar.f19734a));
    }
}
