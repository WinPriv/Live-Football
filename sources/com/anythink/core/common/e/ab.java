package com.anythink.core.common.e;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ab extends k {

    /* renamed from: n, reason: collision with root package name */
    private int f5422n;
    private int o;

    private void P(int i10) {
        this.o = i10;
    }

    private void Q(int i10) {
        this.f5422n = i10;
    }

    public static ab c(String str) {
        boolean z10;
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ab abVar = new ab();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                abVar.q(jSONObject.optInt("f_t"));
                int optInt = jSONObject.optInt("v_c");
                if (optInt != 1) {
                    if (optInt == 2) {
                        optInt = 1;
                    }
                } else {
                    optInt = 0;
                }
                abVar.r(optInt);
                abVar.s(jSONObject.optInt("s_b_t"));
                if (jSONObject.has("s_b_d")) {
                    abVar.t(jSONObject.optInt("s_b_d"));
                }
                int optInt2 = jSONObject.optInt("e_c_a");
                if (optInt2 != 1) {
                    if (optInt2 != 2) {
                        if (optInt2 == 3) {
                            optInt2 = 2;
                        }
                    } else {
                        optInt2 = 1;
                    }
                } else {
                    optInt2 = 0;
                }
                abVar.u(optInt2);
                int optInt3 = jSONObject.optInt("ak_cfm");
                if (optInt3 != 1) {
                    if (optInt3 == 2) {
                        optInt3 = 1;
                    }
                } else {
                    optInt3 = 0;
                }
                abVar.m(optInt3);
                abVar.l(jSONObject.optInt("m_t"));
                int optInt4 = jSONObject.optInt("cm");
                if (optInt4 != 1) {
                    if (optInt4 == 2) {
                        optInt4 = 1;
                    }
                } else {
                    optInt4 = 0;
                }
                abVar.f5422n = optInt4;
                abVar.c(jSONObject.optInt("ipua"));
                abVar.d(jSONObject.optInt("clua"));
                abVar.k(jSONObject.optInt("dp_cm"));
                abVar.o = jSONObject.optInt("l_o_num");
                abVar.j(jSONObject.optInt("ld_t"));
                abVar.x(jSONObject.optInt("ec_r"));
                abVar.y(jSONObject.optInt("ec_s_t"));
                abVar.z(jSONObject.optInt("ec_l_t"));
                abVar.a(jSONObject.optLong("or_t"));
                abVar.e(jSONObject.optInt("rv_fail_reward"));
                abVar.f(jSONObject.optInt("cl_sz"));
                abVar.i(jSONObject.optInt("si_fit"));
                if (jSONObject.has("at_cl_sw")) {
                    abVar.A(jSONObject.optInt("at_cl_sw"));
                }
                if (jSONObject.has("at_ct_ti")) {
                    abVar.B(jSONObject.optInt("at_ct_ti"));
                }
                if (jSONObject.has("int_cl_sw")) {
                    abVar.C(jSONObject.optInt("int_cl_sw"));
                }
                if (jSONObject.has("int_cl_ti")) {
                    abVar.D(jSONObject.optInt("int_cl_ti"));
                }
                if (jSONObject.has("sh_ec")) {
                    abVar.E(jSONObject.optInt("sh_ec"));
                }
                if (jSONObject.has("ap_arpt")) {
                    abVar.F(jSONObject.optInt("ap_arpt"));
                }
                if (jSONObject.has("ap_pasbl")) {
                    abVar.G(jSONObject.optInt("ap_pasbl"));
                }
                if (jSONObject.has("inter_type")) {
                    abVar.b(jSONObject.optString("inter_type"));
                }
                if (jSONObject.has("shk_sw")) {
                    abVar.H(jSONObject.optInt("shk_sw"));
                }
                if (jSONObject.has("shk_strength_and")) {
                    abVar.I(jSONObject.optInt("shk_strength_and"));
                }
                if (jSONObject.has("shk_time")) {
                    abVar.d(jSONObject.optLong("shk_time"));
                }
                if (jSONObject.has("click_cache_time")) {
                    abVar.J(jSONObject.optInt("click_cache_time"));
                }
                if (jSONObject.has("click_nt_sw")) {
                    abVar.K(jSONObject.optInt("click_nt_sw"));
                }
                if (jSONObject.has("ft_cl_sz")) {
                    abVar.g(jSONObject.optInt("ft_cl_sz"));
                } else {
                    abVar.g(1);
                }
                if (jSONObject.has("sh_cl_itp")) {
                    abVar.h(jSONObject.optInt("sh_cl_itp"));
                } else {
                    abVar.h(2);
                }
                abVar.L(jSONObject.optInt("shm_t", -1));
                if (jSONObject.has("ready_rate")) {
                    abVar.M(jSONObject.optInt("ready_rate"));
                } else {
                    abVar.M(100);
                }
                if (jSONObject.has("rsdl_rate")) {
                    abVar.N(jSONObject.optInt("rsdl_rate"));
                } else {
                    abVar.N(0);
                }
                if (jSONObject.has("video_ctn_type")) {
                    abVar.O(jSONObject.optInt("video_ctn_type"));
                } else {
                    abVar.O(2);
                }
                if (jSONObject.has("preload_offer_html")) {
                    if (jSONObject.optInt("preload_offer_html") == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    abVar.a(z11);
                } else {
                    abVar.a(true);
                }
                if (jSONObject.has("re_monitor")) {
                    if (jSONObject.optInt("re_monitor") == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    abVar.b(z10);
                } else {
                    abVar.b(false);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return abVar;
    }

    public final int X() {
        return this.o;
    }

    public final int Y() {
        return this.f5422n;
    }
}
