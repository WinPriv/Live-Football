package e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.huawei.openalliance.ad.constant.bj;
import e.a;
import j7.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import vc.e;
import vc.h;
import zc.d;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class b extends a<String[], Map<String, Boolean>> {
    @Override // e.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        d.d(componentActivity, bj.f.o);
        d.d(strArr, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        d.c(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // e.a
    public final a.C0364a b(ComponentActivity componentActivity, Object obj) {
        boolean z10;
        boolean z11;
        String[] strArr = (String[]) obj;
        d.d(componentActivity, bj.f.o);
        d.d(strArr, "input");
        boolean z12 = true;
        if (strArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new a.C0364a(e.f36007s);
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (d0.a.a(componentActivity, strArr[i10]) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                z12 = false;
                break;
            }
            i10++;
        }
        if (z12) {
            int F = r.F(strArr.length);
            if (F < 16) {
                F = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(F);
            for (String str : strArr) {
                linkedHashMap.put(str, Boolean.TRUE);
            }
            return new a.C0364a(linkedHashMap);
        }
        return null;
    }

    @Override // e.a
    public final Map<String, Boolean> c(int i10, Intent intent) {
        boolean z10;
        e eVar = e.f36007s;
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    if (i11 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(Boolean.valueOf(z10));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(vc.b.N0(arrayList2), vc.b.N0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new uc.b(it.next(), it2.next()));
                }
                return h.L(arrayList3);
            }
            return eVar;
        }
        return eVar;
    }
}
