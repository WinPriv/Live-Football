package com.applovin.impl.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f17400c = Arrays.asList("video/mp4", com.anythink.expressad.exoplayer.k.o.f, com.anythink.expressad.exoplayer.k.o.f9073g, "video/x-matroska");

    /* renamed from: b, reason: collision with root package name */
    private final p f17402b;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f17403d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f17404e;
    private final com.applovin.impl.sdk.ad.b f;

    /* renamed from: a, reason: collision with root package name */
    protected List<t> f17401a = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final long f17405g = System.currentTimeMillis();

    public e(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, p pVar) {
        this.f17402b = pVar;
        this.f17403d = jSONObject;
        this.f17404e = jSONObject2;
        this.f = bVar;
    }

    public int a() {
        return this.f17401a.size();
    }

    public List<t> b() {
        return this.f17401a;
    }

    public JSONObject c() {
        return this.f17403d;
    }

    public JSONObject d() {
        return this.f17404e;
    }

    public com.applovin.impl.sdk.ad.b e() {
        return this.f;
    }

    public long f() {
        return this.f17405g;
    }

    public List<String> g() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.f17403d, "vast_preferred_video_types", null));
        if (explode.isEmpty()) {
            return f17400c;
        }
        return explode;
    }

    public int h() {
        return Utils.getVideoCompletionPercent(this.f17403d);
    }
}
