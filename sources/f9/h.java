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
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.anythink.nativead.api.ATNativeAdView;
import com.hamkho.livefoot.Activities.FootballScores.AllScores.MatchDetails;
import com.hamkho.livefoot.R;
import f9.h;
import java.util.ArrayList;
import java.util.List;
import m9.j;

/* compiled from: TodayAllMatchesAdapter.java */
/* loaded from: classes2.dex */
public final class h extends RecyclerView.g<RecyclerView.c0> {

    /* renamed from: i, reason: collision with root package name */
    public final List<l9.e> f28203i;

    /* renamed from: j, reason: collision with root package name */
    public final Activity f28204j;

    /* compiled from: TodayAllMatchesAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements p3.f<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.c0 f28205a;

        public a(RecyclerView.c0 c0Var) {
            this.f28205a = c0Var;
        }

        @Override // p3.f
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }

        @Override // p3.f
        public final void b() {
            ((e) this.f28205a).f.setImageResource(R.drawable.teamlogoholder);
        }
    }

    /* compiled from: TodayAllMatchesAdapter.java */
    /* loaded from: classes2.dex */
    public class b implements p3.f<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.c0 f28206a;

        public b(RecyclerView.c0 c0Var) {
            this.f28206a = c0Var;
        }

        @Override // p3.f
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }

        @Override // p3.f
        public final void b() {
            ((e) this.f28206a).f28215g.setImageResource(R.drawable.teamlogoholder);
        }
    }

    /* compiled from: TodayAllMatchesAdapter.java */
    /* loaded from: classes2.dex */
    public class c implements h9.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f28207a;

        public c(int i10) {
            this.f28207a = i10;
        }

        @Override // h9.b
        public final void a() {
            h hVar = h.this;
            hVar.f28204j.startActivity(new Intent(hVar.f28204j, (Class<?>) MatchDetails.class).putExtra("MatchLink", hVar.f28203i.get(this.f28207a).f32563h));
        }
    }

    /* compiled from: TodayAllMatchesAdapter.java */
    /* loaded from: classes2.dex */
    public class d extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final y1.g f28209b;

        public d(View view) {
            super(view);
            this.f28209b = y1.g.a(view);
        }
    }

    /* compiled from: TodayAllMatchesAdapter.java */
    /* loaded from: classes2.dex */
    public class e extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f28211b;

        /* renamed from: c, reason: collision with root package name */
        public final TextView f28212c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f28213d;

        /* renamed from: e, reason: collision with root package name */
        public final TextView f28214e;
        public final ImageView f;

        /* renamed from: g, reason: collision with root package name */
        public final ImageView f28215g;

        public e(View view) {
            super(view);
            this.f28211b = (TextView) view.findViewById(R.id.Timing);
            this.f28212c = (TextView) view.findViewById(R.id.Team1Name);
            this.f28213d = (TextView) view.findViewById(R.id.Team2Name);
            this.f28214e = (TextView) view.findViewById(R.id.Score);
            this.f = (ImageView) view.findViewById(R.id.Team1Image);
            this.f28215g = (ImageView) view.findViewById(R.id.Team2Image);
        }
    }

    public h(FragmentActivity fragmentActivity, ArrayList arrayList) {
        this.f28203i = arrayList;
        this.f28204j = fragmentActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        List<l9.e> list = this.f28203i;
        if (list.size() > 0) {
            return Math.round(list.size() / 8) + list.size();
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i10) {
        if ((i10 + 1) % 8 == 0) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.c0 c0Var, int i10) {
        if (c0Var.getItemViewType() == 0) {
            final int round = i10 - Math.round(i10 / 8);
            List<l9.e> list = this.f28203i;
            boolean contains = list.get(round).f32561e.contains("https://");
            Activity activity = this.f28204j;
            if (contains) {
                com.bumptech.glide.b.e(activity).k(list.get(round).f32561e).h(R.drawable.teamlogoholder).w(new a(c0Var)).u(((e) c0Var).f);
            } else {
                ((e) c0Var).f.setImageResource(R.drawable.teamlogoholder);
            }
            if (list.get(round).f.contains("https://")) {
                com.bumptech.glide.b.e(activity).k(list.get(round).f).h(R.drawable.teamlogoholder).w(new b(c0Var)).u(((e) c0Var).f28215g);
            } else {
                ((e) c0Var).f28215g.setImageResource(R.drawable.teamlogoholder);
            }
            e eVar = (e) c0Var;
            eVar.f28212c.setText(list.get(round).f32557a);
            eVar.f28213d.setText(list.get(round).f32558b);
            boolean equals = list.get(round).f32559c.equals("");
            TextView textView = eVar.f28214e;
            if (!equals && !list.get(round).f32560d.equals("")) {
                textView.setText(String.format("( %s - %s )", list.get(round).f32559c, list.get(round).f32560d));
            } else {
                textView.setVisibility(8);
            }
            eVar.f28211b.setText(list.get(round).f32562g);
            eVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: f9.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h hVar = h.this;
                    hVar.getClass();
                    t8.a.g(hVar.f28204j, new h.c(round));
                }
            });
            return;
        }
        if (c0Var.getItemViewType() == 1) {
            d dVar = (d) c0Var;
            Activity activity2 = h.this.f28204j;
            y1.g gVar = dVar.f28209b;
            t8.a.j(activity2, (FrameLayout) gVar.f36545u, (j) gVar.f36547w, (ATNativeAdView) gVar.f36546v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new e(LayoutInflater.from(this.f28204j).inflate(R.layout.todaymatchescard, viewGroup, false));
        }
        if (i10 == 1) {
            return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.native_list_ad_item, viewGroup, false));
        }
        return null;
    }
}
