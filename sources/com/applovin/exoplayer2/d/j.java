package com.applovin.exoplayer2.d;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.applovin.exoplayer2.d.c;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class j {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(Throwable th) {
            return th instanceof NotProvisionedException;
        }

        public static boolean b(Throwable th) {
            return th instanceof DeniedByServerException;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return com.applovin.exoplayer2.h.b(ai.d(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static int a(Exception exc, int i10) {
        int i11 = ai.f16274a;
        if (i11 >= 21 && b.a(exc)) {
            return b.b(exc);
        }
        if (i11 >= 23 && c.a(exc)) {
            return 6006;
        }
        if (i11 >= 18 && a.a(exc)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (i11 >= 18 && a.b(exc)) {
            return 6007;
        }
        if (exc instanceof t) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (exc instanceof c.d) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        if (exc instanceof q) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        throw new IllegalArgumentException();
    }
}
