package o0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.anythink.expressad.exoplayer.h.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0.k;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static int f33520d;

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f33521a;

    /* renamed from: b, reason: collision with root package name */
    public int f33522b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f33523c = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f33524e;
        public static final a f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f33525g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f33526h;

        /* renamed from: i, reason: collision with root package name */
        public static final a f33527i;

        /* renamed from: j, reason: collision with root package name */
        public static final a f33528j;

        /* renamed from: k, reason: collision with root package name */
        public static final a f33529k;

        /* renamed from: l, reason: collision with root package name */
        public static final a f33530l;

        /* renamed from: a, reason: collision with root package name */
        public final Object f33531a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33532b;

        /* renamed from: c, reason: collision with root package name */
        public final Class<? extends k.a> f33533c;

        /* renamed from: d, reason: collision with root package name */
        public final k f33534d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            new a(1);
            new a(2);
            new a(4);
            new a(8);
            f33524e = new a(16);
            new a(32);
            new a(64);
            new a(128);
            new a(256, k.b.class);
            new a(512, k.b.class);
            new a(1024, k.c.class);
            new a(2048, k.c.class);
            f = new a(4096);
            f33525g = new a(8192);
            new a(16384);
            new a(32768);
            new a(com.anythink.expressad.exoplayer.b.aX);
            new a(131072, k.g.class);
            f33526h = new a(262144);
            f33527i = new a(524288);
            f33528j = new a(o.f8460d);
            new a(2097152, k.h.class);
            int i10 = Build.VERSION.SDK_INT;
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, k.e.class);
            f33529k = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f33530l = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18 = null;
            if (i10 >= 29) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            } else {
                accessibilityAction = null;
            }
            new a(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
            if (i10 >= 29) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction17;
            } else {
                accessibilityAction2 = null;
            }
            new a(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
            if (i10 >= 29) {
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                accessibilityAction3 = null;
            }
            new a(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
            if (i10 >= 29) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction16;
            } else {
                accessibilityAction4 = null;
            }
            new a(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, k.f.class);
            if (i10 >= 26) {
                accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                accessibilityAction5 = null;
            }
            new a(accessibilityAction5, R.id.accessibilityActionMoveWindow, null, null, k.d.class);
            if (i10 >= 28) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction6 = accessibilityAction15;
            } else {
                accessibilityAction6 = null;
            }
            new a(accessibilityAction6, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i10 >= 28) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction7 = accessibilityAction14;
            } else {
                accessibilityAction7 = null;
            }
            new a(accessibilityAction7, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i10 >= 30) {
                accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            } else {
                accessibilityAction8 = null;
            }
            new a(accessibilityAction8, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i10 >= 30) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction9 = accessibilityAction13;
            } else {
                accessibilityAction9 = null;
            }
            new a(accessibilityAction9, R.id.accessibilityActionImeEnter, null, null, null);
            if (i10 >= 32) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            } else {
                accessibilityAction10 = null;
            }
            new a(accessibilityAction10, R.id.ALT, null, null, null);
            if (i10 >= 32) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            } else {
                accessibilityAction11 = null;
            }
            new a(accessibilityAction11, R.id.CTRL, null, null, null);
            if (i10 >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            } else {
                accessibilityAction12 = null;
            }
            new a(accessibilityAction12, R.id.FUNCTION, null, null, null);
            if (i10 >= 33) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            new a(accessibilityAction18, R.id.KEYCODE_0, null, null, null);
        }

        public a(int i10) {
            this(null, i10, null, null, null);
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f33531a).getId();
        }

        public final CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f33531a).getLabel();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = ((a) obj).f33531a;
            Object obj3 = this.f33531a;
            if (obj3 == null) {
                if (obj2 != null) {
                    return false;
                }
                return true;
            }
            if (!obj3.equals(obj2)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            Object obj = this.f33531a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i10, Class cls) {
            this(null, i10, null, null, cls);
        }

        public a(Object obj, int i10, String str, k kVar, Class cls) {
            this.f33532b = i10;
            this.f33534d = kVar;
            if (obj == null) {
                this.f33531a = new AccessibilityNodeInfo.AccessibilityAction(i10, str);
            } else {
                this.f33531a = obj;
            }
            this.f33533c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f33535a;

        public b(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f33535a = collectionInfo;
        }

        public static b a(int i10, int i11, int i12) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, false, i12));
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f33536a;

        public c(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f33536a = collectionItemInfo;
        }

        public static c a(int i10, int i11, int i12, int i13, boolean z10) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, false, z10));
        }
    }

    public g(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f33521a = accessibilityNodeInfo;
    }

    public final void a(int i10) {
        this.f33521a.addAction(i10);
    }

    public final void b(a aVar) {
        this.f33521a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f33531a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33521a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    @Deprecated
    public final void d(Rect rect) {
        this.f33521a.getBoundsInParent(rect);
    }

    public final CharSequence e() {
        boolean z10 = !c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33521a;
        if (z10) {
            ArrayList c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList c13 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i10 = 0; i10 < c10.size(); i10++) {
                spannableString.setSpan(new o0.a(((Integer) c13.get(i10)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c10.get(i10)).intValue(), ((Integer) c11.get(i10)).intValue(), ((Integer) c12.get(i10)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f33521a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f33521a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        if (this.f33523c == gVar.f33523c && this.f33522b == gVar.f33522b) {
            return true;
        }
        return false;
    }

    public final void f(int i10, boolean z10) {
        Bundle extras = this.f33521a.getExtras();
        if (extras != null) {
            int i11 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public final void g(c cVar) {
        this.f33521a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) cVar.f33536a);
    }

    public final void h(String str) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33521a;
        if (i10 >= 26) {
            n0.k.k(accessibilityNodeInfo, str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33521a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(boolean z10) {
        this.f33521a.setScrollable(z10);
    }

    public final void j(CharSequence charSequence) {
        this.f33521a.setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public final String toString() {
        String string;
        ?? emptyList;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        d(rect);
        sb2.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33521a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(accessibilityNodeInfo.getPackageName());
        sb2.append("; className: ");
        sb2.append(accessibilityNodeInfo.getClassName());
        sb2.append("; text: ");
        sb2.append(e());
        sb2.append("; contentDescription: ");
        sb2.append(accessibilityNodeInfo.getContentDescription());
        sb2.append("; viewId: ");
        sb2.append(accessibilityNodeInfo.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        if (j0.a.c()) {
            string = accessibilityNodeInfo.getUniqueId();
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb2.append(string);
        sb2.append("; checkable: ");
        sb2.append(accessibilityNodeInfo.isCheckable());
        sb2.append("; checked: ");
        sb2.append(accessibilityNodeInfo.isChecked());
        sb2.append("; focusable: ");
        sb2.append(accessibilityNodeInfo.isFocusable());
        sb2.append("; focused: ");
        sb2.append(accessibilityNodeInfo.isFocused());
        sb2.append("; selected: ");
        sb2.append(accessibilityNodeInfo.isSelected());
        sb2.append("; clickable: ");
        sb2.append(accessibilityNodeInfo.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(accessibilityNodeInfo.isLongClickable());
        sb2.append("; enabled: ");
        sb2.append(accessibilityNodeInfo.isEnabled());
        sb2.append("; password: ");
        sb2.append(accessibilityNodeInfo.isPassword());
        sb2.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                emptyList.add(new a(actionList.get(i10), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i11 = 0; i11 < emptyList.size(); i11++) {
            a aVar = (a) emptyList.get(i11);
            int a10 = aVar.a();
            if (a10 != 1) {
                if (a10 != 2) {
                    switch (a10) {
                        case 4:
                            str = "ACTION_SELECT";
                            break;
                        case 8:
                            str = "ACTION_CLEAR_SELECTION";
                            break;
                        case 16:
                            str = "ACTION_CLICK";
                            break;
                        case 32:
                            str = "ACTION_LONG_CLICK";
                            break;
                        case 64:
                            str = "ACTION_ACCESSIBILITY_FOCUS";
                            break;
                        case 128:
                            str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                            break;
                        case 256:
                            str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                            break;
                        case 512:
                            str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                            break;
                        case 1024:
                            str = "ACTION_NEXT_HTML_ELEMENT";
                            break;
                        case 2048:
                            str = "ACTION_PREVIOUS_HTML_ELEMENT";
                            break;
                        case 4096:
                            str = "ACTION_SCROLL_FORWARD";
                            break;
                        case 8192:
                            str = "ACTION_SCROLL_BACKWARD";
                            break;
                        case 16384:
                            str = "ACTION_COPY";
                            break;
                        case 32768:
                            str = "ACTION_PASTE";
                            break;
                        case com.anythink.expressad.exoplayer.b.aX /* 65536 */:
                            str = "ACTION_CUT";
                            break;
                        case 131072:
                            str = "ACTION_SET_SELECTION";
                            break;
                        case 262144:
                            str = "ACTION_EXPAND";
                            break;
                        case 524288:
                            str = "ACTION_COLLAPSE";
                            break;
                        case 2097152:
                            str = "ACTION_SET_TEXT";
                            break;
                        case R.id.accessibilityActionMoveWindow:
                            str = "ACTION_MOVE_WINDOW";
                            break;
                        default:
                            switch (a10) {
                                case R.id.accessibilityActionShowOnScreen:
                                    str = "ACTION_SHOW_ON_SCREEN";
                                    break;
                                case R.id.accessibilityActionScrollToPosition:
                                    str = "ACTION_SCROLL_TO_POSITION";
                                    break;
                                case R.id.accessibilityActionScrollUp:
                                    str = "ACTION_SCROLL_UP";
                                    break;
                                case R.id.accessibilityActionScrollLeft:
                                    str = "ACTION_SCROLL_LEFT";
                                    break;
                                case R.id.accessibilityActionScrollDown:
                                    str = "ACTION_SCROLL_DOWN";
                                    break;
                                case R.id.accessibilityActionScrollRight:
                                    str = "ACTION_SCROLL_RIGHT";
                                    break;
                                case R.id.accessibilityActionContextClick:
                                    str = "ACTION_CONTEXT_CLICK";
                                    break;
                                case R.id.accessibilityActionSetProgress:
                                    str = "ACTION_SET_PROGRESS";
                                    break;
                                default:
                                    switch (a10) {
                                        case R.id.accessibilityActionShowTooltip:
                                            str = "ACTION_SHOW_TOOLTIP";
                                            break;
                                        case R.id.accessibilityActionHideTooltip:
                                            str = "ACTION_HIDE_TOOLTIP";
                                            break;
                                        case R.id.accessibilityActionPageUp:
                                            str = "ACTION_PAGE_UP";
                                            break;
                                        case R.id.accessibilityActionPageDown:
                                            str = "ACTION_PAGE_DOWN";
                                            break;
                                        case R.id.accessibilityActionPageLeft:
                                            str = "ACTION_PAGE_LEFT";
                                            break;
                                        case R.id.accessibilityActionPageRight:
                                            str = "ACTION_PAGE_RIGHT";
                                            break;
                                        case R.id.accessibilityActionPressAndHold:
                                            str = "ACTION_PRESS_AND_HOLD";
                                            break;
                                        default:
                                            switch (a10) {
                                                case R.id.accessibilityActionImeEnter:
                                                    str = "ACTION_IME_ENTER";
                                                    break;
                                                case R.id.ALT:
                                                    str = "ACTION_DRAG_START";
                                                    break;
                                                case R.id.CTRL:
                                                    str = "ACTION_DRAG_DROP";
                                                    break;
                                                case R.id.FUNCTION:
                                                    str = "ACTION_DRAG_CANCEL";
                                                    break;
                                                default:
                                                    str = "ACTION_UNKNOWN";
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    str = "ACTION_CLEAR_FOCUS";
                }
            } else {
                str = "ACTION_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                str = aVar.b().toString();
            }
            sb2.append(str);
            if (i11 != emptyList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
