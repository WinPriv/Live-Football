package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Kf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1006Kf implements InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7G A01;
    public final /* synthetic */ LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Ascii.DLE, Ascii.SO, Ascii.ETB, Ascii.SO, Ascii.ESC, Ascii.DC2, Ascii.FF, Ascii.NAK, 19, 34, 1, Ascii.RS, Ascii.SUB, Ascii.ETB, 34, -4, Ascii.SI, Ascii.ESC, 19, Ascii.GS, Ascii.ESC, 42, 10, 47, 38, Ascii.ESC, -75, -77, -62, -92, -81, -70, -61, -77, 40, 39, -4, 33, Ascii.RS, Ascii.FS, 36, 44, 46, 38, 44, Ascii.VT, Ascii.RS, Ascii.SUB, Ascii.GS, 50};
    }

    public C1006Kf(int i10, LinkedBlockingQueue linkedBlockingQueue, C7G c7g) {
        this.A00 = i10;
        this.A02 = linkedBlockingQueue;
        this.A01 = c7g;
    }

    @Override // java.lang.reflect.InvocationHandler
    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 122)) && objArr.length == 1 && (objArr[0] instanceof List)) {
                for (Object c10 : (List) objArr[0]) {
                    String str = (String) c10.getClass().getMethod(A00(7, 12, 111), new Class[0]).invoke(c10, new Object[0]);
                    int intValue = ((Integer) c10.getClass().getMethod(A00(19, 7, 119), new Class[0]).invoke(c10, new Object[0])).intValue();
                    if (str == null && intValue == this.A00) {
                        byte[] value = (byte[]) c10.getClass().getMethod(A00(26, 8, 15), new Class[0]).invoke(c10, new Object[0]);
                        this.A02.put(value);
                        return null;
                    }
                }
                this.A02.put(null);
            }
        } catch (Throwable t10) {
            this.A01.A06().A8u(A00(0, 7, 106), C06977l.A1G, new C06987m(t10));
        }
        return null;
    }
}
