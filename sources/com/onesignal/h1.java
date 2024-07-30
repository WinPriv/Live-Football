package com.onesignal;

import com.vungle.warren.model.AdvertisementDBAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageRedisplayStats.java */
/* loaded from: classes2.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public long f26841a;

    /* renamed from: b, reason: collision with root package name */
    public int f26842b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26843c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26844d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26845e;

    public h1() {
        this.f26841a = -1L;
        this.f26842b = 0;
        this.f26843c = 1;
        this.f26844d = 0L;
        this.f26845e = false;
    }

    public final String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.f26841a + ", displayQuantity=" + this.f26842b + ", displayLimit=" + this.f26843c + ", displayDelay=" + this.f26844d + '}';
    }

    public h1(int i10, long j10) {
        this.f26843c = 1;
        this.f26844d = 0L;
        this.f26845e = false;
        this.f26842b = i10;
        this.f26841a = j10;
    }

    public h1(JSONObject jSONObject) throws JSONException {
        this.f26841a = -1L;
        this.f26842b = 0;
        this.f26843c = 1;
        this.f26844d = 0L;
        this.f26845e = false;
        this.f26845e = true;
        Object obj = jSONObject.get("limit");
        Object obj2 = jSONObject.get(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_DELAY);
        if (obj instanceof Integer) {
            this.f26843c = ((Integer) obj).intValue();
        }
        if (obj2 instanceof Long) {
            this.f26844d = ((Long) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            this.f26844d = ((Integer) obj2).intValue();
        }
    }
}
