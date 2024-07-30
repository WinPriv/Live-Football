package com.anythink.core.common.res.a;

import android.text.TextUtils;
import com.anythink.core.common.a.j;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.f;
import com.anythink.core.common.res.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends com.anythink.core.common.res.image.b {

    /* renamed from: a, reason: collision with root package name */
    final String f6417a;

    /* renamed from: b, reason: collision with root package name */
    public com.anythink.core.common.res.a.b f6418b;

    /* renamed from: j, reason: collision with root package name */
    public List<AbstractC0083a> f6419j;

    /* renamed from: k, reason: collision with root package name */
    public b f6420k;

    /* renamed from: l, reason: collision with root package name */
    int f6421l;

    /* renamed from: m, reason: collision with root package name */
    private final int f6422m;

    /* renamed from: n, reason: collision with root package name */
    private final int f6423n;
    private int o;

    /* renamed from: p, reason: collision with root package name */
    private int f6424p;

    /* renamed from: q, reason: collision with root package name */
    private long f6425q;

    /* renamed from: r, reason: collision with root package name */
    private String f6426r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6427s;

    /* renamed from: com.anythink.core.common.res.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0083a {
        public abstract void a(String str, String str2);

        public abstract boolean a(int i10, long j10, long j11);
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract void a(long j10, long j11, long j12, long j13, long j14);

        public abstract void a(String str, String str2, long j10, long j11, long j12, long j13);
    }

    public a(String str) {
        super(str);
        this.f6417a = "a";
        this.f6422m = 0;
        this.f6423n = 1;
        this.f6421l = -1;
        this.f6419j = new ArrayList();
        this.f6418b = new com.anythink.core.common.res.a.b();
        this.f6424p = 0;
        this.f6425q = 0L;
        this.f6427s = false;
        this.o = 0;
    }

    private int g() {
        return this.o;
    }

    private void h() {
        String a10 = d.a(n.a().g()).a(4);
        if (TextUtils.isEmpty(a10)) {
            b("", "without saveDirectory");
            return;
        }
        File file = new File(a10);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f6426r = d.a(n.a().g()).b(4, f.a(this.f6495c));
        File file2 = new File(this.f6426r);
        if (file2.exists()) {
            this.f6425q = file2.length();
        }
    }

    private boolean i() {
        int i10 = this.f6424p;
        if (i10 == 100) {
            a(i10, this.f6425q);
            b(this.f6424p, this.f6425q);
            return false;
        }
        if (this.o != 0 || i10 >= 100) {
            return false;
        }
        return true;
    }

    private synchronized void j() {
        this.f6419j.clear();
    }

    @Override // com.anythink.core.common.res.image.b
    public final Map<String, String> a() {
        return null;
    }

    @Override // com.anythink.core.common.res.image.b
    public final void b() {
    }

    @Override // com.anythink.core.common.res.image.b
    public final void c() {
        this.o = 0;
    }

    public final void e() {
        i();
        if (i()) {
            h();
            this.o = 1;
            d();
        }
    }

    public final void f() {
        i();
        this.f6427s = true;
        if (i()) {
            h();
            this.o = 1;
            d();
        }
    }

    private synchronized boolean b(int i10) {
        if (this.f6427s) {
            return true;
        }
        com.anythink.core.common.res.a.b bVar = this.f6418b;
        if (bVar.f6434c == 2) {
            if (i10 >= bVar.f6432a) {
                return false;
            }
        }
        return true;
    }

    public final synchronized void a(com.anythink.core.common.res.a.b bVar) {
        int i10 = bVar.f6432a;
        int i11 = bVar.f6434c;
        com.anythink.core.common.res.a.b bVar2 = this.f6418b;
        if (bVar2.f6432a < i10) {
            bVar2.f6432a = i10;
        }
        if (bVar2.f6434c != 1) {
            bVar2.f6434c = i11;
        }
    }

    private void b(int i10, long j10) {
        if (i10 == 100) {
            j.a().a(this.f6495c, this.f6426r, this.f6500i, j10, i10, true);
            b bVar = this.f6420k;
            if (bVar != null) {
                bVar.a(this.f6500i, this.f6497e, this.f6498g, this.f, this.f6499h);
            }
        }
    }

    public final synchronized void a(AbstractC0083a abstractC0083a) {
        if (!this.f6419j.contains(abstractC0083a)) {
            this.f6419j.add(abstractC0083a);
        }
    }

    private synchronized void b(String str, String str2) {
        this.o = 0;
        Iterator<AbstractC0083a> it = this.f6419j.iterator();
        while (it.hasNext()) {
            it.next().a(str, str2);
        }
        j();
        b bVar = this.f6420k;
        if (bVar != null) {
            bVar.a(str, str2, this.f6500i, this.f6497e, this.f, this.f6499h);
        }
    }

    private void a(b bVar) {
        this.f6420k = bVar;
    }

    private void a(int i10) {
        this.o = i10;
    }

    private synchronized void a(int i10, long j10) {
        if (this.f6421l != i10) {
            this.f6421l = i10;
        }
        Iterator<AbstractC0083a> it = this.f6419j.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (it.next().a(i10, j10, this.f6500i)) {
                z10 = i10 != 100;
                it.remove();
            }
        }
        j.a().a(this.f6495c, this.f6426r, this.f6500i, j10, i10, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v1, types: [long] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.anythink.core.common.res.image.b
    public final boolean a(InputStream inputStream) {
        ?? r22;
        FileOutputStream fileOutputStream;
        boolean z10 = false;
        if (!TextUtils.isEmpty(this.f6426r)) {
            FileOutputStream fileOutputStream2 = null;
            try {
                r22 = this.f6425q;
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (r22 > 0) {
                    inputStream.skip(r22);
                    fileOutputStream = new FileOutputStream(this.f6426r, true);
                    long j10 = this.f6425q;
                    int i10 = (int) (((j10 * 1.0d) / this.f6500i) * 100.0d);
                    this.f6424p = i10;
                    a(i10, j10);
                } else {
                    fileOutputStream = new FileOutputStream(this.f6426r);
                    this.f6424p = 0;
                }
                fileOutputStream2 = fileOutputStream;
                r22 = 2048;
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1 || !b(this.f6424p)) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                    long j11 = this.f6425q + read;
                    this.f6425q = j11;
                    int i11 = (int) (((j11 * 1.0d) / this.f6500i) * 100.0d);
                    this.f6424p = i11;
                    a(i11, j11);
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (Throwable unused) {
                }
                z10 = true;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = r22;
                try {
                    th.printStackTrace();
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    b(this.f6424p, this.f6425q);
                    return z10;
                } catch (Throwable th3) {
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    throw th3;
                }
            }
        }
        b(this.f6424p, this.f6425q);
        return z10;
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(com.anythink.core.common.k.b.b bVar) {
        com.anythink.core.common.k.b.a.a().a(bVar, 5);
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(String str, String str2) {
        b(str, str2);
    }
}
