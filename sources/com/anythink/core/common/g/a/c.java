package com.anythink.core.common.g.a;

import com.anythink.core.common.g.a.d;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5838d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5839e = 2;
    public static final int f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5840g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5841h = 4;

    /* renamed from: a, reason: collision with root package name */
    private final int f5842a = 0;

    /* renamed from: i, reason: collision with root package name */
    protected int f5843i;

    /* renamed from: j, reason: collision with root package name */
    protected String f5844j;

    /* loaded from: classes.dex */
    public interface a {
        void a(Object obj);

        void a(Throwable th);
    }

    public void a(String str, String str2, String str3, int i10) {
    }

    public abstract int c();

    public abstract int d();

    public abstract byte[] e();

    public abstract boolean f();

    public final JSONObject g() {
        return com.anythink.core.common.g.c.a(h());
    }

    public int h() {
        return 0;
    }

    public final void a(int i10, String str) {
        this.f5843i = i10;
        this.f5844j = str;
    }

    public static byte[] a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(com.anythink.expressad.foundation.g.a.bN));
            gZIPOutputStream.close();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static JSONObject a() {
        return com.anythink.core.common.g.c.a();
    }

    public final void a(a aVar) {
        com.anythink.core.common.k.b.a.a().a((com.anythink.core.common.k.b.b) new d.AnonymousClass1(this, aVar), 4);
    }
}
