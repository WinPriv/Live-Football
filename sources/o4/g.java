package o4;

import com.vungle.warren.utility.platform.Platform;
import d6.g0;
import java.util.UUID;

/* compiled from: FrameworkCryptoConfig.java */
/* loaded from: classes2.dex */
public final class g implements n4.b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f33618d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f33619a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f33620b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33621c;

    static {
        boolean z10;
        if (Platform.MANUFACTURER_AMAZON.equals(g0.f27304c)) {
            String str = g0.f27305d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f33618d = z10;
            }
        }
        z10 = false;
        f33618d = z10;
    }

    public g(UUID uuid, byte[] bArr, boolean z10) {
        this.f33619a = uuid;
        this.f33620b = bArr;
        this.f33621c = z10;
    }
}
