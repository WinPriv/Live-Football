package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* compiled from: EmojiMetadata.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<v0.a> f1641d = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    public final int f1642a;

    /* renamed from: b, reason: collision with root package name */
    public final n f1643b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1644c = 0;

    public i(n nVar, int i10) {
        this.f1643b = nVar;
        this.f1642a = i10;
    }

    public final int a(int i10) {
        v0.a c10 = c();
        int a10 = c10.a(16);
        if (a10 != 0) {
            ByteBuffer byteBuffer = c10.f35905b;
            int i11 = a10 + c10.f35904a;
            return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
        }
        return 0;
    }

    public final int b() {
        v0.a c10 = c();
        int a10 = c10.a(16);
        if (a10 != 0) {
            int i10 = a10 + c10.f35904a;
            return c10.f35905b.getInt(c10.f35905b.getInt(i10) + i10);
        }
        return 0;
    }

    public final v0.a c() {
        ThreadLocal<v0.a> threadLocal = f1641d;
        v0.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new v0.a();
            threadLocal.set(aVar);
        }
        v0.b bVar = this.f1643b.f1665a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i10 = a10 + bVar.f35904a;
            int i11 = (this.f1642a * 4) + bVar.f35905b.getInt(i10) + i10 + 4;
            aVar.b(bVar.f35905b.getInt(i11) + i11, bVar.f35905b);
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        v0.a c10 = c();
        int a10 = c10.a(4);
        if (a10 != 0) {
            i10 = c10.f35905b.getInt(a10 + c10.f35904a);
        } else {
            i10 = 0;
        }
        sb2.append(Integer.toHexString(i10));
        sb2.append(", codepoints:");
        int b10 = b();
        for (int i11 = 0; i11 < b10; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
