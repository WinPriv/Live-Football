package com.applovin.exoplayer2.e;

import android.net.Uri;
import com.applovin.exoplayer2.e.i.ac;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f14275b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor<? extends h> f14276c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14277d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14278e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f14279g;

    /* renamed from: h, reason: collision with root package name */
    private int f14280h;

    /* renamed from: i, reason: collision with root package name */
    private int f14281i;

    /* renamed from: j, reason: collision with root package name */
    private int f14282j;

    /* renamed from: k, reason: collision with root package name */
    private int f14283k;

    /* renamed from: l, reason: collision with root package name */
    private int f14284l;

    /* renamed from: n, reason: collision with root package name */
    private int f14286n;

    /* renamed from: m, reason: collision with root package name */
    private int f14285m = 1;
    private int o = 112800;

    static {
        Constructor<? extends h> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.applovin.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.applovin.exoplayer2.ext.flac.FlacExtractor").asSubclass(h.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FLAC extension", e10);
        }
        f14276c = constructor;
    }

    @Override // com.applovin.exoplayer2.e.l
    public synchronized h[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int a10 = com.applovin.exoplayer2.l.l.a(map);
        if (a10 != -1) {
            a(a10, arrayList);
        }
        int a11 = com.applovin.exoplayer2.l.l.a(uri);
        if (a11 != -1 && a11 != a10) {
            a(a11, arrayList);
        }
        for (int i10 : f14275b) {
            if (i10 != a10 && i10 != a11) {
                a(i10, arrayList);
            }
        }
        return (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    @Override // com.applovin.exoplayer2.e.l
    public synchronized h[] createExtractors() {
        return a(Uri.EMPTY, new HashMap());
    }

    private void a(int i10, List<h> list) {
        switch (i10) {
            case 0:
                list.add(new com.applovin.exoplayer2.e.i.a());
                return;
            case 1:
                list.add(new com.applovin.exoplayer2.e.i.c());
                return;
            case 2:
                list.add(new com.applovin.exoplayer2.e.i.e((this.f14278e ? 2 : 0) | this.f | (this.f14277d ? 1 : 0)));
                return;
            case 3:
                list.add(new com.applovin.exoplayer2.e.a.a((this.f14278e ? 2 : 0) | this.f14279g | (this.f14277d ? 1 : 0)));
                return;
            case 4:
                Constructor<? extends h> constructor = f14276c;
                if (constructor != null) {
                    try {
                        list.add(constructor.newInstance(Integer.valueOf(this.f14280h)));
                        return;
                    } catch (Exception e10) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
                    }
                }
                list.add(new com.applovin.exoplayer2.e.b.b(this.f14280h));
                return;
            case 5:
                list.add(new com.applovin.exoplayer2.e.c.b());
                return;
            case 6:
                list.add(new com.applovin.exoplayer2.e.e.d(this.f14281i));
                return;
            case 7:
                list.add(new com.applovin.exoplayer2.e.f.d((this.f14278e ? 2 : 0) | this.f14284l | (this.f14277d ? 1 : 0)));
                return;
            case 8:
                list.add(new com.applovin.exoplayer2.e.g.e(this.f14283k));
                list.add(new com.applovin.exoplayer2.e.g.g(this.f14282j));
                return;
            case 9:
                list.add(new com.applovin.exoplayer2.e.h.c());
                return;
            case 10:
                list.add(new com.applovin.exoplayer2.e.i.w());
                return;
            case 11:
                list.add(new ac(this.f14285m, this.f14286n, this.o));
                return;
            case 12:
                list.add(new com.applovin.exoplayer2.e.j.a());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new com.applovin.exoplayer2.e.d.a());
                return;
        }
    }
}
