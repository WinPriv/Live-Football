package cb;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.huawei.openalliance.ad.ppskit.views.viewpager.PPSGalleryView;

/* loaded from: classes2.dex */
public final class b extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final PPSGalleryView f3477a;

    public b(PPSGalleryView pPSGalleryView) {
        this.f3477a = pPSGalleryView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.a() > 1) goto L8;
     */
    @Override // android.view.View.AccessibilityDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityEvent(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            super.onInitializeAccessibilityEvent(r3, r4)
            java.lang.Class<com.huawei.openalliance.ad.ppskit.views.viewpager.PPSGalleryView> r3 = com.huawei.openalliance.ad.ppskit.views.viewpager.PPSGalleryView.class
            java.lang.String r3 = r3.getName()
            r4.setClassName(r3)
            com.huawei.openalliance.ad.ppskit.views.viewpager.PPSGalleryView r3 = r2.f3477a
            cb.e r0 = r3.C
            if (r0 == 0) goto L1a
            int r0 = r0.a()
            r1 = 1
            if (r0 <= r1) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r4.setScrollable(r1)
            int r0 = r4.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto L3b
            cb.e r0 = r3.C
            if (r0 == 0) goto L3b
            int r0 = r0.a()
            r4.setItemCount(r0)
            int r0 = r3.f23571u
            r4.setFromIndex(r0)
            int r3 = r3.f23571u
            r4.setToIndex(r3)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.b.onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(PPSGalleryView.class.getName());
        PPSGalleryView pPSGalleryView = this.f3477a;
        e eVar = pPSGalleryView.C;
        if (eVar != null && eVar.a() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setScrollable(z10);
        if (pPSGalleryView.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
        }
        if (pPSGalleryView.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        int i11;
        if (super.performAccessibilityAction(view, i10, bundle)) {
            return true;
        }
        PPSGalleryView pPSGalleryView = this.f3477a;
        if (i10 != 4096) {
            if (i10 != 8192 || !pPSGalleryView.canScrollHorizontally(-1)) {
                return false;
            }
            i11 = pPSGalleryView.f23571u - 1;
        } else {
            if (!pPSGalleryView.canScrollHorizontally(1)) {
                return false;
            }
            i11 = pPSGalleryView.f23571u + 1;
        }
        pPSGalleryView.setCurrentItem(i11);
        return true;
    }
}
