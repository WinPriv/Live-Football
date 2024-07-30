package ka;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.inter.data.ImageInfo;

/* loaded from: classes2.dex */
public final class i7 implements com.huawei.openalliance.ad.ppskit.utils.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageInfo f31270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j7 f31271b;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Drawable f31272s;

        public a(Drawable drawable) {
            this.f31272s = drawable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i7 i7Var = i7.this;
            ((wa.e) ((p9) i7Var.f31271b.f32659s)).c(i7Var.f31270a, this.f31272s);
        }
    }

    public i7(j7 j7Var, ImageInfo imageInfo) {
        this.f31271b = j7Var;
        this.f31270a = imageInfo;
    }

    @Override // com.huawei.openalliance.ad.ppskit.utils.n1
    public final void a() {
        n7.g("NativeVideoP", "cover image load fail");
    }

    @Override // com.huawei.openalliance.ad.ppskit.utils.n1
    public final void a(String str, Drawable drawable) {
        ImageInfo imageInfo = this.f31270a;
        if (imageInfo == null || !TextUtils.equals(str, imageInfo.getUrl())) {
            return;
        }
        com.huawei.openalliance.ad.ppskit.utils.d2.a(new a(drawable));
    }
}
