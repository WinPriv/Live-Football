package x4;

import com.anythink.expressad.exoplayer.k.p;
import d6.w;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: Atom.java */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f36329a;

    /* compiled from: Atom.java */
    /* renamed from: x4.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0507a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final long f36330b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f36331c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f36332d;

        public C0507a(int i10, long j10) {
            super(i10);
            this.f36330b = j10;
            this.f36331c = new ArrayList();
            this.f36332d = new ArrayList();
        }

        public final C0507a b(int i10) {
            ArrayList arrayList = this.f36332d;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0507a c0507a = (C0507a) arrayList.get(i11);
                if (c0507a.f36329a == i10) {
                    return c0507a;
                }
            }
            return null;
        }

        public final b c(int i10) {
            ArrayList arrayList = this.f36331c;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) arrayList.get(i11);
                if (bVar.f36329a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // x4.a
        public final String toString() {
            return a.a(this.f36329a) + " leaves: " + Arrays.toString(this.f36331c.toArray()) + " containers: " + Arrays.toString(this.f36332d.toArray());
        }
    }

    /* compiled from: Atom.java */
    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final w f36333b;

        public b(int i10, w wVar) {
            super(i10);
            this.f36333b = wVar;
        }
    }

    public a(int i10) {
        this.f36329a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & p.f9095b)) + ((char) ((i10 >> 16) & p.f9095b)) + ((char) ((i10 >> 8) & p.f9095b)) + ((char) (i10 & p.f9095b));
    }

    public String toString() {
        return a(this.f36329a);
    }
}
