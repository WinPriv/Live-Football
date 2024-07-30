package ka;

import com.iab.omid.library.huawei.adsession.CreativeType;

/* loaded from: classes2.dex */
public enum nb {
    /* JADX INFO: Fake field, exist only in values array */
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    /* JADX INFO: Fake field, exist only in values array */
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO(com.anythink.expressad.exoplayer.k.o.f9069b);


    /* renamed from: v, reason: collision with root package name */
    public static final boolean f31504v;

    /* renamed from: s, reason: collision with root package name */
    public final String f31506s;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31507a;

        static {
            int[] iArr = new int[nb.values().length];
            f31507a = iArr;
            try {
                nb nbVar = nb.NATIVE_DISPLAY;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f31507a;
                nb nbVar2 = nb.NATIVE_DISPLAY;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f31507a;
                nb nbVar3 = nb.NATIVE_DISPLAY;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f31507a;
                nb nbVar4 = nb.NATIVE_DISPLAY;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f31507a;
                nb nbVar5 = nb.NATIVE_DISPLAY;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        f31504v = false;
        f31504v = jb.a(com.huawei.hms.ads.hb.f21705k);
    }

    nb(String str) {
        this.f31506s = str;
    }

    public static CreativeType a(nb nbVar) {
        if (!f31504v) {
            return null;
        }
        int i10 = a.f31507a[nbVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return CreativeType.AUDIO;
                    }
                    return CreativeType.VIDEO;
                }
                return CreativeType.NATIVE_DISPLAY;
            }
            return CreativeType.HTML_DISPLAY;
        }
        return CreativeType.DEFINED_BY_JAVASCRIPT;
    }

    public static boolean k() {
        return f31504v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f31506s;
    }
}
