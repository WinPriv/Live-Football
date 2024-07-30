package f9;

import a3.l;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.anythink.nativead.api.ATNativeAdView;
import com.hamkho.livefoot.Activities.FootballScores.AllScores.MatchDetails;
import com.hamkho.livefoot.R;
import java.util.ArrayList;
import java.util.List;
import m9.j;

/* compiled from: DetailsScoresAdapter.java */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.g<RecyclerView.c0> {

    /* renamed from: i, reason: collision with root package name */
    public final List<l9.b> f28177i;

    /* renamed from: j, reason: collision with root package name */
    public final Activity f28178j;

    /* compiled from: DetailsScoresAdapter.java */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final y1.g f28179b;

        public a(View view) {
            super(view);
            this.f28179b = y1.g.a(view);
        }
    }

    /* compiled from: DetailsScoresAdapter.java */
    /* renamed from: f9.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0382b extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f28181b;

        /* renamed from: c, reason: collision with root package name */
        public final TextView f28182c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f28183d;

        public C0382b(View view) {
            super(view);
            this.f28181b = (TextView) view.findViewById(R.id.Time);
            this.f28182c = (TextView) view.findViewById(R.id.T2Text);
            this.f28183d = (ImageView) view.findViewById(R.id.T2Card);
        }
    }

    public b(MatchDetails matchDetails, ArrayList arrayList) {
        this.f28177i = arrayList;
        this.f28178j = matchDetails;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        List<l9.b> list = this.f28177i;
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
            C0382b c0382b = (C0382b) c0Var;
            StringBuilder sb2 = new StringBuilder();
            List<l9.b> list = this.f28177i;
            c0382b.f28181b.setText(l.p(sb2, list.get(round).f32549a, "'"));
            c0382b.f28182c.setText(list.get(round).f32551c);
            boolean equals = list.get(round).f32550b.equals("yellow");
            Activity activity = this.f28178j;
            ImageView imageView = c0382b.f28183d;
            if (equals) {
                com.bumptech.glide.b.e(activity).j(Integer.valueOf(R.drawable.yellowcard)).u(imageView);
                return;
            }
            if (list.get(round).f32550b.equals("red")) {
                com.bumptech.glide.b.e(activity).j(Integer.valueOf(R.drawable.redcard)).u(imageView);
                return;
            }
            if (list.get(round).f32550b.equals("yellowred")) {
                com.bumptech.glide.b.e(activity).j(Integer.valueOf(R.drawable.yellowredcard)).u(imageView);
                return;
            }
            if (list.get(round).f32550b.equals("change")) {
                com.bumptech.glide.b.e(activity).j(Integer.valueOf(R.drawable.change)).u(imageView);
                return;
            } else if (list.get(round).f32550b.equals("goal")) {
                com.bumptech.glide.b.e(activity).j(Integer.valueOf(R.drawable.goal)).u(imageView);
                return;
            } else {
                imageView.setVisibility(4);
                return;
            }
        }
        if (c0Var.getItemViewType() == 1) {
            a aVar = (a) c0Var;
            Activity activity2 = b.this.f28178j;
            y1.g gVar = aVar.f28179b;
            t8.a.j(activity2, (FrameLayout) gVar.f36545u, (j) gVar.f36547w, (ATNativeAdView) gVar.f36546v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new C0382b(LayoutInflater.from(this.f28178j).inflate(R.layout.detailsitem, viewGroup, false));
        }
        if (i10 == 1) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.native_list_ad_item, viewGroup, false));
        }
        return null;
    }
}
