package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.network.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinNativeAdImpl extends AppLovinAdBase implements AppLovinNativeAd {
    private static final String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private static final String DEFAULT_APPLOVIN_PRIVACY_URL = "https://www.applovin.com/privacy/";
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private static final int VIEWABLE_MRC100_PERCENTAGE = 100;
    private static final int VIEWABLE_MRC50_PERCENTAGE = 50;
    private static final int VIEWABLE_MRC_REQUIRED_SECONDS = 1;
    private static final int VIEWABLE_VIDEO_MRC_REQUIRED_SECONDS = 2;
    private final com.applovin.impl.sdk.a.e adEventTracker;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final Uri clickDestinationBackupUri;
    private final Uri clickDestinationUri;
    private final a clickHandler;
    private final List<String> clickTrackingUrls;
    private AppLovinNativeAdEventListener eventListener;
    private Uri iconUri;
    private final List<l> impressionRequests;
    private final AtomicBoolean impressionTracked;
    private final List<String> jsTrackers;
    private Uri mainImageUri;
    private AppLovinMediaView mediaView;
    private ViewGroup nativeAdView;
    private final b onAttachStateChangeHandler;
    private AppLovinOptionsView optionsView;
    private Uri privacyDestinationUri;
    private Uri privacyIconUri;
    private final List<View> registeredViews;
    private final Double starRating;
    private final String tag;
    private final String title;
    private final com.applovin.impl.c.a vastAd;
    private View videoView;
    private final c viewableMRC100Callback;
    private ad viewableMRC100Tracker;
    private final c viewableMRC50Callback;
    private ad viewableMRC50Tracker;
    private c viewableVideoMRC50Callback;
    private ad viewableVideoMRC50Tracker;

    /* loaded from: classes.dex */
    public static class Builder {
        private final JSONObject adObject;
        private String advertiser;
        private String body;
        private String callToAction;
        private Uri clickDestinationBackupUri;
        private Uri clickDestinationUri;
        private List<String> clickTrackingUrls;
        private final JSONObject fullResponse;
        private Uri iconUri;
        private List<l> impressionRequests;
        private List<String> jsTrackers;
        private Uri mainImageUri;
        private Uri privacyDestinationUri;
        private Uri privacyIconUri;
        private final p sdk;
        private Double starRating;
        private String title;
        private com.applovin.impl.c.a vastAd;
        private List<l> viewableMRC100Requests;
        private List<l> viewableMRC50Requests;
        private List<l> viewableVideo50Requests;

        public Builder(JSONObject jSONObject, JSONObject jSONObject2, p pVar) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = pVar;
        }

        public AppLovinNativeAdImpl build() {
            return new AppLovinNativeAdImpl(this);
        }

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.callToAction = str;
            return this;
        }

        public Builder setClickDestinationBackupUri(Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public Builder setClickDestinationUri(Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setImpressionRequests(List<l> list) {
            this.impressionRequests = list;
            return this;
        }

        public Builder setJsTrackers(List<String> list) {
            this.jsTrackers = list;
            return this;
        }

        public Builder setMainImageUri(Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public Builder setPrivacyDestinationUri(Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public Builder setPrivacyIconUri(Uri uri) {
            this.privacyIconUri = uri;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.starRating = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVastAd(com.applovin.impl.c.a aVar) {
            this.vastAd = aVar;
            return this;
        }

        public Builder setViewableMRC100Requests(List<l> list) {
            this.viewableMRC100Requests = list;
            return this;
        }

        public Builder setViewableMRC50Requests(List<l> list) {
            this.viewableMRC50Requests = list;
            return this;
        }

        public Builder setViewableVideo50Requests(List<l> list) {
            this.viewableVideo50Requests = list;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final AppLovinNativeAdImpl f19031a;

        public a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f19031a = appLovinNativeAdImpl;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a((Object) this)) {
                return false;
            }
            AppLovinNativeAdImpl a10 = a();
            AppLovinNativeAdImpl a11 = aVar.a();
            if (a10 != null ? a10.equals(a11) : a11 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            AppLovinNativeAdImpl a10 = a();
            if (a10 == null) {
                hashCode = 43;
            } else {
                hashCode = a10.hashCode();
            }
            return 59 + hashCode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(final View view) {
            ((AppLovinAdBase) this.f19031a).sdk.L();
            if (y.a()) {
                ((AppLovinAdBase) this.f19031a).sdk.L().b(this.f19031a.tag, "Handle view clicked");
            }
            ((AppLovinAdBase) this.f19031a).sdk.E().maybeSubmitPersistentPostbacks(this.f19031a.getDirectClickTrackingPostbacks());
            Iterator it = this.f19031a.clickTrackingUrls.iterator();
            while (it.hasNext()) {
                ((AppLovinAdBase) this.f19031a).sdk.ak().dispatchPostbackAsync((String) it.next(), null);
            }
            k.a(this.f19031a.eventListener, this.f19031a);
            if (this.f19031a.isDirectDownloadEnabled()) {
                ((AppLovinAdBase) this.f19031a).sdk.ai().startDirectInstallOrDownloadProcess(this.f19031a, new ArrayService.DirectDownloadListener() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.a.1
                    @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                    public void onFailure() {
                        a aVar = a.this;
                        aVar.a(aVar.f19031a, view.getContext());
                    }

                    @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                    public void onAppDetailsDismissed() {
                    }

                    @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                    public void onAppDetailsDisplayed() {
                    }
                });
            } else {
                a(this.f19031a, view.getContext());
            }
        }

        public String toString() {
            return "AppLovinNativeAdImpl.ClickHandler(ad=" + a() + ")";
        }

        public AppLovinNativeAdImpl a() {
            return this.f19031a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(AppLovinNativeAdImpl appLovinNativeAdImpl, Context context) {
            if (Utils.openUri(context, appLovinNativeAdImpl.clickDestinationUri, ((AppLovinAdBase) appLovinNativeAdImpl).sdk)) {
                ((AppLovinAdBase) appLovinNativeAdImpl).sdk.L();
                if (y.a()) {
                    ((AppLovinAdBase) appLovinNativeAdImpl).sdk.L().b(appLovinNativeAdImpl.tag, "Opening URL: " + appLovinNativeAdImpl.clickDestinationUri);
                    return;
                }
                return;
            }
            if (Utils.openUri(context, appLovinNativeAdImpl.clickDestinationBackupUri, ((AppLovinAdBase) appLovinNativeAdImpl).sdk)) {
                ((AppLovinAdBase) appLovinNativeAdImpl).sdk.L();
                if (y.a()) {
                    ((AppLovinAdBase) appLovinNativeAdImpl).sdk.L().b(appLovinNativeAdImpl.tag, "Opening backup URL: " + appLovinNativeAdImpl.clickDestinationBackupUri);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final AppLovinNativeAdImpl f19034a;

        public b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f19034a = appLovinNativeAdImpl;
        }

        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a(this)) {
                return false;
            }
            AppLovinNativeAdImpl a10 = a();
            AppLovinNativeAdImpl a11 = bVar.a();
            if (a10 != null ? a10.equals(a11) : a11 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            AppLovinNativeAdImpl a10 = a();
            if (a10 == null) {
                hashCode = 43;
            } else {
                hashCode = a10.hashCode();
            }
            return 59 + hashCode;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f19034a.maybeHandleOnAttachedToWindow(view);
        }

        public String toString() {
            return "AppLovinNativeAdImpl.OnAttachStateChangeHandler(ad=" + a() + ")";
        }

        public AppLovinNativeAdImpl a() {
            return this.f19034a;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements ad.a {

        /* renamed from: b, reason: collision with root package name */
        private final List<l> f19036b;

        public c(List<l> list) {
            this.f19036b = list;
        }

        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a(this)) {
                return false;
            }
            List<l> a10 = a();
            List<l> a11 = cVar.a();
            if (a10 != null ? a10.equals(a11) : a11 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            List<l> a10 = a();
            if (a10 == null) {
                hashCode = 43;
            } else {
                hashCode = a10.hashCode();
            }
            return 59 + hashCode;
        }

        @Override // com.applovin.impl.sdk.ad.a
        public void onLogVisibilityImpression() {
            Iterator<l> it = this.f19036b.iterator();
            while (it.hasNext()) {
                ((AppLovinAdBase) AppLovinNativeAdImpl.this).sdk.ak().dispatchPostbackRequest(it.next(), null);
            }
        }

        public String toString() {
            return "AppLovinNativeAdImpl.VisibilityCallback(requests=" + a() + ")";
        }

        public List<l> a() {
            return this.f19036b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.applovin.impl.sdk.d.a> getDirectClickTrackingPostbacks() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, getClCode(), getStringFromAdObject("click_tracking_url", null), this.sdk);
        }
        return postbacks;
    }

    private boolean isDspAd() {
        return AD_RESPONSE_TYPE_ORTB.equalsIgnoreCase(getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleOnAttachedToWindow(View view) {
        if (this.impressionTracked.compareAndSet(false, true)) {
            ad adVar = new ad(this.nativeAdView, this.sdk, this.viewableMRC50Callback);
            this.viewableMRC50Tracker = adVar;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            adVar.a(0, 50.0f, 50.0f, timeUnit.toMillis(1L), this.nativeAdView);
            ad adVar2 = new ad(this.nativeAdView, this.sdk, this.viewableMRC100Callback);
            this.viewableMRC100Tracker = adVar2;
            adVar2.a(0, 100.0f, 100.0f, timeUnit.toMillis(1L), this.nativeAdView);
            com.applovin.impl.c.a aVar = this.vastAd;
            if (aVar != null && aVar.hasVideoUrl()) {
                ad adVar3 = new ad(this.nativeAdView, this.sdk, this.viewableVideoMRC50Callback);
                this.viewableVideoMRC50Tracker = adVar3;
                adVar3.a(0, 50.0f, 50.0f, timeUnit.toMillis(2L), this.videoView);
            }
            List<String> list = this.jsTrackers;
            if (list != null && list.size() > 0) {
                if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.fQ)).booleanValue()) {
                    Iterator<String> it = this.jsTrackers.iterator();
                    while (it.hasNext()) {
                        this.sdk.aa().a(it.next());
                    }
                } else {
                    String str = this.jsTrackers.get(0);
                    if (StringUtils.isValidString(str)) {
                        final com.applovin.impl.adview.d dVar = new com.applovin.impl.adview.d(null, this.sdk, view.getContext());
                        dVar.loadData(str, "text/html", "UTF-8");
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.1
                            @Override // java.lang.Runnable
                            public void run() {
                                dVar.stopLoading();
                            }
                        }, timeUnit.toMillis(5L));
                    }
                }
            }
            Iterator<l> it2 = this.impressionRequests.iterator();
            while (it2.hasNext()) {
                this.sdk.ak().dispatchPostbackRequest(it2.next(), null);
            }
            this.adEventTracker.a(view);
            this.adEventTracker.d();
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void destroy() {
        unregisterViewsForInteraction();
        this.eventListener = null;
        this.adEventTracker.e();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getBody() {
        return this.body;
    }

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getCallToAction() {
        return this.callToAction;
    }

    public a getClickHandler() {
        return this.clickHandler;
    }

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

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Uri getIconUri() {
        return this.iconUri;
    }

    public Uri getMainImageUri() {
        return this.mainImageUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinMediaView getMediaView() {
        return this.mediaView;
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
        ArrayList arrayList = new ArrayList();
        synchronized (this.adObjectLock) {
            JSONArray jSONArray = JsonUtils.getJSONArray(this.adObject, "omid_verification_script_resources", null);
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
                    try {
                        URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                        String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                        String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                        if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                        } else {
                            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                        }
                    } catch (Throwable th) {
                        this.sdk.L();
                        if (y.a()) {
                            this.sdk.L().b(this.tag, "Failed to parse OMID verification script resource", th);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    public Uri getPrivacyIconUri() {
        return this.privacyIconUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Double getStarRating() {
        return this.starRating;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return getStringFromAdObject("type", AD_RESPONSE_TYPE_UNDEFINED);
    }

    public com.applovin.impl.c.a getVastAd() {
        return this.vastAd;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void registerViewsForInteraction(List<View> list, ViewGroup viewGroup) {
        this.nativeAdView = viewGroup;
        if (h.c() && this.nativeAdView.isAttachedToWindow()) {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        } else if (!h.c() && this.nativeAdView.getParent() != null) {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        } else {
            this.nativeAdView.addOnAttachStateChangeListener(this.onAttachStateChangeHandler);
        }
        this.sdk.L();
        if (y.a()) {
            this.sdk.L().b(this.tag, "Registered ad view for impressions: " + this.nativeAdView);
        }
        if (this.clickDestinationUri == null && this.clickDestinationBackupUri == null) {
            this.sdk.L();
            if (y.a()) {
                this.sdk.L().b(this.tag, "Skipping click registration - no click URLs provided");
                return;
            }
            return;
        }
        for (View view : list) {
            if (view.hasOnClickListeners()) {
                this.sdk.L();
                if (y.a()) {
                    this.sdk.L().e(this.tag, "View has an onClickListener already - " + view);
                }
            }
            if (!view.isClickable()) {
                this.sdk.L();
                if (y.a()) {
                    this.sdk.L().e(this.tag, "View is not clickable - " + view);
                }
            }
            if (!view.isEnabled()) {
                this.sdk.L();
                if (y.a()) {
                    this.sdk.L().e(this.tag, "View is not enabled - " + view);
                }
            }
            if (view instanceof Button) {
                this.sdk.L();
                if (y.a()) {
                    this.sdk.L().b(this.tag, "Registering click for button: " + view);
                }
            } else {
                this.sdk.L();
                if (y.a()) {
                    this.sdk.L().b(this.tag, "Registering click for view: " + view);
                }
            }
            view.setOnClickListener(this.clickHandler);
            this.registeredViews.add(view);
        }
        this.sdk.L();
        if (y.a()) {
            this.sdk.L().b(this.tag, "Registered views: " + this.registeredViews);
        }
    }

    public void setEventListener(AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageUri(Uri uri) {
        this.mainImageUri = uri;
    }

    public void setPrivacyIconUri(Uri uri) {
        this.privacyIconUri = uri;
    }

    public void setUpNativeAdViewComponents() {
        com.applovin.impl.c.a aVar = this.vastAd;
        if (aVar != null && aVar.hasVideoUrl()) {
            try {
                this.mediaView = new AppLovinVastMediaView(this, this.sdk, p.y());
            } catch (Throwable th) {
                this.sdk.L();
                if (y.a()) {
                    this.sdk.L().a(this.tag, "Failed to create ExoPlayer VAST media view. Falling back to static image for media view.", th);
                }
                this.mediaView = new AppLovinMediaView(this, this.sdk, p.y());
            }
        } else {
            this.mediaView = new AppLovinMediaView(this, this.sdk, p.y());
        }
        if (this.privacyDestinationUri != null) {
            this.optionsView = new AppLovinOptionsView(this, this.sdk, p.y());
            return;
        }
        this.sdk.L();
        if (y.a()) {
            this.sdk.L().b(this.tag, "Privacy icon will not render because no native ad privacy URL is provided.");
        }
    }

    public void setVideoView(View view) {
        this.videoView = view;
    }

    public boolean shouldInjectOpenMeasurementScriptDuringCaching() {
        return false;
    }

    public String toString() {
        return "AppLovinNativeAd{adIdNumber=" + getAdIdNumber() + " - " + getTitle() + "}";
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void unregisterViewsForInteraction() {
        Iterator<View> it = this.registeredViews.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(null);
        }
        this.sdk.L();
        if (y.a()) {
            this.sdk.L().b(this.tag, "Unregistered views: " + this.registeredViews);
        }
        this.registeredViews.clear();
        ad adVar = this.viewableMRC50Tracker;
        if (adVar != null) {
            adVar.a();
        }
        ad adVar2 = this.viewableMRC100Tracker;
        if (adVar2 != null) {
            adVar2.a();
        }
        ad adVar3 = this.viewableVideoMRC50Tracker;
        if (adVar3 != null) {
            adVar3.a();
        }
        ViewGroup viewGroup = this.nativeAdView;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.onAttachStateChangeHandler);
            this.nativeAdView = null;
        }
        AppLovinMediaView appLovinMediaView = this.mediaView;
        if (appLovinMediaView != null) {
            appLovinMediaView.destroy();
        }
        AppLovinOptionsView appLovinOptionsView = this.optionsView;
        if (appLovinOptionsView != null) {
            appLovinOptionsView.destroy();
        }
    }

    private AppLovinNativeAdImpl(Builder builder) {
        super(builder.adObject, builder.fullResponse, builder.sdk);
        this.impressionTracked = new AtomicBoolean();
        this.registeredViews = new ArrayList();
        this.clickHandler = new a(this);
        this.onAttachStateChangeHandler = new b(this);
        this.adEventTracker = new com.applovin.impl.sdk.a.e(this);
        this.title = builder.title;
        this.advertiser = builder.advertiser;
        this.body = builder.body;
        this.callToAction = builder.callToAction;
        this.iconUri = builder.iconUri;
        this.mainImageUri = builder.mainImageUri;
        this.privacyIconUri = builder.privacyIconUri;
        com.applovin.impl.c.a aVar = builder.vastAd;
        this.vastAd = aVar;
        this.clickDestinationUri = builder.clickDestinationUri;
        this.clickDestinationBackupUri = builder.clickDestinationBackupUri;
        this.clickTrackingUrls = builder.clickTrackingUrls;
        this.jsTrackers = builder.jsTrackers;
        this.impressionRequests = builder.impressionRequests;
        Double d10 = builder.starRating;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : d10;
        if (builder.privacyDestinationUri != null) {
            this.privacyDestinationUri = builder.privacyDestinationUri;
        } else if (!isDspAd() || getSdk().av().a()) {
            this.privacyDestinationUri = Uri.parse(DEFAULT_APPLOVIN_PRIVACY_URL);
        }
        this.viewableMRC50Callback = new c(builder.viewableMRC50Requests);
        this.viewableMRC100Callback = new c(builder.viewableMRC100Requests);
        if (aVar != null && aVar.hasVideoUrl()) {
            this.viewableVideoMRC50Callback = new c(builder.viewableVideo50Requests);
        }
        this.tag = "AppLovinNativeAd:" + getAdIdNumber();
    }

    public com.applovin.impl.sdk.a.e getAdEventTracker() {
        return this.adEventTracker;
    }
}
