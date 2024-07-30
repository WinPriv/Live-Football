package com.anythink.expressad.foundation.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.anythink.expressad.foundation.h.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9394a = "a";

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f9395c;

    /* renamed from: b, reason: collision with root package name */
    SharedPreferences f9396b;

    private a() {
    }

    public static a a() {
        if (f9395c == null) {
            synchronized (a.class) {
                if (f9395c == null) {
                    f9395c = new a();
                }
            }
        }
        return f9395c;
    }

    private int b(String str, int i10) {
        try {
            Context d10 = com.anythink.expressad.foundation.b.a.b().d();
            if (d10 == null) {
                return i10;
            }
            if (this.f9396b == null) {
                this.f9396b = d10.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
            }
            return this.f9396b.getInt(str, i10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return i10;
        }
    }

    private int c(String str) {
        try {
            Context d10 = com.anythink.expressad.foundation.b.a.b().d();
            if (d10 == null) {
                return 0;
            }
            if (this.f9396b == null) {
                this.f9396b = d10.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
            }
            return this.f9396b.getInt(str, 0);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private Long d(String str) {
        try {
            Context d10 = com.anythink.expressad.foundation.b.a.b().d();
            if (d10 == null) {
                o.d(f9394a, "context is null in get");
                return 0L;
            }
            if (this.f9396b == null) {
                this.f9396b = d10.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
            }
            return Long.valueOf(this.f9396b.getLong(str, 0L));
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    private List<String> b() {
        ArrayList arrayList = new ArrayList();
        Context d10 = com.anythink.expressad.foundation.b.a.b().d();
        if (d10 == null) {
            return null;
        }
        if (this.f9396b == null) {
            this.f9396b = d10.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
        }
        Iterator<Map.Entry<String, ?>> it = this.f9396b.getAll().entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }

    public final void a(String str, String str2) {
        try {
            Context d10 = com.anythink.expressad.foundation.b.a.b().d();
            if (d10 == null) {
                return;
            }
            if (this.f9396b == null) {
                this.f9396b = d10.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
            }
            SharedPreferences.Editor edit = this.f9396b.edit();
            edit.putString(str, str2);
            edit.apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void b(String str) {
        Context d10 = com.anythink.expressad.foundation.b.a.b().d();
        if (d10 == null) {
            return;
        }
        if (this.f9396b == null) {
            this.f9396b = d10.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
        }
        this.f9396b.edit().remove(str).apply();
    }

    private void a(String str, int i10) {
        try {
            Context d10 = com.anythink.expressad.foundation.b.a.b().d();
            if (d10 == null) {
                return;
            }
            if (this.f9396b == null) {
                this.f9396b = d10.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
            }
            SharedPreferences.Editor edit = this.f9396b.edit();
            edit.putInt(str, i10);
            edit.apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(String str, long j10) {
        try {
            Context d10 = com.anythink.expressad.foundation.b.a.b().d();
            if (d10 == null) {
                o.d(f9394a, "context is null in put");
                return;
            }
            if (this.f9396b == null) {
                this.f9396b = d10.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
            }
            SharedPreferences.Editor edit = this.f9396b.edit();
            edit.putLong(str, j10);
            edit.apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final String a(String str) {
        try {
            Context d10 = com.anythink.expressad.foundation.b.a.b().d();
            if (d10 == null) {
                return null;
            }
            if (this.f9396b == null) {
                this.f9396b = d10.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
            }
            return this.f9396b.getString(str, "");
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
