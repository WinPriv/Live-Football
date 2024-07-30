package com.huawei.hms.ads.template.downloadbuttonstyle;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.huawei.hms.ads.nativead.R;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.s;
import com.huawei.openalliance.ad.views.u;

/* loaded from: classes2.dex */
public class e extends com.huawei.hms.ads.template.downloadbuttonstyle.a {
    private RemoteButtonStyleAttr I;

    /* loaded from: classes2.dex */
    public static class a extends u {
        public a(Context context, RemoteButtonStyleAttr remoteButtonStyleAttr) {
            super(context);
            Drawable d10;
            this.V.f24156a = remoteButtonStyleAttr.F();
            s.b bVar = this.V;
            remoteButtonStyleAttr.j();
            bVar.getClass();
            this.V.f24157b = remoteButtonStyleAttr.D();
            this.I.f24156a = remoteButtonStyleAttr.L();
            s.b bVar2 = this.I;
            remoteButtonStyleAttr.j();
            bVar2.getClass();
            this.I.f24157b = remoteButtonStyleAttr.a();
            this.Z.f24156a = remoteButtonStyleAttr.b();
            s.b bVar3 = this.Z;
            remoteButtonStyleAttr.j();
            bVar3.getClass();
            this.Z.f24157b = remoteButtonStyleAttr.c();
            if (remoteButtonStyleAttr.d() == null) {
                d10 = context.getResources().getDrawable(R.drawable.hiad_app_down_cancel_btn_dark);
            } else {
                d10 = remoteButtonStyleAttr.d();
            }
            this.B = d10;
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends u {
        public b(Context context, RemoteButtonStyleAttr remoteButtonStyleAttr) {
            super(context);
            Drawable S;
            this.V.f24156a = remoteButtonStyleAttr.Code();
            s.b bVar = this.V;
            remoteButtonStyleAttr.j();
            bVar.getClass();
            this.V.f24157b = remoteButtonStyleAttr.V();
            this.I.f24156a = remoteButtonStyleAttr.I();
            s.b bVar2 = this.I;
            remoteButtonStyleAttr.j();
            bVar2.getClass();
            this.I.f24157b = remoteButtonStyleAttr.Z();
            this.Z.f24156a = remoteButtonStyleAttr.B();
            s.b bVar3 = this.Z;
            remoteButtonStyleAttr.j();
            bVar3.getClass();
            this.Z.f24157b = remoteButtonStyleAttr.C();
            if (remoteButtonStyleAttr.S() == null) {
                S = context.getResources().getDrawable(R.drawable.hiad_app_down_cancel_btn);
            } else {
                S = remoteButtonStyleAttr.S();
            }
            this.B = S;
        }
    }

    public e(Context context, AppDownloadButton appDownloadButton, RemoteButtonStyleAttr remoteButtonStyleAttr) {
        super(context, appDownloadButton);
        this.I = remoteButtonStyleAttr;
    }

    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    public void Code() {
        AppDownloadButton appDownloadButton;
        s bVar;
        if (gb.u.s(this.Code)) {
            appDownloadButton = this.V;
            bVar = new a(this.Code, this.I);
        } else {
            appDownloadButton = this.V;
            bVar = new b(this.Code, this.I);
        }
        appDownloadButton.setAppDownloadButtonStyle(bVar);
    }

    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    public void V(Context context) {
        this.V.setMinWidth(this.I.h());
        this.V.setPaddingRelative(this.I.l(), this.I.n(), this.I.m(), this.I.o());
        this.V.setMaxWidth(this.I.g());
        this.V.setFontFamily(this.I.k());
        this.V.setTextSize(this.I.j());
        this.V.setVisibility(0);
    }

    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    public void Code(String str) {
        this.V.setMinWidth(this.I.h());
        this.V.setPaddingRelative(this.I.l(), this.I.n(), this.I.m(), this.I.o());
        this.V.setMaxWidth(this.I.g());
        this.V.setResetWidth(this.I.f());
        this.V.setFixedWidth(this.I.e());
        this.V.setFontFamily(this.I.k());
        this.V.setTextSize(this.I.j());
        this.V.setTextColor(this.I.V());
        this.V.setBackground(this.I.Code());
        if (TextUtils.isEmpty(str)) {
            this.V.setText(this.Code.getString(R.string.hiad_detail));
        } else {
            this.V.setText(str);
        }
    }
}
