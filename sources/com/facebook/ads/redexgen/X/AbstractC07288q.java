package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.gl;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC07288q extends RW {
    public RelativeLayout A00;
    public C1047Lu A01;
    public InterfaceC1082Ne A02;
    public C1176Qv A03;
    public OO A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final C1316Wj A0B;
    public final AbstractC1044Lr A0C;
    public final AbstractC1011Kk A0D;
    public final K6 A0E;
    public final K2 A0F;
    public final JP A0G;
    public final String A0H;
    public static final int A0J = (int) (Kd.A02 * 1.0f);
    public static final int A0K = (int) (Kd.A02 * 4.0f);
    public static final int A0I = (int) (Kd.A02 * 6.0f);

    public abstract void A0j(C1316Wj c1316Wj);

    public AbstractC07288q(NV nv, boolean z10, String str, C1176Qv c1176Qv) {
        super(nv, z10);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0G = new JP() { // from class: com.facebook.ads.redexgen.X.8v
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(JQ jq) {
                C1176Qv c1176Qv2;
                c1176Qv2 = AbstractC07288q.this.A03;
                c1176Qv2.A0P().setVolume(AbstractC07288q.this.getVideoView().getVolume());
            }
        };
        this.A0C = new AbstractC1044Lr() { // from class: com.facebook.ads.redexgen.X.8u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C6v c6v) {
                C1176Qv c1176Qv2;
                c1176Qv2 = AbstractC07288q.this.A03;
                c1176Qv2.A0N().ACZ(((Integer) AbstractC07288q.this.getTag(-1593835536)).intValue());
            }
        };
        this.A0E = new K6() { // from class: com.facebook.ads.redexgen.X.8t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(KV kv) {
                C1176Qv c1176Qv2;
                c1176Qv2 = AbstractC07288q.this.A03;
                c1176Qv2.A0O().ACi(AbstractC07288q.this);
            }
        };
        this.A0D = new AbstractC1011Kk() { // from class: com.facebook.ads.redexgen.X.8s
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C06836s c06836s) {
                C1176Qv c1176Qv2;
                c1176Qv2 = AbstractC07288q.this.A03;
                c1176Qv2.A0O().ACg(AbstractC07288q.this);
            }
        };
        this.A0F = new K2() { // from class: com.facebook.ads.redexgen.X.8r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(K5 k52) {
                AbstractC07288q.this.A07 = true;
                AbstractC07288q.this.A01();
            }
        };
        this.A03 = c1176Qv;
        this.A0H = str;
        this.A0B = nv.A05();
        setGravity(17);
        int i10 = A0J;
        setPadding(i10, 0, i10, i10);
        LE.A0M(this, 0);
        setUpView(this.A0B);
        this.A08 = new Paint();
        this.A08.setColor(-16777216);
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A02 == null) {
            return;
        }
        if ((A0i() && this.A07) || (!A0i() && this.A06)) {
            this.A02.A9x();
        }
    }

    private void A02(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        LE.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final boolean A0c() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final void A0e() {
        if (A0i()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final void A0f() {
        if (A0i()) {
            A0g();
            this.A04.A05(EnumC1121Os.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final void A0g() {
        float volume = this.A03.A0P().getVolume();
        if (A0i()) {
            float newVolume = this.A04.getVolume();
            if (volume != newVolume) {
                this.A04.setVolume(volume);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final boolean A0h() {
        return A0i() && this.A04.A06();
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final boolean A0i() {
        return this.A05;
    }

    public final void A0k(Map<String, String> extraParams) {
        this.A04.A02();
        if (A0i()) {
            this.A04.A04(getAdEventManager(), this.A0H, extraParams);
        }
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final OO getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(gl.Code, gl.Code, getWidth(), getHeight());
        Path path = this.A09;
        RectF rectF = this.A0A;
        int i10 = A0I;
        path.addRoundRect(rectF, i10, i10, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0J, gl.Code, getWidth() - A0J, getHeight() - A0J);
        Path path2 = this.A09;
        RectF rectF2 = this.A0A;
        int i11 = A0K;
        path2.addRoundRect(rectF2, i11, i11, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A01(str, str2, null, true, false);
    }

    public void setCTAInfo(C1L c1l, Map<String, String> extraData) {
        getCtaButton().setCta(c1l, this.A0H, extraData);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new AsyncTaskC1195Ro(this.A01, this.A0B).A04().A06(new RV(this)).A07(str);
    }

    public void setIsVideo(boolean z10) {
        this.A05 = z10;
    }

    public void setOnAssetsLoadedListener(InterfaceC1082Ne interfaceC1082Ne) {
        this.A02 = interfaceC1082Ne;
    }

    public void setUpImageView(C1316Wj c1316Wj) {
        this.A01 = new C1047Lu(c1316Wj);
        A02(this.A01);
    }

    public void setUpMediaContainer(C1316Wj c1316Wj) {
        this.A00 = new RelativeLayout(c1316Wj);
        A02(this.A00);
    }

    public void setUpVideoView(C1316Wj c1316Wj) {
        this.A04 = new OO(c1316Wj, new C0954Ib(this.A0H, getAdEventManager()));
        A02(this.A04);
    }

    private void setUpView(C1316Wj c1316Wj) {
        setUpImageView(c1316Wj);
        setUpVideoView(c1316Wj);
        setUpMediaContainer(c1316Wj);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A0j(c1316Wj);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0C);
        this.A04.A03(this.A0E);
        this.A04.A03(this.A0D);
        this.A04.A03(this.A0F);
    }
}
