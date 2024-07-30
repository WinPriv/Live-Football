package com.huawei.hms.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.widget.ImageView;
import com.huawei.hms.ads.jv;
import java.util.List;

/* loaded from: classes2.dex */
public interface iq<V extends jv> {
    boolean C();

    void Code(Context context, ImageView imageView, Drawable drawable);

    void Code(Location location);

    void Code(RequestOptions requestOptions);

    void Code(com.huawei.openalliance.ad.inter.data.j jVar);

    void Code(com.huawei.openalliance.ad.inter.data.n nVar);

    void Code(Integer num);

    void Code(String str, int i10, List<String> list, int i11);

    void Code(String str, com.huawei.openalliance.ad.inter.data.e eVar, long j10);

    boolean Code(com.huawei.openalliance.ad.inter.data.b bVar, float f);

    void I(Integer num);

    void V(Integer num);

    void V(String str);
}
