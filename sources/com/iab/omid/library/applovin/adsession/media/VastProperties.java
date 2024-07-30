package com.iab.omid.library.applovin.adsession.media;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24243a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f24244b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24245c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f24246d;

    private VastProperties(boolean z10, Float f, boolean z11, Position position) {
        this.f24243a = z10;
        this.f24244b = f;
        this.f24245c = z11;
        this.f24246d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f24243a);
            if (this.f24243a) {
                jSONObject.put("skipOffset", this.f24244b);
            }
            jSONObject.put(NativeAdvancedJsUtils.f6921k, this.f24245c);
            jSONObject.put("position", this.f24246d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f24246d;
    }

    public Float getSkipOffset() {
        return this.f24244b;
    }

    public boolean isAutoPlay() {
        return this.f24245c;
    }

    public boolean isSkippable() {
        return this.f24243a;
    }
}
