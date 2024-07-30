package e9;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.anythink.nativead.api.ATNativeAdView;
import com.hamkho.livefoot.Activities.SoccerLive.ChannelDetailActivity;
import com.hamkho.livefoot.Activities.SoccerLive.ChannelsListActivity;
import com.hamkho.livefoot.R;
import java.util.ArrayList;
import java.util.List;
import m9.j;
import y1.g;

/* compiled from: ChannelsAdapter.java */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.g<RecyclerView.c0> {

    /* renamed from: i, reason: collision with root package name */
    public final Activity f27859i;

    /* renamed from: j, reason: collision with root package name */
    public final List<k9.b> f27860j;

    /* compiled from: ChannelsAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ k9.b f27861s;

        /* compiled from: ChannelsAdapter.java */
        /* renamed from: e9.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0372a implements h9.b {
            public C0372a() {
            }

            @Override // h9.b
            public final void a() {
                a aVar = a.this;
                Intent intent = new Intent(c.this.f27859i, (Class<?>) ChannelDetailActivity.class);
                intent.putExtra("ChannelName", aVar.f27861s.f30901b);
                intent.putExtra("ChannelLogo", aVar.f27861s.f30902c);
                intent.putExtra("ChannelLink", aVar.f27861s.f30900a);
                intent.putExtra("ChannelDescription", aVar.f27861s.f30903d);
                intent.putExtra("Play_In", aVar.f27861s.f30904e);
                c.this.f27859i.startActivity(intent);
            }
        }

        public a(k9.b bVar) {
            this.f27861s = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            t8.a.g(c.this.f27859i, new C0372a());
        }
    }

    /* compiled from: ChannelsAdapter.java */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f27864b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f27865c;

        public b(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.ChannelName);
            this.f27864b = textView;
            this.f27865c = (ImageView) view.findViewById(R.id.ChannelImage);
            textView.setSelected(true);
        }
    }

    /* compiled from: ChannelsAdapter.java */
    /* renamed from: e9.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0373c extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final g f27866b;

        public C0373c(View view) {
            super(view);
            this.f27866b = g.a(view);
        }
    }

    public c(ChannelsListActivity channelsListActivity, ArrayList arrayList) {
        this.f27859i = channelsListActivity;
        this.f27860j = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        List<k9.b> list = this.f27860j;
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
            k9.b bVar = this.f27860j.get(i10 - Math.round(i10 / 3));
            b bVar2 = (b) c0Var;
            bVar2.f27864b.setText(bVar.f30901b);
            com.bumptech.glide.b.e(this.f27859i).k(bVar.f30902c).u(bVar2.f27865c);
            bVar2.itemView.setOnClickListener(new a(bVar));
            return;
        }
        if (c0Var.getItemViewType() == 1) {
            C0373c c0373c = (C0373c) c0Var;
            Activity activity = c.this.f27859i;
            g gVar = c0373c.f27866b;
            t8.a.j(activity, (FrameLayout) gVar.f36545u, (j) gVar.f36547w, (ATNativeAdView) gVar.f36546v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new b(LayoutInflater.from(this.f27859i).inflate(R.layout.channsitem, viewGroup, false));
        }
        if (i10 == 1) {
            return new C0373c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.native_list_ad_item, viewGroup, false));
        }
        return null;
    }
}
