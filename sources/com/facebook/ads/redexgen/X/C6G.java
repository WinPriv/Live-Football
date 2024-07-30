package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.anythink.expressad.video.module.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6G {
    public static AnonymousClass00 A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"8gkZjHnxCvZyg7TzwjjGeSdvls9L7Gam", "fcbSC3ja3K2jNylkxCBC51G6bXitMdQ0", "2foOCT", "ocB0m3", "KfMQJM794wt5IuG", "feDb68pnVWWOEqV45c", "KnEa0S3Tnigt4irEXno07XBXpnYxFsFq", "aK1UKkDbG3zR1xh0x3umKxUvmkPLseuR"};
    public static final String A0E;
    public static final Map<String, AnonymousClass06> A0F;
    public static final Map<String, C6I> A0G;
    public long A00;
    public C0954Ib A01;
    public final C6H A03;
    public final C7G A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 10);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static AtomicBoolean A0D(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0D;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "";
            if (!hasNext) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                try {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Boolean bool = (Boolean) ((Future) it2.next()).get();
                        atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
                    }
                } catch (InterruptedException | ExecutionException e10) {
                    Log.e(A0E, A08(86, 42, 61), e10);
                    atomicBoolean.set(false);
                }
                return atomicBoolean;
            }
            arrayList2.add(LJ.A02().submit(it.next()));
        }
    }

    public static void A0F() {
        A0C = new byte[]{123, -85, -85, Byte.MIN_VALUE, 126, -127, 125, -83, 104, -104, -100, 111, 107, -104, -100, 103, 84, 86, 86, Ascii.DEL, 126, 83, -125, -125, -119, -89, -87, -82, -85, 102, -71, -70, -89, -72, -70, -85, -86, 116, -113, -83, -81, -76, -75, -70, -77, 108, -81, -69, -71, -68, -72, -79, -64, -79, Ascii.DEL, -99, -97, -92, -91, -86, -93, 92, -94, -99, -91, -88, -95, -96, 100, -126, -124, -119, -118, -113, -120, 65, -108, -107, -126, -109, -107, -122, -123, 79, 79, 79, -116, -65, -86, -84, -73, -69, -80, -74, -75, 103, -66, -81, -80, -77, -84, 103, -84, -65, -84, -86, -68, -69, -80, -75, -82, 103, -86, -88, -86, -81, -84, 103, -85, -74, -66, -75, -77, -74, -88, -85, -70, 117, -79, -81, -79, -74, -77, -111, -67, -69, -66, -70, -77, -62, -73, -67, -68, -106, -67, -67, -71, 120, 118, 120, 125, 122, 91, 118, 126, -127, -118, -121, 122, 93, -124, -124, Byte.MIN_VALUE, -120, -101, -120, -122, -104, -105, -120, -24, -21, -35, -32, -27, -24, -38, -35, -40, -19, -30, -26, -34, -40, -26, -20, -96, -107, -100, -92};
    }

    static {
        A0F();
        A0E = C6G.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
        A0G = Collections.synchronizedMap(new HashMap());
    }

    public C6G(C7G c7g) {
        this.A04 = c7g;
        this.A03 = C6H.A06(c7g.A00());
        this.A08 = ID.A20(c7g);
        this.A09 = ID.A28(c7g, PS.A03());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.07] */
    public static synchronized AnonymousClass00 A03(C1315Wi c1315Wi) {
        AnonymousClass00 anonymousClass00;
        synchronized (C6G.class) {
            if (A0A == null) {
                A0A = AnonymousClass01.A00(c1315Wi, new Object() { // from class: com.facebook.ads.redexgen.X.07
                    public int A00;
                    public int A01;
                    public boolean A02;
                    public boolean A03;
                    public boolean A04;

                    public final AnonymousClass07 A00(int i10) {
                        this.A00 = i10;
                        return this;
                    }

                    public final AnonymousClass07 A01(int i10) {
                        this.A01 = i10;
                        return this;
                    }

                    public final AnonymousClass07 A02(boolean z10) {
                        this.A02 = z10;
                        return this;
                    }

                    public final AnonymousClass07 A03(boolean z10) {
                        this.A03 = z10;
                        return this;
                    }

                    public final AnonymousClass07 A04(boolean z10) {
                        this.A04 = z10;
                        return this;
                    }

                    public final AnonymousClass08 A05() {
                        return new AnonymousClass08(this.A00, this.A02, this.A01, this.A03, this.A04);
                    }
                }.A00(ID.A05(c1315Wi)).A02(c1315Wi.A03().A8N()).A01(-1).A03(ID.A0l(c1315Wi)).A04(ID.A27(c1315Wi)).A05(), A05(c1315Wi));
            }
            anonymousClass00 = A0A;
        }
        return anonymousClass00;
    }

    public static AnonymousClass06 A04(C7G c7g, String str) {
        AnonymousClass06 anonymousClass06 = A0F.get(str);
        if (C6J.A06(c7g) && anonymousClass06 != null) {
            AnonymousClass06 storedCacheData = new AnonymousClass06(anonymousClass06);
            return storedCacheData;
        }
        AnonymousClass06 storedCacheData2 = new AnonymousClass06(str);
        return storedCacheData2;
    }

    public static C0L A05(C1315Wi c1315Wi) {
        return new C1319Wm(c1315Wi);
    }

    public static synchronized List<String> A09(C7G c7g) {
        List<String> list;
        synchronized (C6G.class) {
            if (A0B == null) {
                A0B = new ArrayList();
                A0J(A0B, c7g);
            }
            list = A0B;
        }
        return list;
    }

    public static void A0H(C7G c7g, String str) {
        C6I c6i;
        if (C6J.A06(c7g) && !TextUtils.isEmpty(str) && (c6i = A0G.get(str)) != null) {
            c6i.A00 = A08(186, 4, 35);
            C1315Wi A00 = c7g.A00();
            PW A05 = PW.A05(A00);
            String A08 = PW.A08(A00, KM.A00(str));
            if (A08 == null) {
                A08 = str;
            }
            C6J.A04(c7g, c6i, A05.A0H(A08));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(EnumC0953Ia enumC0953Ia) {
        if (this.A01 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A08(174, 12, 111), L5.A04(this.A00));
        this.A01.A02(enumC0953Ia, hashMap);
    }

    public static void A0J(List<String> cacheDirs, C7G c7g) {
        A0K(cacheDirs, C1384Zb.A01(c7g));
        A0K(cacheDirs, C6H.A07(c7g));
    }

    public static void A0K(List<String> list, File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        String[] strArr = A0D;
        String str = strArr[3];
        String path2 = strArr[2];
        if (str.length() != path2.length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[3] = "Vghlgc";
        strArr2[2] = "qwUey9";
        String path3 = A08(0, 0, a.R);
        if (path != path3) {
            String path4 = path.toLowerCase(Locale.getDefault());
            list.add(path4);
        }
    }

    @Nullable
    public final Bitmap A0M(String str) {
        return this.A07.get(str);
    }

    @Nullable
    public final Bitmap A0N(String str, int i10, int i11) {
        if (this.A08) {
            AnonymousClass06 A04 = A04(this.A04, str);
            A04.A03 = A08(186, 4, 35);
            A04.A01 = i11;
            A04.A00 = i10;
            return A03(this.A04.A00()).ADy(A04, true).A00();
        }
        return this.A03.A0E(this.A04, str, i10, i11, A08(170, 4, 114));
    }

    @Nullable
    public final File A0O(String str) {
        AnonymousClass06 A04 = A04(this.A04, str);
        A04.A03 = A08(186, 4, 35);
        return A03(this.A04.A00()).ADz(A04);
    }

    @Nullable
    public final File A0P(String str) {
        if (this.A08) {
            return A0O(str);
        }
        return this.A03.A0F(str);
    }

    public final String A0Q(String str) {
        if (this.A08) {
            return A0R(str);
        }
        return this.A03.A0G(str);
    }

    public final String A0R(String str) {
        AnonymousClass06 A04 = A04(this.A04, str);
        A04.A03 = A08(186, 4, 35);
        String AE1 = A03(this.A04.A00()).AE1(A04);
        return AE1 != null ? AE1 : str;
    }

    public final String A0S(String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0R(str);
    }

    public final void A0T() {
        JH.A05(A08(128, 19, 68), A08(38, 16, 66), A08(16, 8, 19));
    }

    public final void A0U() {
        JH.A05(A08(147, 16, 11), A08(54, 14, 50), A08(8, 8, 44));
    }

    public final void A0V() {
        this.A07.clear();
    }

    public final void A0W(@Nullable AnonymousClass68 anonymousClass68, AnonymousClass69 anonymousClass69) {
        JH.A05(A08(163, 7, 25), A08(68, 18, 23), A08(0, 8, 64));
        this.A00 = System.currentTimeMillis();
        C6J.A02(this.A04, anonymousClass69, C6J.A07, A08(24, 14, 60), -1L);
        LJ.A03().execute(new C1320Wn(this, new ArrayList(this.A05), anonymousClass68, anonymousClass69, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0X(C6C c6c) {
        this.A05.add(new C6D(this, c6c));
    }

    public final void A0Y(C6C c6c) {
        c6c.A05 = true;
        this.A06.add(new C6D(this, c6c));
    }

    public final void A0Z(C6C c6c) {
        c6c.A05 = true;
        if (this.A09) {
            this.A06.add(new C6B(this, c6c));
        } else {
            this.A06.add(new C6D(this, c6c));
        }
    }

    public final void A0a(C6C c6c) {
        if (this.A09) {
            this.A05.add(new C6B(this, c6c));
        } else {
            this.A05.add(new C6D(this, c6c));
        }
    }

    public final void A0b(final C6E c6e) {
        Callable<Boolean> callable = new Callable<Boolean>(c6e) { // from class: com.facebook.ads.redexgen.X.6F
            public static byte[] A02;
            public static String[] A03 = {"jwTNBF52XqMGgcVEiQTwvXvSBsl43Bcu", "zl9XISU", "9LwyCiCzMXmNgkxTRjX8XUqiNT4UlidW", "Jar4Zz8ck96tLH67JFbLbWmYESMeU49V", "Yd8bjyjazIom6Oxe2tnjIAJyfdSlHwWG", "VgUZ5KaBAYbzt3oMIew8EQ4BA2c", "hXTgBapwd4emagenALPcDOSBW5zmdf3H", "17k"};
            public final C6E A00;

            public static String A01(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                int i13 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    if (A03[1].length() == 32) {
                        throw new RuntimeException();
                    }
                    A03[3] = "";
                    if (i13 >= length) {
                        return new String(copyOfRange);
                    }
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
                    i13++;
                }
            }

            public static void A02() {
                A02 = new byte[]{-20, -16, -28, -22, -24};
            }

            static {
                A02();
            }

            {
                this.A00 = c6e;
            }

            private final Boolean A00() {
                C7G c7g;
                boolean z10;
                C7G c7g2;
                AnonymousClass00 A032;
                boolean z11;
                boolean z12;
                C6H c6h;
                Map map;
                if (C0990Jm.A02(this)) {
                    return null;
                }
                try {
                    TrafficStats.setThreadStatsTag(61453);
                    AnonymousClass06 anonymousClass06 = new AnonymousClass06(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, 83), this.A00.A01, this.A00.A02);
                    anonymousClass06.A01 = this.A00.A04;
                    anonymousClass06.A00 = this.A00.A03;
                    c7g = C6G.this.A04;
                    if (C6J.A06(c7g)) {
                        map = C6G.A0F;
                        map.put(this.A00.A07, anonymousClass06);
                    }
                    z10 = C6G.this.A08;
                    boolean precacheResult = false;
                    if (A03[3].length() != 5) {
                        A03[4] = "CZcPy1KhLDdCOlGcBT5xxsnRB32IUDMD";
                        if (!z10) {
                            c6h = C6G.this.A03;
                            if (c6h.A0D(this.A00) != null) {
                                precacheResult = true;
                            }
                        } else {
                            c7g2 = C6G.this.A04;
                            A032 = C6G.A03(c7g2.A00());
                            precacheResult = A032.ADy(anonymousClass06, false).A01();
                        }
                        C6L c6l = this.A00.A00;
                        if (c6l != null && c6l.A02()) {
                            int A00 = c6l.A00();
                            int A01 = c6l.A01();
                            if (A00 <= 0 || A01 <= 0) {
                                z11 = C6G.this.A08;
                                if (z11) {
                                    A04(this.A00.A07, anonymousClass06);
                                } else {
                                    A03(this.A00.A03, this.A00.A04);
                                }
                            } else {
                                z12 = C6G.this.A08;
                                if (z12) {
                                    anonymousClass06.A00 = A00;
                                    anonymousClass06.A01 = A01;
                                    A04(this.A00.A07, anonymousClass06);
                                } else {
                                    A03(A00, A01);
                                }
                            }
                        }
                        return Boolean.valueOf(precacheResult);
                    }
                    throw new RuntimeException();
                } catch (Throwable th) {
                    C0990Jm.A00(th, this);
                    return null;
                }
            }

            private void A03(int i10, int i11) {
                C6H c6h;
                C7G c7g;
                Map map;
                c6h = C6G.this.A03;
                c7g = C6G.this.A04;
                Bitmap A0E2 = c6h.A0E(c7g, this.A00.A07, i10, i11, this.A00.A01);
                if (A0E2 == null) {
                    return;
                }
                map = C6G.this.A07;
                map.put(this.A00.A07, A0E2);
            }

            private void A04(String str, AnonymousClass06 anonymousClass06) {
                C7G c7g;
                AnonymousClass00 A032;
                Map map;
                c7g = C6G.this.A04;
                A032 = C6G.A03(c7g.A00());
                Bitmap A00 = A032.ADy(anonymousClass06, true).A00();
                if (A00 == null) {
                    return;
                }
                map = C6G.this.A07;
                map.put(str, A00);
            }

            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
                if (C0990Jm.A02(this)) {
                    return null;
                }
                try {
                    return A00();
                } catch (Throwable th) {
                    C0990Jm.A00(th, this);
                    return null;
                }
            }
        };
        if (!c6e.A02) {
            this.A05.add(callable);
        } else {
            this.A06.add(callable);
        }
    }

    public final void A0c(C6E c6e) {
        c6e.A02 = true;
        A0b(c6e);
    }

    public final void A0d(C0954Ib c0954Ib) {
        this.A01 = c0954Ib;
    }
}
