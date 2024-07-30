package com.google.gson.internal.sql;

import com.google.gson.internal.bind.a;
import java.sql.Date;
import java.sql.Timestamp;
import m8.b0;

/* compiled from: SqlTypesSupport.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f21428a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0242a f21429b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f21430c;

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f21431d;

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f21432e;
    public static final b0 f;

    /* compiled from: SqlTypesSupport.java */
    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0242a extends a.AbstractC0240a<Date> {
        public C0242a() {
            super(Date.class);
        }

        @Override // com.google.gson.internal.bind.a.AbstractC0240a
        public final Date b(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    /* compiled from: SqlTypesSupport.java */
    /* loaded from: classes2.dex */
    public class b extends a.AbstractC0240a<Timestamp> {
        public b() {
            super(Timestamp.class);
        }

        @Override // com.google.gson.internal.bind.a.AbstractC0240a
        public final Timestamp b(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f21428a = z10;
        if (z10) {
            f21429b = new C0242a();
            f21430c = new b();
            f21431d = SqlDateTypeAdapter.f21422b;
            f21432e = SqlTimeTypeAdapter.f21424b;
            f = SqlTimestampTypeAdapter.f21426b;
            return;
        }
        f21429b = null;
        f21430c = null;
        f21431d = null;
        f21432e = null;
        f = null;
    }
}
