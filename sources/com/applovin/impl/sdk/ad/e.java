package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.adview.i;
import com.applovin.impl.adview.t;
import com.applovin.impl.adview.x;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.af;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.huawei.hms.ads.jsb.constant.Constant;
import com.huawei.openalliance.ad.constant.bj;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e extends AppLovinAdImpl {

    /* renamed from: a, reason: collision with root package name */
    private final List<Uri> f18586a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f18587b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f18588c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<com.applovin.impl.sdk.b.c> f18589d;

    /* renamed from: e, reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f18590e;
    private List<com.applovin.impl.sdk.d.a> f;

    /* renamed from: g, reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f18591g;

    /* renamed from: h, reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f18592h;

    /* renamed from: i, reason: collision with root package name */
    private c f18593i;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* loaded from: classes.dex */
    public enum b {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f18602a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18603b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18604c;

        /* renamed from: d, reason: collision with root package name */
        public final int f18605d;

        /* renamed from: e, reason: collision with root package name */
        public final int f18606e;

        private c() {
            p unused = ((AppLovinAdBase) e.this).sdk;
            this.f18602a = AppLovinSdkUtils.dpToPx(p.y(), e.this.Y());
            p unused2 = ((AppLovinAdBase) e.this).sdk;
            this.f18603b = AppLovinSdkUtils.dpToPx(p.y(), e.this.Z());
            p unused3 = ((AppLovinAdBase) e.this).sdk;
            this.f18604c = AppLovinSdkUtils.dpToPx(p.y(), e.this.aa());
            p unused4 = ((AppLovinAdBase) e.this).sdk;
            this.f18605d = AppLovinSdkUtils.dpToPx(p.y(), ((Integer) ((AppLovinAdBase) e.this).sdk.a(com.applovin.impl.sdk.c.b.bU)).intValue());
            p unused5 = ((AppLovinAdBase) e.this).sdk;
            this.f18606e = AppLovinSdkUtils.dpToPx(p.y(), ((Integer) ((AppLovinAdBase) e.this).sdk.a(com.applovin.impl.sdk.c.b.bT)).intValue());
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public e(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, p pVar) {
        super(jSONObject, jSONObject2, bVar, pVar);
        this.f18586a = CollectionUtils.synchronizedList();
        this.f18587b = new AtomicBoolean();
        this.f18588c = new AtomicBoolean();
        this.f18589d = new AtomicReference<>();
    }

    public boolean A() {
        return getBooleanFromAdObject("html_resources_cached", Boolean.FALSE);
    }

    public List<Uri> B() {
        return this.f18586a;
    }

    public String C() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("video_button_properties", null);
        if (jsonObjectFromAdObject == null) {
            return "";
        }
        return JsonUtils.getString(jsonObjectFromAdObject, "video_button_html", "");
    }

    public t D() {
        return new t(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    public boolean E() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public boolean F() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public a G() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if (bj.b.C.equalsIgnoreCase(stringFromAdObject)) {
                return a.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return a.DO_NOT_DISMISS;
            }
        }
        return a.UNSPECIFIED;
    }

    public List<String> H() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        if (stringFromAdObject != null) {
            return CollectionUtils.explode(stringFromAdObject);
        }
        return Collections.emptyList();
    }

    public List<String> I() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        if (stringFromAdObject != null) {
            return CollectionUtils.explode(stringFromAdObject);
        }
        return this.sdk.b(com.applovin.impl.sdk.c.b.bC);
    }

    public boolean J() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public boolean K() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public String L() {
        return getStringFromAdObject("cache_prefix", null);
    }

    public boolean M() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public String N() {
        return getStringFromFullResponse("event_id", null);
    }

    public boolean O() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public int P() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public int Q() {
        int videoCompletionPercent;
        synchronized (this.adObjectLock) {
            videoCompletionPercent = Utils.getVideoCompletionPercent(this.adObject);
        }
        return videoCompletionPercent;
    }

    public int R() {
        synchronized (this.adObjectLock) {
            int i10 = JsonUtils.getInt(this.adObject, "graphic_completion_percent", -1);
            if (i10 >= 0 && i10 <= 100) {
                return i10;
            }
            return 90;
        }
    }

    public int S() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int T() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public boolean U() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public boolean V() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public boolean W() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public c X() {
        if (this.f18593i == null) {
            this.f18593i = new c();
        }
        return this.f18593i;
    }

    public int Y() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cx)).intValue());
    }

    public int Z() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cy)).intValue());
    }

    public abstract void a();

    public List<String> aA() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public List<String> aB() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public Uri aC() {
        String stringFromAdObject = getStringFromAdObject("play_image", null);
        if (!StringUtils.isValidString(stringFromAdObject)) {
            return null;
        }
        return Uri.parse(stringFromAdObject);
    }

    public Uri aD() {
        String stringFromAdObject = getStringFromAdObject("pause_image", null);
        if (!StringUtils.isValidString(stringFromAdObject)) {
            return null;
        }
        return Uri.parse(stringFromAdObject);
    }

    public Uri aE() {
        String stringFromAdObject = getStringFromAdObject("mute_image", null);
        if (!StringUtils.isValidString(stringFromAdObject)) {
            return null;
        }
        return Uri.parse(stringFromAdObject);
    }

    public Uri aF() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean aG() {
        return this.f18588c.get();
    }

    public void aH() {
        this.f18588c.set(true);
    }

    public com.applovin.impl.sdk.b.c aI() {
        return this.f18589d.getAndSet(null);
    }

    public boolean aJ() {
        String str = this.sdk.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.SHOULD_USE_EXOPLAYER);
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return getBooleanFromAdObject("suep", Boolean.FALSE);
    }

    public boolean aK() {
        return getBooleanFromAdObject("rwvbv", Boolean.FALSE);
    }

    public boolean aL() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public boolean aM() {
        return getBooleanFromAdObject("web_video", Boolean.FALSE);
    }

    public d aN() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        if (Constant.MAP_KEY_TOP.equals(stringFromAdObject)) {
            return d.TOP;
        }
        if ("bottom".equals(stringFromAdObject)) {
            return d.BOTTOM;
        }
        if ("left".equals(stringFromAdObject)) {
            return d.LEFT;
        }
        if ("right".equals(stringFromAdObject)) {
            return d.RIGHT;
        }
        return d.RESIZE_ASPECT;
    }

    public int aa() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cw)).intValue());
    }

    public boolean ab() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cv));
    }

    public boolean ac() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cC));
    }

    public long ad() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject < 0) {
            return -1L;
        }
        return TimeUnit.SECONDS.toMillis(longFromAdObject);
    }

    public int ae() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean af() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public AtomicBoolean ag() {
        return this.f18587b;
    }

    public boolean ah() {
        return getBooleanFromAdObject("show_nia", Boolean.FALSE);
    }

    public String ai() {
        return getStringFromAdObject("nia_title", "");
    }

    public String aj() {
        return getStringFromAdObject("nia_message", "");
    }

    public String ak() {
        return getStringFromAdObject("nia_button_title", "");
    }

    public boolean al() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public boolean am() {
        boolean z10;
        if (AppLovinAdType.AUTO_INCENTIVIZED == getType()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(z10));
    }

    public String an() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    public String ao() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    public String ap() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    public List<com.applovin.impl.sdk.d.a> aq() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.f18590e;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_end_urls", this.adObject, getClCode(), c(), this.sdk);
            this.f18590e = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> ar() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.f;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("ad_closed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> as() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.f18591g;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("app_killed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f18591g = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> at() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.f18592h;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("imp_urls", this.adObject, getClCode(), null, null, au(), z(), this.sdk);
            this.f18592h = postbacks;
        }
        return postbacks;
    }

    public Map<String, String> au() {
        Map<String, String> map = CollectionUtils.map();
        try {
            map.putAll(JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject())));
        } catch (JSONException e10) {
            this.sdk.L();
            if (y.a()) {
                this.sdk.L().b("DirectAd", "Failed to retrieve http headers forx postbacks", e10);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            map.put("User-Agent", af.a());
        }
        return map;
    }

    public boolean av() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public String aw() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public boolean ax() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.FALSE);
    }

    public x ay() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject == null) {
            return null;
        }
        return new x(jsonObjectFromAdObject);
    }

    public int az() {
        int i10;
        if (Utils.isBML(getSize())) {
            i10 = 1;
        } else if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.fx)).booleanValue()) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        return getIntFromAdObject("whalt", i10);
    }

    public abstract String d();

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("ah_parameters", null);
        if (jsonObjectFromAdObject == null) {
            return null;
        }
        return JsonUtils.toBundle(jsonObjectFromAdObject);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.a.a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return Collections.emptyList();
    }

    public Uri h() {
        this.sdk.L();
        if (y.a()) {
            this.sdk.L().e("DirectAd", "Attempting to invoke getVideoUri() from base ad class");
            return null;
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.a.a
    public abstract boolean isOpenMeasurementEnabled();

    public Uri j() {
        this.sdk.L();
        if (y.a()) {
            this.sdk.L().e("DirectAd", "Attempting to invoke getClickDestinationUri() from base ad class");
            return null;
        }
        return null;
    }

    public Uri k() {
        this.sdk.L();
        if (y.a()) {
            this.sdk.L().e("DirectAd", "Attempting to invoke getVideoClickDestinationUri() from base ad class");
            return null;
        }
        return null;
    }

    public abstract com.applovin.impl.sdk.a.b o();

    public b p() {
        b bVar = b.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", bVar.toString()).toUpperCase(Locale.ENGLISH);
        if ("ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase)) {
            return b.ACTIVITY_PORTRAIT;
        }
        if ("ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase)) {
            return b.ACTIVITY_LANDSCAPE;
        }
        return bVar;
    }

    public boolean q() {
        return getBooleanFromAdObject("iopmsdc", Boolean.FALSE);
    }

    public long r() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long s() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public long t() {
        long j10;
        List<Integer> u2 = u();
        if (u2 != null && u2.size() > 0) {
            j10 = u2.get(0).intValue();
        } else {
            j10 = 0;
        }
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", j10);
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public List<Integer> u() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public i.a v() {
        int i10;
        List<Integer> b10 = b();
        if (b10 != null && b10.size() > 0) {
            i10 = b10.get(0).intValue();
        } else {
            i10 = -1;
        }
        int intFromAdObject = getIntFromAdObject("close_style", i10);
        if (intFromAdObject == -1) {
            return b(hasVideoUrl());
        }
        return a(intFromAdObject);
    }

    public List<i.a> w() {
        List<Integer> b10 = b();
        if (b10 != null) {
            ArrayList arrayList = new ArrayList(b10.size());
            Iterator<Integer> it = b10.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next().intValue()));
            }
            return arrayList;
        }
        return null;
    }

    public i.a x() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        if (intFromAdObject == -1) {
            return v();
        }
        return a(intFromAdObject);
    }

    public boolean y() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public boolean z() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    private List<Integer> b() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    private String c() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    public void a(boolean z10) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("html_resources_cached", z10);
            }
        } catch (Throwable unused) {
        }
    }

    public void d(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "pause_image", uri.toString());
        }
    }

    public void e(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    public void f(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "unmute_image", uri);
        }
    }

    public void b(Uri uri) {
        this.f18586a.add(uri);
    }

    private String b(PointF pointF, boolean z10) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map<String, String> c10 = c(pointF, z10);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, c10);
        }
        return null;
    }

    private Map<String, String> c(PointF pointF, boolean z10) {
        Point a10 = com.applovin.impl.sdk.utils.h.a(p.y());
        Map<String, String> map = CollectionUtils.map(6);
        map.put(Utils.MACRO_CLCODE, getClCode());
        map.put(Utils.MACRO_CLICK_X, String.valueOf(pointF.x));
        map.put(Utils.MACRO_CLICK_Y, String.valueOf(pointF.y));
        map.put(Utils.MACRO_SCREEN_WIDTH, String.valueOf(a10.x));
        map.put(Utils.MACRO_SCREEN_HEIGHT, String.valueOf(a10.y));
        map.put(Utils.MACRO_IS_VIDEO_CLICK, String.valueOf(z10));
        return map;
    }

    public List<com.applovin.impl.sdk.d.a> a(PointF pointF, boolean z10) {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, c(pointF, z10), b(pointF, z10), au(), z(), this.sdk);
        }
        return postbacks;
    }

    public boolean f() {
        this.sdk.L();
        if (!y.a()) {
            return false;
        }
        this.sdk.L().e("DirectAd", "Attempting to invoke isVideoStream() from base ad class");
        return false;
    }

    private i.a b(boolean z10) {
        return z10 ? i.a.WHITE_ON_TRANSPARENT : i.a.WHITE_ON_BLACK;
    }

    public List<com.applovin.impl.sdk.d.a> a(PointF pointF) {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_click_tracking_urls", this.adObject, c(pointF, true), null, au(), z(), this.sdk);
        }
        return postbacks.isEmpty() ? a(pointF, true) : postbacks;
    }

    public void c(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "play_image", uri.toString());
        }
    }

    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.f18589d.set(cVar);
    }

    public i.a a(int i10) {
        if (i10 == 1) {
            return i.a.WHITE_ON_TRANSPARENT;
        }
        if (i10 == 2) {
            return i.a.INVISIBLE;
        }
        if (i10 == 3) {
            return i.a.TRANSPARENT_SKIP;
        }
        return i.a.WHITE_ON_BLACK;
    }
}
