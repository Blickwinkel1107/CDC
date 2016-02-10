package exp.Connect.retro.author_keywords;

import core.algo.Retro_retrieval;
import core.dataset.TextDataset;
import core.metrics.Result;
import exp.Connect.ConnectSetting;

/**
 * Created by niejia on 16/2/1.
 */
public class Connect_JSEP_Retro_Change847 {
    public static void main(String[] args) {
        TextDataset textDataset = new TextDataset(ConnectSetting.Change847_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange847);

        String retro_out_path = "data/Connect/retro/author_keywords/ch847.txt";
        Result result = Retro_retrieval.computeRetroResult(textDataset, retro_out_path, "Change847", 53);
        result.showMatrix();
        result.showAveragePrecisionByRanklist();
    }
}
