package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.huawei.hms.ads.gl;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C07368y extends RW {

    @Nullable
    public C1047Lu A00;

    @Nullable
    public InterfaceC1082Ne A01;

    @Nullable
    public OO A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    @Nullable
    public RelativeLayout A06;
    public C1176Qv A07;
    public final C1316Wj A08;
    public final AbstractC1044Lr A09;
    public final AbstractC1011Kk A0A;
    public final K6 A0B;
    public final K2 A0C;
    public final JP A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final NV A0I;
    public static String[] A0J = {"dJoea1DbFsfm9GTpKIzcXYdmCRfBe4FS", "N1xc2MysRccxXRgwDgHXZSQeh7bFq7uk", "3nDu3mubCrSGPsHb", "SUxuavEQD34fwSKO8hxc7w", "hmAyL1Y1BI3zOyZEMNvfuG", "1nycCDmAbpyAo4RWRzHJ2ixoeiRT", "fh6VcnyoMwgZMcb2oBIx6", "bmD"};
    public static final int A0L = (int) (Kd.A02 * gl.Code);
    public static final int A0M = (int) (Kd.A02 * 9.0f);
    public static final int A0K = (int) (Kd.A02 * 9.0f);

    public C07368y(NV nv, boolean z10, String str, C1176Qv c1176Qv) {
        super(nv, z10);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new JP() { // from class: com.facebook.ads.redexgen.X.94
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(JQ jq) {
                if (C07368y.this.getVideoView() != null) {
                    C07368y.this.A07.A0P().setVolume(C07368y.this.getVideoView().getVolume());
                }
            }
        };
        this.A09 = new AbstractC1044Lr() { // from class: com.facebook.ads.redexgen.X.93
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C6v c6v) {
                C07368y.this.A01();
                Object tag = C07368y.this.getTag(-1593835536);
                if (tag != null) {
                    C07368y.this.A07.A0N().ACZ(((Integer) tag).intValue());
                }
            }
        };
        this.A0B = new K6() { // from class: com.facebook.ads.redexgen.X.91
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(KV kv) {
                C07368y.this.A00();
                C07368y.this.A07.A0O().ACi(C07368y.this);
            }
        };
        this.A0A = new AbstractC1011Kk() { // from class: com.facebook.ads.redexgen.X.90
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C06836s c06836s) {
                C07368y.this.A01();
                C07368y.this.A07.A0O().ACg(C07368y.this);
            }
        };
        this.A0C = new K2() { // from class: com.facebook.ads.redexgen.X.8z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(K5 k52) {
                C07368y.this.A05 = true;
                C07368y.this.A02();
            }
        };
        this.A0I = nv;
        this.A07 = c1176Qv;
        this.A0E = str;
        this.A08 = nv.A05();
        setGravity(17);
        int i10 = A0L;
        setPadding(i10, 0, i10, i10);
        LE.A0M(this, 0);
        setUpView(this.A08);
        this.A0F = new Paint();
        this.A0F.setColor(-16777216);
        this.A0F.setStyle(Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        if (this.A0I.A0A() != null && this.A02 != null) {
            this.A0I.A0A().A8l(this.A02.getSimpleVideoView());
            if (ID.A1a(getContext())) {
                this.A0I.A0A().A07(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A0I.A0A() != null) {
            this.A0I.A0A().A05();
            if (this.A02 != null) {
                this.A0I.A0A().AF5(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A01 == null) {
            return;
        }
        if (!A0i() || !this.A05) {
            boolean A0i = A0i();
            String[] strArr = A0J;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[3] = "whWH7G9NZGoicUCMK8TGye";
            strArr2[4] = "jQqQ2QRGHP0rmsCqitHuog";
            if (A0i || !this.A04) {
                return;
            }
        }
        this.A01.A9x();
    }

    private void A03(@Nullable View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        LE.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final boolean A0c() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final void A0e() {
        OO oo;
        if (A0i() && (oo = this.A02) != null) {
            oo.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final void A0f() {
        if (A0i()) {
            A0g();
            OO oo = this.A02;
            if (oo != null) {
                oo.A05(EnumC1121Os.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final void A0g() {
        OO oo;
        float volume = this.A07.A0P().getVolume();
        if (!A0i() || (oo = this.A02) == null) {
            return;
        }
        float newVolume = oo.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final boolean A0h() {
        OO oo;
        return A0i() && (oo = this.A02) != null && oo.A06();
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final boolean A0i() {
        return this.A03;
    }

    public final void A0j(Map<String, String> extraParams) {
        OO oo = this.A02;
        if (oo != null) {
            oo.A02();
            if (A0i()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    @Nullable
    public final OO getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.NR, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(gl.Code, gl.Code, getWidth(), getHeight());
        int i10 = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z10 = radius == 1;
        if (z10) {
            i10 = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i10, i10, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        RectF rectF = this.A0H;
        int radius2 = A0L;
        float f = radius2;
        int width = getWidth();
        int radius3 = A0L;
        float f10 = width - radius3;
        int height = getHeight();
        int radius4 = A0L;
        rectF.set(f, gl.Code, f10, height - radius4);
        if (z10) {
            i10 = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i10, i10, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setImageUrl(String str) {
        C1047Lu c1047Lu = this.A00;
        if (c1047Lu != null) {
            c1047Lu.setVisibility(0);
            new AsyncTaskC1195Ro(this.A00, this.A08).A04().A06(new C1190Rj(this)).A07(str);
        }
        OO oo = this.A02;
        if (oo != null) {
            oo.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z10) {
        this.A03 = z10;
    }

    public void setOnAssetsLoadedListener(InterfaceC1082Ne interfaceC1082Ne) {
        this.A01 = interfaceC1082Ne;
    }

    public void setUpImageView(C1316Wj c1316Wj) {
        this.A00 = new C1047Lu(c1316Wj);
        A04(this.A00);
    }

    public void setUpMediaContainer(C1316Wj c1316Wj) {
        this.A06 = new RelativeLayout(c1316Wj);
        A04(this.A06);
        C1047Lu c1047Lu = this.A00;
        if (c1047Lu != null) {
            this.A06.addView(c1047Lu);
            A03(this.A00);
        }
        OO oo = this.A02;
        if (oo != null) {
            this.A06.addView(oo);
            A03(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C1316Wj c1316Wj) {
        this.A02 = new OO(c1316Wj, new C0954Ib(this.A0E, getAdEventManager()));
        A04(this.A02);
    }

    private void setUpView(C1316Wj c1316Wj) {
        setUpImageView(c1316Wj);
        setUpVideoView(c1316Wj);
        setUpMediaContainer(c1316Wj);
    }

    public void setVideoPlaceholderUrl(String str) {
        OO oo = this.A02;
        if (oo != null) {
            oo.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        C1047Lu c1047Lu = this.A00;
        if (c1047Lu != null) {
            if (A0J[5].length() == 10) {
                throw new RuntimeException();
            }
            A0J[2] = "s54OOOYMcUndmM7F";
            c1047Lu.setVisibility(8);
        }
        OO oo = this.A02;
        if (oo != null) {
            oo.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
