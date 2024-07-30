package b3;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy.java */
/* loaded from: classes.dex */
public final class m implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f2882d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f2883e;
    public static final Bitmap.Config[] f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f2884g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f2885h;

    /* renamed from: a, reason: collision with root package name */
    public final c f2886a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final g<b, Bitmap> f2887b = new g<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2888c = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2889a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f2889a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2889a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2889a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2889a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        public final c f2890a;

        /* renamed from: b, reason: collision with root package name */
        public int f2891b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap.Config f2892c;

        public b(c cVar) {
            this.f2890a = cVar;
        }

        @Override // b3.l
        public final void a() {
            this.f2890a.h(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f2891b != bVar.f2891b || !t3.l.b(this.f2892c, bVar.f2892c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i10;
            int i11 = this.f2891b * 31;
            Bitmap.Config config = this.f2892c;
            if (config != null) {
                i10 = config.hashCode();
            } else {
                i10 = 0;
            }
            return i11 + i10;
        }

        public final String toString() {
            return m.c(this.f2891b, this.f2892c);
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    public static class c extends b3.c {
        public c() {
            super(0);
        }

        @Override // b3.c
        public final l f() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f2882d = configArr;
        f2883e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f2884g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f2885h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num2 = d10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d10.remove(num);
                return;
            } else {
                d10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[EDGE_INSN: B:37:0x00ab->B:26:0x00ab BREAK  A[LOOP:0: B:16:0x0068->B:35:0x00a8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(int r11, int r12, android.graphics.Bitmap.Config r13) {
        /*
            r10 = this;
            char[] r0 = t3.l.f35429a
            int r0 = r11 * r12
            if (r13 != 0) goto L9
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            goto La
        L9:
            r1 = r13
        La:
            int[] r2 = t3.l.a.f35432a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L25
            if (r1 == r4) goto L23
            if (r1 == r3) goto L23
            if (r1 == r2) goto L20
            r1 = r2
            goto L26
        L20:
            r1 = 8
            goto L26
        L23:
            r1 = r4
            goto L26
        L25:
            r1 = r5
        L26:
            int r1 = r1 * r0
            b3.m$c r0 = r10.f2886a
            b3.l r6 = r0.g()
            b3.m$b r6 = (b3.m.b) r6
            r6.f2891b = r1
            r6.f2892c = r13
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            r9 = 0
            if (r7 < r8) goto L47
            android.graphics.Bitmap$Config r7 = a8.j.k()
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L47
            android.graphics.Bitmap$Config[] r2 = b3.m.f2883e
            goto L67
        L47:
            int[] r7 = b3.m.a.f2889a
            int r8 = r13.ordinal()
            r7 = r7[r8]
            if (r7 == r5) goto L65
            if (r7 == r4) goto L62
            if (r7 == r3) goto L5f
            if (r7 == r2) goto L5c
            android.graphics.Bitmap$Config[] r2 = new android.graphics.Bitmap.Config[r5]
            r2[r9] = r13
            goto L67
        L5c:
            android.graphics.Bitmap$Config[] r2 = b3.m.f2885h
            goto L67
        L5f:
            android.graphics.Bitmap$Config[] r2 = b3.m.f2884g
            goto L67
        L62:
            android.graphics.Bitmap$Config[] r2 = b3.m.f
            goto L67
        L65:
            android.graphics.Bitmap$Config[] r2 = b3.m.f2882d
        L67:
            int r3 = r2.length
        L68:
            if (r9 >= r3) goto Lab
            r4 = r2[r9]
            java.util.NavigableMap r5 = r10.d(r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.lang.Object r5 = r5.ceilingKey(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto La8
            int r7 = r5.intValue()
            int r8 = r1 * 8
            if (r7 > r8) goto La8
            int r2 = r5.intValue()
            if (r2 != r1) goto L95
            if (r4 != 0) goto L8f
            if (r13 == 0) goto Lab
            goto L95
        L8f:
            boolean r1 = r4.equals(r13)
            if (r1 != 0) goto Lab
        L95:
            r0.h(r6)
            int r1 = r5.intValue()
            b3.l r0 = r0.g()
            r6 = r0
            b3.m$b r6 = (b3.m.b) r6
            r6.f2891b = r1
            r6.f2892c = r4
            goto Lab
        La8:
            int r9 = r9 + 1
            goto L68
        Lab:
            b3.g<b3.m$b, android.graphics.Bitmap> r0 = r10.f2887b
            java.lang.Object r0 = r0.a(r6)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Lc1
            int r1 = r6.f2891b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.a(r1, r0)
            r0.reconfigure(r11, r12, r13)
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.m.b(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap hashMap = this.f2888c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final String e(Bitmap bitmap) {
        return c(t3.l.c(bitmap), bitmap.getConfig());
    }

    public final void f(Bitmap bitmap) {
        int c10 = t3.l.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        b bVar = (b) this.f2886a.g();
        bVar.f2891b = c10;
        bVar.f2892c = config;
        this.f2887b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num = d10.get(Integer.valueOf(bVar.f2891b));
        Integer valueOf = Integer.valueOf(bVar.f2891b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        d10.put(valueOf, Integer.valueOf(i10));
    }

    public final String toString() {
        StringBuilder j10 = com.ironsource.adapters.facebook.a.j("SizeConfigStrategy{groupedMap=");
        j10.append(this.f2887b);
        j10.append(", sortedSizes=(");
        HashMap hashMap = this.f2888c;
        for (Map.Entry entry : hashMap.entrySet()) {
            j10.append(entry.getKey());
            j10.append('[');
            j10.append(entry.getValue());
            j10.append("], ");
        }
        if (!hashMap.isEmpty()) {
            j10.replace(j10.length() - 2, j10.length(), "");
        }
        j10.append(")}");
        return j10.toString();
    }
}
