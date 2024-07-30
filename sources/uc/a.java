package uc;

/* compiled from: KotlinVersion.kt */
/* loaded from: classes2.dex */
public final class a implements Comparable<a> {

    /* renamed from: w, reason: collision with root package name */
    public static final a f35840w = new a();

    /* renamed from: s, reason: collision with root package name */
    public final int f35841s = 1;

    /* renamed from: t, reason: collision with root package name */
    public final int f35842t = 8;

    /* renamed from: u, reason: collision with root package name */
    public final int f35843u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final int f35844v;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r1 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a() {
        /*
            r5 = this;
            r5.<init>()
            r0 = 1
            r5.f35841s = r0
            r1 = 8
            r5.f35842t = r1
            r2 = 0
            r5.f35843u = r2
            ad.c r3 = new ad.c
            r4 = 255(0xff, float:3.57E-43)
            r3.<init>(r2, r4)
            int r3 = r3.f408t
            if (r0 > r3) goto L1a
            r3 = r0
            goto L1b
        L1a:
            r3 = r2
        L1b:
            if (r3 == 0) goto L3a
            ad.c r3 = new ad.c
            r3.<init>(r2, r4)
            int r3 = r3.f408t
            if (r1 > r3) goto L28
            r1 = r0
            goto L29
        L28:
            r1 = r2
        L29:
            if (r1 == 0) goto L3a
            ad.c r1 = new ad.c
            r1.<init>(r2, r4)
            int r1 = r1.f408t
            if (r1 < 0) goto L36
            r1 = r0
            goto L37
        L36:
            r1 = r2
        L37:
            if (r1 == 0) goto L3a
            goto L3b
        L3a:
            r0 = r2
        L3b:
            if (r0 == 0) goto L43
            r0 = 67584(0x10800, float:9.4705E-41)
            r5.f35844v = r0
            return
        L43:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Version components are out of range: 1.8.0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.a.<init>():void");
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        a aVar2 = aVar;
        zc.d.d(aVar2, "other");
        return this.f35844v - aVar2.f35844v;
    }

    public final boolean equals(Object obj) {
        a aVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            aVar = (a) obj;
        } else {
            aVar = null;
        }
        if (aVar != null && this.f35844v == aVar.f35844v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35844v;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35841s);
        sb2.append('.');
        sb2.append(this.f35842t);
        sb2.append('.');
        sb2.append(this.f35843u);
        return sb2.toString();
    }
}
