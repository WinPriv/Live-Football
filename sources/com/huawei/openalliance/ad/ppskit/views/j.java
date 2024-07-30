package com.huawei.openalliance.ad.ppskit.views;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.huawei.openalliance.ad.ppskit.activity.PPSArActivity;
import ka.n7;

/* loaded from: classes2.dex */
public final class j implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPSArView f23451a;

    public j(PPSArView pPSArView) {
        this.f23451a = pPSArView;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
        va.f fVar;
        RadioButton radioButton;
        RadioButton radioButton2;
        va.f fVar2;
        va.f fVar3;
        boolean z10;
        String str;
        va.f fVar4;
        va.f fVar5;
        va.f fVar6;
        RadioButton radioButton3;
        RadioButton radioButton4;
        PPSArView pPSArView = this.f23451a;
        fVar = pPSArView.E;
        boolean z11 = true;
        if (fVar == null) {
            radioButton3 = pPSArView.y;
            radioButton3.setChecked(true);
            radioButton4 = pPSArView.f23161z;
            radioButton4.setChecked(false);
            return;
        }
        radioButton = pPSArView.y;
        if (i10 != radioButton.getId()) {
            radioButton2 = pPSArView.f23161z;
            if (i10 == radioButton2.getId()) {
                n7.e("PPSArView", "AR selected");
                StringBuilder sb2 = new StringBuilder("mArViewLitener:");
                fVar2 = pPSArView.E;
                sb2.append(fVar2.hashCode());
                n7.e("PPSArView", sb2.toString());
                fVar3 = pPSArView.E;
                ((PPSArActivity) fVar3).m("2");
                if (pPSArView.A != null) {
                    z10 = pPSArView.G;
                    if (!z10) {
                        pPSArView.A.setArMode(true);
                        pPSArView.G = true;
                        if (!pPSArView.M.isEmpty()) {
                            str = "model ar";
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                n7.g("PPSArView", "wrong button clicked");
                return;
            }
        } else {
            n7.e("PPSArView", "3D selected");
            StringBuilder sb3 = new StringBuilder("mArViewLitener:");
            fVar4 = pPSArView.E;
            if (fVar4 != null) {
                z11 = false;
            }
            sb3.append(z11);
            n7.e("PPSArView", sb3.toString());
            StringBuilder sb4 = new StringBuilder("mArViewLitener:");
            fVar5 = pPSArView.E;
            sb4.append(fVar5.hashCode());
            n7.e("PPSArView", sb4.toString());
            fVar6 = pPSArView.E;
            ((PPSArActivity) fVar6).m("1");
            if (pPSArView.A != null) {
                pPSArView.A.setArMode(false);
                pPSArView.G = false;
                if (!pPSArView.M.isEmpty()) {
                    str = "model 3d";
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        n7.e("PPSArView", str);
        pPSArView.b();
    }
}
