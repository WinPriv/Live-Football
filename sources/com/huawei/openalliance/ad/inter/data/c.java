package com.huawei.openalliance.ad.inter.data;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jf;
import com.huawei.hms.ads.reward.RewardVerifyConfig;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.constant.w;
import gb.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class c implements d {
    private static final String I = "BaseAd";
    private String B;
    private String C;
    protected AdContentData Code;
    private boolean D = false;
    private List<AdSource> F;
    private AppInfo S;
    protected String V;
    private String Z;

    public c(AdContentData adContentData) {
        this.Z = UUID.randomUUID().toString();
        this.Code = adContentData;
        if (adContentData != null) {
            if (TextUtils.isEmpty(adContentData.Y())) {
                this.Code.P(this.Z);
            } else {
                this.Z = this.Code.Y();
            }
        }
    }

    public static List<h> Code(List<ImageInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator<ImageInfo> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new h(it.next()));
            }
        }
        return arrayList;
    }

    private void V(Context context) {
        String str;
        if (cl.Code(context).V()) {
            str = "china rom should not call gotoWhyThisAdPage method";
        } else {
            if (context != null) {
                String i10 = i();
                if (TextUtils.isEmpty(i10)) {
                    i10 = h();
                }
                r0.l(context, i10);
                return;
            }
            str = "context is null not call gotoWhyThisAdPage method";
        }
        ex.I(I, str);
    }

    public String A() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.a1();
        }
        return null;
    }

    public String D() {
        MetaData h_;
        if (this.B == null && (h_ = h_()) != null) {
            this.B = gb.p.j(h_.q());
        }
        return this.B;
    }

    public String G() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.A0();
        }
        return null;
    }

    public String H() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.B0();
        }
        return null;
    }

    public void I(String str) {
        if (str != null) {
            this.Code.N0(str);
        }
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public RewardVerifyConfig J() {
        RewardVerifyConfig.Builder builder = new RewardVerifyConfig.Builder();
        builder.setData(G());
        builder.setUserId(H());
        return builder.build();
    }

    public List<AdSource> K() {
        MetaData h_;
        if (this.F == null && (h_ = h_()) != null) {
            this.F = h_.W();
        }
        return this.F;
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public String L() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.L();
        }
        return null;
    }

    public String M() {
        AdSource a10 = AdSource.a(K());
        if (a10 != null) {
            return gb.p.j(a10.k());
        }
        return null;
    }

    public String N() {
        AdSource a10 = AdSource.a(K());
        if (a10 != null) {
            return a10.p();
        }
        return null;
    }

    public String O() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.U0();
        }
        return null;
    }

    public String P() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.g0();
        }
        return null;
    }

    public String Q() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.h0();
        }
        return null;
    }

    public int R() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.j0();
        }
        return 0;
    }

    public boolean T() {
        MetaData h_ = h_();
        if (h_ != null) {
            return h_.X();
        }
        return false;
    }

    public boolean U() {
        return this.D;
    }

    public void Z(boolean z10) {
        this.D = z10;
    }

    public String a() {
        MetaData h_ = h_();
        if (h_ != null) {
            return h_.H();
        }
        return "2";
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public int b() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.O0();
        }
        return 0;
    }

    public CtrlExt b_() {
        AdContentData adContentData = this.Code;
        if (adContentData == null) {
            return null;
        }
        return adContentData.W();
    }

    public String c() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.a();
        }
        return "";
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public String d() {
        MetaData h_;
        if (this.C == null && (h_ = h_()) != null) {
            this.C = gb.p.j(h_.D());
        }
        return this.C;
    }

    public long e() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.J0();
        }
        return 0L;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        String L = L();
        if (!(obj instanceof c) || L == null) {
            return false;
        }
        return TextUtils.equals(L, ((c) obj).L());
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public long f() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.H0();
        }
        return 0L;
    }

    public boolean g() {
        if (f() < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public String h() {
        String str;
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            str = adContentData.k0();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return w.al;
        }
        return str;
    }

    public MetaData h_() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.K();
        }
        return null;
    }

    public int hashCode() {
        int i10;
        String L = L();
        if (L != null) {
            i10 = L.hashCode();
        } else {
            i10 = -1;
        }
        return i10 & super.hashCode();
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public String i() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.l0();
        }
        return "";
    }

    public String i_() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.E();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public String j() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.m0();
        }
        return "";
    }

    public int j_() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.M0();
        }
        return 0;
    }

    public String k() {
        MetaData h_ = h_();
        if (h_ != null) {
            return h_.C();
        }
        return "";
    }

    public DelayInfo k_() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.u0();
        }
        return null;
    }

    public boolean l_() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            adContentData.getClass();
            return true;
        }
        return false;
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public AdContentData m() {
        return this.Code;
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public String n() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.D();
        }
        return null;
    }

    public String p() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.u();
        }
        return null;
    }

    public long q() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.c0();
        }
        return 0L;
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public long s() {
        MetaData h_ = h_();
        if (h_ != null) {
            return h_.v();
        }
        return 500L;
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public int t() {
        MetaData h_ = h_();
        if (h_ != null) {
            return h_.r();
        }
        return 50;
    }

    public String u() {
        MetaData h_ = h_();
        if (h_ != null) {
            return h_.a();
        }
        return "";
    }

    public String v() {
        return this.Z;
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public AppInfo w() {
        MetaData h_;
        ApkInfo F;
        if (this.S == null && (h_ = h_()) != null && (F = h_.F()) != null) {
            AppInfo appInfo = new AppInfo(F);
            appInfo.Code(k());
            appInfo.V(v());
            appInfo.s(h_.u());
            this.S = appInfo;
        }
        return this.S;
    }

    public List<Integer> x() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.T0();
        }
        return null;
    }

    public boolean y() {
        boolean Z = jf.Z(A());
        if (!Z) {
            ex.V(I, "native ad is not in whiteList, api call event report is not allowed.");
        }
        return Z;
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public int z() {
        return jf.a(A());
    }

    public void Code(long j10) {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            adContentData.b0(j10);
        }
    }

    public void I(boolean z10) {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            adContentData.X(z10);
        }
    }

    public void V(String str) {
        if (str != null) {
            this.Code.X0(str);
        }
    }

    public void Code(Context context) {
        V(context);
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public void Code(RewardVerifyConfig rewardVerifyConfig) {
        if (this.Code == null || rewardVerifyConfig == null) {
            return;
        }
        Code(rewardVerifyConfig.getData());
        V(rewardVerifyConfig.getUserId());
    }

    public void Code(String str) {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            adContentData.V0(str);
        }
    }
}
