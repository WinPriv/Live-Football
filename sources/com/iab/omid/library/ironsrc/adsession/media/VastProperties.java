package com.iab.omid.library.ironsrc.adsession.media;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.iab.omid.library.ironsrc.utils.d;
import com.iab.omid.library.ironsrc.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24361a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f24362b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24363c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f24364d;

    private VastProperties(boolean z10, Float f, boolean z11, Position position) {
        this.f24361a = z10;
        this.f24362b = f;
        this.f24363c = z11;
        this.f24364d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z10, position);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f24361a);
            if (this.f24361a) {
                jSONObject.put("skipOffset", this.f24362b);
            }
            jSONObject.put(NativeAdvancedJsUtils.f6921k, this.f24363c);
            jSONObject.put("position", this.f24364d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f24364d;
    }

    public final Float getSkipOffset() {
        return this.f24362b;
    }

    public final boolean isAutoPlay() {
        return this.f24363c;
    }

    public final boolean isSkippable() {
        return this.f24361a;
    }
}
