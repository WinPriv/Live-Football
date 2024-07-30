package m4;

import com.anythink.expressad.foundation.h.m;

/* compiled from: Ac3Util.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f32691a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f32692b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f32693c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f32694d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f32695e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, m.a.f10162a, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, com.anythink.expressad.foundation.g.a.aS, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0 && i10 < 3 && i11 >= 0 && i12 < 19) {
            int i13 = f32692b[i10];
            if (i13 == 44100) {
                return ((i11 % 2) + f[i12]) * 2;
            }
            int i14 = f32695e[i12];
            if (i13 == 32000) {
                return i14 * 6;
            }
            return i14 * 4;
        }
        return -1;
    }
}
