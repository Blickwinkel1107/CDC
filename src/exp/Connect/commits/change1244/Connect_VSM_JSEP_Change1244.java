package exp.Connect.commits.change1244;

import core.algo.JSS2015_CSTI;
import core.dataset.TextDataset;
import core.ir.IR;
import core.ir.IRModelConst;
import core.metrics.Result;
import exp.Connect.ConnectSetting;
import visual.VisualCurve;

/**
 * Created by niejia on 16/1/30.
 */
public class Connect_VSM_JSEP_Change1244 {
    public static void main(String[] args) {
        TextDataset textDataset = new TextDataset(ConnectSetting.Change1244_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1244);

        Result result_ir = IR.compute(textDataset, IRModelConst.VSM_ALL, new JSS2015_CSTI(), "Change1244");
        result_ir.showMatrix();
        result_ir.showAveragePrecisionByRanklist();
        result_ir.showMeanAveragePrecisionByQuery();

        VisualCurve curve = new VisualCurve();
        curve.addLine(result_ir);
        curve.showChart();
    }
}
