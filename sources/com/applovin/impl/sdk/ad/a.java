package com.applovin.impl.sdk.ad;

import android.net.Uri;
import com.applovin.impl.adview.i;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.huawei.hms.ads.gl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    private final String f18563a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18564b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18565c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.a.c f18566d;

    public a(JSONObject jSONObject, JSONObject jSONObject2, b bVar, p pVar) {
        super(jSONObject, jSONObject2, bVar, pVar);
        this.f18563a = b();
        this.f18564b = i();
        this.f18565c = aO();
        this.f18566d = new com.applovin.impl.sdk.a.c(this);
    }

    private String aO() {
        return getStringFromAdObject("stream_url", "");
    }

    @Override // com.applovin.impl.sdk.ad.e
    public void a() {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.f18563a);
            JsonUtils.putString(this.adObject, "stream_url", this.f18565c);
        }
    }

    public String b() {
        String string;
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, "html", "");
        }
        return string;
    }

    @Override // com.applovin.impl.sdk.ad.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.sdk.a.c o() {
        return this.f18566d;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public String d() {
        return this.f18564b;
    }

    public String e() {
        return this.f18565c;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean f() {
        return this.adObject.has("stream_url");
    }

    public void g() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject deepCopy;
        synchronized (this.fullResponseLock) {
            deepCopy = JsonUtils.deepCopy(this.fullResponse);
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(deepCopy, com.anythink.expressad.foundation.d.d.f9543h, new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject, "html", this.f18563a);
            JsonUtils.putString(jSONObject, "video", this.f18564b);
            JsonUtils.putString(jSONObject, "stream_url", this.f18565c);
        }
        return deepCopy;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri h() {
        String aO = aO();
        if (StringUtils.isValidString(aO)) {
            return Uri.parse(aO);
        }
        String i10 = i();
        if (StringUtils.isValidString(i10)) {
            return Uri.parse(i10);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        if (h() != null) {
            return true;
        }
        return false;
    }

    public String i() {
        return getStringFromAdObject("video", "");
    }

    @Override // com.applovin.impl.sdk.ad.e, com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri j() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri k() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return j();
    }

    public float l() {
        return getFloatFromAdObject("mraid_close_delay_graphic", gl.Code);
    }

    public boolean m() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    public i.a n() {
        return a(getIntFromAdObject("expandable_style", i.a.INVISIBLE.a()));
    }

    public void a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    public void a(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }
}
