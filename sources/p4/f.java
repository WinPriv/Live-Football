package p4;

import android.net.Uri;
import com.applovin.exoplayer2.b0;
import d6.d0;
import j7.j0;
import j7.v1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import z4.c0;

/* compiled from: DefaultExtractorsFactory.java */
/* loaded from: classes2.dex */
public final class f implements l {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f34317t = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: u, reason: collision with root package name */
    public static final a f34318u = new a(new b0(16));

    /* renamed from: v, reason: collision with root package name */
    public static final a f34319v = new a(new com.applovin.exoplayer2.d.w(13));

    /* renamed from: s, reason: collision with root package name */
    public final v1 f34320s;

    /* compiled from: DefaultExtractorsFactory.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0458a f34321a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f34322b = new AtomicBoolean(false);

        /* compiled from: DefaultExtractorsFactory.java */
        /* renamed from: p4.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public interface InterfaceC0458a {
            Constructor<? extends h> a() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException;
        }

        public a(InterfaceC0458a interfaceC0458a) {
            this.f34321a = interfaceC0458a;
        }

        public final h a(Object... objArr) {
            Constructor<? extends h> a10;
            synchronized (this.f34322b) {
                if (!this.f34322b.get()) {
                    try {
                        a10 = this.f34321a.a();
                    } catch (ClassNotFoundException unused) {
                        this.f34322b.set(true);
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating extension", e10);
                    }
                }
                a10 = null;
            }
            if (a10 == null) {
                return null;
            }
            try {
                return a10.newInstance(objArr);
            } catch (Exception e11) {
                throw new IllegalStateException("Unexpected error creating extractor", e11);
            }
        }
    }

    public f() {
        j0.b bVar = j0.f30006t;
        this.f34320s = v1.f30113w;
    }

    @Override // p4.l
    public final synchronized h[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f34317t;
        arrayList = new ArrayList(16);
        int i10 = d6.a.i(map);
        if (i10 != -1) {
            b(i10, arrayList);
        }
        int j10 = d6.a.j(uri);
        if (j10 != -1 && j10 != i10) {
            b(j10, arrayList);
        }
        for (int i11 = 0; i11 < 16; i11++) {
            int i12 = iArr[i11];
            if (i12 != i10 && i12 != j10) {
                b(i12, arrayList);
            }
        }
        return (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    public final void b(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new z4.a());
                return;
            case 1:
                arrayList.add(new z4.c());
                return;
            case 2:
                arrayList.add(new z4.e(0));
                return;
            case 3:
                arrayList.add(new q4.a());
                return;
            case 4:
                h a10 = f34318u.a(0);
                if (a10 != null) {
                    arrayList.add(a10);
                    return;
                } else {
                    arrayList.add(new s4.b());
                    return;
                }
            case 5:
                arrayList.add(new t4.c());
                return;
            case 6:
                arrayList.add(new v4.d(0));
                return;
            case 7:
                arrayList.add(new w4.d(0));
                return;
            case 8:
                arrayList.add(new x4.e());
                arrayList.add(new x4.g(0));
                return;
            case 9:
                arrayList.add(new y4.c());
                return;
            case 10:
                arrayList.add(new z4.w());
                return;
            case 11:
                arrayList.add(new c0(1, new d0(0L), new z4.g(0, this.f34320s)));
                return;
            case 12:
                arrayList.add(new a5.a());
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new u4.a());
                return;
            case 15:
                h a11 = f34319v.a(new Object[0]);
                if (a11 != null) {
                    arrayList.add(a11);
                    return;
                }
                return;
            case 16:
                arrayList.add(new r4.b());
                return;
        }
    }

    @Override // p4.l
    public final synchronized h[] createExtractors() {
        return a(Uri.EMPTY, new HashMap());
    }
}
