package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;

/* compiled from: MetadataRepo.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final v0.b f1665a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f1666b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1667c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f1668d;

    /* compiled from: MetadataRepo.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f1669a;

        /* renamed from: b, reason: collision with root package name */
        public i f1670b;

        public a() {
            this(1);
        }

        public final void a(i iVar, int i10, int i11) {
            a aVar;
            int a10 = iVar.a(i10);
            SparseArray<a> sparseArray = this.f1669a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(a10);
            }
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(iVar.a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(iVar, i10 + 1, i11);
            } else {
                aVar.f1670b = iVar;
            }
        }

        public a(int i10) {
            this.f1669a = new SparseArray<>(i10);
        }
    }

    public n(Typeface typeface, v0.b bVar) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        this.f1668d = typeface;
        this.f1665a = bVar;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.f35904a;
            i10 = bVar.f35905b.getInt(bVar.f35905b.getInt(i13) + i13);
        } else {
            i10 = 0;
        }
        this.f1666b = new char[i10 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.f35904a;
            i11 = bVar.f35905b.getInt(bVar.f35905b.getInt(i14) + i14);
        } else {
            i11 = 0;
        }
        for (int i15 = 0; i15 < i11; i15++) {
            i iVar = new i(this, i15);
            v0.a c10 = iVar.c();
            int a12 = c10.a(4);
            if (a12 != 0) {
                i12 = c10.f35905b.getInt(a12 + c10.f35904a);
            } else {
                i12 = 0;
            }
            Character.toChars(i12, this.f1666b, i15 * 2);
            if (iVar.b() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            a0.a.u0(z10, "invalid metadata codepoint length");
            this.f1667c.a(iVar, 0, iVar.b() - 1);
        }
    }
}
