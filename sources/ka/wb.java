package ka;

import com.iab.omid.library.huawei.adsession.media.Position;
import com.vungle.warren.model.Advertisement;

/* loaded from: classes2.dex */
public enum wb {
    /* JADX INFO: Fake field, exist only in values array */
    PREROLL("preroll"),
    /* JADX INFO: Fake field, exist only in values array */
    MIDROLL("midroll"),
    /* JADX INFO: Fake field, exist only in values array */
    POSTROLL(Advertisement.KEY_POSTROLL),
    /* JADX INFO: Fake field, exist only in values array */
    STANDALONE("standalone");


    /* renamed from: t, reason: collision with root package name */
    public static final boolean f32132t;

    /* renamed from: s, reason: collision with root package name */
    public final String f32134s;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32135a;

        static {
            int[] iArr = new int[wb.values().length];
            f32135a = iArr;
            try {
                boolean z10 = wb.f32132t;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f32135a;
                boolean z11 = wb.f32132t;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f32135a;
                boolean z12 = wb.f32132t;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f32135a;
                boolean z13 = wb.f32132t;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        f32132t = false;
        f32132t = jb.a("com.iab.omid.library.huawei.adsession.media.Position");
    }

    wb(String str) {
        this.f32134s = str;
    }

    public static Position k() {
        if (!f32132t) {
            return null;
        }
        int i10 = a.f32135a[3];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return null;
                    }
                    return Position.STANDALONE;
                }
                return Position.POSTROLL;
            }
            return Position.PREROLL;
        }
        return Position.PREROLL;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f32134s;
    }
}
