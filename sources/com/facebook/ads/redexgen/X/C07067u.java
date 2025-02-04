package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.huawei.hms.ads.gl;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7u */
/* loaded from: assets/audience_network.dex */
public final class C07067u {
    public static Sensor A00;
    public static Sensor A01;
    public static SensorEventListener A02;
    public static SensorEventListener A03;
    public static SensorManager A04;
    public static Map<String, String> A05;
    public static byte[] A06;
    public static String[] A07;
    public static final AtomicReference<String> A08;
    public static volatile float[] A09;
    public static volatile float[] A0A;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-97, -12, -16, -14, -14, -12, -5, -12, 1, -2, -4, -12, 3, -12, 1, -18, -67, -65, -48, -59, -46, -59, -48, -43, 41, 54, 44, 58, 55, 49, 44, -10, 49, 54, 60, 45, 54, 60, -10, 41, 43, 60, 49, 55, 54, -10, 10, 9, Ascii.FS, Ascii.FS, Ascii.CR, Ascii.SUB, 33, 39, Ascii.VT, Ascii.DLE, 9, Ascii.SYN, Ascii.SI, Ascii.CR, Ascii.FF, Ascii.ETB, 44, Ascii.ETB, Ascii.US, 34, Ascii.ETB, Ascii.CAN, 34, Ascii.ESC, Ascii.NAK, 35, Ascii.ESC, 35, 37, 40, 47, 33, 32, 51, 51, 36, 49, 56, -4, 1, -6, Ascii.VT, 0, 2, 7, 0, 35, 47, 34, 34, Ascii.FS, 48, 45, Ascii.RS, 32, 34, -18, -20, -11, -20, -7, -16, -22, 19, Ascii.FF, Ascii.GS, Ascii.FF, 19, -60, -63, -58, -77, -58, -69, -63, -64, -79, -60, -76, -78, -67, -74, 4, -10, -1, 4, 0, 3, 8, 9, -10, 9, 10, 8, 45, 40, 45, Ascii.SUB, 37, Ascii.CAN, 38, Ascii.RS, 38, 40, 43, 50, Ascii.DLE, 17, -49};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A08(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String valueOf = String.valueOf(statFs.getAvailableBlocks() * statFs.getBlockSize());
        A08.set(valueOf);
        A05.put(A01(92, 10, 111), valueOf);
    }

    static {
        A03();
        A04 = null;
        A00 = null;
        A01 = null;
        A05 = new ConcurrentHashMap();
        A07 = new String[]{A01(152, 1, 74), A01(153, 1, 74), A01(154, 1, 7)};
        A08 = new AtomicReference<>();
    }

    @Nullable
    public static String A00() {
        return A08.get();
    }

    public static Map<String, String> A02() {
        HashMap hashMap = new HashMap();
        Map<String, String> currentAnalogInfo = A05;
        hashMap.putAll(currentAnalogInfo);
        A0C(hashMap);
        return hashMap;
    }

    public static synchronized void A06() {
        synchronized (C07067u.class) {
            if (A04 != null) {
                A04.unregisterListener(A02);
            }
            A02 = null;
        }
    }

    public static synchronized void A07() {
        synchronized (C07067u.class) {
            if (A04 != null) {
                A04.unregisterListener(A03);
            }
            A03 = null;
        }
    }

    public static void A09(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(A01(16, 8, 14))).getMemoryInfo(memoryInfo);
        A05.put(A01(61, 16, 104), String.valueOf(memoryInfo.availMem));
        if (Build.VERSION.SDK_INT >= 16) {
            A05.put(A01(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 12, 107), String.valueOf(memoryInfo.totalMem));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.facebook.ads.redexgen.X.7G] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.facebook.ads.redexgen.X.7G] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Intent] */
    public static void A0A(C7G c7g) {
        try {
            c7g = c7g.registerReceiver(null, new IntentFilter(A01(24, 37, 122)));
            if (c7g == 0) {
                return;
            }
            int intExtra = c7g.getIntExtra(A01(109, 5, 89), -1);
            int scale = c7g.getIntExtra(A01(123, 5, 3), -1);
            int status = c7g.getIntExtra(A01(134, 6, 71), -1);
            boolean z10 = status == 2 || status == 5;
            float f = gl.Code;
            if (scale > 0) {
                f = (intExtra / scale) * 100.0f;
            }
            A05.put(A01(77, 7, 113), String.valueOf(f));
            A05.put(A01(84, 8, 75), z10 ? A01(1, 1, 117) : A01(0, 1, 33));
        } catch (IllegalArgumentException e10) {
            c7g.A06().A8u(A01(102, 7, 57), C06977l.A1T, new C06987m(e10));
        }
    }

    public static synchronized void A0B(C7G c7g) {
        synchronized (C07067u.class) {
            A09(c7g);
            A0A(c7g);
            if (A04 == null) {
                A04 = (SensorManager) c7g.getSystemService(A01(128, 6, 67));
                if (A04 == null) {
                    return;
                }
            }
            if (A00 == null) {
                A00 = A04.getDefaultSensor(1);
            }
            if (A01 == null) {
                A01 = A04.getDefaultSensor(4);
            }
            if (A02 == null) {
                A02 = new C07047s();
                if (A00 != null) {
                    A04.registerListener(A02, A00, 3);
                }
            }
            if (A03 == null) {
                A03 = new C07057t();
                if (A01 != null) {
                    A04.registerListener(A03, A01, 3);
                }
            }
        }
    }

    public static void A0C(Map<String, String> map) {
        float[] fArr = A09;
        float[] fArr2 = A0A;
        if (fArr != null) {
            int min = Math.min(A07.length, fArr.length);
            for (int i10 = 0; i10 < min; i10++) {
                map.put(A01(2, 14, 65) + A07[i10], String.valueOf(fArr[i10]));
            }
        }
        if (fArr2 != null) {
            int min2 = Math.min(A07.length, fArr2.length);
            for (int i11 = 0; i11 < min2; i11++) {
                map.put(A01(114, 9, 4) + A07[i11], String.valueOf(fArr2[i11]));
            }
        }
    }
}
