package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;
import com.huawei.openalliance.ad.ppskit.views.VideoView;

/* loaded from: classes2.dex */
public final class k7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f31367a;

    /* renamed from: b, reason: collision with root package name */
    public final VideoView f31368b;

    /* renamed from: c, reason: collision with root package name */
    public int f31369c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Context f31370d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31371e;

    public k7(Context context, VideoView videoView, VideoInfo videoInfo, f7 f7Var) {
        this.f31370d = context;
        this.f31368b = videoView;
        this.f31367a = videoInfo.getAutoPlayNetwork();
        videoInfo.getDownloadNetwork();
        videoInfo.getVideoPlayMode();
        boolean z10 = videoInfo.K;
        this.f31371e = f7Var.f31170g;
        n7.c("LinkedAlertAndPlayStrategy", "isDirectReturn %s", Boolean.valueOf(z10));
    }

    public final int a(int i10, boolean z10) {
        this.f31369c = i10;
        n7.c("LinkedAlertAndPlayStrategy", "startPlayVideo， mManualOrAuto %s", Integer.valueOf(i10));
        String str = this.f31371e;
        if (!TextUtils.isEmpty(str) && !com.huawei.openalliance.ad.ppskit.utils.y1.t(str)) {
            return i10 + 100;
        }
        Context context = this.f31370d;
        if (!com.huawei.openalliance.ad.ppskit.utils.k1.g(context)) {
            return 1;
        }
        if (!com.huawei.openalliance.ad.ppskit.utils.k1.e(context) && this.f31367a != 1) {
            if (!z10) {
                return i10 + 100;
            }
            return this.f31369c + 200;
        }
        return i10 + 100;
    }
}
