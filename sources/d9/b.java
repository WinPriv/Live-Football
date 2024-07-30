package d9;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.anythink.nativead.api.ATNativeAdView;
import com.hamkho.livefoot.R;
import java.util.ArrayList;
import java.util.List;
import m9.j;
import p3.f;
import y1.g;

/* compiled from: LiveCricketAdapter.java */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.g<RecyclerView.c0> {

    /* renamed from: i, reason: collision with root package name */
    public final List<j9.a> f27513i;

    /* renamed from: j, reason: collision with root package name */
    public final Activity f27514j;

    /* compiled from: LiveCricketAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements f<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.c0 f27515a;

        public a(RecyclerView.c0 c0Var) {
            this.f27515a = c0Var;
        }

        @Override // p3.f
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }

        @Override // p3.f
        public final void b() {
            ((d) this.f27515a).f27525i.setImageResource(R.drawable.leagueholder);
        }
    }

    /* compiled from: LiveCricketAdapter.java */
    /* renamed from: d9.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0359b implements f<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.c0 f27516a;

        public C0359b(RecyclerView.c0 c0Var) {
            this.f27516a = c0Var;
        }

        @Override // p3.f
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }

        @Override // p3.f
        public final void b() {
            ((d) this.f27516a).f27526j.setImageResource(R.drawable.leagueholder);
        }
    }

    /* compiled from: LiveCricketAdapter.java */
    /* loaded from: classes2.dex */
    public class c extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final g f27517b;

        public c(View view) {
            super(view);
            this.f27517b = g.a(view);
        }
    }

    /* compiled from: LiveCricketAdapter.java */
    /* loaded from: classes2.dex */
    public class d extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f27519b;

        /* renamed from: c, reason: collision with root package name */
        public final TextView f27520c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f27521d;

        /* renamed from: e, reason: collision with root package name */
        public final TextView f27522e;
        public final TextView f;

        /* renamed from: g, reason: collision with root package name */
        public final TextView f27523g;

        /* renamed from: h, reason: collision with root package name */
        public final TextView f27524h;

        /* renamed from: i, reason: collision with root package name */
        public final ImageView f27525i;

        /* renamed from: j, reason: collision with root package name */
        public final ImageView f27526j;

        public d(View view) {
            super(view);
            this.f27519b = (TextView) view.findViewById(R.id.info1);
            this.f27520c = (TextView) view.findViewById(R.id.cricketstatus);
            this.f27521d = (TextView) view.findViewById(R.id.cricketStidium);
            this.f27522e = (TextView) view.findViewById(R.id.cricket1name);
            this.f = (TextView) view.findViewById(R.id.cricket2name);
            this.f27523g = (TextView) view.findViewById(R.id.cricket1score);
            this.f27524h = (TextView) view.findViewById(R.id.cricket2score);
            this.f27525i = (ImageView) view.findViewById(R.id.cricket1Logo);
            this.f27526j = (ImageView) view.findViewById(R.id.cricket2Logo);
        }
    }

    public b(FragmentActivity fragmentActivity, ArrayList arrayList) {
        this.f27513i = arrayList;
        this.f27514j = fragmentActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        List<j9.a> list = this.f27513i;
        if (list.size() > 0) {
            return Math.round(list.size() / 3) + list.size();
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i10) {
        if ((i10 + 1) % 3 == 0) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.c0 c0Var, int i10) {
        if (c0Var.getItemViewType() == 0) {
            j9.a aVar = this.f27513i.get(i10 - Math.round(i10 / 3));
            d dVar = (d) c0Var;
            dVar.f27519b.setText(aVar.f30178a);
            dVar.f27520c.setText(aVar.f30179b);
            dVar.f27521d.setText(aVar.f30185i);
            dVar.f27522e.setText(aVar.f30182e);
            dVar.f.setText(aVar.f);
            dVar.f27523g.setText(aVar.f30183g);
            dVar.f27524h.setText(aVar.f30184h);
            Activity activity = this.f27514j;
            com.bumptech.glide.b.e(activity).k(aVar.f30180c).w(new a(c0Var)).u(dVar.f27525i);
            com.bumptech.glide.b.c(activity).b(activity).k(aVar.f30181d).w(new C0359b(c0Var)).u(dVar.f27526j);
            return;
        }
        if (c0Var.getItemViewType() == 1) {
            c cVar = (c) c0Var;
            Activity activity2 = b.this.f27514j;
            g gVar = cVar.f27517b;
            t8.a.j(activity2, (FrameLayout) gVar.f36545u, (j) gVar.f36547w, (ATNativeAdView) gVar.f36546v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new d(LayoutInflater.from(this.f27514j).inflate(R.layout.livecricketcard, viewGroup, false));
        }
        if (i10 == 1) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.native_list_ad_item, viewGroup, false));
        }
        return null;
    }
}
