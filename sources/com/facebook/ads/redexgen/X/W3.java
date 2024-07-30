package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.f;
import com.anythink.expressad.video.module.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import com.huawei.openalliance.ad.constant.ag;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W3 implements InterfaceC07469i {
    public static byte[] A04;
    public final int A00;
    public final long A01;
    public final Context A02;

    @Nullable
    public final B8<C1288Vh> A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{73, 104, 107, 108, 120, 97, 121, 95, 104, 99, 105, 104, Ascii.DEL, 104, Ascii.DEL, 126, 75, 108, 110, 121, 98, Ascii.DEL, 116, Ascii.US, 40, 40, 53, 40, 122, 51, 52, 41, 46, 59, 52, 46, 51, 59, 46, 51, 52, 61, 122, Ascii.FS, Ascii.FS, 55, 42, 63, 61, 122, 63, 34, 46, 63, 52, 41, 51, 53, 52, Ascii.FS, 43, 43, 54, 43, 121, 48, 55, 42, 45, 56, 55, 45, 48, 56, 45, 48, 55, 62, 121, Ascii.US, Ascii.NAK, Ascii.CAN, Ascii.SUB, 121, 60, 33, 45, 60, 55, 42, 48, 54, 55, 92, 107, 107, 118, 107, 57, 112, 119, 106, 109, 120, 119, 109, 112, 120, 109, 112, 119, 126, 57, 86, 105, 108, 106, 57, 124, 97, 109, 124, 119, 106, 112, 118, 119, 52, 3, 3, Ascii.RS, 3, 81, Ascii.CAN, Ascii.US, 2, 5, Ascii.DLE, Ascii.US, 5, Ascii.CAN, Ascii.DLE, 5, Ascii.CAN, Ascii.US, Ascii.SYN, 81, 39, 33, 72, 81, Ascii.DC4, 9, 5, Ascii.DC4, Ascii.US, 2, Ascii.CAN, Ascii.RS, Ascii.US, 108, 79, 65, 68, 69, 68, 0, 102, 70, 77, 80, 69, 71, 97, 85, 68, 73, 79, 114, 69, 78, 68, 69, 82, 69, 82, Ascii.SO, Ascii.US, 60, 50, 55, 54, 55, 115, Ascii.US, 58, 49, 53, 63, 50, 48, Ascii.DC2, 38, 55, 58, 60, 1, 54, 61, 55, 54, 33, 54, 33, 125, 65, 98, 108, 105, 104, 105, 45, 65, 100, 111, 98, 125, 120, 126, 76, 120, 105, 100, 98, 95, 104, 99, 105, 104, Ascii.DEL, 104, Ascii.DEL, 35, 126, 93, 83, 86, 87, 86, Ascii.DC2, 126, 91, 80, 68, 66, 74, 100, 91, 86, 87, 93, 96, 87, 92, 86, 87, 64, 87, 64, Ascii.FS, 119, 123, 121, 58, 114, 117, 119, 113, 118, 123, 123, Ascii.DEL, 58, 117, 112, 103, 58, 125, 122, 96, 113, 102, 122, 117, 120, 58, 113, 108, 123, 100, 120, 117, 109, 113, 102, 38, 58, 113, 108, 96, 58, 114, 114, 121, 100, 113, 115, 58, 82, 114, 121, 100, 113, 115, 85, 97, 112, 125, 123, 70, 113, 122, 112, 113, 102, 113, 102, 37, 41, 43, 104, 32, 39, 37, 35, 36, 41, 41, 45, 104, 39, 34, 53, 104, 47, 40, 50, 35, 52, 40, 39, 42, 104, 35, 62, 41, 54, 42, 39, 63, 35, 52, 116, 104, 35, 62, 50, 104, 32, 42, 39, 37, 104, 10, 47, 36, 32, 42, 39, 37, 7, 51, 34, 47, 41, Ascii.DC4, 35, 40, 34, 35, 52, 35, 52, 121, 117, 119, 52, 124, 123, 121, Ascii.DEL, 120, 117, 117, 113, 52, 123, 126, 105, 52, 115, 116, 110, Ascii.DEL, 104, 116, 123, 118, 52, Ascii.DEL, 98, 117, 106, 118, 123, 99, Ascii.DEL, 104, 40, 52, Ascii.DEL, 98, 110, 52, 117, 106, 111, 105, 52, 86, 115, 120, 117, 106, 111, 105, 91, 111, 126, 115, 117, 72, Ascii.DEL, 116, 126, Ascii.DEL, 104, Ascii.DEL, 104, 92, 80, 82, 17, 89, 94, 92, 90, 93, 80, 80, 84, 17, 94, 91, 76, 17, 86, 81, 75, 90, 77, 81, 94, 83, 17, 90, 71, 80, 79, 83, 94, 70, 90, 77, Ascii.CR, 17, 90, 71, 75, 17, 73, 79, 6, 17, 115, 86, 93, 73, 79, 71, 105, 86, 91, 90, 80, 109, 90, 81, 91, 90, 77, 90, 77};
    }

    public W3(Context context) {
        this(context, 0);
    }

    public W3(Context context, int i10) {
        this(context, null, i10, f.f7962a);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    @Deprecated
    public W3(Context context, @Nullable B8<C1288Vh> b82, int i10, long j10) {
        this.A02 = context;
        this.A00 = i10;
        this.A01 = j10;
        this.A03 = b82;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    private final void A02(Context context, @Nullable B8<C1288Vh> b82, long j10, Handler handler, I9 i92, int extensionRendererIndex, ArrayList<W1> arrayList) {
        arrayList.add(new C1Y(context, InterfaceC0821Cs.A00, j10, b82, false, handler, i92, 50));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                Class<?> cls = Class.forName(A00(469, 64, 117));
                Class<?> clazz = Boolean.TYPE;
                Class<?> clazz2 = Long.TYPE;
                Class<?> clazz3 = Integer.TYPE;
                try {
                    arrayList.add(size, (W1) cls.getConstructor(clazz, clazz2, Handler.class, I9.class, clazz3).newInstance(true, Long.valueOf(j10), handler, i92, 50));
                    Log.i(A00(0, 23, 71), A00(243, 27, 120));
                } catch (Exception e10) {
                    e = e10;
                    throw new RuntimeException(A00(a.R, 33, 59), e);
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    private final void A03(Context context, @Nullable B8<C1288Vh> b82, A7[] a7Arr, Handler handler, AF af, int i10, ArrayList<W1> arrayList) {
        int extensionRendererIndex;
        int i11;
        String A00 = A00(0, 23, 71);
        arrayList.add(new C05471e(context, InterfaceC0821Cs.A00, b82, false, handler, af, A0.A00(context), a7Arr));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            extensionRendererIndex = size + 1;
        } catch (ClassNotFoundException unused) {
            extensionRendererIndex = size;
        } catch (Exception e10) {
            e = e10;
        }
        try {
            arrayList.add(size, (W1) Class.forName(A00(ag.f22001l, 66, 80)).getConstructor(Handler.class, AF.class, A7[].class).newInstance(handler, af, a7Arr));
            Log.i(A00, A00(215, 28, 71));
        } catch (ClassNotFoundException unused2) {
        } catch (Exception e11) {
            e = e11;
            throw new RuntimeException(A00(93, 34, 83), e);
        }
        try {
            i11 = extensionRendererIndex + 1;
            try {
                arrayList.add(extensionRendererIndex, (W1) Class.forName(A00(337, 66, 12)).getConstructor(Handler.class, AF.class, A7[].class).newInstance(handler, af, a7Arr));
                Log.i(A00, A00(187, 28, 25));
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e12) {
                e = e12;
                throw new RuntimeException(A00(59, 34, 19), e);
            }
        } catch (ClassNotFoundException unused4) {
            i11 = extensionRendererIndex;
        } catch (Exception e13) {
            e = e13;
        }
        try {
            try {
                try {
                    arrayList.add(i11, (W1) Class.forName(A00(270, 67, 94)).getConstructor(Handler.class, AF.class, A7[].class).newInstance(handler, af, a7Arr));
                    Log.i(A00, A00(160, 27, 106));
                } catch (Exception e14) {
                    e = e14;
                    throw new RuntimeException(A00(23, 36, 16), e);
                }
            } catch (Exception e15) {
                e = e15;
            }
        } catch (ClassNotFoundException unused5) {
        }
    }

    private final void A04(Context context, D5 d52, Looper looper, int i10, ArrayList<W1> arrayList) {
        arrayList.add(new AnonymousClass35(d52, looper));
    }

    private final void A05(Context context, FN fn, Looper looper, int i10, ArrayList<W1> arrayList) {
        arrayList.add(new AnonymousClass33(fn, looper));
    }

    private final A7[] A06() {
        return new A7[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07469i
    public final W1[] A4R(Handler handler, I9 i92, AF af, FN fn, D5 d52, @Nullable B8<C1288Vh> b82) {
        B8<C1288Vh> b83 = b82;
        if (b83 == null) {
            b83 = this.A03;
        }
        ArrayList<W1> arrayList = new ArrayList<>();
        A02(this.A02, b83, this.A01, handler, i92, this.A00, arrayList);
        A03(this.A02, b83, A06(), handler, af, this.A00, arrayList);
        A05(this.A02, fn, handler.getLooper(), this.A00, arrayList);
        A04(this.A02, d52, handler.getLooper(), this.A00, arrayList);
        return (W1[]) arrayList.toArray(new W1[arrayList.size()]);
    }
}
