package q0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.Toast;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.l.p;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationBarView;
import com.hamkho.livefoot.Activities.SoccerLive.LiveMainHolder;
import com.hamkho.livefoot.Activities.SplashActivity;
import com.hamkho.livefoot.R;
import d6.g0;
import d6.j;
import d6.o;
import h4.b;
import i8.f0;
import j5.a0;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import k4.c1;
import k4.e1;
import k4.o0;
import n0.c;
import n0.c0;
import org.jsoup.helper.Consumer;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeVisitor;
import p4.a;
import q0.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements g, p.a, b.a, o.b, o.a, d6.f, a.d, a0.a, OnCompleteListener, NavigationBarView.b, Response.ErrorListener, NodeVisitor {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f34553s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f34554t;

    public /* synthetic */ d(Object obj, int i10) {
        this.f34553s = i10;
        this.f34554t = obj;
    }

    @Override // com.google.android.material.navigation.NavigationBarView.b
    public final void a(MenuItem menuItem) {
        LiveMainHolder liveMainHolder = (LiveMainHolder) this.f34554t;
        int i10 = LiveMainHolder.f21490t;
        liveMainHolder.getClass();
        switch (menuItem.getItemId()) {
            case R.id.MyChannels /* 2131361836 */:
                liveMainHolder.c(new c9.c());
                return;
            case R.id.MyEvents /* 2131361837 */:
                liveMainHolder.c(new c9.f());
                return;
            default:
                return;
        }
    }

    @Override // d6.f
    public final void accept(Object obj) {
        ((e.a) obj).e((Exception) this.f34554t);
    }

    public final boolean b(h hVar, int i10, Bundle bundle) {
        c.b c0443c;
        View view = (View) this.f34554t;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                hVar.f34557a.b();
                InputContentInfo inputContentInfo = (InputContentInfo) hVar.f34557a.d();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
            }
        }
        ClipDescription description = hVar.f34557a.getDescription();
        h.c cVar = hVar.f34557a;
        ClipData clipData = new ClipData(description, new ClipData.Item(cVar.a()));
        if (i11 >= 31) {
            c0443c = new c.a(clipData, 2);
        } else {
            c0443c = new c.C0443c(clipData, 2);
        }
        c0443c.a(cVar.c());
        c0443c.setExtras(bundle);
        if (c0.h(view, c0443c.build()) == null) {
            return true;
        }
        return false;
    }

    @Override // d6.o.b
    public final void d(Object obj, j jVar) {
        k4.a0 a0Var = (k4.a0) this.f34554t;
        int i10 = k4.a0.f30317l0;
        a0Var.getClass();
        ((e1.c) obj).Y(new e1.b(jVar));
    }

    @Override // h4.b.a
    public final Object execute() {
        ((f4.h) this.f34554t).f28096i.b();
        return null;
    }

    @Override // org.jsoup.select.NodeVisitor
    public final void head(Node node, int i10) {
        Consumer consumer = (Consumer) this.f34554t;
        List<Node> list = Node.f33995u;
        consumer.accept(node);
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f34553s;
        Object obj2 = this.f34554t;
        switch (i10) {
            case 1:
                com.applovin.exoplayer2.a.a.c0((b.a) obj2, (com.applovin.exoplayer2.a.b) obj);
                return;
            case 2:
            case 3:
            default:
                ((e1.c) obj).u((r5.c) obj2);
                return;
            case 4:
                ((e1.c) obj).i0(k4.a0.f0((c1) obj2));
                return;
            case 5:
                int i11 = k4.a0.f30317l0;
                ((e1.c) obj).Q((o0) obj2);
                return;
            case 6:
                ((e1.c) obj).h((Metadata) obj2);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i10 = this.f34553s;
        Object obj = this.f34554t;
        switch (i10) {
            case 11:
                f0.a((Intent) obj);
                return;
            default:
                ((ScheduledFuture) obj).cancel(false);
                return;
        }
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(VolleyError volleyError) {
        h9.a aVar = (h9.a) this.f34554t;
        Toast.makeText(((SplashActivity.a) aVar).f21500a, volleyError.getMessage(), 0).show();
    }

    @Override // p4.a.d
    public final long timeUsToTargetTime(long j10) {
        return g0.i((j10 * r0.f34332e) / 1000000, 0L, ((p4.p) this.f34554t).f34336j - 1);
    }
}
