package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import ka.n7;
import ka.u4;

/* loaded from: classes2.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f22512a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f22513b;

    public c0(Context context) {
        this.f22513b = context.getApplicationContext();
        this.f22512a = l.d(context);
    }

    public static void g(u4 u4Var) {
        if (u4Var != null) {
            synchronized (u4Var) {
                u4Var.close();
            }
        }
    }

    public final <T extends pa.a> long d(Class<T> cls, ContentValues contentValues) {
        if (!this.f22512a.k()) {
            return 0L;
        }
        u4 m10 = m();
        try {
            return m10.c(contentValues, cls.getSimpleName());
        } finally {
            g(m10);
        }
    }

    public abstract String e();

    public final void f(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            cursor.close();
        } catch (Throwable unused) {
            n7.i(e(), "closeCursor exception");
        }
    }

    public final ArrayList h(Class cls, String[] strArr, int i10, String[] strArr2, String str, String str2) {
        String a10;
        Cursor cursor;
        Cursor query;
        ArrayList arrayList = new ArrayList();
        u4 u4Var = null;
        if (i10 == 0) {
            a10 = null;
        } else {
            a10 = a3.k.a(i10);
        }
        try {
            u4 m10 = m();
            try {
                String simpleName = cls.getSimpleName();
                synchronized (m10) {
                    query = m10.getReadableDatabase().query(simpleName, strArr, a10, strArr2, null, null, str, str2);
                }
                if (query != null) {
                    while (query.moveToNext()) {
                        try {
                            try {
                                pa.a aVar = (pa.a) cls.newInstance();
                                aVar.m(query);
                                arrayList.add(aVar);
                            } catch (Throwable th) {
                                n7.i(e(), "query:" + th.getClass().getSimpleName());
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            u4Var = query;
                            cursor = u4Var;
                            u4Var = m10;
                            try {
                                n7.j(e(), "query db exception: %s", th.getClass().getSimpleName());
                                return arrayList;
                            } finally {
                                f(cursor);
                                g(u4Var);
                            }
                        }
                    }
                }
                f(query);
                g(m10);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Lpa/a;>(Ljava/lang/Class<TT;>;Ljava/lang/Object;Ljava/util/List<Ljava/lang/String;>;)V */
    public final void i(Class cls, int i10, List list) {
        u4 m10 = m();
        try {
            m10.g(cls.getSimpleName(), a3.k.a(i10), list);
        } finally {
            g(m10);
        }
    }

    public final void j(Class cls, int i10, String[] strArr) {
        String a10;
        u4 m10 = m();
        if (i10 == 0) {
            a10 = null;
        } else {
            a10 = a3.k.a(i10);
        }
        try {
            String simpleName = cls.getSimpleName();
            synchronized (m10) {
                try {
                    m10.getWritableDatabase().delete(simpleName, a10, strArr);
                } catch (Exception unused) {
                    n7.g(m10.d(), "delete ex");
                }
            }
        } finally {
            g(m10);
        }
    }

    public final void k(Class cls, ContentValues contentValues, int i10, ArrayList arrayList) {
        u4 m10 = m();
        try {
            m10.f(cls.getSimpleName(), contentValues, a3.k.a(i10), arrayList);
        } finally {
            g(m10);
        }
    }

    public final void l(Class cls, ContentValues contentValues, int i10, String[] strArr) {
        if (!this.f22512a.k()) {
            return;
        }
        u4 m10 = m();
        try {
            m10.b(cls.getSimpleName(), contentValues, a3.k.a(i10), strArr);
        } finally {
            g(m10);
        }
    }

    public abstract u4 m();
}
