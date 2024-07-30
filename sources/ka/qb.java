package ka;

import com.iab.omid.library.huawei.adsession.Owner;

/* loaded from: classes2.dex */
public enum qb {
    NATIVE(com.anythink.expressad.foundation.g.a.f.f9813a),
    /* JADX INFO: Fake field, exist only in values array */
    JAVASCRIPT("javascript"),
    NONE("none");


    /* renamed from: v, reason: collision with root package name */
    public static final boolean f31675v;

    /* renamed from: s, reason: collision with root package name */
    public final String f31677s;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31678a;

        static {
            int[] iArr = new int[qb.values().length];
            f31678a = iArr;
            try {
                qb qbVar = qb.NATIVE;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f31678a;
                qb qbVar2 = qb.NATIVE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f31678a;
                qb qbVar3 = qb.NATIVE;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        f31675v = false;
        f31675v = jb.a(com.huawei.hms.ads.hb.o);
    }

    qb(String str) {
        this.f31677s = str;
    }

    public static Owner a(qb qbVar) {
        if (!f31675v) {
            return null;
        }
        int i10 = a.f31678a[qbVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return Owner.NONE;
            }
            return Owner.JAVASCRIPT;
        }
        return Owner.NATIVE;
    }

    public static boolean k() {
        return f31675v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f31677s;
    }
}
