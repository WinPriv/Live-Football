package com.applovin.impl.c;

import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final Set<k> f17422a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Set<k> f17423b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private Uri f17424c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f17425d;

    /* renamed from: e, reason: collision with root package name */
    private int f17426e;
    private int f;

    public static g a(t tVar, p pVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (pVar != null) {
            t b10 = tVar.b("StaticResource");
            if (b10 != null && URLUtil.isValidUrl(b10.c())) {
                g gVar = new g();
                gVar.f17424c = Uri.parse(b10.c());
                t c10 = tVar.c("IconClickThrough");
                if (c10 != null && URLUtil.isValidUrl(c10.c())) {
                    gVar.f17425d = Uri.parse(c10.c());
                }
                String str = tVar.b().get(ContentRecord.WIDTH);
                int i10 = 0;
                int parseInt = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
                String str2 = tVar.b().get(ContentRecord.HEIGHT);
                if (str2 != null && Integer.parseInt(str2) > 0) {
                    i10 = Integer.parseInt(str2);
                }
                int intValue = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eQ)).intValue();
                if (parseInt > 0 && i10 > 0) {
                    double d10 = parseInt / i10;
                    int min = Math.min(Math.max(parseInt, i10), intValue);
                    if (parseInt >= i10) {
                        gVar.f17426e = min;
                        gVar.f = (int) (min / d10);
                    } else {
                        gVar.f = min;
                        gVar.f17426e = (int) (min * d10);
                    }
                } else {
                    gVar.f = intValue;
                    gVar.f17426e = intValue;
                }
                return gVar;
            }
            pVar.L();
            if (!y.a()) {
                return null;
            }
            pVar.L().e("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public Uri b() {
        return this.f17425d;
    }

    public int c() {
        return this.f17426e;
    }

    public int d() {
        return this.f;
    }

    public Set<k> e() {
        return this.f17422a;
    }

    public Set<k> f() {
        return this.f17423b;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + a() + "', clickUri='" + b() + "', width=" + c() + ", height=" + d() + "}";
    }

    public static ImageView a(Uri uri, Context context, p pVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        Utils.setImageUrl(uri.toString(), imageView, pVar);
        return imageView;
    }

    public Uri a() {
        return this.f17424c;
    }
}
