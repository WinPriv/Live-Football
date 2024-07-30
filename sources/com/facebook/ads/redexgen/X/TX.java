package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/* loaded from: assets/audience_network.dex */
public final class TX implements InterfaceC0919Gq {
    public static boolean A06;
    public static byte[] A07;
    public static final HashSet<File> A08;
    public long A00;
    public boolean A01;
    public final TZ A02;
    public final C0927Gy A03;
    public final File A04;
    public final HashMap<String, ArrayList<InterfaceC0918Gp>> A05;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{106, 69, 68, 95, 67, 78, 89, Ascii.VT, 120, 66, 70, 91, 71, 78, 104, 74, 72, 67, 78, Ascii.VT, 66, 69, 88, 95, 74, 69, 72, 78, Ascii.VT, 94, 88, 78, 88, Ascii.VT, 95, 67, 78, Ascii.VT, 77, 68, 71, 79, 78, 89, 17, Ascii.VT, 82, 104, 108, 113, 109, 100, 66, 96, 98, 105, 100, 94, 100, 96, 125, 97, 104, 78, 108, 110, 101, 104, 35, 100, 99, 100, 121, 100, 108, 97, 100, 119, 104, 37, 36, 0, 39, 60, 33, 58, 61, 52, 115, 58, 61, 55, 54, 43, 115, 53, 58, 63, 54, 115, 53, 50, 58, 63, 54, 55, Ascii.FS, Ascii.RS, Ascii.FS, Ascii.ETB, Ascii.SUB, Ascii.ESC, 32, Ascii.FS, Ascii.DLE, 17, Ascii.VT, Ascii.SUB, 17, Ascii.VT, 32, Ascii.SYN, 17, Ascii.ESC, Ascii.SUB, 7, 81, Ascii.SUB, 7, Ascii.SYN};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Gq
    public final synchronized void A44(File file) throws C0917Go {
        H6.A04(!this.A01);
        TW A00 = TW.A00(file, this.A03);
        H6.A04(A00 != null);
        C0926Gx A09 = this.A03.A09(A00.A04);
        H6.A01(A09);
        H6.A04(A09.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long A002 = H1.A00(A09.A05());
            if (A002 != -1) {
                H6.A04(A00.A02 + A00.A01 <= A002);
            }
            A0A(A00);
            this.A03.A0G();
            notifyAll();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Gq
    @NonNull
    public final synchronized NavigableSet<C0923Gu> A5v(String str) {
        C0926Gx A09;
        H6.A04(!this.A01);
        A09 = this.A03.A09(str);
        return (A09 == null || A09.A0C()) ? new TreeSet() : new TreeSet((Collection) A09.A08());
    }

    static {
        A06();
        A08 = new HashSet<>();
    }

    public TX(File file, TZ tz) {
        this(file, tz, null, false);
    }

    public TX(File file, TZ tz, C0927Gy c0927Gy) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = tz;
            this.A03 = c0927Gy;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new H3(this, A03(57, 24, 74), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 108) + file);
    }

    public TX(File file, TZ tz, byte[] bArr, boolean z10) {
        this(file, tz, new C0927Gy(file, bArr, z10));
    }

    private TW A00(String str, long j10) throws C0917Go {
        TW span;
        C0926Gx A09 = this.A03.A09(str);
        if (A09 == null) {
            return TW.A02(str, j10);
        }
        while (true) {
            span = A09.A06(j10);
            if (!span.A05 || span.A03.exists()) {
                break;
            }
            A05();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Gq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final synchronized TW AEq(String str, long j10) throws InterruptedException, C0917Go {
        TW span;
        while (true) {
            span = AEr(str, j10);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Gq
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final synchronized TW AEr(String str, long j10) throws C0917Go {
        H6.A04(!this.A01);
        TW A00 = A00(str, j10);
        if (A00.A05) {
            TW cacheSpan = this.A03.A09(str).A07(A00);
            A0C(A00, cacheSpan);
            return cacheSpan;
        }
        C0926Gx A0A = this.A03.A0A(str);
        if (!A0A.A0D()) {
            A0A.A0B(true);
            return A00;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0E();
        File[] listFiles = this.A04.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(A03(106, 24, 56))) {
                TW A00 = file.length() > 0 ? TW.A00(file, this.A03) : null;
                if (A00 != null) {
                    A0A(A00);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0F();
        try {
            this.A03.A0G();
        } catch (C0917Go e10) {
            Log.e(A03(46, 11, 70), A03(81, 25, 20), e10);
        }
    }

    private void A05() throws C0917Go {
        ArrayList arrayList = new ArrayList();
        Iterator<C0926Gx> it = this.A03.A0D().iterator();
        while (it.hasNext()) {
            Iterator<TW> it2 = it.next().A08().iterator();
            while (it2.hasNext()) {
                TW next = it2.next();
                if (!next.A03.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            A08((C0923Gu) arrayList.get(i10), false);
        }
        this.A03.A0F();
        this.A03.A0G();
    }

    private void A07(C0923Gu c0923Gu) {
        ArrayList<InterfaceC0918Gp> arrayList = this.A05.get(c0923Gu.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ACI(this, c0923Gu);
            }
        }
        this.A02.ACI(this, c0923Gu);
    }

    private void A08(C0923Gu c0923Gu, boolean z10) throws C0917Go {
        C0926Gx A09 = this.A03.A09(c0923Gu.A04);
        if (A09 == null || !A09.A0E(c0923Gu)) {
            return;
        }
        this.A00 -= c0923Gu.A01;
        if (z10) {
            try {
                this.A03.A0H(A09.A03);
                this.A03.A0G();
            } finally {
                A07(c0923Gu);
            }
        }
    }

    private void A0A(TW tw) {
        this.A03.A0A(tw.A04).A09(tw);
        this.A00 += tw.A01;
        A0B(tw);
    }

    private void A0B(TW tw) {
        ArrayList<InterfaceC0918Gp> arrayList = this.A05.get(tw.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ACH(this, tw);
            }
        }
        this.A02.ACH(this, tw);
    }

    private void A0C(TW tw, C0923Gu c0923Gu) {
        ArrayList<InterfaceC0918Gp> arrayList = this.A05.get(tw.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ACJ(this, tw, c0923Gu);
            }
        }
        this.A02.ACJ(this, tw, c0923Gu);
    }

    public static synchronized boolean A0D(File file) {
        synchronized (TX.class) {
            if (A06) {
                return true;
            }
            return A08.add(file.getAbsoluteFile());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Gq
    public final synchronized void A3P(String str, H2 h22) throws C0917Go {
        H6.A04(!this.A01);
        this.A03.A0I(str, h22);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Gq
    public final synchronized long A5t() {
        H6.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Gq
    public final synchronized long A5u(String str, long j10, long j11) {
        C0926Gx cachedContent;
        H6.A04(!this.A01);
        cachedContent = this.A03.A09(str);
        return cachedContent != null ? cachedContent.A04(j10, j11) : -j11;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Gq
    public final synchronized long A66(String str) {
        return H1.A00(A67(str));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Gq
    public final synchronized H0 A67(String str) {
        H6.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Gq
    public final synchronized void ADj(C0923Gu c0923Gu) {
        H6.A04(!this.A01);
        C0926Gx A09 = this.A03.A09(c0923Gu.A04);
        H6.A01(A09);
        H6.A04(A09.A0D());
        A09.A0B(false);
        this.A03.A0H(A09.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Gq
    public final synchronized void ADq(C0923Gu c0923Gu) throws C0917Go {
        H6.A04(!this.A01);
        A08(c0923Gu, true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Gq
    public final synchronized void AEO(String str, long j10) throws C0917Go {
        H2 mutations = new H2();
        H1.A05(mutations, j10);
        A3P(str, mutations);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Gq
    public final synchronized File AEo(String str, long j10, long j11) throws C0917Go {
        C0926Gx A09;
        H6.A04(!this.A01);
        A09 = this.A03.A09(str);
        H6.A01(A09);
        H6.A04(A09.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.ACK(this, str, j10, j11);
        return TW.A04(this.A04, A09.A02, j10, System.currentTimeMillis());
    }
}
