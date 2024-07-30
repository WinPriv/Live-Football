package com.applovin.impl.sdk.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class r {
    public static boolean a(int i10) {
        return i10 == 0;
    }

    public static void b(final View view, long j10, final Runnable runnable) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, gl.Code);
        alphaAnimation.setDuration(j10);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.sdk.utils.r.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(4);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        });
        view.startAnimation(alphaAnimation);
    }

    public static void a(View view, long j10) {
        a(view, j10, (Runnable) null);
    }

    public static void a(final View view, long j10, final Runnable runnable) {
        view.setVisibility(4);
        view.bringToFront();
        AlphaAnimation alphaAnimation = new AlphaAnimation(gl.Code, 1.0f);
        alphaAnimation.setDuration(j10);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.sdk.utils.r.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        });
        view.startAnimation(alphaAnimation);
    }

    public static String b(int i10) {
        return i10 == 0 ? "VISIBLE" : i10 == 4 ? "INVISIBLE" : i10 == 8 ? "GONE" : String.valueOf(i10);
    }

    public static boolean a(int i10, int i11) {
        return a(i10) != a(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if ((r6 & 1) == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0039, code lost:
    
        if ((r6 & 16) == 16) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] a(int r6, int r7, int r8) {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            if (r6 != 0) goto Lc
            int[] r6 = new int[r0]
            r6[r1] = r7
            r6[r2] = r8
            return r6
        Lc:
            r3 = r6 & 119(0x77, float:1.67E-43)
            r4 = 119(0x77, float:1.67E-43)
            if (r3 != r4) goto L19
            int[] r6 = new int[r2]
            r7 = 13
            r6[r1] = r7
            return r6
        L19:
            r3 = r6 & 112(0x70, float:1.57E-43)
            r4 = 15
            r5 = 112(0x70, float:1.57E-43)
            if (r3 != r5) goto L23
        L21:
            r7 = r4
            goto L3c
        L23:
            r3 = r6 & 48
            r5 = 48
            if (r3 != r5) goto L2c
            r7 = 10
            goto L3c
        L2c:
            r3 = r6 & 80
            r5 = 80
            if (r3 != r5) goto L35
            r7 = 12
            goto L3c
        L35:
            r3 = r6 & 16
            r5 = 16
            if (r3 != r5) goto L3c
            goto L21
        L3c:
            r3 = r6 & 7
            r4 = 14
            r5 = 7
            if (r3 != r5) goto L45
        L43:
            r8 = r4
            goto L79
        L45:
            boolean r3 = com.applovin.impl.sdk.utils.h.b()
            if (r3 == 0) goto L55
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r5 = r6 & r3
            if (r5 != r3) goto L55
            r8 = 20
            goto L79
        L55:
            r3 = r6 & 3
            r5 = 3
            if (r3 != r5) goto L5d
            r8 = 9
            goto L79
        L5d:
            boolean r3 = com.applovin.impl.sdk.utils.h.b()
            if (r3 == 0) goto L6d
            r3 = 8388613(0x800005, float:1.175495E-38)
            r5 = r6 & r3
            if (r5 != r3) goto L6d
            r8 = 21
            goto L79
        L6d:
            r3 = r6 & 5
            r5 = 5
            if (r3 != r5) goto L75
            r8 = 11
            goto L79
        L75:
            r6 = r6 & r2
            if (r6 != r2) goto L79
            goto L43
        L79:
            int[] r6 = new int[r0]
            r6[r1] = r8
            r6[r2] = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.r.a(int, int, int):int[]");
    }

    public static void a(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }
}
