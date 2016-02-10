package exp.Connect.retro.author_keywords;

import core.algo.Retro_retrieval;
import core.dataset.TextDataset;
import core.metrics.Result;
import exp.Connect.ConnectSetting;

/**
 * Created by niejia on 16/2/2.
 */
public class Connect_JSEP_Retro_AuthorWords_Changes_All {
    public static void main(String[] args) {

        String retro_out_path_ch847 = "data/Connect/retro/author_keywords/ch847.txt";
        String retro_out_path_ch840 = "data/Connect/retro/author_keywords/ch840.txt";
        String retro_out_path_ch840_D = "data/Connect/retro/author_keywords/ch840-D.txt";
        String retro_out_path_ch839 = "data/Connect/retro/author_keywords/ch839.txt";
        String retro_out_path_ch839_D = "data/Connect/retro/author_keywords/ch839-D.txt";
        String retro_out_path_ch841 = "data/Connect/retro/author_keywords/ch841.txt";
        String retro_out_path_ch843 = "data/Connect/retro/author_keywords/ch843.txt";
        String retro_out_path_ch321 = "data/Connect/retro/author_keywords/ch321.txt";
        String retro_out_path_ch321_A = "data/Connect/retro/author_keywords/ch321-A.txt";
        String retro_out_path_ch321_B = "data/Connect/retro/author_keywords/ch321-B.txt";
        String retro_out_path_ch321_C = "data/Connect/retro/author_keywords/ch321-C.txt";
        String retro_out_path_ch1123 = "data/Connect/retro/author_keywords/ch1123.txt";
        String retro_out_path_ch1121 = "data/Connect/retro/author_keywords/ch1121.txt";
        String retro_out_path_ch1121_C = "data/Connect/retro/author_keywords/ch1121-C.txt";
        String retro_out_path_ch1241 = "data/Connect/retro/author_keywords/ch1241.txt";
        String retro_out_path_ch1242 = "data/Connect/retro/author_keywords/ch1242.txt";
        String retro_out_path_ch1243 = "data/Connect/retro/author_keywords/ch1243.txt";

        String retro_out_path_ch1243_A = "data/Connect/retro/author_keywords/ch1243-A.txt";
        String retro_out_path_ch1243_B = "data/Connect/retro/author_keywords/ch1243-B.txt";


        String retro_out_path_ch1244 = "data/Connect/retro/author_keywords/ch1244.txt";
        String retro_out_path_ch1346 = "data/Connect/retro/author_keywords/ch1346.txt";

        jsep_retro_myversion(ConnectSetting.Change847_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange847, retro_out_path_ch847, "Change847");

        jsep_retro_myversion(ConnectSetting.Change840_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange840, retro_out_path_ch840, "Change840");

        System.out.println("Change840-D");
        jsep_retro_myversion(ConnectSetting.Change840_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange840, retro_out_path_ch840_D, "Change840");


        jsep_retro_myversion(ConnectSetting.Change839_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange839, retro_out_path_ch839, "Change839");

        System.out.println("Change839-D");
        jsep_retro_myversion(ConnectSetting.Change839_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange839, retro_out_path_ch839_D, "Change839");


        jsep_retro_myversion(ConnectSetting.Change841_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange841, retro_out_path_ch841, "Change841");

        jsep_retro_myversion(ConnectSetting.Change843_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange843, retro_out_path_ch843, "Change843");

        jsep_retro_myversion(ConnectSetting.Change321_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange321, retro_out_path_ch321, "Change321");


        System.out.println("Change321-A");
        jsep_retro_myversion(ConnectSetting.Change321_GroupedByJSEP,
                        ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange321, retro_out_path_ch321_A, "Change321");

        System.out.println("Change321-B");
        jsep_retro_myversion(ConnectSetting.Change321_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange321, retro_out_path_ch321_B, "Change321");

        System.out.println("Change321-C");
        jsep_retro_myversion(ConnectSetting.Change321_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange321, retro_out_path_ch321_C, "Change321");


        jsep_retro_myversion(ConnectSetting.Change1123_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1123, retro_out_path_ch1123, "Change1123");


        jsep_retro_myversion(ConnectSetting.Change1121_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1121, retro_out_path_ch1121, "Change1121");

        System.out.println("Change1121-C");
        jsep_retro_myversion(ConnectSetting.Change1121_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1121, retro_out_path_ch1121_C, "Change1121");


        jsep_retro_myversion(ConnectSetting.Change1241_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1241, retro_out_path_ch1241, "Change1241");
//
        jsep_retro_myversion(ConnectSetting.Change1242_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1242, retro_out_path_ch1242, "Change1242");

        jsep_retro_myversion(ConnectSetting.Change1243_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1243, retro_out_path_ch1243, "Change1243");

        System.out.println("Change1243-A");
        jsep_retro_myversion(ConnectSetting.Change1243_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1243, retro_out_path_ch1243_A, "Change1243");

        System.out.println("Change1243-B");
        jsep_retro_myversion(ConnectSetting.Change1243_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1243, retro_out_path_ch1243_B, "Change1243");



        jsep_retro_myversion(ConnectSetting.Change1244_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1244, retro_out_path_ch1244, "Change1244");
        jsep_retro_myversion(ConnectSetting.Change1346_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1346, retro_out_path_ch1346, "Change1346");
    }

    public static void jsep_retro_myversion(String code, String req, String oracle, String retro_out_path, String version) {
        System.out.println("----------" + version + "----------");
        TextDataset textDataset = new TextDataset(code,
                req, oracle);

        Result result = Retro_retrieval.computeRetroResult(textDataset, retro_out_path, version, 53);
        result.showMatrix();
        result.showAveragePrecisionByRanklist();
        System.out.println("--------------------");
    }
}
