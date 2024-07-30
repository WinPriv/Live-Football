package wa;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.huawei.openalliance.ad.ppskit.linked.view.LinkedAppDetailView;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.n1;
import com.huawei.openalliance.ad.ppskit.utils.v0;
import ka.y4;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f36184s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ImageView f36185t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ LinkedAppDetailView f36186u;

    /* loaded from: classes2.dex */
    public class a implements n1 {

        /* renamed from: wa.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0501a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Drawable f36188s;

            public RunnableC0501a(Drawable drawable) {
                this.f36188s = drawable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                b.this.f36185t.setBackground(null);
                b.this.f36185t.setImageDrawable(this.f36188s);
            }
        }

        public a() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.n1
        public final void a() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.n1
        public final void a(String str, Drawable drawable) {
            if (drawable != null) {
                d2.a(new RunnableC0501a(drawable));
            }
        }
    }

    public b(LinkedAppDetailView linkedAppDetailView, String str, ImageView imageView) {
        this.f36186u = linkedAppDetailView;
        this.f36184s = str;
        this.f36185t = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SourceParam sourceParam = new SourceParam();
        sourceParam.l(false);
        sourceParam.o(true);
        sourceParam.h("icon");
        sourceParam.n(this.f36184s);
        LinkedAppDetailView linkedAppDetailView = this.f36186u;
        if (!linkedAppDetailView.B) {
            sourceParam.b(linkedAppDetailView.f22657x.O(linkedAppDetailView.F));
        }
        e6.c e10 = new za.c(linkedAppDetailView.f22652s, sourceParam).e();
        if (e10 != null) {
            String str = e10.f27764a;
            if (!TextUtils.isEmpty(str)) {
                String h10 = y4.a(linkedAppDetailView.f22652s, "normal").h(linkedAppDetailView.f22652s, str);
                if (!TextUtils.isEmpty(h10)) {
                    SourceParam sourceParam2 = new SourceParam();
                    sourceParam2.n(h10);
                    v0.g(linkedAppDetailView.f22652s, sourceParam2, new a(), null, null);
                }
            }
        }
    }
}
