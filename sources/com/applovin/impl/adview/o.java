package com.applovin.impl.adview;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.util.Map;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f17180a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f17181b;

    public o(Map<String, Object> map, com.applovin.impl.sdk.p pVar) {
        this.f17180a = map;
        this.f17181b = pVar;
    }

    public Drawable a() {
        Object obj = this.f17180a.get("google_watermark");
        if (!(obj instanceof String)) {
            this.f17181b.L();
            if (com.applovin.impl.sdk.y.a()) {
                this.f17181b.L().e("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] decode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.applovin.impl.sdk.p.y().getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th) {
            this.f17181b.L();
            if (com.applovin.impl.sdk.y.a()) {
                this.f17181b.L().b("GoogleWatermarkGenerator", "Failed to render watermark", th);
            }
            return null;
        }
    }

    public String b() {
        return "google watermark";
    }
}
