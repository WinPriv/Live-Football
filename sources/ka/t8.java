package ka;

import android.content.Context;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;
import java.net.URLEncoder;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class t8 {

    /* renamed from: a, reason: collision with root package name */
    public final a4.l f31879a;

    /* renamed from: b, reason: collision with root package name */
    public final u8 f31880b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f31881c;

    public t8(Context context, a4.l lVar, u8 u8Var) {
        this.f31879a = lVar;
        this.f31880b = u8Var;
        this.f31881c = context;
    }

    public final String a(VideoInfo videoInfo) {
        String encode = URLEncoder.encode(videoInfo.f22646t, "UTF-8");
        return String.format(Locale.ENGLISH, "http://%s:%s/%s?nonsense=%s&sha256=%s", this.f31881c.getString(R.string.player_local_host), Integer.valueOf(this.f31880b.f31935c), encode, URLEncoder.encode(a0.a.l0(), "UTF-8"), URLEncoder.encode(videoInfo.getSha256(), "UTF-8"));
    }
}
