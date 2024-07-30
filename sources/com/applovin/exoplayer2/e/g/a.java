package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f14325a;

    /* renamed from: com.applovin.exoplayer2.e.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0166a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final long f14326b;

        /* renamed from: c, reason: collision with root package name */
        public final List<b> f14327c;

        /* renamed from: d, reason: collision with root package name */
        public final List<C0166a> f14328d;

        public C0166a(int i10, long j10) {
            super(i10);
            this.f14326b = j10;
            this.f14327c = new ArrayList();
            this.f14328d = new ArrayList();
        }

        public void a(b bVar) {
            this.f14327c.add(bVar);
        }

        public b d(int i10) {
            int size = this.f14327c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f14327c.get(i11);
                if (bVar.f14325a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public C0166a e(int i10) {
            int size = this.f14328d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0166a c0166a = this.f14328d.get(i11);
                if (c0166a.f14325a == i10) {
                    return c0166a;
                }
            }
            return null;
        }

        @Override // com.applovin.exoplayer2.e.g.a
        public String toString() {
            return a.c(this.f14325a) + " leaves: " + Arrays.toString(this.f14327c.toArray()) + " containers: " + Arrays.toString(this.f14328d.toArray());
        }

        public void a(C0166a c0166a) {
            this.f14328d.add(c0166a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final y f14329b;

        public b(int i10, y yVar) {
            super(i10);
            this.f14329b = yVar;
        }
    }

    public a(int i10) {
        this.f14325a = i10;
    }

    public static int a(int i10) {
        return (i10 >> 24) & com.anythink.expressad.exoplayer.k.p.f9095b;
    }

    public static int b(int i10) {
        return i10 & 16777215;
    }

    public static String c(int i10) {
        return "" + ((char) ((i10 >> 24) & com.anythink.expressad.exoplayer.k.p.f9095b)) + ((char) ((i10 >> 16) & com.anythink.expressad.exoplayer.k.p.f9095b)) + ((char) ((i10 >> 8) & com.anythink.expressad.exoplayer.k.p.f9095b)) + ((char) (i10 & com.anythink.expressad.exoplayer.k.p.f9095b));
    }

    public String toString() {
        return c(this.f14325a);
    }
}
