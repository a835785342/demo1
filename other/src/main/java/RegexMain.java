import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegexMain {

    public static void main(String[] args) {
        List<String> fields = new ArrayList<>();
        fields.add("id");
        fields.add("busi_date");
        fields.add("rec_id");
        fields.add("secu_id");
        fields.add("info_src");
        fields.add("corp_id");
        fields.add("dvd_type");
        fields.add("ann_date_fst");
        fields.add("evt_proc");
        fields.add("dvd_date");
        fields.add("cash_dvd_date");
        fields.add("impl_ann_date");
        fields.add("stkhold_rslt_ann_date");
        fields.add("bonus_tran_stk_date");
        fields.add("bonus_tran_stk_list_date");
        fields.add("last_trd_date");
        fields.add("dvd_year_strt_date");
        fields.add("ex_rt_dvd_date");
        fields.add("stk_rt_reg_date");
        fields.add("tax_bef_amt_cny");
        fields.add("tax_aft_amt_cny");
        fields.add("tax_bef_amt_crrc");
        fields.add("tax_aft_amt_crrc");
        fields.add("dnt_stk_rati");
        fields.add("tran_rati");
        fields.add("wrt_rati");
        fields.add("crrc_cd");
        fields.add("distr_equi_basi");
        fields.add("distr_obj");
        fields.add("distr_tot_equi");
        fields.add("cash_dvd_amt_cny");
        fields.add("cash_dvd_amt_fc");
        fields.add("bonus_stk_qty");
        fields.add("tran_stk_qty");
        fields.add("bonus_tran_stk_qty");
        fields.add("distr_bef_unrlz_prft");
        fields.add("distr_aft_unrlz_prft");
        fields.add("distr_bef_cptl_rsv");
        fields.add("distr_aft_cptl_rsv");
        fields.add("is_program_chg");
        fields.add("det_bef_program_chg");
        fields.add("bonus_shr_list_date");
        fields.add("basi_date");
        fields.add("last_ann_dt");
        fields.add("cash_nmrt_bef_tax");
        fields.add("cash_nmrt_aft_tax");
        fields.add("bns_deno");
        fields.add("cash_deno");
        fields.add("remark");
        fields.add("rec_upd_time");
        fields.add("grp_id");

        String collect = fields.stream().collect(Collectors.joining("||"));
        System.out.println(collect);
    }
}
