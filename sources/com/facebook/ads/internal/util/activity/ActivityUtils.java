package com.facebook.ads.internal.util.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.redexgen.X.C06977l;
import com.facebook.ads.redexgen.X.C06987m;
import com.facebook.ads.redexgen.X.C1315Wi;
import com.facebook.ads.redexgen.X.C1316Wj;
import com.facebook.ads.redexgen.X.ID;
import com.facebook.ads.redexgen.X.KA;
import com.facebook.ads.redexgen.X.KB;
import com.facebook.ads.redexgen.X.KF;
import com.facebook.ads.redexgen.X.L8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: assets/audience_network.dex */
public final class ActivityUtils implements Application.ActivityLifecycleCallbacks {
    public static Context A01;
    public static C1315Wi A02;
    public static byte[] A03;
    public static String[] A04 = {"ouMPsLdF8VOzsynXqmRiTnVq9sCULlEK", "RDluICFSUJyOT3sC2lXOFgStPQc7gg7Y", "UmtUlnThENixw5hdz8sG1KFdsGmJDk97", "fTn296Ch3TXxkAVBDyGQxp9TrJ", "IUqXVRs0X8uhoFuXuWrDHC", "AqSoSQ8lTXl56yd6tw1FPxb5AEpw6", "5ylHfIThOZnGyEtaFkstDkkPbeVs18fd", "i0x"};
    public static final KF A05;
    public static final List<KB> A06;
    public static final List<Runnable> A07;
    public static final Map<Activity, Integer> A08;
    public final Class<? extends Activity> A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A04;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "4AKSMNDzmxTAf23dNNcZP8";
            strArr2[7] = "cH1";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 12);
            i13++;
        }
    }

    public static void A02() {
        A03 = new byte[]{54, 58, 91, 121, 110, 115, 108, 115, 110, 99, 32, 58, 92, 80, 2, Ascii.NAK, Ascii.SYN, 74, 80, 115, 81, 70, 91, 68, 91, 70, 75, Ascii.DC2, 86, 91, 65, 81, 64, 87, 66, 83, 92, 81, 91, 87, 65, Ascii.FS, 55, 6, 6, 53, Ascii.EM, Ascii.CAN, 2, 19, Ascii.SO, 2, 86, Ascii.US, 5, 86, Ascii.CAN, Ascii.EM, 2, 86, 55, 6, 6, Ascii.SUB, Ascii.US, Ascii.NAK, Ascii.ETB, 2, Ascii.US, Ascii.EM, Ascii.CAN, 88, 40, 4, 5, 8, Ascii.RS, Ascii.EM, Ascii.EM, Ascii.SO, 5, Ascii.US, 75, 6, 4, Ascii.SI, 2, Ascii.CR, 2, 8, 10, Ascii.US, 2, 4, 5, 75, Ascii.SO, 19, 8, Ascii.SO, Ascii.ESC, Ascii.US, 2, 4, 5, 75, Ascii.US, 3, Ascii.EM, 4, Ascii.FS, 5, Ascii.SI, Ascii.RS, Ascii.EM, 2, 5, Ascii.FF, 75, Ascii.EM, Ascii.SO, Ascii.FF, 2, Ascii.CAN, Ascii.US, Ascii.SO, Ascii.EM, 42, 8, Ascii.US, 2, Ascii.GS, 2, Ascii.US, Ascii.DC2, 40, 10, 7, 7, 9, 10, 8, 0, Ascii.CAN, 39, 2, Ascii.CAN, Ascii.US, Ascii.SO, 5, Ascii.SO, Ascii.EM, 10, 41, 33, 101, 36, 38, 49, 44, 51, 44, 49, 60, 101, 54, 49, 36, 49, 32, Ascii.DEL, 101, 115, 66, 86, 80, 70, 71, 3, 66, 64, 87, 74, 85, 74, 87, 90, 3, 74, 80, 3, 77, 76, 87, 3, 81, 70, 80, 86, 78, 70, 71, Ascii.CR, 74, 125, 107, 34, 56, Ascii.US, Ascii.GS, 10, 33, Ascii.VT, 10, Ascii.ETB, Ascii.DC2, 4, Ascii.NAK, Ascii.FF, 81, 80, Ascii.DEL, 93, 74, 87, 72, 87, 74, 71, 125, 76, 91, 95, 74, 91, 90};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static synchronized void A04(C1315Wi c1315Wi, Class<? extends Activity> cls) {
        synchronized (ActivityUtils.class) {
            A02 = c1315Wi;
            A01 = c1315Wi.getApplicationContext();
            if (A01 instanceof Application) {
                ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
                if (aNActivityLifecycleCallbacksListener != null) {
                    Map<Activity, Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                    synchronized (activityStateMap) {
                        try {
                            A08.putAll(activityStateMap);
                        } catch (ConcurrentModificationException unused) {
                            c1315Wi.A06().A8u(A01(208, 8, 114), C06977l.A02, new C06987m(A01(72, 80, 103)));
                        }
                    }
                    ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(c1315Wi);
                }
                ((Application) A01).registerActivityLifecycleCallbacks(new ActivityUtils(cls));
            } else {
                c1315Wi.A06().A8u(A01(216, 3, 105), C06977l.A0d, new C06987m(A01(42, 30, 122)));
            }
        }
    }

    static {
        A02();
        A08 = Collections.synchronizedMap(new WeakHashMap());
        A06 = Collections.synchronizedList(new ArrayList());
        A07 = new ArrayList();
        A05 = KF.A00();
    }

    public ActivityUtils(Class<? extends Activity> adsActivityClass) {
        this.A00 = adsActivityClass;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x009d, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x000e, B:8:0x0014, B:11:0x0027, B:14:0x0031, B:19:0x003d, B:20:0x0041, B:24:0x0049), top: B:4:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b A[DONT_GENERATE] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized android.app.Activity A00() {
        /*
            java.lang.Class<com.facebook.ads.internal.util.activity.ActivityUtils> r9 = com.facebook.ads.internal.util.activity.ActivityUtils.class
            monitor-enter(r9)
            r6 = 0
            java.util.Map<android.app.Activity, java.lang.Integer> r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A08     // Catch: java.lang.Throwable -> L9d
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L9d
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L9d
        Le:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L2d
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L9d
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> L9d
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L9d
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L9d
            r0 = 3
            if (r1 != r0) goto Le
            java.lang.Object r6 = r2.getKey()     // Catch: java.lang.Throwable -> L9d
            android.app.Activity r6 = (android.app.Activity) r6     // Catch: java.lang.Throwable -> L9d
        L2d:
            r5 = 0
            r8 = 1
            if (r6 == 0) goto L3a
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L9d
            r0 = 28
            if (r1 >= r0) goto L38
            goto L3a
        L38:
            r1 = 0
            goto L3b
        L3a:
            r1 = 1
        L3b:
            if (r1 == 0) goto L41
            android.app.Activity r5 = com.facebook.ads.redexgen.X.K8.A00()     // Catch: java.lang.Throwable -> L9d
        L41:
            com.facebook.ads.redexgen.X.Wi r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A02     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L97
            if (r1 == 0) goto L97
            if (r6 == r5) goto L97
            r2 = 19
            r1 = 23
            r0 = 62
            java.lang.String r7 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r3.<init>()     // Catch: java.lang.Throwable -> L9d
            r2 = 203(0xcb, float:2.84E-43)
            r1 = 5
            r0 = 20
            java.lang.String r0 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> L9d
            r3.append(r0)     // Catch: java.lang.Throwable -> L9d
            r3.append(r6)     // Catch: java.lang.Throwable -> L9d
            r2 = 12
            r1 = 7
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> L9d
            r3.append(r0)     // Catch: java.lang.Throwable -> L9d
            r3.append(r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L9d
            com.facebook.ads.redexgen.X.7m r4 = new com.facebook.ads.redexgen.X.7m     // Catch: java.lang.Throwable -> L9d
            r4.<init>(r7, r0)     // Catch: java.lang.Throwable -> L9d
            r4.A03(r8)     // Catch: java.lang.Throwable -> L9d
            com.facebook.ads.redexgen.X.Wi r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A02     // Catch: java.lang.Throwable -> L9d
            com.facebook.ads.redexgen.X.7k r3 = r0.A06()     // Catch: java.lang.Throwable -> L9d
            r2 = 208(0xd0, float:2.91E-43)
            r1 = 8
            r0 = 114(0x72, float:1.6E-43)
            java.lang.String r1 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> L9d
            int r0 = com.facebook.ads.redexgen.X.C06977l.A03     // Catch: java.lang.Throwable -> L9d
            r3.A8u(r1, r0, r4)     // Catch: java.lang.Throwable -> L9d
        L97:
            if (r6 == 0) goto L9b
            monitor-exit(r9)
            return r6
        L9b:
            monitor-exit(r9)
            return r5
        L9d:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.util.activity.ActivityUtils.A00():android.app.Activity");
    }

    public static void A03(@NonNull C1316Wj c1316Wj) {
        if (!ID.A1B(c1316Wj) || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        KA ka2 = new KA(c1316Wj);
        synchronized (A07) {
            A07.add(ka2);
        }
        L8.A01.A01().postDelayed(ka2, 2000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        A08.put(activity, 1);
        Iterator<KB> it = A06.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(219, 17, 50));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        A08.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        Integer num = A08.get(activity);
        if (num == null || num.intValue() != 3) {
            C06987m c06987m = new C06987m(A01(172, 31, 47), A01(152, 20, 73) + num + A01(0, 12, 22) + activity);
            c06987m.A03(0);
            A02.A06().A8u(A01(208, 8, 114), C06977l.A03, c06987m);
        }
        A08.put(activity, 4);
        if (activity.getClass() != this.A00) {
            synchronized (A07) {
                arrayList = new ArrayList(A07);
                A07.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                L8.A01.A01().removeCallbacks((Runnable) it.next());
            }
        }
        A05.A01();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        A08.put(activity, 3);
        A05.A02();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        A08.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        A08.put(activity, 5);
    }
}
