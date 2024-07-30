package com.google.gson.internal.bind;

import a3.k;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m8.a0;
import m8.i;
import m8.o;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* loaded from: classes2.dex */
public final class f extends ReflectiveTypeAdapterFactory.b {
    public final /* synthetic */ boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Method f21412g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f21413h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0 f21414i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f21415j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r8.a f21416k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f21417l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f21418m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, Field field, boolean z10, boolean z11, boolean z12, Method method, boolean z13, a0 a0Var, i iVar, r8.a aVar, boolean z14, boolean z15) {
        super(str, field, z10, z11);
        this.f = z12;
        this.f21412g = method;
        this.f21413h = z13;
        this.f21414i = a0Var;
        this.f21415j = iVar;
        this.f21416k = aVar;
        this.f21417l = z14;
        this.f21418m = z15;
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
    public final void a(s8.a aVar, int i10, Object[] objArr) throws IOException, l1.c {
        Object a10 = this.f21414i.a(aVar);
        if (a10 == null && this.f21417l) {
            throw new l1.c("null is not allowed as value for record component '" + this.f21350c + "' of primitive type; at path " + aVar.i());
        }
        objArr[i10] = a10;
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
    public final void b(s8.a aVar, Object obj) throws IOException, IllegalAccessException {
        Object a10 = this.f21414i.a(aVar);
        if (a10 != null || !this.f21417l) {
            boolean z10 = this.f;
            Field field = this.f21349b;
            if (z10) {
                ReflectiveTypeAdapterFactory.b(obj, field);
            } else if (this.f21418m) {
                throw new o(s.f.b("Cannot set value of 'static final' ", q8.a.d(field, false)));
            }
            field.set(obj, a10);
        }
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
    public final void c(s8.b bVar, Object obj) throws IOException, IllegalAccessException {
        Object obj2;
        if (!this.f21351d) {
            return;
        }
        boolean z10 = this.f;
        Field field = this.f21349b;
        Method method = this.f21412g;
        if (z10) {
            if (method == null) {
                ReflectiveTypeAdapterFactory.b(obj, field);
            } else {
                ReflectiveTypeAdapterFactory.b(obj, method);
            }
        }
        if (method != null) {
            try {
                obj2 = method.invoke(obj, new Object[0]);
            } catch (InvocationTargetException e10) {
                throw new o(k.l("Accessor ", q8.a.d(method, false), " threw exception"), e10.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.h(this.f21348a);
        boolean z11 = this.f21413h;
        a0 a0Var = this.f21414i;
        if (!z11) {
            a0Var = new h(this.f21415j, a0Var, this.f21416k.getType());
        }
        a0Var.b(bVar, obj2);
    }
}
