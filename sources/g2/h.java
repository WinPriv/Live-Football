package g2;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: LottieComposition.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public Map<String, List<o2.e>> f28408c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, b0> f28409d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, l2.c> f28410e;
    public List<l2.h> f;

    /* renamed from: g, reason: collision with root package name */
    public q.j<l2.d> f28411g;

    /* renamed from: h, reason: collision with root package name */
    public q.f<o2.e> f28412h;

    /* renamed from: i, reason: collision with root package name */
    public List<o2.e> f28413i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f28414j;

    /* renamed from: k, reason: collision with root package name */
    public float f28415k;

    /* renamed from: l, reason: collision with root package name */
    public float f28416l;

    /* renamed from: m, reason: collision with root package name */
    public float f28417m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f28418n;

    /* renamed from: a, reason: collision with root package name */
    public final i0 f28406a = new i0();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet<String> f28407b = new HashSet<>();
    public int o = 0;

    public final void a(String str) {
        s2.c.b(str);
        this.f28407b.add(str);
    }

    public final float b() {
        return ((this.f28416l - this.f28415k) / this.f28417m) * 1000.0f;
    }

    public final l2.h c(String str) {
        int size = this.f.size();
        for (int i10 = 0; i10 < size; i10++) {
            l2.h hVar = this.f.get(i10);
            String str2 = hVar.f32346a;
            boolean z10 = true;
            if (!str2.equalsIgnoreCase(str) && (!str2.endsWith("\r") || !str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                z10 = false;
            }
            if (z10) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<o2.e> it = this.f28413i.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().a("\t"));
        }
        return sb2.toString();
    }
}
