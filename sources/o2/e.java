package o2;

import androidx.appcompat.app.r;
import java.util.List;
import java.util.Locale;
import q2.j;

/* compiled from: Layer.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List<n2.b> f33573a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.h f33574b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33575c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33576d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33577e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final String f33578g;

    /* renamed from: h, reason: collision with root package name */
    public final List<n2.f> f33579h;

    /* renamed from: i, reason: collision with root package name */
    public final m2.h f33580i;

    /* renamed from: j, reason: collision with root package name */
    public final int f33581j;

    /* renamed from: k, reason: collision with root package name */
    public final int f33582k;

    /* renamed from: l, reason: collision with root package name */
    public final int f33583l;

    /* renamed from: m, reason: collision with root package name */
    public final float f33584m;

    /* renamed from: n, reason: collision with root package name */
    public final float f33585n;
    public final float o;

    /* renamed from: p, reason: collision with root package name */
    public final float f33586p;

    /* renamed from: q, reason: collision with root package name */
    public final m2.f f33587q;

    /* renamed from: r, reason: collision with root package name */
    public final m2.g f33588r;

    /* renamed from: s, reason: collision with root package name */
    public final m2.b f33589s;

    /* renamed from: t, reason: collision with root package name */
    public final List<t2.a<Float>> f33590t;

    /* renamed from: u, reason: collision with root package name */
    public final int f33591u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f33592v;

    /* renamed from: w, reason: collision with root package name */
    public final r f33593w;

    /* renamed from: x, reason: collision with root package name */
    public final j f33594x;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Ln2/b;>;Lg2/h;Ljava/lang/String;JLjava/lang/Object;JLjava/lang/String;Ljava/util/List<Ln2/f;>;Lm2/h;IIIFFFFLm2/f;Lm2/g;Ljava/util/List<Lt2/a<Ljava/lang/Float;>;>;Ljava/lang/Object;Lm2/b;ZLandroidx/appcompat/app/r;Lq2/j;)V */
    public e(List list, g2.h hVar, String str, long j10, int i10, long j11, String str2, List list2, m2.h hVar2, int i11, int i12, int i13, float f, float f10, float f11, float f12, m2.f fVar, m2.g gVar, List list3, int i14, m2.b bVar, boolean z10, r rVar, j jVar) {
        this.f33573a = list;
        this.f33574b = hVar;
        this.f33575c = str;
        this.f33576d = j10;
        this.f33577e = i10;
        this.f = j11;
        this.f33578g = str2;
        this.f33579h = list2;
        this.f33580i = hVar2;
        this.f33581j = i11;
        this.f33582k = i12;
        this.f33583l = i13;
        this.f33584m = f;
        this.f33585n = f10;
        this.o = f11;
        this.f33586p = f12;
        this.f33587q = fVar;
        this.f33588r = gVar;
        this.f33590t = list3;
        this.f33591u = i14;
        this.f33589s = bVar;
        this.f33592v = z10;
        this.f33593w = rVar;
        this.f33594x = jVar;
    }

    public final String a(String str) {
        int i10;
        StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
        j10.append(this.f33575c);
        j10.append("\n");
        g2.h hVar = this.f33574b;
        e eVar = (e) hVar.f28412h.d(this.f, null);
        if (eVar != null) {
            j10.append("\t\tParents: ");
            j10.append(eVar.f33575c);
            for (e eVar2 = (e) hVar.f28412h.d(eVar.f, null); eVar2 != null; eVar2 = (e) hVar.f28412h.d(eVar2.f, null)) {
                j10.append("->");
                j10.append(eVar2.f33575c);
            }
            j10.append(str);
            j10.append("\n");
        }
        List<n2.f> list = this.f33579h;
        if (!list.isEmpty()) {
            j10.append(str);
            j10.append("\tMasks: ");
            j10.append(list.size());
            j10.append("\n");
        }
        int i11 = this.f33581j;
        if (i11 != 0 && (i10 = this.f33582k) != 0) {
            j10.append(str);
            j10.append("\tBackground: ");
            j10.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f33583l)));
        }
        List<n2.b> list2 = this.f33573a;
        if (!list2.isEmpty()) {
            j10.append(str);
            j10.append("\tShapes:\n");
            for (n2.b bVar : list2) {
                j10.append(str);
                j10.append("\t\t");
                j10.append(bVar);
                j10.append("\n");
            }
        }
        return j10.toString();
    }

    public final String toString() {
        return a("");
    }
}
