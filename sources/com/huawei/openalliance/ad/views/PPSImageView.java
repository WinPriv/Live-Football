package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.ih;
import com.huawei.hms.ads.jw;
import com.huawei.hms.ads.splash.R;

/* loaded from: classes2.dex */
public class PPSImageView extends PPSBaseView implements jw {
    public ImageView J;

    public PPSImageView(Context context) {
        super(context);
        View.inflate(context, R.layout.hiad_view_image_ad, this);
        this.J = (ImageView) findViewById(R.id.iv_ad_content);
        this.f23814s = new ih(context, this);
    }

    @Override // com.huawei.hms.ads.jw
    public final void Code(Drawable drawable) {
        ex.V("PPSImageView", "onAdImageLoaded - set image to view");
        this.J.setImageDrawable(drawable);
        this.f23814s.Code(this.f23817v);
    }
}
