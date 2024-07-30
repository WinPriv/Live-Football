package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.b;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network.dex */
public final class EX {
    public static String[] A04 = {"HGHzNcawqnVFgJx8ceQNwcxcn1SDkpDb", "AD2ta0a", "biSUTEi4nYJndXTTLsT", "38FOXeSW4cnwnxdXp60to", "WtyRCcfaPM", "iLolo35", "fvJAwdggv90DLF", "FbA7S8K"};
    public final int A00;

    @Nullable
    public final EK A01;
    public final long A02;
    public final CopyOnWriteArrayList<EW> A03;

    public EX() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public EX(CopyOnWriteArrayList<EW> copyOnWriteArrayList, int i10, @Nullable EK ek, long j10) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i10;
        this.A01 = ek;
        this.A02 = j10;
    }

    private long A00(long j10) {
        long A01 = AnonymousClass92.A01(j10);
        if (A01 == b.f7291b) {
            return b.f7291b;
        }
        long j11 = this.A02;
        if (A04[2].length() != 19) {
            throw new RuntimeException();
        }
        A04[7] = "vQJR5ZN";
        return j11 + A01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @CheckResult
    public final EX A02(int i10, @Nullable EK ek, long j10) {
        return new EX(this.A03, i10, ek, j10);
    }

    public final void A03() {
        H6.A04(this.A01 != null);
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW next = it.next();
            InterfaceC0853Ea listener = next.A01;
            A01(next.A00, new EN(this, listener));
        }
    }

    public final void A04() {
        H6.A04(this.A01 != null);
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW next = it.next();
            InterfaceC0853Ea listener = next.A01;
            A01(next.A00, new EO(this, listener));
        }
    }

    public final void A05() {
        H6.A04(this.A01 != null);
        Iterator<EW> it = this.A03.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A04[7].length() != 7) {
                throw new RuntimeException();
            }
            A04[2] = "JAadAeVCHcunsRCfoQL";
            if (hasNext) {
                EW next = it.next();
                InterfaceC0853Ea listener = next.A01;
                A01(next.A00, new ET(this, listener));
            } else {
                return;
            }
        }
    }

    public final void A06(int i10, @Nullable Format format, int i11, @Nullable Object obj, long j10) {
        A0C(new EZ(1, i10, format, i11, obj, A00(j10), b.f7291b));
    }

    public final void A07(Handler handler, InterfaceC0853Ea interfaceC0853Ea) {
        H6.A03((handler == null || interfaceC0853Ea == null) ? false : true);
        this.A03.add(new EW(handler, interfaceC0853Ea));
    }

    public final void A08(EY ey, EZ ez) {
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW next = it.next();
            InterfaceC0853Ea listener = next.A01;
            A01(next.A00, new ER(this, listener, ey, ez));
        }
    }

    public final void A09(EY ey, EZ ez) {
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW next = it.next();
            InterfaceC0853Ea listener = next.A01;
            A01(next.A00, new EQ(this, listener, ey, ez));
        }
    }

    public final void A0A(EY ey, EZ ez) {
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW next = it.next();
            InterfaceC0853Ea listener = next.A01;
            A01(next.A00, new EP(this, listener, ey, ez));
        }
    }

    public final void A0B(EY ey, EZ ez, IOException iOException, boolean z10) {
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW next = it.next();
            A01(next.A00, new ES(this, next.A01, ey, ez, iOException, z10));
        }
    }

    public final void A0C(EZ ez) {
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW next = it.next();
            InterfaceC0853Ea listener = next.A01;
            A01(next.A00, new EV(this, listener, ez));
        }
    }

    public final void A0D(InterfaceC0853Ea interfaceC0853Ea) {
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == interfaceC0853Ea) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final void A0E(GU gu, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12) {
        A0A(new EY(gu, j12, 0L, 0L), new EZ(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0F(GU gu, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14) {
        A08(new EY(gu, j12, j13, j14), new EZ(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0G(GU gu, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14) {
        A09(new EY(gu, j12, j13, j14), new EZ(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0H(GU gu, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
        A0B(new EY(gu, j12, j13, j14), new EZ(i10, i11, format, i12, obj, A00(j10), A00(j11)), iOException, z10);
    }
}
