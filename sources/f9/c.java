package f9;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.anythink.nativead.api.ATNativeAdView;
import com.bumptech.glide.n;
import com.bumptech.glide.o;
import com.hamkho.livefoot.Activities.FootballScores.AllLeagues.LeagueDetails;
import com.hamkho.livefoot.Activities.FootballScores.AllLeagues.LeaguesListActivity;
import com.hamkho.livefoot.R;
import java.util.ArrayList;
import java.util.List;
import m9.j;

/* compiled from: LeagueScoresAdapter.java */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.g<RecyclerView.c0> {

    /* renamed from: i, reason: collision with root package name */
    public final List<l9.c> f28184i;

    /* renamed from: j, reason: collision with root package name */
    public final Activity f28185j;

    /* compiled from: LeagueScoresAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements p3.f<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.c0 f28186a;

        public a(RecyclerView.c0 c0Var) {
            this.f28186a = c0Var;
        }

        @Override // p3.f
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }

        @Override // p3.f
        public final void b() {
            ((d) this.f28186a).f28193c.setImageResource(R.drawable.leagueholder);
        }
    }

    /* compiled from: LeagueScoresAdapter.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f28187s;

        /* compiled from: LeagueScoresAdapter.java */
        /* loaded from: classes2.dex */
        public class a implements h9.b {
            public a() {
            }

            @Override // h9.b
            public final void a() {
                b bVar = b.this;
                c.this.f28185j.startActivity(new Intent(c.this.f28185j, (Class<?>) LeagueDetails.class).putExtra("llink", c.this.f28184i.get(bVar.f28187s).f32554c));
            }
        }

        public b(int i10) {
            this.f28187s = i10;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            t8.a.g(c.this.f28185j, new a());
        }
    }

    /* compiled from: LeagueScoresAdapter.java */
    /* renamed from: f9.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0383c extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final y1.g f28190b;

        public C0383c(View view) {
            super(view);
            this.f28190b = y1.g.a(view);
        }
    }

    /* compiled from: LeagueScoresAdapter.java */
    /* loaded from: classes2.dex */
    public class d extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f28192b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f28193c;

        public d(View view) {
            super(view);
            this.f28192b = (TextView) view.findViewById(R.id.LeagueName);
            this.f28193c = (ImageView) view.findViewById(R.id.LeagueImage);
        }
    }

    public c(LeaguesListActivity leaguesListActivity, ArrayList arrayList) {
        this.f28184i = arrayList;
        this.f28185j = leaguesListActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        List<l9.c> list = this.f28184i;
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
            int round = i10 - Math.round(i10 / 3);
            o e10 = com.bumptech.glide.b.e(this.f28185j);
            List<l9.c> list = this.f28184i;
            n w10 = e10.k(list.get(round).f32553b).h(R.drawable.leagueholder).w(new a(c0Var));
            d dVar = (d) c0Var;
            w10.u(dVar.f28193c);
            dVar.f28192b.setText(list.get(round).f32552a);
            dVar.itemView.setOnClickListener(new b(round));
            return;
        }
        if (c0Var.getItemViewType() == 1) {
            C0383c c0383c = (C0383c) c0Var;
            Activity activity = c.this.f28185j;
            y1.g gVar = c0383c.f28190b;
            t8.a.j(activity, (FrameLayout) gVar.f36545u, (j) gVar.f36547w, (ATNativeAdView) gVar.f36546v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new d(LayoutInflater.from(this.f28185j).inflate(R.layout.leaguesoreitem, viewGroup, false));
        }
        if (i10 == 1) {
            return new C0383c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.native_list_ad_item, viewGroup, false));
        }
        return null;
    }
}
