package ka;

import com.iab.omid.library.huawei.adsession.media.InteractionType;

/* loaded from: classes2.dex */
public enum vb {
    /* JADX INFO: Fake field, exist only in values array */
    CLICK("click"),
    /* JADX INFO: Fake field, exist only in values array */
    INVITATION_ACCEPTED("invitationAccept");


    /* renamed from: t, reason: collision with root package name */
    public static final boolean f31997t;

    /* renamed from: s, reason: collision with root package name */
    public final String f31999s;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32000a;

        static {
            int[] iArr = new int[vb.values().length];
            f32000a = iArr;
            try {
                boolean z10 = vb.f31997t;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f32000a;
                boolean z11 = vb.f31997t;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        f31997t = false;
        f31997t = jb.a("com.iab.omid.library.huawei.adsession.media.InteractionType");
    }

    vb(String str) {
        this.f31999s = str;
    }

    public static InteractionType k() {
        if (!f31997t) {
            return null;
        }
        int i10 = a.f32000a[0];
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return InteractionType.INVITATION_ACCEPTED;
        }
        return InteractionType.CLICK;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f31999s;
    }
}
