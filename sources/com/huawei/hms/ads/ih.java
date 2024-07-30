package com.huawei.hms.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.inner.SourceParam;
import gb.w0;

/* loaded from: classes2.dex */
public class ih extends ig<jw> implements it {
    public ih(Context context, jw jwVar) {
        super(context, jwVar);
    }

    @Override // com.huawei.hms.ads.ig
    public void V(final String str) {
        ((jw) I()).B();
        ex.V("PPSImageViewPresenter", "onMaterialLoaded - begin to load image");
        SourceParam sourceParam = new SourceParam();
        sourceParam.i(str);
        sourceParam.d(this.Code);
        w0.e(((ig) this).V, sourceParam, new gb.j() { // from class: com.huawei.hms.ads.ih.1
            @Override // gb.j
            public void Code() {
                ex.V("PPSImageViewPresenter", "onMaterialLoaded - image load failed");
                gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ih.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ((jw) ih.this.I()).Code(-9);
                    }
                });
                ih ihVar = ih.this;
                ihVar.V(ihVar.Code);
            }

            @Override // gb.j
            public void Code(String str2, final Drawable drawable) {
                if (TextUtils.equals(str2, str)) {
                    ex.V("PPSImageViewPresenter", "onMaterialLoaded - image load success");
                    gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ih.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ((jw) ih.this.I()).Code(drawable);
                            ((jw) ih.this.I()).Z();
                        }
                    });
                } else {
                    Code();
                    ih ihVar = ih.this;
                    cz.Code(((ig) ihVar).V, 5, "url not equals filePath", ihVar.Code);
                }
            }
        });
    }
}
