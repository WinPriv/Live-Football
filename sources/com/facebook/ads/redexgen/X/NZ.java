package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.huawei.hms.ads.gl;

/* loaded from: assets/audience_network.dex */
public class NZ extends AnimatorListenerAdapter {
    public static String[] A02 = {"R9x3aA0CxKnsz3as3yTNo", "wj3", "QXJ1VvuxLHED1mtMWLYdqrUglWa9lzRq", "lkNOeAB6Ljcfoc1GYo9neKrfDLaf7fDy", "DjE9g1oV3RhQW9", "kuoJdNjNcIUcz8fbOu7oHrt", "PXWkVVH6OcZLxwrP3oXHVUdgM2dUbdjZ", "8PrLrYluZp2AIaWhf9UgS"};
    public final /* synthetic */ RX A00;
    public final /* synthetic */ boolean A01;

    public NZ(RX rx, boolean z10) {
        this.A00 = rx;
        this.A01 = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1080Nc c1080Nc;
        C1206Rz c1206Rz;
        C1206Rz c1206Rz2;
        super.onAnimationEnd(animator);
        c1080Nc = this.A00.A0F;
        c1080Nc.setTranslationY(gl.Code);
        this.A00.A0H();
        if (this.A01) {
            return;
        }
        c1206Rz = this.A00.A0D;
        if (c1206Rz != null) {
            RX rx = this.A00;
            String[] strArr = A02;
            if (strArr[2].charAt(23) != strArr[6].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "czZD1KZ4paLzcRsa7FTotpjgHmPZqDaL";
            strArr2[6] = "ekjCDFK0XFV5sAsD0BjD76lgNibQF4SI";
            c1206Rz2 = rx.A0D;
            c1206Rz2.destroy();
        }
    }
}
