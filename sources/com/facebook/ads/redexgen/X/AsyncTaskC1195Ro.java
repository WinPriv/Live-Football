package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ro, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC1195Ro extends AsyncTask<String, Void, Bitmap[]> implements C7E {
    public static byte[] A0A;
    public static String[] A0B = {"Y", "r8ye64eLoQHeOJVpmB1uxWw1zCCHhuzX", "pvZIfONmKv3cVbimQPa9", "RLgA2SApOIsDDawooMs2KL5D8ZiCWoW1", "kM6akDIqkvY", "0vJdyNO9qrz2JF8Kt31GcmRDql8haFQB", "b8N1ZLVb0I2QrMIKflin5UtA7D7V4D", "X"};
    public int A00;
    public int A01;
    public N1 A02;
    public boolean A03;
    public final int A04;
    public final int A05;

    @Nullable
    public final WeakReference<C1077Mz> A06;
    public final WeakReference<C1316Wj> A07;

    @Nullable
    public final WeakReference<ImageView> A08;

    @Nullable
    public final WeakReference<ViewGroup> A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-89, -91, -82, -91, -78, -87, -93};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final Bitmap[] A03(String... strArr) {
        if (C0990Jm.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            Bitmap bitmap = null;
            Bitmap bitmap2 = null;
            C1316Wj c1316Wj = this.A07.get();
            if (c1316Wj == null) {
                return new Bitmap[]{null, null};
            }
            try {
                bitmap = new C6G(c1316Wj).A0N(str, this.A00, this.A01);
                if (bitmap != null && !this.A03) {
                    bitmap2 = LL.A01(c1316Wj, bitmap, this.A04, this.A05);
                }
            } catch (Throwable th) {
                c1316Wj.A06().A8u(A00(0, 7, 16), C06977l.A1V, new C06987m(th));
            }
            return new Bitmap[]{bitmap, bitmap2};
        } catch (Throwable th2) {
            C0990Jm.A00(th2, this);
            return null;
        }
    }

    static {
        A01();
    }

    public AsyncTaskC1195Ro(ViewGroup viewGroup, int i10, int i11, C1316Wj c1316Wj) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1316Wj);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new WeakReference<>(viewGroup);
        this.A04 = i10;
        this.A05 = i11;
    }

    public AsyncTaskC1195Ro(ViewGroup viewGroup, C1316Wj c1316Wj) {
        this(viewGroup, 12, 16, c1316Wj);
    }

    public AsyncTaskC1195Ro(ImageView imageView, C1316Wj c1316Wj) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1316Wj);
        this.A06 = null;
        this.A08 = new WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public AsyncTaskC1195Ro(C1077Mz c1077Mz, C1316Wj c1316Wj) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1316Wj);
        this.A06 = new WeakReference<>(c1077Mz);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A02(Bitmap[] result) {
        C1077Mz c1077Mz;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            if (this.A08 != null) {
                ImageView imageView = this.A08.get();
                if (result[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(result[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(result[0]);
                }
            }
            if (this.A06 != null && (c1077Mz = this.A06.get()) != null) {
                c1077Mz.setImage(result[0], result[1]);
            }
            if (this.A09 != null && this.A09.get() != null && result[1] != null) {
                LE.A0S(this.A09.get(), new BitmapDrawable(this.A07.get().getResources(), result[1]));
            }
            if (this.A02 != null) {
                this.A02.AAr(result[0] != null);
            }
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }

    public final AsyncTaskC1195Ro A04() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final AsyncTaskC1195Ro A05(int i10, int i11) {
        this.A00 = i10;
        this.A01 = i11;
        return this;
    }

    public final AsyncTaskC1195Ro A06(N1 n12) {
        this.A02 = n12;
        return this;
    }

    public final void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            N1 n12 = this.A02;
            if (n12 != null) {
                n12.AAr(false);
                return;
            }
            return;
        }
        executeOnExecutor(LJ.A06, str);
    }

    @Override // com.facebook.ads.redexgen.X.C7E
    @Nullable
    public final C1316Wj A5Z() {
        return this.A07.get();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap[] doInBackground(String[] strArr) {
        if (C0990Jm.A02(this)) {
            return null;
        }
        try {
            return A03(strArr);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            A02(bitmapArr);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[0] = "X";
            strArr2[7] = "y";
        }
    }
}
