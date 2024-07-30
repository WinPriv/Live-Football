package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdvertiserInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.TemplateV3;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ma.a;
import ma.d;
import ma.f;

@DataKeep
/* loaded from: classes2.dex */
public class Content extends RspBean implements Comparable {
    private String adChoiceIcon;
    private String adChoiceUrl;
    private Integer apiVer;
    private List<Asset> assets;
    private List<Integer> clickActionList;
    private String compliance;
    private List<ContentExt> contentExts;
    private String contentid;

    @d(a = "taskinfo")
    private String contenttaskinfo;
    private int creativetype;
    private String ctrlExt;

    @f
    private CtrlExt ctrlExtObj;
    private String ctrlSwitchs;
    private DefaultTemplate defaultTemplate;

    @a
    private DeviceAiParam deviceAiParam;
    private long dispTime;
    private String dspExt;
    private long endtime;
    private List<ImpEX> ext;
    private List<Integer> filterList;
    private String harmonyDetailInfo;
    private String harmonyHwChannelId;
    private InteractCfg interactCfg;
    private int interactiontype;
    private String jssdkAllowList;
    private List<String> keyWords;
    private List<String> keyWordsType;
    private String landPageWhiteList;
    private int landingTitle;
    private String landpgDlInteractionCfg;
    private String logo2Pos;
    private String logo2Text;

    @a
    private String metaData;

    @f
    private MetaData metaDataObj;

    @a
    private List<Monitor> monitor;
    private List<NegativeFb> negativeFbs;

    @f
    private List<String> noReportEventList;

    @a
    private List<Om> om;

    @a
    private ParamFromServer paramfromserver;

    @d(a = "prio")
    private Integer priority;
    private String proDesc;
    private int recallSource;
    RewardItem rewardItem;
    private int sequence;
    private int showAppLogoFlag;
    private String showid;
    private Skip skip;
    private String skipText;
    private String skipTextPos;
    private int spare;
    private Integer splashShowTime;
    private Integer splashSkipBtnDelayTime;
    private long starttime;
    private String taskid;
    private TemplateV3 template;
    private int useGaussianBlur;
    private String webConfig;
    private String whyThisAd;

    public Content() {
        this.showAppLogoFlag = 1;
        this.starttime = -1L;
        this.interactiontype = 0;
        this.creativetype = 1;
        this.showid = "";
        this.skipTextPos = "tr";
        this.logo2Text = "";
        this.recallSource = 0;
        this.logo2Pos = "ll";
    }

    public final int A() {
        return this.spare;
    }

    public final int A0() {
        return this.landingTitle;
    }

    public final String B0() {
        return this.skipTextPos;
    }

    public final Integer C() {
        return this.splashSkipBtnDelayTime;
    }

    public final String C0() {
        return this.logo2Pos;
    }

    public final String D() {
        return this.whyThisAd;
    }

    public final List<Integer> D0() {
        return this.clickActionList;
    }

    public final Integer E() {
        return this.splashShowTime;
    }

    public final String E0() {
        return this.webConfig;
    }

    public final long F() {
        return this.dispTime;
    }

    public final String F0() {
        return this.ctrlSwitchs;
    }

    public final int G() {
        return this.useGaussianBlur;
    }

    public final int G0() {
        return this.sequence;
    }

    public final String H() {
        return this.jssdkAllowList;
    }

    public final List<Integer> H0() {
        return this.filterList;
    }

    public final List<String> I0() {
        return this.noReportEventList;
    }

    public final List<ImpEX> K() {
        return this.ext;
    }

    public final String N() {
        return this.proDesc;
    }

    public final List<ContentExt> O() {
        return this.contentExts;
    }

    public final String U() {
        return this.landpgDlInteractionCfg;
    }

    public final String W() {
        return this.dspExt;
    }

    public final InteractCfg X() {
        return this.interactCfg;
    }

    public final List<NegativeFb> Y() {
        return this.negativeFbs;
    }

    public final Integer a0() {
        return this.apiVer;
    }

    public final List<Asset> b0() {
        return this.assets;
    }

    public final TemplateV3 c0() {
        return this.template;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i10;
        int i11;
        if (!(obj instanceof Content) || (i10 = ((Content) obj).sequence) <= 0 || i10 > (i11 = this.sequence)) {
            return -1;
        }
        if (i10 == i11) {
            return 0;
        }
        return 1;
    }

    public final String d() {
        return this.metaData;
    }

    public final String d0() {
        return this.harmonyDetailInfo;
    }

    public final String e0() {
        return this.harmonyHwChannelId;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Content)) {
            return false;
        }
        if (this != obj && this.sequence != ((Content) obj).sequence) {
            return false;
        }
        return true;
    }

    public final List<Om> f0() {
        return this.om;
    }

    public final void g0(List<AdTypeEvent> list, int i10) {
        List<String> b10;
        if (n.M(list)) {
            return;
        }
        for (AdTypeEvent adTypeEvent : list) {
            if (adTypeEvent != null && adTypeEvent.a() == i10 && (b10 = adTypeEvent.b()) != null && b10.size() > 0) {
                ArrayList arrayList = new ArrayList();
                this.noReportEventList = arrayList;
                arrayList.addAll(b10);
            }
        }
    }

    public final List<AdvertiserInfo> h0() {
        if (TextUtils.isEmpty(this.compliance)) {
            return null;
        }
        List<AdvertiserInfo> list = (List) y0.o(null, y1.p(this.compliance), List.class, AdvertiserInfo.class);
        if (!n.M(list)) {
            Collections.sort(list);
        }
        return list;
    }

    public final int hashCode() {
        int i10;
        String str = this.contentid;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = -1;
        }
        return i10 & super.hashCode();
    }

    public final DefaultTemplate i0() {
        return this.defaultTemplate;
    }

    public final int j0() {
        return this.recallSource;
    }

    public final String k() {
        return this.contenttaskinfo;
    }

    public final String k0() {
        return this.ctrlExt;
    }

    public final String l0() {
        return this.skipText;
    }

    public final void m0(String str) {
        this.metaData = str;
    }

    public final MetaData n0() {
        if (this.metaDataObj == null) {
            this.metaDataObj = (MetaData) y0.o(null, this.metaData, MetaData.class, new Class[0]);
        }
        return this.metaDataObj;
    }

    public final List<String> o() {
        return this.keyWordsType;
    }

    public final int o0() {
        return this.creativetype;
    }

    public final String p() {
        return this.landPageWhiteList;
    }

    public final String p0() {
        return this.contentid;
    }

    public final RewardItem q() {
        return this.rewardItem;
    }

    public final String q0() {
        return this.taskid;
    }

    public final String r() {
        return this.adChoiceUrl;
    }

    public final int r0() {
        return this.showAppLogoFlag;
    }

    public final void s0(ArrayList arrayList) {
        this.ext = arrayList;
    }

    public final long t0() {
        return this.endtime;
    }

    public final String u() {
        return this.adChoiceIcon;
    }

    public final long u0() {
        return this.starttime;
    }

    public final Skip v() {
        return this.skip;
    }

    public final int v0() {
        return this.interactiontype;
    }

    public final ParamFromServer w0() {
        return this.paramfromserver;
    }

    public final Integer x() {
        return this.priority;
    }

    public final List<String> x0() {
        return this.keyWords;
    }

    public final List<Monitor> y0() {
        return this.monitor;
    }

    public final String z0() {
        return this.logo2Text;
    }

    public Content(Precontent precontent) {
        this.showAppLogoFlag = 1;
        this.starttime = -1L;
        this.interactiontype = 0;
        this.creativetype = 1;
        this.showid = "";
        this.skipTextPos = "tr";
        this.logo2Text = "";
        this.recallSource = 0;
        this.logo2Pos = "ll";
        this.contentid = precontent.k();
        this.creativetype = precontent.p();
        this.ctrlSwitchs = precontent.u();
        this.noReportEventList = precontent.v();
        MetaData metaData = new MetaData();
        metaData.N(precontent.q());
        metaData.I(precontent.r());
        metaData.Q(precontent.x());
        metaData.X(precontent.C());
        this.metaData = y0.q(null, metaData);
        this.priority = precontent.A();
        this.apiVer = precontent.E();
        this.assets = precontent.l();
        this.template = precontent.F();
    }
}
