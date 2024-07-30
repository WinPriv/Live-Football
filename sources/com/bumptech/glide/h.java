package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;

/* compiled from: GlideContext.java */
/* loaded from: classes.dex */
public final class h extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final a f19723k = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b3.b f19724a;

    /* renamed from: b, reason: collision with root package name */
    public final t3.f f19725b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.activity.n f19726c;

    /* renamed from: d, reason: collision with root package name */
    public final b.a f19727d;

    /* renamed from: e, reason: collision with root package name */
    public final List<p3.f<Object>> f19728e;
    public final Map<Class<?>, p<?, ?>> f;

    /* renamed from: g, reason: collision with root package name */
    public final a3.o f19729g;

    /* renamed from: h, reason: collision with root package name */
    public final i f19730h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19731i;

    /* renamed from: j, reason: collision with root package name */
    public p3.g f19732j;

    public h(Context context, b3.b bVar, l lVar, androidx.activity.n nVar, c cVar, q.b bVar2, List list, a3.o oVar, i iVar, int i10) {
        super(context.getApplicationContext());
        this.f19724a = bVar;
        this.f19726c = nVar;
        this.f19727d = cVar;
        this.f19728e = list;
        this.f = bVar2;
        this.f19729g = oVar;
        this.f19730h = iVar;
        this.f19731i = i10;
        this.f19725b = new t3.f(lVar);
    }

    public final k a() {
        return (k) this.f19725b.get();
    }
}
