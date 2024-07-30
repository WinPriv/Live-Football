package com.anythink.expressad.exoplayer.j.a;

import android.util.SparseArray;
import com.anythink.expressad.exoplayer.j.a.a;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.k.x;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8757a = "cached_content_index.exi";

    /* renamed from: b, reason: collision with root package name */
    private static final int f8758b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8759c = 1;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, g> f8760d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<String> f8761e;
    private final com.anythink.expressad.exoplayer.k.b f;

    /* renamed from: g, reason: collision with root package name */
    private final Cipher f8762g;

    /* renamed from: h, reason: collision with root package name */
    private final SecretKeySpec f8763h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8764i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8765j;

    /* renamed from: k, reason: collision with root package name */
    private x f8766k;

    private h(File file) {
        this(file, null);
    }

    private boolean f() {
        DataInputStream dataInputStream = null;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f.c());
            DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
            try {
                int readInt = dataInputStream2.readInt();
                if (readInt >= 0 && readInt <= 2) {
                    if ((dataInputStream2.readInt() & 1) != 0) {
                        if (this.f8762g == null) {
                            af.a((Closeable) dataInputStream2);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream2.readFully(bArr);
                        try {
                            this.f8762g.init(2, this.f8763h, new IvParameterSpec(bArr));
                            dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f8762g));
                        } catch (InvalidAlgorithmParameterException e10) {
                            e = e10;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e11) {
                            e = e11;
                            throw new IllegalStateException(e);
                        }
                    } else if (this.f8764i) {
                        this.f8765j = true;
                    }
                    int readInt2 = dataInputStream2.readInt();
                    int i10 = 0;
                    for (int i11 = 0; i11 < readInt2; i11++) {
                        g a10 = g.a(readInt, dataInputStream2);
                        a(a10);
                        i10 += a10.a(readInt);
                    }
                    int readInt3 = dataInputStream2.readInt();
                    boolean z10 = dataInputStream2.read() == -1;
                    if (readInt3 == i10 && z10) {
                        af.a((Closeable) dataInputStream2);
                        return true;
                    }
                    af.a((Closeable) dataInputStream2);
                    return false;
                }
                af.a((Closeable) dataInputStream2);
                return false;
            } catch (IOException unused) {
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    af.a((Closeable) dataInputStream);
                }
                return false;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    af.a((Closeable) dataInputStream);
                }
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void g() {
        DataOutputStream dataOutputStream;
        int i10;
        DataOutputStream dataOutputStream2 = null;
        try {
            try {
                OutputStream b10 = this.f.b();
                x xVar = this.f8766k;
                if (xVar == null) {
                    this.f8766k = new x(b10);
                } else {
                    xVar.a(b10);
                }
                dataOutputStream = new DataOutputStream(this.f8766k);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            dataOutputStream.writeInt(2);
            int i11 = 0;
            if (this.f8764i) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            dataOutputStream.writeInt(i10);
            if (this.f8764i) {
                byte[] bArr = new byte[16];
                new Random().nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    this.f8762g.init(1, this.f8763h, new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(this.f8766k, this.f8762g));
                } catch (InvalidAlgorithmParameterException e11) {
                    e = e11;
                    throw new IllegalStateException(e);
                } catch (InvalidKeyException e12) {
                    e = e12;
                    throw new IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(this.f8760d.size());
            for (g gVar : this.f8760d.values()) {
                gVar.a(dataOutputStream);
                i11 += gVar.a(2);
            }
            dataOutputStream.writeInt(i11);
            this.f.a(dataOutputStream);
            af.a((Closeable) null);
        } catch (IOException e13) {
            e = e13;
            dataOutputStream2 = dataOutputStream;
            throw new a.C0114a(e);
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream2 = dataOutputStream;
            af.a(dataOutputStream2);
            throw th;
        }
    }

    private static Cipher h() {
        if (af.f8993a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    public final void a() {
        com.anythink.expressad.exoplayer.k.a.b(!this.f8765j);
        if (f()) {
            return;
        }
        this.f.a();
        this.f8760d.clear();
        this.f8761e.clear();
    }

    public final void b() {
        DataOutputStream dataOutputStream;
        if (this.f8765j) {
            DataOutputStream dataOutputStream2 = null;
            try {
                try {
                    OutputStream b10 = this.f.b();
                    x xVar = this.f8766k;
                    if (xVar == null) {
                        this.f8766k = new x(b10);
                    } else {
                        xVar.a(b10);
                    }
                    dataOutputStream = new DataOutputStream(this.f8766k);
                } catch (IOException e10) {
                    e = e10;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.f8764i ? 1 : 0);
                if (this.f8764i) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.f8762g.init(1, this.f8763h, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(this.f8766k, this.f8762g));
                    } catch (InvalidAlgorithmParameterException e11) {
                        e = e11;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e12) {
                        e = e12;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(this.f8760d.size());
                int i10 = 0;
                for (g gVar : this.f8760d.values()) {
                    gVar.a(dataOutputStream);
                    i10 += gVar.a(2);
                }
                dataOutputStream.writeInt(i10);
                this.f.a(dataOutputStream);
                af.a((Closeable) null);
                this.f8765j = false;
            } catch (IOException e13) {
                e = e13;
                dataOutputStream2 = dataOutputStream;
                throw new a.C0114a(e);
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream2 = dataOutputStream;
                af.a(dataOutputStream2);
                throw th;
            }
        }
    }

    public final Collection<g> c() {
        return this.f8760d.values();
    }

    public final void d(String str) {
        g gVar = this.f8760d.get(str);
        if (gVar == null || !gVar.d() || gVar.b()) {
            return;
        }
        this.f8760d.remove(str);
        this.f8761e.remove(gVar.f8753a);
        this.f8765j = true;
    }

    public final Set<String> e() {
        return this.f8760d.keySet();
    }

    private h(File file, byte[] bArr) {
        this(file, bArr, bArr != null);
    }

    public final int c(String str) {
        return a(str).f8753a;
    }

    public final i e(String str) {
        g b10 = b(str);
        return b10 != null ? b10.a() : l.f8773b;
    }

    public h(File file, byte[] bArr, boolean z10) {
        this.f8764i = z10;
        if (bArr != null) {
            com.anythink.expressad.exoplayer.k.a.a(bArr.length == 16);
            try {
                this.f8762g = h();
                this.f8763h = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            com.anythink.expressad.exoplayer.k.a.b(!z10);
            this.f8762g = null;
            this.f8763h = null;
        }
        this.f8760d = new HashMap<>();
        this.f8761e = new SparseArray<>();
        this.f = new com.anythink.expressad.exoplayer.k.b(new File(file, f8757a));
    }

    public final g a(String str) {
        g gVar = this.f8760d.get(str);
        if (gVar != null) {
            return gVar;
        }
        SparseArray<String> sparseArray = this.f8761e;
        int size = sparseArray.size();
        int i10 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            keyAt = i10;
        }
        g gVar2 = new g(keyAt, str);
        a(gVar2);
        this.f8765j = true;
        return gVar2;
    }

    public final void d() {
        int size = this.f8760d.size();
        String[] strArr = new String[size];
        this.f8760d.keySet().toArray(strArr);
        for (int i10 = 0; i10 < size; i10++) {
            d(strArr[i10]);
        }
    }

    public final String a(int i10) {
        return this.f8761e.get(i10);
    }

    public final void a(String str, k kVar) {
        if (a(str).a(kVar)) {
            this.f8765j = true;
        }
    }

    private void a(g gVar) {
        this.f8760d.put(gVar.f8754b, gVar);
        this.f8761e.put(gVar.f8753a, gVar.f8754b);
    }

    private static int a(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i10 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt >= 0) {
            return keyAt;
        }
        while (i10 < size && i10 == sparseArray.keyAt(i10)) {
            i10++;
        }
        return i10;
    }

    private g f(String str) {
        SparseArray<String> sparseArray = this.f8761e;
        int size = sparseArray.size();
        int i10 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            keyAt = i10;
        }
        g gVar = new g(keyAt, str);
        a(gVar);
        this.f8765j = true;
        return gVar;
    }

    public final g b(String str) {
        return this.f8760d.get(str);
    }
}
