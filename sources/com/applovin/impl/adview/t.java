package com.applovin.impl.adview;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private final int f17212a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17213b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17214c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17215d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f17216e;
    private final int f;

    /* renamed from: g, reason: collision with root package name */
    private final int f17217g;

    /* renamed from: h, reason: collision with root package name */
    private final int f17218h;

    /* renamed from: i, reason: collision with root package name */
    private final float f17219i;

    /* renamed from: j, reason: collision with root package name */
    private final float f17220j;

    public t(JSONObject jSONObject, com.applovin.impl.sdk.p pVar) {
        pVar.L();
        if (com.applovin.impl.sdk.y.a()) {
            pVar.L().c("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f17212a = JsonUtils.getInt(jSONObject, ContentRecord.WIDTH, 64);
        this.f17213b = JsonUtils.getInt(jSONObject, ContentRecord.HEIGHT, 7);
        this.f17214c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f17215d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f17216e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f17217g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f17218h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f17219i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f17220j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public int a() {
        return this.f17212a;
    }

    public int b() {
        return this.f17213b;
    }

    public int c() {
        return this.f17214c;
    }

    public int d() {
        return this.f17215d;
    }

    public boolean e() {
        return this.f17216e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f17212a == tVar.f17212a && this.f17213b == tVar.f17213b && this.f17214c == tVar.f17214c && this.f17215d == tVar.f17215d && this.f17216e == tVar.f17216e && this.f == tVar.f && this.f17217g == tVar.f17217g && this.f17218h == tVar.f17218h && Float.compare(tVar.f17219i, this.f17219i) == 0 && Float.compare(tVar.f17220j, this.f17220j) == 0) {
            return true;
        }
        return false;
    }

    public long f() {
        return this.f;
    }

    public long g() {
        return this.f17217g;
    }

    public long h() {
        return this.f17218h;
    }

    public int hashCode() {
        int i10;
        int i11 = ((((((((((((((this.f17212a * 31) + this.f17213b) * 31) + this.f17214c) * 31) + this.f17215d) * 31) + (this.f17216e ? 1 : 0)) * 31) + this.f) * 31) + this.f17217g) * 31) + this.f17218h) * 31;
        float f = this.f17219i;
        int i12 = 0;
        if (f != gl.Code) {
            i10 = Float.floatToIntBits(f);
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        float f10 = this.f17220j;
        if (f10 != gl.Code) {
            i12 = Float.floatToIntBits(f10);
        }
        return i13 + i12;
    }

    public float i() {
        return this.f17219i;
    }

    public float j() {
        return this.f17220j;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f17212a + ", heightPercentOfScreen=" + this.f17213b + ", margin=" + this.f17214c + ", gravity=" + this.f17215d + ", tapToFade=" + this.f17216e + ", tapToFadeDurationMillis=" + this.f + ", fadeInDurationMillis=" + this.f17217g + ", fadeOutDurationMillis=" + this.f17218h + ", fadeInDelay=" + this.f17219i + ", fadeOutDelay=" + this.f17220j + '}';
    }
}
