package f9;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
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
import com.bumptech.glide.n;
import com.bumptech.glide.o;
import com.hamkho.livefoot.Activities.FootballScores.AllLeagues.LeaguesListActivity;
import com.hamkho.livefoot.R;
import java.util.ArrayList;
import java.util.List;
import m9.j;

/* compiled from: CountryScoresAdapter.java */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.g<RecyclerView.c0> {

    /* renamed from: i, reason: collision with root package name */
    public final List<l9.a> f28167i;

    /* renamed from: j, reason: collision with root package name */
    public final Activity f28168j;

    /* compiled from: CountryScoresAdapter.java */
    /* renamed from: f9.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0380a implements p3.f<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.c0 f28169a;

        public C0380a(RecyclerView.c0 c0Var) {
            this.f28169a = c0Var;
        }

        @Override // p3.f
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }

        @Override // p3.f
        public final void b() {
            ((d) this.f28169a).f28176c.setImageResource(R.drawable.goal);
        }
    }

    /* compiled from: CountryScoresAdapter.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f28170s;

        /* compiled from: CountryScoresAdapter.java */
        /* renamed from: f9.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0381a implements h9.b {
            public C0381a() {
            }

            @Override // h9.b
            public final void a() {
                b bVar = b.this;
                a.this.f28168j.startActivity(new Intent(a.this.f28168j, (Class<?>) LeaguesListActivity.class).putExtra("countryName", a.this.f28167i.get(bVar.f28170s).f32546a).putExtra("matchLink", a.this.f28167i.get(bVar.f28170s).f32548c));
            }
        }

        public b(int i10) {
            this.f28170s = i10;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            t8.a.g(a.this.f28168j, new C0381a());
        }
    }

    /* compiled from: CountryScoresAdapter.java */
    /* loaded from: classes2.dex */
    public class c extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final y1.g f28173b;

        public c(View view) {
            super(view);
            this.f28173b = y1.g.a(view);
        }
    }

    /* compiled from: CountryScoresAdapter.java */
    /* loaded from: classes2.dex */
    public class d extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f28175b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f28176c;

        public d(View view) {
            super(view);
            this.f28175b = (TextView) view.findViewById(R.id.CountryName);
            this.f28176c = (ImageView) view.findViewById(R.id.CountryImage);
        }
    }

    public a(FragmentActivity fragmentActivity, ArrayList arrayList) {
        this.f28167i = arrayList;
        this.f28168j = fragmentActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        List<l9.a> list = this.f28167i;
        if (list.size() > 0) {
            return Math.round(list.size() / 7) + list.size();
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i10) {
        if ((i10 + 1) % 7 == 0) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.c0 c0Var, @SuppressLint({"RecyclerView"}) int i10) {
        if (c0Var.getItemViewType() == 0) {
            int round = i10 - Math.round(i10 / 7);
            o e10 = com.bumptech.glide.b.e(this.f28168j);
            List<l9.a> list = this.f28167i;
            n w10 = e10.k(list.get(round).f32547b).h(R.drawable.teamlogoholder).w(new C0380a(c0Var));
            d dVar = (d) c0Var;
            w10.u(dVar.f28176c);
            dVar.f28175b.setText(list.get(round).f32546a);
            dVar.itemView.setOnClickListener(new b(round));
            return;
        }
        if (c0Var.getItemViewType() == 1) {
            c cVar = (c) c0Var;
            Activity activity = a.this.f28168j;
            y1.g gVar = cVar.f28173b;
            t8.a.j(activity, (FrameLayout) gVar.f36545u, (j) gVar.f36547w, (ATNativeAdView) gVar.f36546v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new d(LayoutInflater.from(this.f28168j).inflate(R.layout.countriesscores, viewGroup, false));
        }
        if (i10 == 1) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.native_list_ad_item, viewGroup, false));
        }
        return null;
    }
}
