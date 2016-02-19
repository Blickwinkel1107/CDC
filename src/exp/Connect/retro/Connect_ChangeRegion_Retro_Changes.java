package exp.Connect.retro;

import core.algo.Retro_retrieval;
import core.dataset.TextDataset;
import core.metrics.Result;
import exp.Connect.ConnectSetting;

/**
 * Created by niejia on 16/2/18.
 */
public class Connect_ChangeRegion_Retro_Changes {

    public static void main(String[] args) {

        String retro_out_path_841 = "data/Connect/retro/change_region/ch841.txt";
        String retro_out_path_843 = "data/Connect/retro/change_region/ch843.txt";
        String retro_out_path_847 = "data/Connect/retro/change_region/ch847.txt";


        change_region_retro(ConnectSetting.Change841_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange841, retro_out_path_841, "Change841");


        change_region_retro(ConnectSetting.Change843_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange843, retro_out_path_843, "Change843");

        change_region_retro(ConnectSetting.Change847_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange847, retro_out_path_847, "Change847");


        String retro_out_path_839 = "data/Connect/retro/change_region/ch839.txt";
        change_region_retro(ConnectSetting.Change839_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange839, retro_out_path_839, "Change839");

        String retro_out_path_1121 = "data/Connect/retro/change_region/ch1121.txt";
        change_region_retro(ConnectSetting.Change1121_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1121, retro_out_path_1121, "Change1121");

        String retro_out_path_1123 = "data/Connect/retro/change_region/ch1123.txt";
        change_region_retro(ConnectSetting.Change1123_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1123, retro_out_path_1123, "Change1123");


        String retro_out_path_1241 = "data/Connect/retro/change_region/ch1241.txt";
        change_region_retro(ConnectSetting.Change1241_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1241, retro_out_path_1241, "Change1241");

        String retro_out_path_1242 = "data/Connect/retro/change_region/ch1242.txt";
        change_region_retro(ConnectSetting.Change1242_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1242, retro_out_path_1242, "Change1242");

        String retro_out_path_1243 = "data/Connect/retro/change_region/ch1243.txt";
        change_region_retro(ConnectSetting.Change1243_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1243, retro_out_path_1243, "Change1243");

        String retro_out_path_1244 = "data/Connect/retro/change_region/ch1244.txt";
        change_region_retro(ConnectSetting.Change1244_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1244, retro_out_path_1244, "Change1244");

        String retro_out_path_1346 = "data/Connect/retro/change_region/ch1346.txt";
        change_region_retro(ConnectSetting.Change1346_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1346, retro_out_path_1346, "Change1346");
    
    
    }


    public static void change_region_retro(String code, String req, String oracle, String retro_out_path, String version) {
        System.out.println("----------" + version + "----------");
        TextDataset textDataset = new TextDataset(code,
                req, oracle);

        Result result = Retro_retrieval.computeRetroResultIR(textDataset, retro_out_path, version, 53);
        result.showMatrix();
        result.showAveragePrecisionByRanklist();
        System.out.println("--------------------");
    }
}
