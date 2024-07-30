package com.huawei.hms.ads.jsb.inner.data;

import androidx.transition.n;
import com.huawei.hms.ads.AdvertiserInfo;
import com.huawei.hms.ads.jf;
import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.RewardItem;
import gb.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@DataKeep
/* loaded from: classes2.dex */
public class H5Ad {
    private String adChoiceUrl;
    private int adType;
    private List<AdvertiserInfo> advertiserInfos;
    private App app;
    private String bannerRefSetting;
    private String clickBtnTxt;
    private String contentId;
    private int creativeType;
    private CtrlExt ctrlExt;
    private String desc;
    private String dspLogo;
    private String dspName;
    private long endTime;
    private Map<String, String> ext;
    private ImageInfo icon;
    private List<ImageInfo> imgList;
    private int interactionType;
    private boolean isGaussianBlur;
    private boolean isSilentReserve;
    private List<String> keywords;
    private String label;
    private String logo2Text;
    private MediaFile mediaFile;
    private int minEffectiveShowRatio;
    private long minEffectiveShowTime;
    private String requestId;
    private RewardItem rewardItem;
    private int sequence;
    private boolean showAppElement;
    private String showId;
    private String slotId;
    private String source;
    private long startShowtime;
    private String taskId;
    private String title;
    private String uniqueId;
    private Video video;

    public H5Ad() {
    }

    public H5Ad(AdContentData adContentData) {
        if (adContentData == null) {
            return;
        }
        this.isSilentReserve = jf.b(adContentData.a1());
        this.requestId = adContentData.E();
        this.uniqueId = adContentData.Y();
        this.showId = adContentData.u();
        this.slotId = adContentData.D();
        this.contentId = adContentData.L();
        this.taskId = adContentData.a();
        this.adType = adContentData.a0();
        this.creativeType = adContentData.O0();
        this.interactionType = adContentData.M0();
        this.endTime = adContentData.H0();
        this.sequence = adContentData.C();
        this.adChoiceUrl = adContentData.l0();
        this.ctrlExt = adContentData.W();
        if (!n.h(adContentData.R0())) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = adContentData.R0().iterator();
            while (it.hasNext()) {
                arrayList.add(p.i(it.next()));
            }
            this.keywords = arrayList;
        }
        this.isGaussianBlur = adContentData.s0() == 1;
        this.bannerRefSetting = adContentData.v0();
        this.logo2Text = adContentData.U0();
        MetaData K = adContentData.K();
        if (K != null) {
            this.minEffectiveShowRatio = K.r();
            this.minEffectiveShowTime = K.v();
            this.desc = K.k();
            List<com.huawei.openalliance.ad.beans.metadata.ImageInfo> p10 = K.p();
            if (p10 != null && !p10.isEmpty()) {
                this.icon = new ImageInfo(p10.get(0));
            }
            this.imgList = V(K.E());
            AdSource a10 = AdSource.a(K.W());
            if (a10 != null) {
                this.dspName = a10.k();
                this.dspLogo = a10.p();
            }
            this.source = K.D();
            this.clickBtnTxt = K.q();
            this.title = K.A();
            this.label = K.D();
            this.mediaFile = new MediaFile(K.K(), K.U());
            this.showAppElement = K.X();
        }
        if (adContentData.Y0() != null) {
            this.video = new Video(adContentData.Y0());
        }
        if (adContentData.H() > 0 && adContentData.M() != null) {
            this.rewardItem = new RewardItem(adContentData.M(), adContentData.H());
        }
        if (adContentData.c1() != null) {
            this.app = new App(adContentData.c1());
        }
        List<ImpEX> E0 = adContentData.E0();
        HashMap hashMap = new HashMap();
        if (!n.h(E0)) {
            for (ImpEX impEX : E0) {
                hashMap.put(impEX.k(), impEX.p());
            }
        }
        this.ext = hashMap;
        if (!n.h(adContentData.i0())) {
            this.advertiserInfos = adContentData.i0();
        }
    }

    public String B() {
        return this.slotId;
    }

    public String C() {
        return this.taskId;
    }

    public String Code() {
        return this.uniqueId;
    }

    public String D() {
        return this.desc;
    }

    public String F() {
        return this.title;
    }

    public String I() {
        return this.requestId;
    }

    public String L() {
        return this.source;
    }

    public int S() {
        return this.adType;
    }

    public String V() {
        return this.showId;
    }

    public String Z() {
        return this.contentId;
    }

    public ImageInfo a() {
        return this.icon;
    }

    public List<ImageInfo> b() {
        return this.imgList;
    }

    public Video c() {
        return this.video;
    }

    public App d() {
        return this.app;
    }

    public String e() {
        return this.clickBtnTxt;
    }

    public int f() {
        return this.creativeType;
    }

    public int g() {
        return this.interactionType;
    }

    public long h() {
        return this.endTime;
    }

    public long i() {
        return this.minEffectiveShowTime;
    }

    public int j() {
        return this.minEffectiveShowRatio;
    }

    public int k() {
        return this.sequence;
    }

    public String l() {
        return this.dspName;
    }

    public String m() {
        return this.dspLogo;
    }

    public String n() {
        return this.logo2Text;
    }

    public List<AdvertiserInfo> o() {
        return this.advertiserInfos;
    }

    public long p() {
        return this.startShowtime;
    }

    public boolean q() {
        return this.showAppElement;
    }

    private List<ImageInfo> V(List<com.huawei.openalliance.ad.beans.metadata.ImageInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator<com.huawei.openalliance.ad.beans.metadata.ImageInfo> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new ImageInfo(it.next()));
            }
        }
        return arrayList;
    }

    public void Code(long j10) {
        this.startShowtime = j10;
    }

    public void Code(List<AdvertiserInfo> list) {
        this.advertiserInfos = list;
    }
}
