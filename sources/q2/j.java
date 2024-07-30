package q2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.hamkho.livefoot.R;

/* compiled from: DropShadowEffect.java */
/* loaded from: classes.dex */
public final class j implements b4.b {

    /* renamed from: s, reason: collision with root package name */
    public final Object f34586s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f34587t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f34588u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f34589v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f34590w;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f34586s = obj;
        this.f34587t = obj2;
        this.f34588u = obj3;
        this.f34589v = obj4;
        this.f34590w = obj5;
    }

    public static j a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.installapp, (ViewGroup) null, false);
        int i10 = R.id.Close;
        ImageView imageView = (ImageView) a0.a.H0(R.id.Close, inflate);
        if (imageView != null) {
            i10 = R.id.Install;
            ImageView imageView2 = (ImageView) a0.a.H0(R.id.Install, inflate);
            if (imageView2 != null) {
                i10 = R.id.textView6;
                TextView textView = (TextView) a0.a.H0(R.id.textView6, inflate);
                if (textView != null) {
                    i10 = R.id.textView7;
                    TextView textView2 = (TextView) a0.a.H0(R.id.textView7, inflate);
                    if (textView2 != null) {
                        return new j((CardView) inflate, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // tc.a
    public final Object get() {
        i4.a aVar = (i4.a) ((tc.a) this.f34586s).get();
        i4.a aVar2 = (i4.a) ((tc.a) this.f34587t).get();
        Object obj = ((tc.a) this.f34588u).get();
        Object obj2 = ((tc.a) this.f34589v).get();
        return new g4.o(aVar, aVar2, (g4.e) obj, (g4.t) obj2, (tc.a) this.f34590w);
    }
}
