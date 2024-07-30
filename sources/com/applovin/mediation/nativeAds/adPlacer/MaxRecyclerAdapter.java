package com.applovin.mediation.nativeAds.adPlacer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.applovin.impl.mediation.nativeAds.a.c;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* loaded from: classes.dex */
public class MaxRecyclerAdapter extends RecyclerView.g<RecyclerView.c0> implements MaxAdPlacer.Listener {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdPlacer f19676a;

    /* renamed from: b, reason: collision with root package name */
    private final RecyclerView.g f19677b;

    /* renamed from: c, reason: collision with root package name */
    private final a f19678c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f19679d;

    /* renamed from: e, reason: collision with root package name */
    private c f19680e;
    private MaxAdPlacer.Listener f;

    /* renamed from: g, reason: collision with root package name */
    private int f19681g;

    /* renamed from: h, reason: collision with root package name */
    private AdPositionBehavior f19682h;

    /* loaded from: classes.dex */
    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    /* loaded from: classes.dex */
    public static class MaxAdRecyclerViewHolder extends RecyclerView.c0 {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f19685a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f19685a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f19685a;
        }
    }

    /* loaded from: classes.dex */
    public class a extends RecyclerView.i {
        private a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        @SuppressLint({"NotifyDataSetChanged"})
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i10, int i11) {
            int adjustedPosition = MaxRecyclerAdapter.this.f19676a.getAdjustedPosition(i10);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f19676a.getAdjustedPosition((i10 + i11) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        @SuppressLint({"NotifyDataSetChanged"})
        public void onItemRangeInserted(int i10, int i11) {
            boolean z10;
            if (i10 + i11 >= MaxRecyclerAdapter.this.f19677b.getItemCount()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (MaxRecyclerAdapter.this.f19682h != AdPositionBehavior.FIXED && (MaxRecyclerAdapter.this.f19682h != AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND || !z10)) {
                int adjustedPosition = MaxRecyclerAdapter.this.f19676a.getAdjustedPosition(i10);
                for (int i12 = 0; i12 < i11; i12++) {
                    MaxRecyclerAdapter.this.f19676a.insertItem(adjustedPosition);
                }
                MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i11);
                return;
            }
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        @SuppressLint({"NotifyDataSetChanged"})
        public void onItemRangeMoved(int i10, int i11, int i12) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        @SuppressLint({"NotifyDataSetChanged"})
        public void onItemRangeRemoved(int i10, int i11) {
            boolean z10;
            int itemCount = MaxRecyclerAdapter.this.f19677b.getItemCount();
            if (i10 + i11 >= itemCount) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (MaxRecyclerAdapter.this.f19682h != AdPositionBehavior.FIXED && (MaxRecyclerAdapter.this.f19682h != AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND || !z10)) {
                int adjustedPosition = MaxRecyclerAdapter.this.f19676a.getAdjustedPosition(i10);
                int adjustedCount = MaxRecyclerAdapter.this.f19676a.getAdjustedCount(itemCount + i11);
                for (int i12 = 0; i12 < i11; i12++) {
                    MaxRecyclerAdapter.this.f19676a.removeItem(adjustedPosition);
                }
                int adjustedCount2 = MaxRecyclerAdapter.this.f19676a.getAdjustedCount(itemCount);
                int i13 = adjustedCount - adjustedCount2;
                Collection<Integer> clearTrailingAds = MaxRecyclerAdapter.this.f19676a.clearTrailingAds(adjustedCount2 - 1);
                if (!clearTrailingAds.isEmpty()) {
                    i13 += clearTrailingAds.size();
                }
                MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (i13 - i11), i13);
                return;
            }
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.g gVar, Activity activity) {
        a aVar = new a();
        this.f19678c = aVar;
        this.f19681g = 8;
        this.f19682h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f19676a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(gVar.hasStableIds());
        this.f19677b = gVar;
        gVar.registerAdapterDataObserver(aVar);
    }

    public void destroy() {
        try {
            this.f19677b.unregisterAdapterDataObserver(this.f19678c);
        } catch (Exception unused) {
        }
        this.f19676a.destroy();
        c cVar = this.f19680e;
        if (cVar != null) {
            cVar.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f19676a;
    }

    public int getAdjustedPosition(int i10) {
        return this.f19676a.getAdjustedPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return this.f19676a.getAdjustedCount(this.f19677b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long getItemId(int i10) {
        if (!this.f19677b.hasStableIds()) {
            return -1L;
        }
        if (this.f19676a.isFilledPosition(i10)) {
            return this.f19676a.getAdItemId(i10);
        }
        return this.f19677b.getItemId(this.f19676a.getOriginalPosition(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int i10) {
        if (this.f19676a.isAdPosition(i10)) {
            return -42;
        }
        return this.f19677b.getItemViewType(this.f19676a.getOriginalPosition(i10));
    }

    public int getOriginalPosition(int i10) {
        return this.f19676a.getOriginalPosition(i10);
    }

    public void loadAds() {
        this.f19676a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i10) {
        notifyItemChanged(i10);
        MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdLoaded(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i10) {
        MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdRemoved(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f19679d = recyclerView;
        c cVar = new c(recyclerView);
        this.f19680e = cVar;
        cVar.a(new c.a() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.1
            @Override // com.applovin.impl.mediation.nativeAds.a.c.a
            public void a(int i10, int i11) {
                MaxRecyclerAdapter.this.f19676a.updateFillablePositions(i10, Math.min(MaxRecyclerAdapter.this.f19681g + i11, MaxRecyclerAdapter.this.getItemCount() - 1));
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(RecyclerView.c0 c0Var, int i10) {
        int dpToPx;
        int dpToPx2;
        this.f19680e.a(c0Var.itemView, i10);
        if (this.f19676a.isAdPosition(i10)) {
            AppLovinSdkUtils.Size adSize = this.f19676a.getAdSize(i10, a(i10));
            ViewGroup containerView = ((MaxAdRecyclerViewHolder) c0Var).getContainerView();
            ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
            if (adSize != AppLovinSdkUtils.Size.ZERO) {
                if (adSize.getWidth() < 0) {
                    dpToPx = adSize.getWidth();
                } else {
                    dpToPx = AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
                }
                layoutParams.width = dpToPx;
                if (adSize.getHeight() < 0) {
                    dpToPx2 = adSize.getHeight();
                } else {
                    dpToPx2 = AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
                }
                layoutParams.height = dpToPx2;
                containerView.setLayoutParams(layoutParams);
                this.f19676a.renderAd(i10, containerView);
                return;
            }
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
            return;
        }
        this.f19677b.onBindViewHolder(c0Var, this.f19676a.getOriginalPosition(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == -42) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            RecyclerView.o layoutManager = this.f19679d.getLayoutManager();
            if (layoutManager != null && layoutManager.d()) {
                layoutParams.width = -2;
                layoutParams.height = -1;
            } else {
                layoutParams.width = -1;
                layoutParams.height = -2;
            }
            inflate.setLayoutParams(layoutParams);
            return new MaxAdRecyclerViewHolder(inflate);
        }
        return this.f19677b.onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f19679d = null;
        c cVar = this.f19680e;
        if (cVar != null) {
            cVar.a();
            this.f19680e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public boolean onFailedToRecycleView(RecyclerView.c0 c0Var) {
        if (c0Var instanceof MaxAdRecyclerViewHolder) {
            return super.onFailedToRecycleView(c0Var);
        }
        return this.f19677b.onFailedToRecycleView(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(RecyclerView.c0 c0Var) {
        if (c0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(c0Var);
        } else {
            this.f19677b.onViewAttachedToWindow(c0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(RecyclerView.c0 c0Var) {
        if (c0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(c0Var);
        } else {
            this.f19677b.onViewDetachedFromWindow(c0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewRecycled(RecyclerView.c0 c0Var) {
        c cVar = this.f19680e;
        if (cVar != null) {
            cVar.a(c0Var.itemView);
        }
        if (c0Var instanceof MaxAdRecyclerViewHolder) {
            if (this.f19676a.isFilledPosition(c0Var.getBindingAdapterPosition())) {
                ((MaxAdRecyclerViewHolder) c0Var).getContainerView().removeAllViews();
            }
            super.onViewRecycled(c0Var);
            return;
        }
        this.f19677b.onViewRecycled(c0Var);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f19682h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void setHasStableIds(boolean z10) {
        super.setHasStableIds(z10);
        this.f19677b.unregisterAdapterDataObserver(this.f19678c);
        this.f19677b.setHasStableIds(z10);
        this.f19677b.registerAdapterDataObserver(this.f19678c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f = listener;
    }

    public void setLookAhead(int i10) {
        this.f19681g = i10;
    }

    private int a(int i10) {
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f19679d.getContext(), this.f19679d.getWidth());
        RecyclerView.o layoutManager = this.f19679d.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            return layoutManager instanceof StaggeredGridLayoutManager ? pxToDp / ((StaggeredGridLayoutManager) layoutManager).f2214p : pxToDp;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        return (pxToDp / gridLayoutManager.F) * gridLayoutManager.K.c(i10);
    }
}
