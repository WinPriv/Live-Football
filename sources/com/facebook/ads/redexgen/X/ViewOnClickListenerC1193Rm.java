package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.huawei.hms.ads.gl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Rm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class ViewOnClickListenerC1193Rm extends NC implements View.OnClickListener {
    public static byte[] A0B;
    public static String[] A0C = {"idQnrwKrPQs0c3zYYHT6WTvW1aXoRMqQ", "Gekt1WHQiHnIJqxdwB9j8FzDtIJy1cfJ", "sF2V", "CdtBVDHmuEaNC9R8", "jtmNaJ8NDkAfiILRFeCM3WK", "aXO2Ks7stxeTyHMnCxwSATKtkmhK3bmt", "xmLEl9t0StR", ""};
    public static final int A0D;
    public int A00;
    public int A01;

    @Nullable
    public Bitmap A02;

    @Nullable
    public Paint A03;

    @Nullable
    public Rect A04;
    public C1316Wj A05;

    @Nullable
    public String A06;

    @Nullable
    public String A07;
    public boolean A08;
    public final N9 A09;
    public final Map<String, String> A0A;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A0C[2].length() != 4) {
                throw new RuntimeException();
            }
            A0C[3] = "DG";
            copyOfRange[i13] = (byte) (i14 ^ 83);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0B = new byte[]{6, 2, 77, Ascii.CR, 5, 19, 19, 5, Ascii.SO, 7, 5, Ascii.DC2};
    }

    static {
        A06();
        A0D = (int) (Kd.A02 * 24.0f);
    }

    public ViewOnClickListenerC1193Rm(C1316Wj c1316Wj, String str, C1K c1k, IT it, InterfaceC1029Lc interfaceC1029Lc, C1137Pi c1137Pi, L6 l62) {
        this(c1316Wj, str, c1k, false, it, interfaceC1029Lc, c1137Pi, l62);
    }

    public ViewOnClickListenerC1193Rm(C1316Wj c1316Wj, String str, C1K c1k, boolean z10, IT it, InterfaceC1029Lc interfaceC1029Lc, C1137Pi c1137Pi, L6 l62) {
        super(c1316Wj, c1k);
        this.A0A = new HashMap();
        this.A05 = c1316Wj;
        this.A08 = z10;
        this.A09 = new N9(c1316Wj, str, c1137Pi, l62, it, interfaceC1029Lc);
        setOnClickListener(this);
        LE.A0G(1001, this);
    }

    @Nullable
    public static Bitmap A03(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private void A05() {
        String str;
        if (this.A08 && (str = this.A07) != null) {
            this.A02 = A03(LN.A03(this.A05, str.contains(A04(0, 12, 51)) ? LM.MESSENGER : LM.WHATSAPP));
            this.A03 = new Paint();
            int i10 = A0D;
            setPadding(i10, 0, i10, 0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.A06) && !TextUtils.isEmpty(this.A07)) {
                this.A09.A08(this.A06, this.A07, this.A0A);
            }
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            this.A04 = new Rect(0, 0, bitmap.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, gl.Code);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f = width - textWidth;
            float textWidth2 = this.A00;
            int i10 = (int) (f - textWidth2);
            int height = getHeight() / 2;
            int left = this.A01;
            int top = height - (left / 2);
            Rect destRect = new Rect(i10, top, i10 + left, left + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    public void setCta(C1L c1l, String str, Map<String, String> extraData) {
        setCta(c1l, str, extraData, null);
    }

    public void setCta(C1L c1l, String str, Map<String, String> extraData, @Nullable N8 n82) {
        this.A06 = str;
        this.A07 = c1l.A05();
        this.A0A.putAll(extraData);
        this.A09.A07(n82);
        String A04 = c1l.A04();
        if (!TextUtils.isEmpty(A04)) {
            String buttonText = this.A07;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(A04);
                A05();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z10) {
        this.A09.A09(z10);
    }
}
