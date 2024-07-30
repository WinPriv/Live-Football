package com.iab.omid.library.vungle.adsession.media;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.iab.omid.library.vungle.d.c;
import com.iab.omid.library.vungle.d.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24483a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f24484b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24485c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f24486d;

    private VastProperties(boolean z10, Float f, boolean z11, Position position) {
        this.f24483a = z10;
        this.f24484b = f;
        this.f24485c = z11;
        this.f24486d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f24483a);
            if (this.f24483a) {
                jSONObject.put("skipOffset", this.f24484b);
            }
            jSONObject.put(NativeAdvancedJsUtils.f6921k, this.f24485c);
            jSONObject.put("position", this.f24486d);
        } catch (JSONException e10) {
            c.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f24486d;
    }

    public Float getSkipOffset() {
        return this.f24484b;
    }

    public boolean isAutoPlay() {
        return this.f24485c;
    }

    public boolean isSkippable() {
        return this.f24483a;
    }
}
