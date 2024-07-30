package com.huawei.openalliance.ad.ppskit.db.bean;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.utils.n2;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ka.n7;
import ma.e;

@DataKeep
/* loaded from: classes2.dex */
public class AdSampleRecord extends SampleRecord {

    @e
    private MetaData metaData;

    @DataKeep
    /* loaded from: classes2.dex */
    public static class MetaData {
        private String appPkgName;
        private String clickSuccessDestination;
        private String clientAdRequestId;
        private List<String> closeReason;
        private String contentId;
        private String countryCode;
        private String description;
        private String encryptL;
        private String encryptP;
        private String impSource;
        private String isHarmony;
        private Integer limitAdTracking;
        private Integer maxShowRatio;
        private Integer nonPersonalizedAd;
        private Integer orientation;
        private Integer parentCtrlUser;
        private String promotedAppPkg;
        private Integer screenX;
        private Integer screenY;
        private String showId;
        private Long showTimeDuration;
        private String title;
        private Long videoDuration;
        private Integer videoPlayEndProgress;
        private Long videoPlayEndTime;
        private Integer videoPlayStartProgress;
        private Long videoPlayStartTime;
        private int adType = -1;
        private int creativeType = 2;
        private int deviceType = 4;

        public final void A(String str) {
            this.showId = str;
        }

        public final void B(String str) {
            this.impSource = str;
        }

        public final void C(String str) {
            this.encryptP = str;
        }

        public final void D(String str) {
            this.promotedAppPkg = str;
        }

        public final void a(int i10) {
            this.adType = i10;
        }

        public final void b(Integer num) {
            this.screenX = num;
        }

        public final void c(Long l10) {
            this.videoDuration = l10;
        }

        public final void d(String str) {
            this.clientAdRequestId = str;
        }

        public final void e(ArrayList arrayList) {
            this.closeReason = arrayList;
        }

        public final void f(int i10) {
            this.creativeType = i10;
        }

        public final void g(Integer num) {
            this.screenY = num;
        }

        public final void h(Long l10) {
            this.videoPlayStartTime = l10;
        }

        public final void i(String str) {
            this.contentId = str;
        }

        public final void j(int i10) {
            this.deviceType = i10;
        }

        public final void k(Integer num) {
            this.orientation = num;
        }

        public final void l(Long l10) {
            this.videoPlayEndTime = l10;
        }

        public final void m(String str) {
            this.appPkgName = str;
        }

        public final void n(Integer num) {
            this.videoPlayStartProgress = num;
        }

        public final void o(Long l10) {
            this.showTimeDuration = l10;
        }

        public final void p(String str) {
            this.title = str;
        }

        public final void q(Integer num) {
            this.videoPlayEndProgress = num;
        }

        public final void r(String str) {
            this.description = str;
        }

        public final void s(Integer num) {
            this.parentCtrlUser = num;
        }

        public final void t(String str) {
            this.clickSuccessDestination = str;
        }

        public final void u(Integer num) {
            this.limitAdTracking = num;
        }

        public final void v(String str) {
            this.encryptL = str;
        }

        public final void w(Integer num) {
            this.nonPersonalizedAd = num;
        }

        public final void x(String str) {
            this.isHarmony = str;
        }

        public final void y(Integer num) {
            this.maxShowRatio = num;
        }

        public final void z(String str) {
            this.countryCode = str;
        }
    }

    public final MetaData F() {
        String E;
        MetaData metaData = this.metaData;
        if (metaData != null) {
            return metaData;
        }
        if (!TextUtils.isEmpty(E())) {
            if (C()) {
                String E2 = E();
                HashMap hashMap = n2.f22929a;
                if (!TextUtils.isEmpty("BFE_KS_ALIAS") && !TextUtils.isEmpty(E2)) {
                    try {
                        E = new String(n2.d(n.O(E2)), "UTF-8");
                    } catch (Throwable th) {
                        n7.j("GCMKS", "decrypt ex: %s", th.getClass().getSimpleName());
                    }
                } else {
                    n7.i("GCMKS", "alias or encrypt content is null");
                }
                E = "";
            } else {
                E = E();
            }
            this.metaData = (MetaData) y0.o(null, E, MetaData.class, new Class[0]);
        }
        MetaData metaData2 = this.metaData;
        if (metaData2 == null) {
            return new MetaData();
        }
        return metaData2;
    }

    public final void G(MetaData metaData) {
        this.metaData = metaData;
    }

    @Override // pa.a
    public final ContentValues l(Context context) {
        String q10;
        if (C()) {
            q10 = n2.a(y0.q(null, this.metaData));
        } else {
            q10 = y0.q(null, this.metaData);
        }
        B(q10);
        return super.l(context);
    }
}
