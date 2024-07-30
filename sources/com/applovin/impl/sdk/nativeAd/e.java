package com.applovin.impl.sdk.nativeAd;

import a3.k;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.anythink.expressad.exoplayer.k.o;
import com.anythink.expressad.foundation.g.a.f;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.huawei.openalliance.ad.constant.bd;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentTemplateRecord;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.e.a implements a.InterfaceC0220a, AppLovinAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f19053a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f19054b;

    /* renamed from: c, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f19055c;

    /* renamed from: d, reason: collision with root package name */
    private String f19056d;

    /* renamed from: e, reason: collision with root package name */
    private String f19057e;

    /* renamed from: i, reason: collision with root package name */
    private String f19058i;

    /* renamed from: j, reason: collision with root package name */
    private Double f19059j;

    /* renamed from: k, reason: collision with root package name */
    private String f19060k;

    /* renamed from: l, reason: collision with root package name */
    private Uri f19061l;

    /* renamed from: m, reason: collision with root package name */
    private Uri f19062m;

    /* renamed from: n, reason: collision with root package name */
    private com.applovin.impl.c.a f19063n;
    private Uri o;

    /* renamed from: p, reason: collision with root package name */
    private Uri f19064p;

    /* renamed from: q, reason: collision with root package name */
    private Uri f19065q;

    /* renamed from: r, reason: collision with root package name */
    private Uri f19066r;

    /* renamed from: s, reason: collision with root package name */
    private final List<String> f19067s;

    /* renamed from: t, reason: collision with root package name */
    private final List<String> f19068t;

    /* renamed from: u, reason: collision with root package name */
    private final List<l> f19069u;

    /* renamed from: v, reason: collision with root package name */
    private final List<l> f19070v;

    /* renamed from: w, reason: collision with root package name */
    private final List<l> f19071w;

    /* renamed from: x, reason: collision with root package name */
    private final List<l> f19072x;

    public e(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, p pVar) {
        super("TaskRenderNativeAd", pVar);
        this.f19056d = "";
        this.f19057e = "";
        this.f19058i = "";
        this.f19059j = null;
        this.f19060k = "";
        this.f19061l = null;
        this.f19062m = null;
        this.o = null;
        this.f19064p = null;
        this.f19065q = null;
        this.f19066r = null;
        this.f19067s = new ArrayList();
        this.f19068t = new ArrayList();
        this.f19069u = new ArrayList();
        this.f19070v = new ArrayList();
        this.f19071w = new ArrayList();
        this.f19072x = new ArrayList();
        this.f19053a = jSONObject;
        this.f19054b = jSONObject2;
        this.f19055c = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (y.a()) {
            this.f18839h.b(this.f18838g, "VAST ad rendered successfully");
        }
        this.f19063n = (com.applovin.impl.c.a) appLovinAd;
        a();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        if (y.a()) {
            this.f18839h.e(this.f18838g, "VAST ad failed to render");
        }
        a();
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v12, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v5, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r22 = 0;
        String string = JsonUtils.getString(this.f19053a, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.o = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f19053a, "privacy_url", null);
        if (URLUtil.isValidUrl(string2)) {
            this.f19064p = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f19053a, "ortb_response", (JSONObject) null);
        if (jSONObject != null && jSONObject.length() != 0) {
            String string3 = JsonUtils.getString(jSONObject, "version", null);
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
            if (y.a()) {
                k.t("Rendering native ad for oRTB version: ", string3, this.f18839h, this.f18838g);
            }
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, f.f9813a, jSONObject2);
            a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, ContentTemplateRecord.ASSETS, null);
            if (jSONArray != null && jSONArray.length() != 0) {
                String str = "";
                int i10 = 0;
                while (i10 < jSONArray.length()) {
                    JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) r22);
                    if (jSONObject4.has("title")) {
                        this.f19056d = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) r22), o.f9070c, r22);
                        if (y.a()) {
                            this.f18839h.b(this.f18838g, "Processed title: " + this.f19056d);
                        }
                    } else if (jSONObject4.has("link")) {
                        a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r22));
                    } else if (jSONObject4.has(bd.Code)) {
                        int i11 = JsonUtils.getInt(jSONObject4, "id", -1);
                        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, bd.Code, (JSONObject) r22);
                        int i12 = JsonUtils.getInt(jSONObject5, "type", -1);
                        String string4 = JsonUtils.getString(jSONObject5, "url", r22);
                        if (i12 != 1 && 3 != i11) {
                            if (i12 != 3 && 2 != i11) {
                                if (y.a()) {
                                    this.f18839h.d(this.f18838g, "Unrecognized image: " + jSONObject4);
                                }
                                int i13 = JsonUtils.getInt(jSONObject5, "w", -1);
                                int i14 = JsonUtils.getInt(jSONObject5, "h", -1);
                                if (i13 > 0 && i14 > 0) {
                                    if (i13 / i14 > 1.0d) {
                                        if (y.a()) {
                                            this.f18839h.b(this.f18838g, "Inferring main image from " + i13 + "x" + i14 + "...");
                                        }
                                        this.f19062m = Uri.parse(string4);
                                    } else {
                                        if (y.a()) {
                                            this.f18839h.b(this.f18838g, "Inferring icon image from " + i13 + "x" + i14 + "...");
                                        }
                                        this.f19061l = Uri.parse(string4);
                                    }
                                } else if (y.a()) {
                                    this.f18839h.d(this.f18838g, "Skipping...");
                                }
                            } else {
                                this.f19062m = Uri.parse(string4);
                                if (y.a()) {
                                    this.f18839h.b(this.f18838g, "Processed main image URL: " + this.f19062m);
                                }
                            }
                        } else {
                            this.f19061l = Uri.parse(string4);
                            if (y.a()) {
                                this.f18839h.b(this.f18838g, "Processed icon URL: " + this.f19061l);
                            }
                        }
                    } else if (jSONObject4.has("video")) {
                        str = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                        if (StringUtils.isValidString(str)) {
                            if (y.a()) {
                                this.f18839h.b(this.f18838g, "Processed VAST video");
                            }
                        } else if (y.a()) {
                            this.f18839h.d(this.f18838g, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                        }
                    } else if (jSONObject4.has("data")) {
                        int i15 = JsonUtils.getInt(jSONObject4, "id", -1);
                        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                        int i16 = JsonUtils.getInt(jSONObject6, "type", -1);
                        String string5 = JsonUtils.getString(jSONObject6, "value", null);
                        if (i16 != 1 && i15 != 8) {
                            if (i16 != 2 && i15 != 4) {
                                if (i16 != 12 && i15 != 5) {
                                    if (i16 != 3 && i15 != 6) {
                                        if (y.a()) {
                                            this.f18839h.d(this.f18838g, "Skipping unsupported data: " + jSONObject4);
                                        }
                                    } else {
                                        double tryParseDouble = Utils.tryParseDouble(string5, -1.0d);
                                        if (tryParseDouble == -1.0d) {
                                            if (y.a()) {
                                                k.t("Received invalid star rating: ", string5, this.f18839h, this.f18838g);
                                            }
                                        } else {
                                            this.f19059j = Double.valueOf(tryParseDouble);
                                            if (y.a()) {
                                                this.f18839h.b(this.f18838g, "Processed star rating: " + this.f19059j);
                                            }
                                        }
                                    }
                                } else {
                                    this.f19060k = string5;
                                    if (y.a()) {
                                        this.f18839h.b(this.f18838g, "Processed cta: " + this.f19060k);
                                    }
                                }
                            } else {
                                this.f19058i = string5;
                                if (y.a()) {
                                    this.f18839h.b(this.f18838g, "Processed body: " + this.f19058i);
                                }
                            }
                        } else {
                            this.f19057e = string5;
                            if (y.a()) {
                                this.f18839h.b(this.f18838g, "Processed advertiser: " + this.f19057e);
                            }
                        }
                    } else if (y.a()) {
                        this.f18839h.e(this.f18838g, "Unsupported asset object: " + jSONObject4);
                    }
                    i10++;
                    r22 = 0;
                }
                String string6 = JsonUtils.getString(jSONObject3, "jstracker", null);
                if (StringUtils.isValidString(string6)) {
                    this.f19068t.add(string6);
                    if (y.a()) {
                        k.t("Processed jstracker: ", string6, this.f18839h, this.f18838g);
                    }
                }
                Object obj = null;
                JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
                if (jSONArray2 != null) {
                    int i17 = 0;
                    while (i17 < jSONArray2.length()) {
                        Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i17, obj);
                        if (objectAtIndex instanceof String) {
                            String str2 = (String) objectAtIndex;
                            if (!TextUtils.isEmpty(str2)) {
                                this.f19069u.add(new l.a(this.f).a(str2).d(false).c(false).a());
                                if (y.a()) {
                                    k.t("Processed imptracker URL: ", str2, this.f18839h, this.f18838g);
                                }
                            }
                        }
                        i17++;
                        obj = null;
                    }
                }
                ?? r23 = 0;
                JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
                if (jSONArray3 != null) {
                    int i18 = 0;
                    while (i18 < jSONArray3.length()) {
                        JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i18, (JSONObject) r23);
                        int i19 = JsonUtils.getInt(jSONObject7, "event", -1);
                        int i20 = JsonUtils.getInt(jSONObject7, "method", -1);
                        String string7 = JsonUtils.getString(jSONObject7, "url", r23);
                        if (!TextUtils.isEmpty(string7)) {
                            if (i20 != 1 && i20 != 2) {
                                if (y.a()) {
                                    this.f18839h.e(this.f18838g, "Unsupported method for event tracker: " + jSONObject7);
                                }
                            } else if (i20 == 2 && string7.startsWith("<script")) {
                                this.f19068t.add(string7);
                            } else {
                                boolean z10 = false;
                                l.a c10 = new l.a(this.f).a(string7).d(false).c(false);
                                if (i20 == 2) {
                                    z10 = true;
                                }
                                l a10 = c10.g(z10).a();
                                if (i19 == 1) {
                                    this.f19069u.add(a10);
                                    if (y.a()) {
                                        k.t("Processed impression URL: ", string7, this.f18839h, this.f18838g);
                                    }
                                } else if (i19 == 2) {
                                    this.f19070v.add(a10);
                                    if (y.a()) {
                                        k.t("Processed viewable MRC50 URL: ", string7, this.f18839h, this.f18838g);
                                    }
                                } else {
                                    if (i19 == 3) {
                                        this.f19071w.add(a10);
                                        if (y.a()) {
                                            k.t("Processed viewable MRC100 URL: ", string7, this.f18839h, this.f18838g);
                                        }
                                    } else if (i19 == 4) {
                                        this.f19072x.add(a10);
                                        if (y.a()) {
                                            k.t("Processed viewable video 50 URL: ", string7, this.f18839h, this.f18838g);
                                        }
                                    } else if (i19 == 555) {
                                        if (y.a()) {
                                            k.t("Ignoring processing of OMID URL: ", string7, this.f18839h, this.f18838g);
                                        }
                                    } else if (y.a()) {
                                        this.f18839h.e(this.f18838g, "Unsupported event tracker: " + jSONObject7);
                                    }
                                    i18++;
                                    r23 = 0;
                                }
                            }
                        }
                        i18++;
                        r23 = 0;
                    }
                }
                if (StringUtils.isValidString(str)) {
                    if (y.a()) {
                        this.f18839h.b(this.f18838g, "Processing VAST video...");
                    }
                    this.f.M().a((com.applovin.impl.sdk.e.a) r.a(str, JsonUtils.shallowCopy(this.f19053a), JsonUtils.shallowCopy(this.f19054b), com.applovin.impl.sdk.ad.b.UNKNOWN, this, this.f));
                    return;
                }
                a();
                return;
            }
            if (y.a()) {
                this.f18839h.e(this.f18838g, "Unable to retrieve assets - failing ad load: " + this.f19053a);
            }
            a("Unable to retrieve assets");
            return;
        }
        if (y.a()) {
            this.f18839h.e(this.f18838g, "No oRtb response provided: " + this.f19053a);
        }
        a("No oRtb response provided");
    }

    private void b(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.e.1
            @Override // java.lang.Runnable
            public void run() {
                y unused = ((com.applovin.impl.sdk.e.a) e.this).f18839h;
                if (y.a()) {
                    ((com.applovin.impl.sdk.e.a) e.this).f18839h.b(((com.applovin.impl.sdk.e.a) e.this).f18838g, "Preparing native ad view components...");
                }
                try {
                    appLovinNativeAdImpl.setUpNativeAdViewComponents();
                    y unused2 = ((com.applovin.impl.sdk.e.a) e.this).f18839h;
                    if (y.a()) {
                        ((com.applovin.impl.sdk.e.a) e.this).f18839h.b(((com.applovin.impl.sdk.e.a) e.this).f18838g, "Successfully prepared native ad view components");
                    }
                    appLovinNativeAdImpl.getAdEventTracker().c();
                    e.this.f19055c.onNativeAdLoaded(appLovinNativeAdImpl);
                } catch (Throwable th) {
                    y unused3 = ((com.applovin.impl.sdk.e.a) e.this).f18839h;
                    if (y.a()) {
                        ((com.applovin.impl.sdk.e.a) e.this).f18839h.b(((com.applovin.impl.sdk.e.a) e.this).f18838g, "Failed to prepare native ad view components", th);
                    }
                    e.this.a(th.getMessage());
                }
            }
        });
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f19065q = Uri.parse(string);
            if (y.a()) {
                this.f18839h.b(this.f18838g, "Processed click destination URL: " + this.f19065q);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f19066r = Uri.parse(string2);
            if (y.a()) {
                this.f18839h.b(this.f18838g, "Processed click destination backup URL: " + this.f19066r);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            try {
                this.f19067s.addAll(JsonUtils.toList(jSONArray));
                if (y.a()) {
                    this.f18839h.b(this.f18838g, "Processed click tracking URLs: " + this.f19067s);
                }
            } catch (Throwable th) {
                if (y.a()) {
                    this.f18839h.b(this.f18838g, "Failed to render click tracking URLs", th);
                }
            }
        }
    }

    private void a() {
        AppLovinNativeAdImpl build = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f19053a), JsonUtils.shallowCopy(this.f19054b), this.f).setTitle(this.f19056d).setAdvertiser(this.f19057e).setBody(this.f19058i).setCallToAction(this.f19060k).setStarRating(this.f19059j).setIconUri(this.f19061l).setMainImageUri(this.f19062m).setPrivacyIconUri(this.o).setVastAd(this.f19063n).setPrivacyDestinationUri(this.f19064p).setClickDestinationUri(this.f19065q).setClickDestinationBackupUri(this.f19066r).setClickTrackingUrls(this.f19067s).setJsTrackers(this.f19068t).setImpressionRequests(this.f19069u).setViewableMRC50Requests(this.f19070v).setViewableMRC100Requests(this.f19071w).setViewableVideo50Requests(this.f19072x).build();
        build.getAdEventTracker().b();
        if (y.a()) {
            this.f18839h.b(this.f18838g, "Starting cache task for type: " + build.getType() + "...");
        }
        this.f.M().a(new a(build, this.f, this), o.a.MAIN);
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0220a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (y.a()) {
            this.f18839h.b(this.f18838g, "Successfully cached and loaded ad");
        }
        b(appLovinNativeAdImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.f19055c.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }
}
