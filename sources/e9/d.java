package e9;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.anythink.nativead.api.ATNativeAdView;
import com.hamkho.livefoot.Activities.SoccerLive.EventDetailActivity;
import com.hamkho.livefoot.R;
import java.util.ArrayList;
import java.util.List;
import m9.j;
import y1.g;

/* compiled from: EventssAdapter.java */
/* loaded from: classes2.dex */
public final class d extends RecyclerView.g<RecyclerView.c0> {

    /* renamed from: i, reason: collision with root package name */
    public final Activity f27868i;

    /* renamed from: j, reason: collision with root package name */
    public final List<k9.c> f27869j;

    /* compiled from: EventssAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ k9.c f27870s;

        /* compiled from: EventssAdapter.java */
        /* renamed from: e9.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0374a implements h9.b {
            public C0374a() {
            }

            @Override // h9.b
            public final void a() {
                a aVar = a.this;
                Intent intent = new Intent(d.this.f27868i, (Class<?>) EventDetailActivity.class);
                intent.putExtra("Team1Logo", aVar.f27870s.f30906b);
                intent.putExtra("Team2Logo", aVar.f27870s.f);
                intent.putExtra("Team1Name", aVar.f27870s.f30907c);
                intent.putExtra("Team2Name", aVar.f27870s.f30910g);
                intent.putExtra("EventDescription", aVar.f27870s.f30911h);
                intent.putExtra("EventLink", aVar.f27870s.f30905a);
                intent.putExtra("Play_In", aVar.f27870s.f30909e);
                d.this.f27868i.startActivity(intent);
            }
        }

        public a(k9.c cVar) {
            this.f27870s = cVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            t8.a.g(d.this.f27868i, new C0374a());
        }
    }

    /* compiled from: EventssAdapter.java */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f27873b;

        /* renamed from: c, reason: collision with root package name */
        public final TextView f27874c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f27875d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f27876e;
        public final ImageView f;

        public b(View view) {
            super(view);
            this.f27873b = (TextView) view.findViewById(R.id.Team1Name);
            this.f27874c = (TextView) view.findViewById(R.id.Team2Name);
            this.f27875d = (TextView) view.findViewById(R.id.MatchTime);
            this.f27876e = (ImageView) view.findViewById(R.id.Team1Logo);
            this.f = (ImageView) view.findViewById(R.id.Team2Logo);
        }
    }

    /* compiled from: EventssAdapter.java */
    /* loaded from: classes2.dex */
    public class c extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final g f27877b;

        public c(View view) {
            super(view);
            this.f27877b = g.a(view);
        }
    }

    public d(FragmentActivity fragmentActivity, ArrayList arrayList) {
        this.f27868i = fragmentActivity;
        this.f27869j = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        List<k9.c> list = this.f27869j;
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
            k9.c cVar = this.f27869j.get(i10 - Math.round(i10 / 3));
            b bVar = (b) c0Var;
            bVar.f27873b.setText(cVar.f30907c);
            bVar.f27874c.setText(cVar.f30910g);
            bVar.f27875d.setText(cVar.f30908d);
            Activity activity = this.f27868i;
            com.bumptech.glide.b.e(activity).k(cVar.f30906b).u(bVar.f27876e);
            com.bumptech.glide.b.c(activity).b(activity).k(cVar.f).u(bVar.f);
            c0Var.itemView.setOnClickListener(new a(cVar));
            return;
        }
        if (c0Var.getItemViewType() == 1) {
            c cVar2 = (c) c0Var;
            Activity activity2 = d.this.f27868i;
            g gVar = cVar2.f27877b;
            t8.a.j(activity2, (FrameLayout) gVar.f36545u, (j) gVar.f36547w, (ATNativeAdView) gVar.f36546v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new b(LayoutInflater.from(this.f27868i).inflate(R.layout.eventsitem, viewGroup, false));
        }
        if (i10 == 1) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.native_list_ad_item, viewGroup, false));
        }
        return null;
    }
}
