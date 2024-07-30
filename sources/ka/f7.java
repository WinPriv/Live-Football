package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;
import java.util.ArrayList;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class f7 implements g7 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f31163h = new a();

    /* renamed from: i, reason: collision with root package name */
    public static final b f31164i = new b();

    /* renamed from: a, reason: collision with root package name */
    public final AdContentData f31165a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentRecord f31166b;

    /* renamed from: c, reason: collision with root package name */
    public final l7 f31167c;

    /* renamed from: d, reason: collision with root package name */
    public VideoInfo f31168d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f31169e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public String f31170g;

    /* loaded from: classes2.dex */
    public static class a extends ArrayList<Integer> {
        public a() {
            add(3);
            add(1);
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends ArrayList<Integer> {
        public b() {
            add(12);
        }
    }

    public f7(Context context, ContentRecord contentRecord, l7 l7Var) {
        String uuid = UUID.randomUUID().toString();
        this.f = -1;
        this.f31166b = contentRecord;
        this.f31167c = l7Var;
        AdContentData f = AdContentData.f(context, contentRecord);
        this.f31165a = f;
        if (f != null) {
            this.f = f.s();
            f.J(uuid);
        }
    }

    public final VideoInfo a() {
        MetaData metaData;
        if (this.f31168d == null) {
            AdContentData adContentData = this.f31165a;
            if (adContentData != null) {
                metaData = adContentData.x();
            } else {
                metaData = null;
            }
            if (metaData != null && metaData.K() != null) {
                VideoInfo videoInfo = new VideoInfo(metaData.K());
                this.f31168d = videoInfo;
                videoInfo.C = "y";
                l7 l7Var = this.f31167c;
                if (l7Var != null) {
                    int i10 = l7Var.f31408c;
                    n7.e("LinkedNativeAd", "obtain progress from native view " + i10);
                    VideoInfo videoInfo2 = this.f31168d;
                    n7.c("LinkedAdConfiguration", "get enableDirectReturnVideoAd is %s", Boolean.valueOf(l7Var.f31410e));
                    videoInfo2.K = l7Var.f31410e;
                    this.f31168d.B = i10;
                }
                this.f31168d.f22649w = "y";
            }
        }
        ContentRecord contentRecord = this.f31166b;
        if (contentRecord != null) {
            this.f31170g = contentRecord.m3();
        }
        return this.f31168d;
    }

    public final boolean b() {
        int i10;
        VideoInfo a10;
        int i11 = 0;
        l7 l7Var = this.f31167c;
        if (l7Var != null) {
            i10 = l7Var.f31406a;
        } else {
            i10 = 0;
        }
        if (i10 != 10) {
            return false;
        }
        int i12 = this.f;
        if (!f31163h.contains(Integer.valueOf(i12)) || (a10 = a()) == null) {
            return false;
        }
        Float videoRatio = a10.getVideoRatio();
        if (videoRatio != null && videoRatio.floatValue() < 1.0f) {
            return false;
        }
        if (i12 != 1 && i12 != 18) {
            return true;
        }
        AdContentData adContentData = this.f31165a;
        if (adContentData != null) {
            i11 = adContentData.O();
        }
        return f31164i.contains(Integer.valueOf(i11));
    }

    public final boolean equals(Object obj) {
        String str;
        if (!(obj instanceof f7)) {
            return false;
        }
        if (obj.hashCode() == hashCode()) {
            return true;
        }
        String str2 = null;
        AdContentData adContentData = this.f31165a;
        if (adContentData != null) {
            str = adContentData.B();
        } else {
            str = null;
        }
        if (str == null) {
            return false;
        }
        AdContentData adContentData2 = ((f7) obj).f31165a;
        if (adContentData2 != null) {
            str2 = adContentData2.B();
        }
        return TextUtils.equals(str, str2);
    }

    public final int hashCode() {
        String str;
        int i10;
        AdContentData adContentData = this.f31165a;
        if (adContentData != null) {
            str = adContentData.B();
        } else {
            str = null;
        }
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = -1;
        }
        return i10 & super.hashCode();
    }
}
