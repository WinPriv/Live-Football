package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@SuppressLint({"CatchGeneralException"})
/* renamed from: com.facebook.ads.redexgen.X.Ju, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractRunnableC0997Ju implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC0988Jk> A04;

    @Nullable
    public final C0986Ji A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{124, 91, 64, 64, 79, 76, 66, 75, Ascii.SO, 77, 92, 75, 79, 90, 75, 74, 0, Ascii.SO, 122, 70, 92, 75, 79, 74, Ascii.DC4, Ascii.SO};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC0997Ju() {
        if (A03.get()) {
            this.A00 = C1002Jz.A01(new C1001Jy(A01(0, 26, 90) + Thread.currentThread().getName()));
            return;
        }
        this.A00 = null;
    }

    public static void A03(boolean z10) {
        A03.set(z10);
    }

    public static void A04(boolean z10, InterfaceC0988Jk interfaceC0988Jk) {
        A02.set(z10);
        A04.set(interfaceC0988Jk);
    }

    @Nullable
    public final C0986Ji A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C1002Jz.A03(this);
            }
            try {
                A06();
            } catch (Throwable th) {
                if (A02.get()) {
                    K1.A00().A8m(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR, th);
                    InterfaceC0988Jk interfaceC0988Jk = A04.get();
                    if (interfaceC0988Jk != null) {
                        interfaceC0988Jk.ADt(th, this);
                    }
                } else {
                    throw th;
                }
            }
            if (A03.get()) {
                C1002Jz.A04(this);
            }
        } catch (Throwable th2) {
            C0990Jm.A00(th2, this);
        }
    }
}
