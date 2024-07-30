package com.huawei.openalliance.ad.inter.data;

import com.huawei.hms.ads.AdvertiserInfo;
import com.huawei.openalliance.ad.beans.metadata.MediaFile;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.constant.be;
import java.util.List;

/* loaded from: classes2.dex */
public final class k extends c implements f, Comparable {

    /* renamed from: s, reason: collision with root package name */
    public boolean f22279s;

    /* renamed from: t, reason: collision with root package name */
    public l f22280t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f22281u;

    public k(AdContentData adContentData) {
        super(adContentData);
        this.f22279s = false;
        this.f22281u = false;
    }

    public final boolean E() {
        l lVar = this.f22280t;
        if (lVar != null && (be.V.equals(lVar.f22282s) || be.B.equals(this.f22280t.f22282s) || be.I.equals(this.f22280t.f22282s) || be.Z.equals(this.f22280t.f22282s))) {
            return true;
        }
        return false;
    }

    @Override // com.huawei.openalliance.ad.inter.data.f
    public final l S() {
        MetaData h_;
        MediaFile K;
        if (this.f22280t == null && (h_ = h_()) != null && (K = h_.K()) != null) {
            this.f22280t = new l(K, h_.U());
        }
        return this.f22280t;
    }

    public final boolean V() {
        l lVar = this.f22280t;
        if (lVar != null && "video/mp4".equals(lVar.f22282s)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i10;
        if (!(obj instanceof k)) {
            return -1;
        }
        AdContentData adContentData = ((k) obj).Code;
        int i11 = 0;
        if (adContentData != null) {
            i10 = adContentData.C();
        } else {
            i10 = 0;
        }
        AdContentData adContentData2 = this.Code;
        if (adContentData2 != null) {
            i11 = adContentData2.C();
        }
        if (i10 > i11) {
            return -1;
        }
        return 1;
    }

    public final List<AdvertiserInfo> l() {
        if (this.Code != null && r()) {
            return this.Code.i0();
        }
        return null;
    }

    public final boolean r() {
        if (this.Code != null) {
            return !androidx.transition.n.h(r0.i0());
        }
        return false;
    }
}
