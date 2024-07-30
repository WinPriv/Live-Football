package com.anythink.expressad.foundation.g.f;

import com.anythink.expressad.foundation.h.o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public abstract class i<T> implements Comparable<i<T>> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f10031c = "i";

    /* renamed from: a, reason: collision with root package name */
    protected ConcurrentHashMap<String, String> f10032a;

    /* renamed from: b, reason: collision with root package name */
    protected e<T> f10033b;

    /* renamed from: d, reason: collision with root package name */
    private final int f10034d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10035e;
    private Integer f;

    /* renamed from: g, reason: collision with root package name */
    private j f10036g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10037h;

    /* renamed from: i, reason: collision with root package name */
    private l f10038i;

    /* renamed from: j, reason: collision with root package name */
    private Object f10039j;

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f10040a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f10041b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f10042c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f10043d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f10044e = 4;
        public static final int f = 5;

        /* renamed from: g, reason: collision with root package name */
        public static final int f10045g = 6;

        /* renamed from: h, reason: collision with root package name */
        public static final int f10046h = 7;
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f10047a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f10048b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f10049c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f10050d = 4;

        private b() {
        }
    }

    public i(int i10, String str, e<T> eVar) {
        this.f10032a = new ConcurrentHashMap<>();
        this.f10037h = false;
        this.f10035e = str;
        this.f10034d = i10;
        this.f10033b = eVar;
        this.f10038i = new com.anythink.expressad.foundation.g.f.b();
    }

    public static com.anythink.expressad.foundation.g.f.a.a a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        return aVar;
    }

    private int p() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public abstract k<T> a(com.anythink.expressad.foundation.g.f.f.c cVar);

    public final Object b() {
        return this.f10039j;
    }

    public final void c() {
        j jVar = this.f10036g;
        if (jVar != null) {
            jVar.b(this);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        i iVar = (i) obj;
        int j10 = j();
        int j11 = iVar.j();
        if (j10 == j11) {
            return this.f.intValue() - iVar.f.intValue();
        }
        return j11 - j10;
    }

    public final String d() {
        return this.f10035e;
    }

    public final void e() {
        this.f10037h = true;
    }

    public final boolean f() {
        return this.f10037h;
    }

    public final Map<String, String> g() {
        return this.f10032a;
    }

    public byte[] h() {
        return null;
    }

    public void i() {
        a("Connection", "close");
        a("Charset", "UTF-8");
    }

    public int j() {
        return 2;
    }

    public final int k() {
        return this.f10038i.b();
    }

    public final l l() {
        return this.f10038i;
    }

    public final void m() {
        e<T> eVar = this.f10033b;
        if (eVar != null) {
            eVar.c();
        }
    }

    public final void n() {
        e<T> eVar = this.f10033b;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final void o() {
        e<T> eVar = this.f10033b;
        if (eVar != null) {
            eVar.a();
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f10037h) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb2.append(str);
        sb2.append(this.f10035e);
        sb2.append(" ");
        sb2.append(j());
        sb2.append(" ");
        sb2.append(this.f);
        return sb2.toString();
    }

    public void a(OutputStream outputStream) {
    }

    public final void b(com.anythink.expressad.foundation.g.f.a.a aVar) {
        e<T> eVar = this.f10033b;
        if (eVar != null) {
            eVar.a(aVar);
        }
    }

    public final int a() {
        return this.f10034d;
    }

    public final void a(e<T> eVar) {
        this.f10033b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i<?> a(Object obj) {
        this.f10039j = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> a(l lVar) {
        this.f10038i = lVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> a(j jVar) {
        this.f10036g = jVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> a(int i10) {
        this.f = Integer.valueOf(i10);
        return this;
    }

    public i(String str) {
        this.f10032a = new ConcurrentHashMap<>();
        this.f10033b = null;
        this.f10037h = false;
        this.f10035e = str;
        this.f10034d = 0;
        this.f10038i = new com.anythink.expressad.foundation.g.f.b();
    }

    public final void a(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    private void a(String str) {
        this.f10032a.remove(str);
    }

    public byte[] a(com.anythink.expressad.foundation.g.f.f.b bVar, c cVar) {
        return bVar.c() != null ? a(bVar) : new byte[0];
    }

    private static byte[] a(com.anythink.expressad.foundation.g.f.f.b bVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            InputStream c10 = bVar.c();
            try {
                if (com.anythink.expressad.foundation.g.f.g.e.b(bVar.b()) && !(c10 instanceof GZIPInputStream)) {
                    c10 = new GZIPInputStream(c10);
                }
                if (c10 != null) {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = c10.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, read);
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        try {
                            c10.close();
                            byteArrayOutputStream2.close();
                        } catch (IOException e10) {
                            o.d(f10031c, e10.getMessage());
                        }
                        return byteArray;
                    } catch (Throwable th) {
                        inputStream = c10;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e11) {
                                o.d(f10031c, e11.getMessage());
                                throw th;
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                }
                throw new com.anythink.expressad.foundation.g.f.a.a(7, null);
            } catch (Throwable th2) {
                th = th2;
                inputStream = c10;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    private static void q() {
    }

    private static void r() {
    }

    public final void a(k<T> kVar) {
        e<T> eVar = this.f10033b;
        if (eVar != null) {
            eVar.a(kVar);
        }
    }

    public final void a(long j10, long j11) {
        e<T> eVar = this.f10033b;
        if (eVar != null) {
            eVar.a(j10, j11);
        }
    }

    private int a(i<T> iVar) {
        int j10 = j();
        int j11 = iVar.j();
        return j10 == j11 ? this.f.intValue() - iVar.f.intValue() : j11 - j10;
    }

    public final void a(String str, String str2) {
        this.f10032a.remove(str);
        this.f10032a.put(str, str2);
    }
}
