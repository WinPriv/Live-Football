package ka;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.iab.omid.library.huawei.adsession.ImpressionType;

/* loaded from: classes2.dex */
public enum pb {
    /* JADX INFO: Fake field, exist only in values array */
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED("unspecified"),
    /* JADX INFO: Fake field, exist only in values array */
    LOADED("loaded"),
    /* JADX INFO: Fake field, exist only in values array */
    BEGIN_TO_RENDER("beginToRender"),
    /* JADX INFO: Fake field, exist only in values array */
    ONE_PIXEL("onePixel"),
    /* JADX INFO: Fake field, exist only in values array */
    VIEWABLE(CallMraidJS.f7002c),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIBLE("audible"),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER("other");


    /* renamed from: t, reason: collision with root package name */
    public static final boolean f31645t;

    /* renamed from: s, reason: collision with root package name */
    public final String f31647s;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31648a;

        static {
            int[] iArr = new int[pb.values().length];
            f31648a = iArr;
            try {
                boolean z10 = pb.f31645t;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f31648a;
                boolean z11 = pb.f31645t;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f31648a;
                boolean z12 = pb.f31645t;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f31648a;
                boolean z13 = pb.f31645t;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f31648a;
                boolean z14 = pb.f31645t;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f31648a;
                boolean z15 = pb.f31645t;
                iArr6[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = f31648a;
                boolean z16 = pb.f31645t;
                iArr7[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = f31648a;
                boolean z17 = pb.f31645t;
                iArr8[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        f31645t = false;
        f31645t = jb.a(com.huawei.hms.ads.hb.f21708n);
    }

    pb(String str) {
        this.f31647s = str;
    }

    public static ImpressionType k() {
        if (!f31645t) {
            return null;
        }
        switch (a.f31648a[5]) {
            case 1:
                return ImpressionType.DEFINED_BY_JAVASCRIPT;
            case 2:
                return ImpressionType.UNSPECIFIED;
            case 3:
                return ImpressionType.LOADED;
            case 4:
                return ImpressionType.BEGIN_TO_RENDER;
            case 5:
                return ImpressionType.ONE_PIXEL;
            case 6:
                return ImpressionType.VIEWABLE;
            case 7:
                return ImpressionType.AUDIBLE;
            case 8:
                return ImpressionType.OTHER;
            default:
                return null;
        }
    }

    public static boolean p() {
        return f31645t;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f31647s;
    }
}
