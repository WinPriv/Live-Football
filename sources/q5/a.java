package q5;

import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k4.i0;
import x4.l;

/* compiled from: SsManifest.java */
/* loaded from: classes2.dex */
public final class a implements i5.b<a> {

    /* renamed from: a, reason: collision with root package name */
    public final int f34653a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34654b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34655c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34656d;

    /* renamed from: e, reason: collision with root package name */
    public final C0462a f34657e;
    public final b[] f;

    /* renamed from: g, reason: collision with root package name */
    public final long f34658g;

    /* renamed from: h, reason: collision with root package name */
    public final long f34659h;

    /* compiled from: SsManifest.java */
    /* renamed from: q5.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0462a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f34660a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f34661b;

        /* renamed from: c, reason: collision with root package name */
        public final l[] f34662c;

        public C0462a(UUID uuid, byte[] bArr, l[] lVarArr) {
            this.f34660a = uuid;
            this.f34661b = bArr;
            this.f34662c = lVarArr;
        }
    }

    /* compiled from: SsManifest.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f34663a;

        /* renamed from: b, reason: collision with root package name */
        public final String f34664b;

        /* renamed from: c, reason: collision with root package name */
        public final long f34665c;

        /* renamed from: d, reason: collision with root package name */
        public final String f34666d;

        /* renamed from: e, reason: collision with root package name */
        public final int f34667e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f34668g;

        /* renamed from: h, reason: collision with root package name */
        public final int f34669h;

        /* renamed from: i, reason: collision with root package name */
        public final String f34670i;

        /* renamed from: j, reason: collision with root package name */
        public final i0[] f34671j;

        /* renamed from: k, reason: collision with root package name */
        public final int f34672k;

        /* renamed from: l, reason: collision with root package name */
        public final String f34673l;

        /* renamed from: m, reason: collision with root package name */
        public final String f34674m;

        /* renamed from: n, reason: collision with root package name */
        public final List<Long> f34675n;
        public final long[] o;

        /* renamed from: p, reason: collision with root package name */
        public final long f34676p;

        public b() {
            throw null;
        }

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, i0[] i0VarArr, List<Long> list, long[] jArr, long j11) {
            this.f34673l = str;
            this.f34674m = str2;
            this.f34663a = i10;
            this.f34664b = str3;
            this.f34665c = j10;
            this.f34666d = str4;
            this.f34667e = i11;
            this.f = i12;
            this.f34668g = i13;
            this.f34669h = i14;
            this.f34670i = str5;
            this.f34671j = i0VarArr;
            this.f34675n = list;
            this.o = jArr;
            this.f34676p = j11;
            this.f34672k = list.size();
        }

        public final b a(i0[] i0VarArr) {
            return new b(this.f34673l, this.f34674m, this.f34663a, this.f34664b, this.f34665c, this.f34666d, this.f34667e, this.f, this.f34668g, this.f34669h, this.f34670i, i0VarArr, this.f34675n, this.o, this.f34676p);
        }

        public final long b(int i10) {
            if (i10 == this.f34672k - 1) {
                return this.f34676p;
            }
            long[] jArr = this.o;
            return jArr[i10 + 1] - jArr[i10];
        }
    }

    public a(int i10, int i11, long j10, long j11, int i12, boolean z10, C0462a c0462a, b[] bVarArr) {
        this.f34653a = i10;
        this.f34654b = i11;
        this.f34658g = j10;
        this.f34659h = j11;
        this.f34655c = i12;
        this.f34656d = z10;
        this.f34657e = c0462a;
        this.f = bVarArr;
    }

    @Override // i5.b
    public final a a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i10);
            b bVar2 = this.f[streamKey.f20117t];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.a((i0[]) arrayList3.toArray(new i0[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f34671j[streamKey.f20118u]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((i0[]) arrayList3.toArray(new i0[0])));
        }
        return new a(this.f34653a, this.f34654b, this.f34658g, this.f34659h, this.f34655c, this.f34656d, this.f34657e, (b[]) arrayList2.toArray(new b[0]));
    }
}
