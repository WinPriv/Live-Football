package com.facebook.ads.redexgen.X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class W0 implements I9, AF, FN, D5, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"tENgV7sVRmCggStQb7ahqyncu3McMlqx", "EBCLDe86SI67l2WgLGk", "Xc2z6PWfFp", "ZjGJvfPpi7mMWyj8ThC73X2hXIQsvVeY", "O", "wm4K2NOZzdg8zteNHm", "uxR1U8t68FFaIgGW", "ZP1sAESULwb937k6ya35I8qp57tsUFN9"};
    public final /* synthetic */ C0816Cn A00;

    public W0(C0816Cn c0816Cn) {
        this.A00 = c0816Cn;
    }

    @Override // com.facebook.ads.redexgen.X.AF
    public final void A9y(String str, long j10, long j11) {
        Iterator it = C0816Cn.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((AF) it.next()).A9y(str, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AF
    public final void A9z(C0771Ai c0771Ai) {
        Iterator it = C0816Cn.A0D(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[0].charAt(30) == strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "r";
            strArr2[1] = "Pw7sEp82k0vieihjeRw";
            if (!hasNext) {
                C0816Cn c0816Cn = this.A00;
                String[] strArr3 = A01;
                if (strArr3[0].charAt(30) == strArr3[7].charAt(30)) {
                    throw new RuntimeException();
                }
                A01[5] = "AJXnTxM8Cjr";
                C0816Cn.A04(c0816Cn, null);
                C0816Cn.A06(this.A00, null);
                C0816Cn.A00(this.A00, 0);
                return;
            }
            AF af = (AF) it.next();
            if (A01[3].charAt(20) != '3') {
                throw new RuntimeException();
            }
            A01[5] = "rZ";
            af.A9z(c0771Ai);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AF
    public final void AA0(C0771Ai c0771Ai) {
        C0816Cn.A06(this.A00, c0771Ai);
        Iterator it = C0816Cn.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((AF) it.next()).AA0(c0771Ai);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AF
    public final void AA1(Format format) {
        C0816Cn.A04(this.A00, format);
        Iterator it = C0816Cn.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((AF) it.next()).AA1(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AF
    public final void AA2(int i10) {
        C0816Cn.A00(this.A00, i10);
        Iterator it = C0816Cn.A0D(this.A00).iterator();
        while (it.hasNext()) {
            AF af = (AF) it.next();
            if (A01[2].length() == 11) {
                throw new RuntimeException();
            }
            A01[2] = "0C";
            af.AA2(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AF
    public final void AA3(int i10, long j10, long j11) {
        Iterator it = C0816Cn.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((AF) it.next()).AA3(i10, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FN
    public final void AAM(List<FJ> list) {
        C0816Cn.A08(this.A00, list);
        Iterator it = C0816Cn.A09(this.A00).iterator();
        while (it.hasNext()) {
            ((FN) it.next()).AAM(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.I9
    public final void AAY(int i10, long j10) {
        Iterator it = C0816Cn.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((I9) it.next()).AAY(i10, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final void ABS(Metadata metadata) {
        Iterator it = C0816Cn.A0A(this.A00).iterator();
        while (it.hasNext()) {
            ((D5) it.next()).ABS(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.I9
    public final void AC1(Surface surface) {
        if (C0816Cn.A01(this.A00) == surface) {
            Iterator it = C0816Cn.A0C(this.A00).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = C0816Cn.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((I9) it2.next()).AC1(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.X.I9
    public final void ACa(String str, long j10, long j11) {
        Iterator it = C0816Cn.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((I9) it.next()).ACa(str, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.I9
    public final void ACb(C0771Ai c0771Ai) {
        Iterator it = C0816Cn.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((I9) it.next()).ACb(c0771Ai);
        }
        C0816Cn.A03(this.A00, null);
        C0816Cn.A05(this.A00, null);
    }

    @Override // com.facebook.ads.redexgen.X.I9
    public final void ACc(C0771Ai c0771Ai) {
        C0816Cn.A05(this.A00, c0771Ai);
        Iterator it = C0816Cn.A0B(this.A00).iterator();
        while (it.hasNext()) {
            I9 i92 = (I9) it.next();
            if (A01[3].charAt(20) != '3') {
                throw new RuntimeException();
            }
            A01[5] = "6iGRC7";
            i92.ACc(c0771Ai);
        }
    }

    @Override // com.facebook.ads.redexgen.X.I9
    public final void ACf(Format format) {
        C0816Cn.A03(this.A00, format);
        Iterator it = C0816Cn.A0B(this.A00).iterator();
        while (it.hasNext()) {
            I9 i92 = (I9) it.next();
            String[] strArr = A01;
            if (strArr[0].charAt(30) == strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            A01[5] = "M1lNqMtLlEQhDRLPZV8vitTN6y5pnm";
            i92.ACf(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.I9
    public final void ACk(int i10, int i11, int i12, float f) {
        Iterator it = C0816Cn.A0C(this.A00).iterator();
        while (it.hasNext()) {
            ((I0) it.next()).ACk(i10, i11, i12, f);
        }
        Iterator it2 = C0816Cn.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((I9) it2.next()).ACk(i10, i11, i12, f);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        C0816Cn.A0H(this.A00, new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0816Cn.A0H(this.A00, null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0816Cn.A0H(this.A00, surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0816Cn.A0H(this.A00, null, false);
    }
}
