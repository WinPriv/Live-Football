package com.anythink.core.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.c.d;
import com.anythink.core.common.c.l;
import com.anythink.core.common.e.ae;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.v;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static a f4503e;

    /* renamed from: a, reason: collision with root package name */
    l f4504a;

    /* renamed from: b, reason: collision with root package name */
    SimpleDateFormat f4505b = new SimpleDateFormat("yyyyMMdd");

    /* renamed from: c, reason: collision with root package name */
    SimpleDateFormat f4506c = new SimpleDateFormat("yyyyMMddHH");

    /* renamed from: d, reason: collision with root package name */
    Context f4507d;

    private a(Context context) {
        this.f4504a = l.a(com.anythink.core.common.c.c.a(context));
        this.f4507d = context;
    }

    public static a a(Context context) {
        if (f4503e == null) {
            f4503e = new a(context);
        }
        return f4503e;
    }

    public final void a() {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                aVar.f4504a.a(aVar.f4505b.format(new Date(System.currentTimeMillis())));
            }
        });
    }

    public final boolean a(d dVar, String str) {
        if (dVar.ab() == -1 && dVar.ac() == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ae a10 = this.f4504a.a(str, this.f4505b.format(new Date(currentTimeMillis)), this.f4506c.format(new Date(currentTimeMillis)));
        int i10 = a10 != null ? a10.f5459c : 0;
        int i11 = a10 != null ? a10.f5460d : 0;
        if (dVar.ab() == -1 || i10 < dVar.ab()) {
            return dVar.ac() != -1 && ((long) i11) >= dVar.ac();
        }
        return true;
    }

    public final boolean a(String str, ai aiVar) {
        if (aiVar.f() == -1 && aiVar.e() == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ae.a a10 = this.f4504a.a(str, aiVar.t(), this.f4505b.format(new Date(currentTimeMillis)), this.f4506c.format(new Date(currentTimeMillis)));
        if (a10 == null) {
            a10 = new ae.a();
        }
        if (aiVar.f() == -1 || a10.f5466e < aiVar.f()) {
            return aiVar.e() != -1 && a10.f5465d >= aiVar.e();
        }
        return true;
    }

    public final ae a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        return this.f4504a.a(str, this.f4505b.format(new Date(currentTimeMillis)), this.f4506c.format(new Date(currentTimeMillis)));
    }

    public final ae.a a(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        return this.f4504a.a(str, str2, this.f4505b.format(new Date(currentTimeMillis)), this.f4506c.format(new Date(currentTimeMillis)));
    }

    public final Map<String, ae> a(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        return this.f4504a.a(i10, this.f4505b.format(new Date(currentTimeMillis)), this.f4506c.format(new Date(currentTimeMillis)));
    }

    public final void a(String str, String str2, String str3) {
        synchronized (v.a().a(str2)) {
            long currentTimeMillis = System.currentTimeMillis();
            String format = this.f4505b.format(new Date(currentTimeMillis));
            String format2 = this.f4506c.format(new Date(currentTimeMillis));
            int parseInt = Integer.parseInt(str);
            ae.a a10 = a(str2, str3);
            if (a10 == null) {
                a10 = new ae.a();
                a10.f5462a = str3;
            }
            if (!TextUtils.equals(format, a10.f5464c)) {
                a10.f5465d = 1;
                a10.f5464c = format;
            } else {
                a10.f5465d++;
            }
            if (!TextUtils.equals(format2, a10.f5463b)) {
                a10.f5466e = 1;
                a10.f5463b = format2;
            } else {
                a10.f5466e++;
            }
            a10.f = currentTimeMillis;
            this.f4504a.a(parseInt, str2, a10);
        }
    }
}
