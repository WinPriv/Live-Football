package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class UP implements InterfaceC0845Dq {
    public static String[] A06 = {"0vmpU1QtAhI6qjIdcVId", "klBv", "qKjW3ego541fEYihs", "NuBFx4EY8fIgWeMvZ", "vAKBh2R", "FoB4J1nu", "9b5WU1uKCw6g3SYcMdOb", "twQXN8Z"};
    public final GU A00;
    public final InterfaceC0919Gq A01;
    public final C1233Tb A02;
    public final HZ A04;
    public final C0924Gv A03 = new C0924Gv();
    public final AtomicBoolean A05 = new AtomicBoolean();

    public UP(Uri uri, String str, C0846Dr c0846Dr) {
        this.A00 = new GU(uri, 0L, -1L, str, 0);
        this.A01 = c0846Dr.A00();
        this.A02 = c0846Dr.A01(false);
        this.A04 = c0846Dr.A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0845Dq
    public final void A4s() throws InterruptedException, IOException {
        this.A04.A00(-1000);
        try {
            C0925Gw.A03(this.A00, this.A01, this.A02, new byte[131072], this.A04, -1000, this.A03, this.A05, true);
            HZ hz = this.A04;
            String[] strArr = A06;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "qX3fQQGAY3dTsBjdyBPn";
            strArr2[6] = "Z0TFAaYyqvVnxMY9deNw";
            hz.A03(-1000);
        } catch (Throwable th) {
            this.A04.A03(-1000);
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0845Dq
    public final float A6N() {
        long j10 = this.A03.A01;
        if (j10 == -1) {
            return -1.0f;
        }
        return (((float) this.A03.A00()) * 100.0f) / ((float) j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0845Dq
    public final long A6O() {
        return this.A03.A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0845Dq
    public final void cancel() {
        this.A05.set(true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0845Dq
    public final void remove() {
        C0925Gw.A05(this.A01, C0925Gw.A02(this.A00));
    }
}
